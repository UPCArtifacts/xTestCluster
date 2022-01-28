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
        long long25 = dateTimeZone20.convertUTCToLocal(0L);
        int int27 = dateTimeZone20.getStandardOffset((long) ' ');
        long long29 = dateTimeZone20.previousTransition(230399999L);
        java.lang.String str31 = dateTimeZone20.getName((long) '4');
        int int33 = dateTimeZone20.getStandardOffset((-230399900L));
        long long35 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, 51L);
        long long38 = dateTimeZone1.convertLocalToUTC(187200000L, true);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 115200000L + "'", long25 == 115200000L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115200000 + "'", int27 == 115200000);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 230399999L + "'", long29 == 230399999L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 115200000 + "'", int33 == 115200000);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 51L + "'", long35 == 51L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 72000000L + "'", long38 == 72000000L);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str11 = dateTimeZone1.getID();
        int int13 = dateTimeZone1.getOffset((long) (byte) 100);
        java.lang.String str14 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        long long20 = dateTimeZone4.adjustOffset((long) (byte) 1, true);
        java.lang.String str22 = dateTimeZone4.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60010L + "'", long16 == 60010L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int6 = dateTimeZone1.getOffset(115140000L);
        long long9 = dateTimeZone1.adjustOffset((-187320000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-187320000L) + "'", long9 == (-187320000L));
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.lang.String str7 = dateTimeZone1.getNameKey(0L);
        java.lang.String str9 = dateTimeZone1.getNameKey(0L);
        boolean boolean10 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int5 = dateTimeZone3.getOffsetFromLocal((-1L));
        boolean boolean6 = dateTimeZone3.isFixed();
        long long8 = dateTimeZone3.convertUTCToLocal(0L);
        java.lang.String str10 = dateTimeZone3.getNameKey((long) 'a');
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) str10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(32L, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getName(115199999L, locale16);
        boolean boolean18 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone1.isLocalDateTimeGap(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115200000L + "'", long8 == 115200000L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:00" + "'", str14, "+01:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+01:00" + "'", str17, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-115199903L), locale4);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC((long) 'a', false);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 96L + "'", long9 == 96L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str11 = dateTimeZone1.getID();
        int int13 = dateTimeZone1.getOffset((long) (byte) 100);
        java.lang.String str14 = dateTimeZone1.toString();
        int int16 = dateTimeZone1.getOffset(187200000L);
        long long19 = dateTimeZone1.convertLocalToUTC((long) (short) 0, true);
        long long22 = dateTimeZone1.convertLocalToUTC(100L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115200000L) + "'", long19 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-115199900L) + "'", long22 == (-115199900L));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean3 = dateTimeZone1.isFixed();
        long long5 = dateTimeZone1.previousTransition(101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.010" + "'", str2, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long4 = dateTimeZone0.previousTransition((-115139990L));
        long long6 = dateTimeZone0.convertUTCToLocal(101L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115139990L) + "'", long4 == (-115139990L));
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60101L + "'", long6 == 60101L);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        long long12 = dateTimeZone1.nextTransition(115200010L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int16 = dateTimeZone14.getOffsetFromLocal((-1L));
        boolean boolean17 = dateTimeZone14.isFixed();
        long long19 = dateTimeZone14.convertUTCToLocal((long) 10);
        boolean boolean21 = dateTimeZone14.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone14.isLocalDateTimeGap(localDateTime22);
        long long27 = dateTimeZone14.convertLocalToUTC(115199999L, false, (long) (short) 0);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) false);
        long long31 = dateTimeZone1.adjustOffset((-115139990L), false);
        java.util.TimeZone timeZone32 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200010L + "'", long12 == 115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200010L + "'", long19 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115139990L) + "'", long31 == (-115139990L));
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long11 = dateTimeZone1.convertLocalToUTC((-230219990L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-345419990L) + "'", long11 == (-345419990L));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        int int10 = dateTimeZone1.getStandardOffset(0L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((long) (-3600000), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:01");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.nextTransition(230399999L);
        boolean boolean14 = dateTimeZone1.isFixed();
        java.lang.String str15 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone17.getShortName((long) (byte) 10, locale19);
        int int22 = dateTimeZone17.getOffsetFromLocal((long) (byte) 1);
        java.lang.String str24 = dateTimeZone17.getNameKey((long) 115200000);
        int int26 = dateTimeZone17.getOffsetFromLocal(115200000L);
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) dateTimeZone17);
        long long31 = dateTimeZone17.convertLocalToUTC(0L, true, 120010L);
        java.lang.String str33 = dateTimeZone17.getNameKey(32L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 230399999L + "'", long13 == 230399999L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115200000 + "'", int26 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115200000L) + "'", long31 == (-115200000L));
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        long long12 = dateTimeZone1.nextTransition(115200010L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int16 = dateTimeZone14.getOffsetFromLocal((-1L));
        boolean boolean17 = dateTimeZone14.isFixed();
        long long19 = dateTimeZone14.convertUTCToLocal((long) 10);
        boolean boolean21 = dateTimeZone14.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone14.isLocalDateTimeGap(localDateTime22);
        long long27 = dateTimeZone14.convertLocalToUTC(115199999L, false, (long) (short) 0);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) false);
        long long31 = dateTimeZone1.adjustOffset((-115139990L), false);
        long long33 = dateTimeZone1.nextTransition(0L);
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone1.getOffset(readableInstant34);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200010L + "'", long12 == 115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200010L + "'", long19 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115139990L) + "'", long31 == (-115139990L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 115200000 + "'", int35 == 115200000);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        long long15 = dateTimeZone1.adjustOffset((long) (byte) -1, false);
        int int17 = dateTimeZone1.getOffsetFromLocal((long) (short) 1);
        java.lang.String str19 = dateTimeZone1.getName((-230339903L));
        java.lang.String str20 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        java.lang.String str18 = dateTimeZone4.getNameKey((long) (-1));
        java.lang.String str20 = dateTimeZone4.getNameKey(43080010L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60010L + "'", long16 == 60010L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        long long37 = dateTimeZone18.convertLocalToUTC((-230399903L), false, (-115199949L));
        boolean boolean38 = dateTimeZone18.isFixed();
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-230459903L) + "'", long37 == (-230459903L));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone31.getName(118740062L, locale40);
        java.lang.String str43 = dateTimeZone31.getShortName(35L);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+32:00" + "'", str41, "+32:00");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+32:00" + "'", str43, "+32:00");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName((long) 100, locale15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone1.getShortName((-230339903L), locale18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean3 = dateTimeZone1.isFixed();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName(115200052L, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.010" + "'", str2, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.010" + "'", str6, "+00:00:00.010");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        long long10 = dateTimeZone2.previousTransition((-115199948L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115199948L) + "'", long10 == (-115199948L));
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getNameKey((-115319900L));
        java.lang.String str6 = dateTimeZone1.getName((-341939900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        java.lang.String str7 = dateTimeZone1.toString();
        long long9 = dateTimeZone1.convertUTCToLocal(120000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 115320000L + "'", long9 == 115320000L);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) 115200000);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        int int14 = dateTimeZone1.getStandardOffset((-115199958L));
        java.lang.String str15 = dateTimeZone1.getID();
        boolean boolean17 = dateTimeZone1.isStandardOffset((-345659903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        long long4 = dateTimeZone0.previousTransition(115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200010L + "'", long4 == 115200010L);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-115139948L) + "'", long5 == (-115139948L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((-1L), locale6);
        long long9 = dateTimeZone2.previousTransition((-187199900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:10" + "'", str7, "+00:10");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-187199900L) + "'", long9 == (-187199900L));
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        boolean boolean34 = dateTimeZone31.isFixed();
        org.joda.time.ReadableInstant readableInstant35 = null;
        int int36 = dateTimeZone31.getOffset(readableInstant35);
        boolean boolean37 = dateTimeZone1.equals((java.lang.Object) readableInstant35);
        java.lang.String str39 = dateTimeZone1.getShortName((-230399998L));
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 115200000 + "'", int36 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+32:00" + "'", str39, "+32:00");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        long long15 = dateTimeZone1.adjustOffset((long) (byte) -1, false);
        long long17 = dateTimeZone1.convertUTCToLocal((long) (short) 10);
        int int19 = dateTimeZone1.getStandardOffset((long) 60000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 115200010L + "'", long17 == 115200010L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        long long8 = dateTimeZone5.nextTransition((-230339948L));
        long long12 = dateTimeZone5.convertLocalToUTC((-230279900L), true, 3540101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-230339948L) + "'", long8 == (-230339948L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-230279900L) + "'", long12 == (-230279900L));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long4 = dateTimeZone1.nextTransition(115199999L);
        long long7 = dateTimeZone1.adjustOffset((-115139948L), true);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115199999L + "'", long4 == 115199999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115139948L) + "'", long7 == (-115139948L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        long long4 = dateTimeZone2.convertUTCToLocal(0L);
        int int6 = dateTimeZone2.getOffset((-115139958L));
        int int8 = dateTimeZone2.getOffsetFromLocal((-187260001L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 187200000L + "'", long4 == 187200000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) 115200000, locale7);
        int int10 = dateTimeZone1.getStandardOffset(230399999L);
        java.lang.String str12 = dateTimeZone1.getNameKey(43020000L);
        long long16 = dateTimeZone1.convertLocalToUTC((-115140001L), false, 100L);
        java.lang.Class<?> wildcardClass17 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
// flaky:         org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115200001L) + "'", long16 == (-115200001L));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        long long3 = dateTimeZone1.nextTransition((-115139958L));
        boolean boolean5 = dateTimeZone1.isStandardOffset((-187259990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115139958L) + "'", long3 == (-115139958L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        int int20 = dateTimeZone11.getOffset((-115140000L));
        int int22 = dateTimeZone11.getOffsetFromLocal((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 230340010L + "'", long18 == 230340010L);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        int int11 = dateTimeZone1.getStandardOffset((-187260000L));
        boolean boolean13 = dateTimeZone1.isStandardOffset(44L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.nextTransition(115260000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115260000L + "'", long12 == 115260000L);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        long long12 = dateTimeZone1.convertUTCToLocal(115200000L);
        boolean boolean13 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 230400000L + "'", long12 == 230400000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        int int36 = dateTimeZone1.getOffset(60000L);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 115200000 + "'", int36 == 115200000);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone18.getShortName((long) (byte) 10, locale20);
        java.lang.String str22 = dateTimeZone18.getID();
        boolean boolean24 = dateTimeZone18.isStandardOffset(10L);
        int int26 = dateTimeZone18.getStandardOffset((long) 1);
        java.lang.String str27 = dateTimeZone18.getID();
        java.lang.String str28 = dateTimeZone18.getID();
        java.lang.String str30 = dateTimeZone18.getShortName(96L);
        long long32 = dateTimeZone2.getMillisKeepLocal(dateTimeZone18, (-230219990L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60010L + "'", long12 == 60010L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115140000L + "'", long16 == 115140000L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115200000 + "'", int26 == 115200000);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:00" + "'", str28, "+32:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-345359990L) + "'", long32 == (-345359990L));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        boolean boolean28 = dateTimeZone10.equals((java.lang.Object) (-59948L));
        long long30 = dateTimeZone10.nextTransition((-115200001L));
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-115200001L) + "'", long30 == (-115200001L));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone5.getShortName((long) (byte) 10, locale7);
        java.lang.String str9 = dateTimeZone5.getID();
        long long11 = dateTimeZone5.convertUTCToLocal((-230339900L));
        long long13 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, 60010L);
        long long15 = dateTimeZone5.nextTransition((-115200001L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115079990L) + "'", long13 == (-115079990L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200001L) + "'", long15 == (-115200001L));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long6 = dateTimeZone1.nextTransition((-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60001L) + "'", long6 == (-60001L));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long13 = dateTimeZone1.convertLocalToUTC((long) 'a', true);
        java.lang.String str15 = dateTimeZone1.getName((-600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199903L) + "'", long13 == (-115199903L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.adjustOffset((long) (byte) -1, true);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone8.previousTransition((long) (byte) -1);
        long long14 = dateTimeZone8.convertLocalToUTC(115199999L, true, (long) '#');
        long long16 = dateTimeZone8.nextTransition((long) 10);
        int int18 = dateTimeZone8.getOffsetFromLocal((-115199900L));
        long long20 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone8.getOffset(readableInstant21);
        long long26 = dateTimeZone8.convertLocalToUTC(51L, true, (-115199949L));
        long long28 = dateTimeZone8.convertUTCToLocal(0L);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone8.getShortName(3540101L, locale30);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-115139999L) + "'", long20 == (-115139999L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115199949L) + "'", long26 == (-115199949L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 115200000L + "'", long28 == 115200000L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        int int18 = dateTimeZone1.getOffsetFromLocal((-460799965L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199958L) + "'", long14 == (-115199958L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone18.getShortName((long) (byte) 10, locale20);
        java.lang.String str22 = dateTimeZone18.getID();
        boolean boolean24 = dateTimeZone18.isStandardOffset(10L);
        int int26 = dateTimeZone18.getStandardOffset((long) 1);
        java.lang.String str27 = dateTimeZone18.getID();
        java.lang.String str28 = dateTimeZone18.getID();
        java.lang.String str30 = dateTimeZone18.getShortName(96L);
        long long32 = dateTimeZone2.getMillisKeepLocal(dateTimeZone18, (-230219990L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int35 = dateTimeZone18.getOffset((-119900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60010L + "'", long12 == 60010L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115140000L + "'", long16 == 115140000L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115200000 + "'", int26 == 115200000);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:00" + "'", str28, "+32:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-345359990L) + "'", long32 == (-345359990L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 115200000 + "'", int35 == 115200000);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        long long16 = dateTimeZone4.convertLocalToUTC((long) (short) 100, true);
        long long18 = dateTimeZone4.convertUTCToLocal((-120001L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115079999L + "'", long18 == 115079999L);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.lang.String str6 = dateTimeZone2.getShortName((long) (short) -1);
        long long10 = dateTimeZone2.convertLocalToUTC(115320000L, false, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:00" + "'", str6, "+100:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-244680000L) + "'", long10 == (-244680000L));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 115140010L);
        boolean boolean7 = dateTimeZone3.isStandardOffset(1L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118740062L + "'", long5 == 118740062L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str11 = dateTimeZone1.getID();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((long) (byte) 10, locale13);
        java.lang.String str15 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        java.util.TimeZone timeZone23 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        long long27 = dateTimeZone25.nextTransition(233940000L);
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
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 233940000L + "'", long27 == 233940000L);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str5 = dateTimeZone2.getShortName((long) (short) 1);
        long long7 = dateTimeZone2.nextTransition(115259975L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115259975L + "'", long7 == 115259975L);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 1L);
        int int12 = dateTimeZone5.getOffsetFromLocal((long) 10);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone5.getName(230399999L, locale14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone5.getName(115200032L, locale17);
        boolean boolean20 = dateTimeZone5.isStandardOffset((-114599949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115139999L) + "'", long10 == (-115139999L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:01");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int5 = dateTimeZone3.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone6 = dateTimeZone3.toTimeZone();
        long long9 = dateTimeZone3.adjustOffset((-111540000L), false);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (-115079990L));
        java.lang.String str12 = dateTimeZone3.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-111540000L) + "'", long9 == (-111540000L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-230219990L) + "'", long11 == (-230219990L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        java.lang.String str21 = dateTimeZone7.getShortName(101L);
        java.lang.Class<?> wildcardClass22 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60010L + "'", long17 == 60010L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-229859900L) + "'", long19 == (-229859900L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName((long) (short) 0, locale2);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (byte) -1);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName(114600000L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coordinated Universal Time" + "'", str3, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long4 = dateTimeZone1.nextTransition(115199999L);
        java.lang.String str6 = dateTimeZone1.getName((-589739949L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) 1, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115199999L + "'", long4 == 115199999L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        int int38 = dateTimeZone1.getOffset(115200100L);
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
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertLocalToUTC((-115199903L), true, (long) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone15.getShortName((long) (byte) 10, locale17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone15.getName((long) (-1), locale20);
        long long24 = dateTimeZone15.convertLocalToUTC((long) (short) -1, false);
        int int26 = dateTimeZone15.getOffsetFromLocal((long) 115200000);
        boolean boolean27 = dateTimeZone15.isFixed();
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) boolean27);
        java.lang.String str30 = dateTimeZone1.getNameKey((-230400000L));
        java.lang.String str32 = dateTimeZone1.getShortName((-115140001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399903L) + "'", long13 == (-230399903L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-115200001L) + "'", long24 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115200000 + "'", int26 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        boolean boolean13 = dateTimeZone1.isFixed();
        int int15 = dateTimeZone1.getOffset(52L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        long long10 = dateTimeZone2.adjustOffset(101L, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone12.getName(10L, locale14);
        boolean boolean16 = dateTimeZone12.isFixed();
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone12.getOffset(readableInstant17);
        long long20 = dateTimeZone2.getMillisKeepLocal(dateTimeZone12, (-111540000L));
        long long23 = dateTimeZone12.adjustOffset(115200035L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 101L + "'", long10 == 101L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-111480100L) + "'", long20 == (-111480100L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 115200035L + "'", long23 == 115200035L);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str11 = dateTimeZone1.getID();
        java.lang.String str12 = dateTimeZone1.toString();
        int int14 = dateTimeZone1.getOffset((-115139900L));
        long long18 = dateTimeZone1.convertLocalToUTC((-115199965L), true, 3600101L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-230399965L) + "'", long18 == (-230399965L));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (short) 0);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((-115319900L), locale4);
        int int7 = dateTimeZone2.getOffsetFromLocal((-115199990L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long3 = dateTimeZone0.nextTransition((-115199899L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean5 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115199899L) + "'", long3 == (-115199899L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone31.getName(115260010L, locale38);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        int int43 = dateTimeZone41.getOffsetFromLocal((long) (short) 1);
        boolean boolean44 = dateTimeZone31.equals((java.lang.Object) int43);
        long long46 = dateTimeZone31.nextTransition((-230399965L));
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+32:00" + "'", str39, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-230399965L) + "'", long46 == (-230399965L));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        long long15 = dateTimeZone4.convertLocalToUTC((long) (byte) -1, true, 10L);
        java.lang.String str17 = dateTimeZone4.getName((-460799965L));
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone4.getOffset(readableInstant18);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200001L) + "'", long15 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        boolean boolean21 = dateTimeZone2.isStandardOffset(115200032L);
        long long23 = dateTimeZone2.nextTransition(115139999L);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 115139999L + "'", long23 == 115139999L);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true);
        long long13 = dateTimeZone1.convertLocalToUTC((-119900L), true, (-230460003L));
        java.lang.Class<?> wildcardClass14 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115200000L) + "'", long9 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115319900L) + "'", long13 == (-115319900L));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        long long3 = dateTimeZone1.convertUTCToLocal(34L);
        int int5 = dateTimeZone1.getOffset((long) (short) 10);
        java.lang.String str7 = dateTimeZone1.getName(115199999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 44L + "'", long3 == 44L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.010" + "'", str7, "+00:00:00.010");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        int int25 = dateTimeZone16.getOffsetFromLocal(59975L);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 115200000 + "'", int25 == 115200000);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        int int21 = dateTimeZone2.getStandardOffset((-230339999L));
        java.lang.String str22 = dateTimeZone2.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:10" + "'", str22, "+00:10");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        int int9 = dateTimeZone1.getOffset((long) '4');
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-187259990L), locale11);
        java.lang.String str14 = dateTimeZone1.getName((long) 'a');
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        boolean boolean18 = dateTimeZone16.isStandardOffset((-230399947L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertUTCToLocal((-115199990L));
        long long8 = dateTimeZone0.convertLocalToUTC((-1L), false, 115260000L);
        long long10 = dateTimeZone0.previousTransition(115200035L);
        long long13 = dateTimeZone0.adjustOffset((-600000L), true);
        java.lang.String str15 = dateTimeZone0.getName(111540100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+32:00" + "'", str1, "+32:00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:00" + "'", str2, "+32:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200001L) + "'", long8 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115200035L + "'", long10 == 115200035L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-600000L) + "'", long13 == (-600000L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        long long26 = dateTimeZone11.nextTransition(51L);
        int int28 = dateTimeZone11.getOffset(115260010L);
        java.util.TimeZone timeZone29 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long33 = dateTimeZone30.adjustOffset(0L, true);
        boolean boolean35 = dateTimeZone30.isStandardOffset((long) 187200000);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 51L + "'", long26 == 51L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115200000 + "'", int28 == 115200000);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int5 = dateTimeZone3.getOffsetFromLocal((-1L));
        boolean boolean6 = dateTimeZone3.isFixed();
        long long8 = dateTimeZone3.convertUTCToLocal(0L);
        java.lang.String str10 = dateTimeZone3.getNameKey((long) 'a');
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) str10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long14 = dateTimeZone1.nextTransition((long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115200000L + "'", long8 == 115200000L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) ' ');
        java.lang.String str9 = dateTimeZone1.getName((-115139900L));
        int int11 = dateTimeZone1.getOffset((-115080001L));
        long long13 = dateTimeZone1.previousTransition(302400010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 302400010L + "'", long13 == 302400010L);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone18.getShortName((-3599900L), locale35);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:01" + "'", str36, "+00:01");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        java.lang.String str4 = dateTimeZone2.getShortName(115140100L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int10 = dateTimeZone8.getOffsetFromLocal((-1L));
        boolean boolean11 = dateTimeZone8.isFixed();
        long long13 = dateTimeZone8.convertUTCToLocal((long) 10);
        boolean boolean15 = dateTimeZone8.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone8.isLocalDateTimeGap(localDateTime16);
        long long19 = dateTimeZone8.nextTransition(10L);
        long long21 = dateTimeZone8.previousTransition((-115199900L));
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone23.getShortName((long) (byte) 10, locale25);
        java.lang.String str28 = dateTimeZone23.getName(10L);
        long long30 = dateTimeZone8.getMillisKeepLocal(dateTimeZone23, 115200010L);
        long long34 = dateTimeZone8.convertLocalToUTC((long) (short) 1, true, (-115200000L));
        long long36 = dateTimeZone5.getMillisKeepLocal(dateTimeZone8, 0L);
        java.lang.String str38 = dateTimeZone5.getName((long) 'a');
        long long40 = dateTimeZone5.previousTransition(0L);
        boolean boolean41 = dateTimeZone5.isFixed();
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone5.getShortName(59975L, locale43);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115200010L + "'", long13 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-115199900L) + "'", long21 == (-115199900L));
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:00" + "'", str28, "+32:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 115200010L + "'", long30 == 115200010L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-115199999L) + "'", long34 == (-115199999L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-115200000L) + "'", long36 == (-115200000L));
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Coordinated Universal Time" + "'", str38, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str11 = dateTimeZone9.getShortName(32L);
        java.util.TimeZone timeZone12 = dateTimeZone9.toTimeZone();
        java.lang.String str14 = dateTimeZone9.getNameKey((-345539903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        long long15 = dateTimeZone1.adjustOffset((long) 3600000, false);
        long long17 = dateTimeZone1.nextTransition((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int24 = dateTimeZone22.getOffsetFromLocal((long) 10);
        boolean boolean25 = dateTimeZone20.equals((java.lang.Object) 10);
        long long29 = dateTimeZone20.convertLocalToUTC(115140000L, true, (long) 100);
        long long31 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, (-187259990L));
        java.lang.String str33 = dateTimeZone1.getNameKey(115199999L);
        java.lang.String str34 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600000L + "'", long15 == 3600000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-72120000L) + "'", long29 == (-72120000L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-259319990L) + "'", long31 == (-259319990L));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+32:00" + "'", str34, "+32:00");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        long long3 = dateTimeZone1.nextTransition((-115139958L));
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115139958L) + "'", long3 == (-115139958L));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition(115200010L);
        java.lang.String str4 = dateTimeZone1.toString();
        java.lang.String str6 = dateTimeZone1.getNameKey((long) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115200010L + "'", long3 == 115200010L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long5 = dateTimeZone2.nextTransition((long) (byte) -1);
        int int7 = dateTimeZone2.getOffset((long) (short) 0);
        java.lang.String str8 = dateTimeZone2.toString();
        java.lang.Class<?> wildcardClass9 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone2.isLocalDateTimeGap(localDateTime20);
        java.lang.String str22 = dateTimeZone2.getID();
        long long24 = dateTimeZone2.previousTransition(115200100L);
        java.lang.String str26 = dateTimeZone2.getNameKey(115200100L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60010L + "'", long17 == 60010L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-229859900L) + "'", long19 == (-229859900L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:10" + "'", str22, "+00:10");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115200100L + "'", long24 == 115200100L);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int5 = dateTimeZone3.getOffsetFromLocal((-1L));
        boolean boolean6 = dateTimeZone3.isFixed();
        long long8 = dateTimeZone3.convertUTCToLocal((long) 10);
        boolean boolean10 = dateTimeZone3.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone3.isLocalDateTimeGap(localDateTime11);
        java.util.TimeZone timeZone13 = dateTimeZone3.toTimeZone();
        long long15 = dateTimeZone3.nextTransition(230399999L);
        boolean boolean16 = dateTimeZone3.isFixed();
        boolean boolean17 = dateTimeZone0.equals((java.lang.Object) boolean16);
        java.lang.String str19 = dateTimeZone0.getShortName((-115199966L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+32:00" + "'", str1, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115200010L + "'", long8 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 230399999L + "'", long15 == 230399999L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getNameKey(3600000L);
        int int5 = dateTimeZone1.getOffset(52L);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        long long4 = dateTimeZone2.convertUTCToLocal(0L);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone2.getOffset(readableInstant5);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime7);
        int int10 = dateTimeZone2.getOffsetFromLocal((long) 3600000);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getName(187260000L, locale12);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 187200000L + "'", long4 == 187200000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 187200000 + "'", int10 == 187200000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+52:00" + "'", str13, "+52:00");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (short) 10);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (short) 100);
        boolean boolean7 = dateTimeZone1.isStandardOffset(100L);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115200000L) + "'", long17 == (-115200000L));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        boolean boolean13 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 115140010L);
        java.lang.String str7 = dateTimeZone1.getName(115200052L);
        long long10 = dateTimeZone1.adjustOffset(10L, false);
        int int12 = dateTimeZone1.getStandardOffset((-115139900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118740062L + "'", long5 == 118740062L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.052" + "'", str7, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        boolean boolean9 = dateTimeZone2.isFixed();
        java.lang.String str10 = dateTimeZone2.toString();
        long long14 = dateTimeZone2.convertLocalToUTC(60000L, true, 115200035L);
        java.lang.Class<?> wildcardClass15 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone12.getShortName((long) (byte) 10, locale14);
        java.lang.String str16 = dateTimeZone12.getID();
        java.lang.String str17 = dateTimeZone12.getID();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean21 = dateTimeZone12.equals((java.lang.Object) dateTimeZone20);
        java.lang.String str23 = dateTimeZone20.getNameKey((long) (byte) 1);
        boolean boolean24 = dateTimeZone20.isFixed();
        long long26 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, (long) (-1));
        long long30 = dateTimeZone20.convertLocalToUTC((-35999899L), false, 115200096L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-72060001L) + "'", long26 == (-72060001L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-223259899L) + "'", long30 == (-223259899L));
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone1.getOffset(readableInstant29);
        java.lang.String str32 = dateTimeZone1.getName(43020000L);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        java.lang.String str5 = dateTimeZone2.getID();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int9 = dateTimeZone7.getOffsetFromLocal((-1L));
        long long11 = dateTimeZone7.convertUTCToLocal((-1L));
        java.lang.String str13 = dateTimeZone7.getName((-1L));
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone7.getOffset(readableInstant14);
        int int17 = dateTimeZone7.getOffset((long) (byte) 0);
        boolean boolean18 = dateTimeZone2.equals((java.lang.Object) dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone21.getShortName(0L, locale23);
        int int26 = dateTimeZone21.getOffsetFromLocal(187200000L);
        long long28 = dateTimeZone2.getMillisKeepLocal(dateTimeZone21, 111540100L);
        int int30 = dateTimeZone21.getStandardOffset((-229799949L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115199999L + "'", long11 == 115199999L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 111540100L + "'", long28 == 111540100L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60000 + "'", int30 == 60000);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        long long20 = dateTimeZone4.adjustOffset((long) (byte) 1, true);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int24 = dateTimeZone22.getOffsetFromLocal((-1L));
        boolean boolean25 = dateTimeZone22.isFixed();
        long long27 = dateTimeZone22.convertUTCToLocal((long) 10);
        boolean boolean29 = dateTimeZone22.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone22.isLocalDateTimeGap(localDateTime30);
        long long33 = dateTimeZone22.nextTransition(10L);
        long long35 = dateTimeZone22.previousTransition((-115199900L));
        java.lang.String str36 = dateTimeZone22.getID();
        java.lang.String str38 = dateTimeZone22.getShortName(100L);
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone22.isLocalDateTimeGap(localDateTime39);
        long long42 = dateTimeZone22.previousTransition((long) 187200000);
        long long44 = dateTimeZone4.getMillisKeepLocal(dateTimeZone22, (-229859900L));
        org.joda.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = dateTimeZone22.isLocalDateTimeGap(localDateTime45);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60010L + "'", long16 == 60010L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 115200000 + "'", int24 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115200010L + "'", long27 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-115199900L) + "'", long35 == (-115199900L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+32:00" + "'", str38, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 187200000L + "'", long42 == 187200000L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-229859900L) + "'", long44 == (-229859900L));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        int int22 = dateTimeZone17.getStandardOffset((-60001L));
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
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        long long12 = dateTimeZone1.adjustOffset((-474659949L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-474659949L) + "'", long12 == (-474659949L));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        long long8 = dateTimeZone1.adjustOffset((-115140000L), false);
        org.joda.time.tz.Provider provider9 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider9);
        org.joda.time.DateTimeZone.setProvider(provider9);
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) provider9);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115140000L) + "'", long8 == (-115140000L));
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        java.lang.String str3 = dateTimeZone1.getName((-115139999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+35:00" + "'", str3, "+35:00");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        int int10 = dateTimeZone1.getStandardOffset((long) (byte) 100);
        boolean boolean12 = dateTimeZone1.isStandardOffset(115260010L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean15 = dateTimeZone1.isStandardOffset((-230279900L));
        boolean boolean16 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getShortName((-115199903L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 43080000L + "'", long11 == 43080000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399900L) + "'", long13 == (-230399900L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 126000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 126000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        java.lang.String str33 = dateTimeZone2.getNameKey(101L);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone35.getShortName((long) (byte) 10, locale37);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone35.getName((long) (-1), locale40);
        long long44 = dateTimeZone35.convertLocalToUTC((long) (short) -1, false);
        long long46 = dateTimeZone35.nextTransition(115200010L);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int50 = dateTimeZone48.getOffsetFromLocal((-1L));
        boolean boolean51 = dateTimeZone48.isFixed();
        long long53 = dateTimeZone48.convertUTCToLocal((long) 10);
        boolean boolean55 = dateTimeZone48.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime56 = null;
        boolean boolean57 = dateTimeZone48.isLocalDateTimeGap(localDateTime56);
        long long61 = dateTimeZone48.convertLocalToUTC(115199999L, false, (long) (short) 0);
        boolean boolean62 = dateTimeZone35.equals((java.lang.Object) false);
        int int64 = dateTimeZone35.getOffsetFromLocal((long) 60000);
        java.lang.String str66 = dateTimeZone35.getNameKey(302400010L);
        boolean boolean67 = dateTimeZone2.equals((java.lang.Object) dateTimeZone35);
        java.lang.String str69 = dateTimeZone35.getName((-115139948L));
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+32:00" + "'", str38, "+32:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+32:00" + "'", str41, "+32:00");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-115200001L) + "'", long44 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 115200010L + "'", long46 == 115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 115200000 + "'", int50 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 115200010L + "'", long53 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 115200000 + "'", int64 == 115200000);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+32:00" + "'", str69, "+32:00");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(43080000L, locale3);
        long long8 = dateTimeZone1.convertLocalToUTC((-35999899L), true, 115200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-35999899L) + "'", long8 == (-35999899L));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(115200010L, locale4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:01" + "'", str5, "+32:01");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long17 = dateTimeZone14.adjustOffset(115200052L, true);
        java.util.TimeZone timeZone18 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        boolean boolean21 = dateTimeZone1.equals((java.lang.Object) dateTimeZone20);
        java.lang.String str22 = dateTimeZone20.getID();
        boolean boolean23 = dateTimeZone20.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 115200052L + "'", long17 == 115200052L);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:01" + "'", str22, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str16 = dateTimeZone15.toString();
        boolean boolean17 = dateTimeZone15.isFixed();
        boolean boolean18 = dateTimeZone4.equals((java.lang.Object) dateTimeZone15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.010" + "'", str16, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        boolean boolean3 = dateTimeZone2.isFixed();
        int int5 = dateTimeZone2.getStandardOffset(230399999L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName((-115199965L), locale7);
        int int10 = dateTimeZone2.getOffsetFromLocal(360000000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 600000 + "'", int5 == 600000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:10" + "'", str8, "+00:10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 600000 + "'", int10 == 600000);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        java.lang.String str10 = dateTimeZone2.getName((long) 60000);
        int int12 = dateTimeZone2.getStandardOffset(32L);
        long long14 = dateTimeZone2.nextTransition((-230399903L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-230399903L) + "'", long14 == (-230399903L));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone25.getShortName((long) (byte) 10, locale27);
        java.lang.String str30 = dateTimeZone25.getName(10L);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone25.getOffset(readableInstant31);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        boolean boolean34 = dateTimeZone16.equals((java.lang.Object) dateTimeZone25);
        long long37 = dateTimeZone25.convertLocalToUTC((-345599965L), true);
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone25.getOffset(readableInstant38);
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
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:00" + "'", str28, "+32:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 115200000 + "'", int32 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-460799965L) + "'", long37 == (-460799965L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 115200000 + "'", int39 == 115200000);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:01");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int5 = dateTimeZone3.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone6 = dateTimeZone3.toTimeZone();
        long long9 = dateTimeZone3.adjustOffset((-111540000L), false);
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (-115079990L));
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-111540000L) + "'", long9 == (-111540000L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-230219990L) + "'", long11 == (-230219990L));
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        boolean boolean13 = dateTimeZone11.isStandardOffset(120000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        java.lang.String str20 = dateTimeZone1.getShortName(0L, locale19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean22 = dateTimeZone1.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int13 = dateTimeZone1.getStandardOffset(187260000L);
        java.lang.String str14 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        java.lang.String str33 = dateTimeZone2.getNameKey(101L);
        java.lang.String str34 = dateTimeZone2.getID();
        java.lang.String str36 = dateTimeZone2.getShortName((-345419990L));
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:01" + "'", str36, "+00:01");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        int int5 = dateTimeZone1.getStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getShortName((long) (byte) 10, locale9);
        java.lang.String str11 = dateTimeZone7.getID();
        boolean boolean13 = dateTimeZone7.isStandardOffset(10L);
        int int15 = dateTimeZone7.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone17.getShortName((long) (byte) 10, locale19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone17.getOffset(readableInstant21);
        java.lang.String str24 = dateTimeZone17.getName(1L);
        long long26 = dateTimeZone7.getMillisKeepLocal(dateTimeZone17, (long) (short) 1);
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) dateTimeZone17);
        java.lang.Class<?> wildcardClass28 = dateTimeZone17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean13 = dateTimeZone1.isStandardOffset((long) (short) 0);
        int int15 = dateTimeZone1.getOffset((-115200001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((-115139900L));
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        long long6 = dateTimeZone0.convertLocalToUTC((-230339999L), false);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getName((-115199899L), locale8);
        java.lang.String str10 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-115139900L) + "'", long2 == (-115139900L));
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-230339999L) + "'", long6 == (-230339999L));
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str15 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        boolean boolean18 = dateTimeZone1.isFixed();
        int int20 = dateTimeZone1.getOffsetFromLocal(60101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115200000L) + "'", long17 == (-115200000L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        java.lang.String str33 = dateTimeZone2.getNameKey(101L);
        long long35 = dateTimeZone2.convertUTCToLocal((-230400000L));
        java.lang.String str37 = dateTimeZone2.getShortName((-120001L));
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-230340000L) + "'", long35 == (-230340000L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:01" + "'", str37, "+00:01");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 115140010L);
        java.lang.String str7 = dateTimeZone1.getName(115200052L);
        long long10 = dateTimeZone1.adjustOffset(10L, false);
        java.lang.String str12 = dateTimeZone1.getShortName((-60000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118740062L + "'", long5 == 118740062L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.052" + "'", str7, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.052" + "'", str12, "+00:00:00.052");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(1L, false);
        long long10 = dateTimeZone1.nextTransition(302400010L);
        long long13 = dateTimeZone1.adjustOffset((long) '#', false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115199999L) + "'", long8 == (-115199999L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 302400010L + "'", long10 == 302400010L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 1L);
        int int12 = dateTimeZone5.getOffsetFromLocal((long) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone14.getShortName((long) (byte) 10, locale16);
        java.lang.String str18 = dateTimeZone14.getID();
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean23 = dateTimeZone14.equals((java.lang.Object) dateTimeZone22);
        java.lang.String str25 = dateTimeZone22.getNameKey((long) (byte) 1);
        boolean boolean26 = dateTimeZone22.isFixed();
        long long28 = dateTimeZone5.getMillisKeepLocal(dateTimeZone22, 115140000L);
        long long32 = dateTimeZone22.convertLocalToUTC((-115199900L), false, 60010L);
        long long36 = dateTimeZone22.convertLocalToUTC((long) (byte) 10, true, (long) (byte) -1);
        java.lang.String str38 = dateTimeZone22.getNameKey((-230460003L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 43080000L + "'", long28 == 43080000L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-302459900L) + "'", long32 == (-302459900L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-187259990L) + "'", long36 == (-187259990L));
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        boolean boolean19 = dateTimeZone1.isStandardOffset((-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115200000L) + "'", long17 == (-115200000L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+52:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+52:00\" is malformed at \"52:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        boolean boolean14 = dateTimeZone4.isFixed();
        long long16 = dateTimeZone4.previousTransition(0L);
        long long19 = dateTimeZone4.adjustOffset((-589739949L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-589739949L) + "'", long19 == (-589739949L));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str15 = dateTimeZone14.getID();
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
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) '#');
        int int4 = dateTimeZone2.getOffsetFromLocal((-72060002L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2100000 + "'", int4 == 2100000);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.previousTransition((long) (short) -1);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long9 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false, 115200000L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599900L) + "'", long9 == (-3599900L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3600000 + "'", int11 == 3600000);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(60000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.nextTransition(230399999L);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        boolean boolean17 = dateTimeZone1.isStandardOffset(115200010L);
        java.lang.String str19 = dateTimeZone1.getName((-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 230399999L + "'", long13 == 230399999L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        long long14 = dateTimeZone1.previousTransition((-115199900L));
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        long long31 = dateTimeZone17.adjustOffset(0L, true);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int35 = dateTimeZone33.getOffsetFromLocal((-1L));
        boolean boolean36 = dateTimeZone33.isFixed();
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = dateTimeZone33.getOffset(readableInstant37);
        int int40 = dateTimeZone33.getStandardOffset((long) 'a');
        long long43 = dateTimeZone33.convertLocalToUTC((-115199900L), true);
        long long47 = dateTimeZone33.convertLocalToUTC(118740062L, false, (-114599949L));
        boolean boolean48 = dateTimeZone17.equals((java.lang.Object) (-114599949L));
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 115200000 + "'", int35 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 115200000 + "'", int38 == 115200000);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 115200000 + "'", int40 == 115200000);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-230399900L) + "'", long43 == (-230399900L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 3540062L + "'", long47 == 3540062L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        boolean boolean9 = dateTimeZone2.isStandardOffset((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone2.getOffset(readableInstant10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone2.getName((-3539990L), locale13);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean28 = dateTimeZone27.isFixed();
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone27.getName((long) 0, locale30);
        int int33 = dateTimeZone27.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone27.isLocalDateTimeGap(localDateTime34);
        int int37 = dateTimeZone27.getStandardOffset(230399999L);
        org.joda.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = dateTimeZone27.isLocalDateTimeGap(localDateTime38);
        long long41 = dateTimeZone1.getMillisKeepLocal(dateTimeZone27, 230400000L);
        java.lang.String str42 = dateTimeZone27.getID();
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
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Coordinated Universal Time" + "'", str31, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 345600000L + "'", long41 == 345600000L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        long long15 = dateTimeZone1.convertLocalToUTC((-115199998L), true);
        int int17 = dateTimeZone1.getStandardOffset((-59900L));
        java.lang.String str18 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-230399998L) + "'", long15 == (-230399998L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        boolean boolean18 = dateTimeZone2.isStandardOffset((-230339948L));
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        long long8 = dateTimeZone1.adjustOffset((-115140000L), false);
        org.joda.time.tz.Provider provider9 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider9);
        org.joda.time.DateTimeZone.setProvider(provider9);
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) provider9);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int17 = dateTimeZone15.getOffsetFromLocal((-1L));
        boolean boolean18 = dateTimeZone15.isFixed();
        long long20 = dateTimeZone15.convertUTCToLocal((long) 10);
        boolean boolean22 = dateTimeZone15.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone15.isLocalDateTimeGap(localDateTime23);
        long long26 = dateTimeZone15.nextTransition(10L);
        java.util.TimeZone timeZone27 = dateTimeZone15.toTimeZone();
        java.lang.String str29 = dateTimeZone15.getNameKey((-474659949L));
        int int31 = dateTimeZone15.getOffset(115139999L);
        boolean boolean32 = dateTimeZone1.equals((java.lang.Object) dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115140000L) + "'", long8 == (-115140000L));
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115200010L + "'", long20 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 115200000 + "'", int31 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        long long8 = dateTimeZone5.nextTransition((-230339948L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str11 = dateTimeZone10.toString();
        long long13 = dateTimeZone5.getMillisKeepLocal(dateTimeZone10, 120000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-230339948L) + "'", long8 == (-230339948L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 119990L + "'", long13 == 119990L);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        java.lang.String str10 = dateTimeZone2.getName((long) 60000);
        java.lang.String str11 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 1L);
        int int12 = dateTimeZone5.getOffsetFromLocal((long) 10);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone5.getName(230399999L, locale14);
        long long17 = dateTimeZone5.nextTransition(43080000L);
        java.lang.Class<?> wildcardClass18 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115139999L) + "'", long10 == (-115139999L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 43080000L + "'", long17 == 43080000L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) 115200000);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.previousTransition((long) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.lang.Class<?> wildcardClass11 = nameProvider0.getClass();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        int int16 = dateTimeZone9.getStandardOffset((-345599965L));
        boolean boolean17 = dateTimeZone9.isFixed();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 187260000 + "'", int16 == 187260000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        java.lang.String str33 = dateTimeZone2.getNameKey(101L);
        java.lang.String str34 = dateTimeZone2.getID();
        boolean boolean35 = dateTimeZone2.isFixed();
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(52L, locale6);
        java.lang.String str9 = dateTimeZone1.getShortName((long) 10);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-115139965L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        boolean boolean12 = dateTimeZone10.isStandardOffset((-72059948L));
        long long15 = dateTimeZone10.adjustOffset((-3539990L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3539990L) + "'", long15 == (-3539990L));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(52L, locale6);
        java.lang.String str9 = dateTimeZone1.getShortName((long) 10);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long14 = dateTimeZone11.convertLocalToUTC(115200100L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115200100L + "'", long14 == 115200100L);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+32:01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+32:01\" is malformed at \"32:01\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.convertLocalToUTC((-115139900L), false, (long) '4');
        int int10 = dateTimeZone1.getOffsetFromLocal(115200010L);
        long long13 = dateTimeZone1.convertLocalToUTC(118740000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-230339900L) + "'", long8 == (-230339900L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3540000L + "'", long13 == 3540000L);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        long long5 = dateTimeZone2.convertLocalToUTC((long) (short) 100, false);
        boolean boolean6 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-187199900L) + "'", long5 == (-187199900L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone3.getName(0L, locale7);
        java.lang.String str9 = dateTimeZone3.getID();
        boolean boolean11 = dateTimeZone3.equals((java.lang.Object) "+00:00:00.035");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        boolean boolean9 = dateTimeZone1.isStandardOffset((-115199958L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        boolean boolean21 = dateTimeZone2.isStandardOffset(115200032L);
        long long23 = dateTimeZone2.convertUTCToLocal((long) '#');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60010L + "'", long17 == 60010L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-229859900L) + "'", long19 == (-229859900L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 600035L + "'", long23 == 600035L);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        java.lang.String str6 = dateTimeZone2.toString();
        long long10 = dateTimeZone2.convertLocalToUTC(3600101L, true, 3660000L);
        long long12 = dateTimeZone2.previousTransition((-35999899L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3540101L + "'", long10 == 3540101L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-35999899L) + "'", long12 == (-35999899L));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str13 = dateTimeZone1.getName((-115079990L));
        java.lang.String str15 = dateTimeZone1.getShortName((-115199948L));
        int int17 = dateTimeZone1.getOffsetFromLocal((-230400000L));
        int int19 = dateTimeZone1.getStandardOffset((-115079990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-115199903L), locale4);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC((long) 'a', false);
        java.lang.String str11 = dateTimeZone1.getName((-115199900L));
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 96L + "'", long9 == 96L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName((-115200001L), locale2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-345359990L), locale5);
        long long8 = dateTimeZone0.convertUTCToLocal((-345359990L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-230159990L) + "'", long8 == (-230159990L));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        java.lang.Class<?> wildcardClass30 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int24 = dateTimeZone22.getOffsetFromLocal((-1L));
        boolean boolean25 = dateTimeZone22.isFixed();
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone22.getOffset(readableInstant26);
        int int29 = dateTimeZone22.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone30 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        boolean boolean33 = dateTimeZone11.equals((java.lang.Object) dateTimeZone32);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone11.getName((-230400000L), locale35);
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
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 115200000 + "'", int24 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115200000 + "'", int27 == 115200000);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 115200000 + "'", int29 == 115200000);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getShortName((long) 115200000);
        java.lang.String str9 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone9.getShortName((long) 100, locale16);
        java.lang.String str19 = dateTimeZone9.getNameKey((long) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        long long23 = dateTimeZone21.previousTransition(115199999L);
        long long25 = dateTimeZone21.previousTransition((long) 60000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone21.getShortName((-230399998L), locale28);
        java.lang.String str31 = dateTimeZone21.getShortName(43080000L);
        long long33 = dateTimeZone9.getMillisKeepLocal(dateTimeZone21, (-25L));
        int int35 = dateTimeZone21.getOffsetFromLocal((-115080001L));
        long long39 = dateTimeZone21.convertLocalToUTC(115139999L, false, 115140010L);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:01" + "'", str17, "+52:01");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 115199999L + "'", long23 == 115199999L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60000L + "'", long25 == 60000L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 72059975L + "'", long33 == 72059975L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 115200000 + "'", int35 == 115200000);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-60001L) + "'", long39 == (-60001L));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertLocalToUTC((-115199903L), true, (long) 'a');
        boolean boolean15 = dateTimeZone1.isStandardOffset(115139999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399903L) + "'", long13 == (-230399903L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        long long12 = dateTimeZone1.nextTransition(115200010L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int16 = dateTimeZone14.getOffsetFromLocal((-1L));
        boolean boolean17 = dateTimeZone14.isFixed();
        long long19 = dateTimeZone14.convertUTCToLocal((long) 10);
        boolean boolean21 = dateTimeZone14.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone14.isLocalDateTimeGap(localDateTime22);
        long long27 = dateTimeZone14.convertLocalToUTC(115199999L, false, (long) (short) 0);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) false);
        int int30 = dateTimeZone1.getOffsetFromLocal((long) 60000);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone1.getName((-229799949L), locale32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200010L + "'", long12 == 115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200010L + "'", long19 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:00" + "'", str33, "+32:00");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.032");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        java.lang.String str21 = dateTimeZone17.getID();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        long long24 = dateTimeZone17.getMillisKeepLocal(dateTimeZone22, 187200000L);
        java.lang.String str26 = dateTimeZone17.getShortName((-72060001L));
        java.lang.String str27 = dateTimeZone17.toString();
        java.lang.Class<?> wildcardClass28 = dateTimeZone17.getClass();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 187200000L + "'", long24 == 187200000L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        long long23 = dateTimeZone4.convertLocalToUTC(115200000L, false, (long) 100);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone4.getOffset(readableInstant24);
        long long27 = dateTimeZone4.previousTransition((-115139999L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115140000L + "'", long19 == 115140000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 115200000 + "'", int25 == 115200000);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-115139999L) + "'", long27 == (-115139999L));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.adjustOffset((long) (byte) -1, true);
        boolean boolean7 = dateTimeZone2.isFixed();
        int int9 = dateTimeZone2.getOffsetFromLocal((-115199900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName((long) 100, locale15);
        boolean boolean18 = dateTimeZone1.isStandardOffset((-230399958L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        java.lang.String str5 = dateTimeZone2.getID();
        long long7 = dateTimeZone2.convertUTCToLocal((-115139990L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115079990L) + "'", long7 == (-115079990L));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        java.lang.Class<?> wildcardClass18 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        int int4 = dateTimeZone2.getOffset(115200010L);
        int int6 = dateTimeZone2.getStandardOffset((long) 2100000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        long long7 = dateTimeZone1.convertUTCToLocal((-230339900L));
        int int9 = dateTimeZone1.getOffset((-59948L));
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName((-111600000L), locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115139900L) + "'", long7 == (-115139900L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        int int12 = dateTimeZone1.getStandardOffset((-230339999L));
        long long15 = dateTimeZone1.convertLocalToUTC(0L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200000L) + "'", long15 == (-115200000L));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone3.getName(0L, locale7);
        long long12 = dateTimeZone3.convertLocalToUTC((-114599949L), true, (-115139900L));
        long long15 = dateTimeZone3.adjustOffset((-111480100L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-229799949L) + "'", long12 == (-229799949L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-111480100L) + "'", long15 == (-111480100L));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 349200000 + "'", int3 == 349200000);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        long long12 = dateTimeZone1.nextTransition(115200010L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int16 = dateTimeZone14.getOffsetFromLocal((-1L));
        boolean boolean17 = dateTimeZone14.isFixed();
        long long19 = dateTimeZone14.convertUTCToLocal((long) 10);
        boolean boolean21 = dateTimeZone14.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone14.isLocalDateTimeGap(localDateTime22);
        long long27 = dateTimeZone14.convertLocalToUTC(115199999L, false, (long) (short) 0);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) false);
        int int30 = dateTimeZone1.getOffsetFromLocal((long) 60000);
        java.lang.String str32 = dateTimeZone1.getNameKey(302400010L);
        int int34 = dateTimeZone1.getOffset((long) 0);
        java.lang.String str35 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200010L + "'", long12 == 115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200010L + "'", long19 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 115200000 + "'", int34 == 115200000);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+32:00" + "'", str35, "+32:00");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        long long22 = dateTimeZone1.convertLocalToUTC((-230159990L), true, 32L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115200000L) + "'", long17 == (-115200000L));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-345359990L) + "'", long22 == (-345359990L));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName((long) (short) 0, locale2);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (byte) -1);
        int int7 = dateTimeZone0.getOffset((-230159990L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coordinated Universal Time" + "'", str3, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        long long12 = dateTimeZone1.convertLocalToUTC(3540062L, true, (long) 115200000);
        java.lang.String str14 = dateTimeZone1.getNameKey(115200001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-111659938L) + "'", long12 == (-111659938L));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        boolean boolean12 = dateTimeZone10.isStandardOffset((-72059948L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        long long10 = dateTimeZone2.previousTransition(60000L);
        int int12 = dateTimeZone2.getOffset(115200101L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone2.getName((-230339900L), locale14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone2.getShortName((-230339999L), locale17);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60000L + "'", long10 == 60000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        long long16 = dateTimeZone4.convertLocalToUTC((long) (short) -1, true);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone4.getShortName((long) (byte) 1, locale18);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115200001L) + "'", long16 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) 1);
        boolean boolean5 = dateTimeZone1.isStandardOffset(52L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 1, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        int int10 = dateTimeZone1.getOffset(0L);
        long long12 = dateTimeZone1.nextTransition(0L);
        boolean boolean14 = dateTimeZone1.isStandardOffset((-115139948L));
        long long17 = dateTimeZone1.adjustOffset(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        long long10 = dateTimeZone2.adjustOffset(101L, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone12.getName(10L, locale14);
        boolean boolean16 = dateTimeZone12.isFixed();
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone12.getOffset(readableInstant17);
        long long20 = dateTimeZone2.getMillisKeepLocal(dateTimeZone12, (-111540000L));
        java.lang.String str22 = dateTimeZone2.getNameKey(115139999L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 101L + "'", long10 == 101L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-111480100L) + "'", long20 == (-111480100L));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-72060001L), locale4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(600000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone9.getShortName((long) (short) 0, locale16);
        long long21 = dateTimeZone9.convertLocalToUTC(115200052L, false, 230339999L);
        boolean boolean22 = dateTimeZone9.isFixed();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone25.isLocalDateTimeGap(localDateTime26);
        java.util.TimeZone timeZone28 = dateTimeZone25.toTimeZone();
        java.lang.Object obj29 = null;
        boolean boolean30 = dateTimeZone25.equals(obj29);
        boolean boolean31 = dateTimeZone9.equals(obj29);
        java.lang.String str32 = dateTimeZone9.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:01" + "'", str17, "+52:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-72059948L) + "'", long21 == (-72059948L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:10");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+52:01" + "'", str32, "+52:01");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        int int10 = dateTimeZone2.getOffset((-115139999L));
        boolean boolean11 = dateTimeZone2.isFixed();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone13.getShortName((long) (byte) 10, locale15);
        java.lang.String str17 = dateTimeZone13.getID();
        java.lang.String str18 = dateTimeZone13.getID();
        java.lang.String str20 = dateTimeZone13.getShortName(1L);
        long long22 = dateTimeZone13.previousTransition((long) (short) 100);
        java.lang.String str24 = dateTimeZone13.getNameKey((-230339900L));
        boolean boolean25 = dateTimeZone2.equals((java.lang.Object) dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone27.getShortName((long) (byte) 10, locale29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone27.getName((long) (-1), locale32);
        long long36 = dateTimeZone27.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str37 = dateTimeZone27.getID();
        int int39 = dateTimeZone27.getOffset((long) (byte) 100);
        java.lang.String str40 = dateTimeZone27.toString();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone42.getShortName((long) (byte) 10, locale44);
        java.lang.String str46 = dateTimeZone42.getID();
        boolean boolean48 = dateTimeZone42.isStandardOffset(10L);
        int int50 = dateTimeZone42.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale54 = null;
        java.lang.String str55 = dateTimeZone52.getShortName((long) (byte) 10, locale54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        int int57 = dateTimeZone52.getOffset(readableInstant56);
        java.lang.String str59 = dateTimeZone52.getName(1L);
        long long61 = dateTimeZone42.getMillisKeepLocal(dateTimeZone52, (long) (short) 1);
        java.lang.String str63 = dateTimeZone42.getShortName(0L);
        boolean boolean64 = dateTimeZone27.equals((java.lang.Object) dateTimeZone42);
        boolean boolean65 = dateTimeZone2.equals((java.lang.Object) dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:00" + "'", str33, "+32:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-115200001L) + "'", long36 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+32:00" + "'", str37, "+32:00");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 115200000 + "'", int39 == 115200000);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+32:00" + "'", str40, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+32:00" + "'", str45, "+32:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+32:00" + "'", str46, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 115200000 + "'", int50 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+32:00" + "'", str55, "+32:00");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 115200000 + "'", int57 == 115200000);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+32:00" + "'", str59, "+32:00");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+32:00" + "'", str63, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        java.lang.String str25 = dateTimeZone10.getID();
        long long29 = dateTimeZone10.convertLocalToUTC(3540101L, true, 59975L);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-111659899L) + "'", long29 == (-111659899L));
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) 100, locale8);
        java.lang.String str10 = dateTimeZone1.toString();
        long long12 = dateTimeZone1.nextTransition((-119900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-119900L) + "'", long12 == (-119900L));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        long long3 = dateTimeZone1.nextTransition((long) 60000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((-230279990L), locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60000L + "'", long3 == 60000L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        long long27 = dateTimeZone17.convertLocalToUTC(360000000L, false);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 244800000L + "'", long27 == 244800000L);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone9.getShortName((long) (short) 0, locale16);
        long long21 = dateTimeZone9.convertLocalToUTC(115200052L, false, 230339999L);
        boolean boolean22 = dateTimeZone9.isFixed();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone25.isLocalDateTimeGap(localDateTime26);
        java.util.TimeZone timeZone28 = dateTimeZone25.toTimeZone();
        java.lang.Object obj29 = null;
        boolean boolean30 = dateTimeZone25.equals(obj29);
        boolean boolean31 = dateTimeZone9.equals(obj29);
        java.lang.Class<?> wildcardClass32 = dateTimeZone9.getClass();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:01" + "'", str17, "+52:01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-72059948L) + "'", long21 == (-72059948L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:10");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str4 = dateTimeZone1.getNameKey((long) 'a');
        long long7 = dateTimeZone1.adjustOffset((long) 3600000, false);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(115199999L, false, (long) (short) 0);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) 60000);
        int int18 = dateTimeZone1.getOffsetFromLocal((-115199999L));
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone1.isLocalDateTimeGap(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        long long9 = dateTimeZone2.nextTransition((long) 100);
        int int11 = dateTimeZone2.getStandardOffset(1L);
        long long13 = dateTimeZone2.convertUTCToLocal((long) (short) 0);
        long long16 = dateTimeZone2.convertLocalToUTC((long) '4', true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60000L + "'", long13 == 60000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-59948L) + "'", long16 == (-59948L));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        boolean boolean3 = dateTimeZone2.isFixed();
        java.lang.String str4 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:10" + "'", str4, "+00:10");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        int int20 = dateTimeZone1.getStandardOffset((-183660000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (short) 0);
        long long6 = dateTimeZone2.convertLocalToUTC((-345539900L), true, (-115200001L));
        java.lang.Class<?> wildcardClass7 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-341939900L) + "'", long6 == (-341939900L));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        long long26 = dateTimeZone11.nextTransition(51L);
        int int28 = dateTimeZone11.getOffset(115260010L);
        java.util.TimeZone timeZone29 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 51L + "'", long26 == 51L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115200000 + "'", int28 == 115200000);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str9 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int12 = dateTimeZone1.getOffsetFromLocal((-115199896L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        long long12 = dateTimeZone1.nextTransition(115200010L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int16 = dateTimeZone14.getOffsetFromLocal((-1L));
        boolean boolean17 = dateTimeZone14.isFixed();
        long long19 = dateTimeZone14.convertUTCToLocal((long) 10);
        boolean boolean21 = dateTimeZone14.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone14.isLocalDateTimeGap(localDateTime22);
        long long27 = dateTimeZone14.convertLocalToUTC(115199999L, false, (long) (short) 0);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) false);
        int int30 = dateTimeZone1.getOffsetFromLocal((long) 60000);
        java.lang.String str32 = dateTimeZone1.getNameKey(302400010L);
        long long34 = dateTimeZone1.convertUTCToLocal((-115259980L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200010L + "'", long12 == 115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200010L + "'", long19 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-59980L) + "'", long34 == (-59980L));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        long long4 = dateTimeZone2.convertUTCToLocal(3660000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4260000L + "'", long4 == 4260000L);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        long long27 = dateTimeZone1.convertLocalToUTC((long) (short) 1, true, (-115200000L));
        long long29 = dateTimeZone1.previousTransition(115140035L);
        long long32 = dateTimeZone1.adjustOffset((-230399965L), true);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-115199999L) + "'", long27 == (-115199999L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 115140035L + "'", long29 == 115140035L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-230399965L) + "'", long32 == (-230399965L));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        int int11 = dateTimeZone1.getOffset((long) (byte) 0);
        long long15 = dateTimeZone1.convertLocalToUTC(0L, false, 115200032L);
        long long18 = dateTimeZone1.adjustOffset((long) 3600000, false);
        long long21 = dateTimeZone1.convertLocalToUTC((-230399896L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200000L) + "'", long15 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3600000L + "'", long18 == 3600000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-345599896L) + "'", long21 == (-345599896L));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(1L, false);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) 100);
        long long16 = dateTimeZone1.convertLocalToUTC(115200001L, true, (long) ' ');
        java.lang.String str18 = dateTimeZone1.getName(417600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115199999L) + "'", long8 == (-115199999L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(60000, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 60000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.lang.String str7 = dateTimeZone1.getNameKey(0L);
        java.lang.String str9 = dateTimeZone1.getNameKey(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.String str5 = dateTimeZone2.toString();
        java.lang.String str6 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        java.lang.String str11 = dateTimeZone1.toString();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName(43080000L, locale13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        java.lang.String str17 = dateTimeZone1.getID();
        long long19 = dateTimeZone1.convertUTCToLocal((-115259899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-59899L) + "'", long19 == (-59899L));
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long14 = dateTimeZone1.convertLocalToUTC((-115139999L), true);
        java.lang.String str16 = dateTimeZone1.getName(0L);
        java.lang.String str18 = dateTimeZone1.getShortName((-187259990L));
        long long20 = dateTimeZone1.convertUTCToLocal(0L);
        int int22 = dateTimeZone1.getOffsetFromLocal((-35999899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-230339999L) + "'", long14 == (-230339999L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115200000L + "'", long20 == 115200000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        long long19 = dateTimeZone1.previousTransition(4260000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-474599949L) + "'", long16 == (-474599949L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4260000L + "'", long19 == 4260000L);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName((long) 60000, locale14);
        java.lang.String str17 = dateTimeZone1.getShortName((-114659899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        long long31 = dateTimeZone17.adjustOffset(0L, true);
        java.util.TimeZone timeZone32 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone33);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone1.isLocalDateTimeGap(localDateTime21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone1.getShortName(1L, locale24);
        java.lang.Class<?> wildcardClass26 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long3 = dateTimeZone0.nextTransition((-115199899L));
        long long5 = dateTimeZone0.convertUTCToLocal((-115139900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115199899L) + "'", long3 == (-115199899L));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-115139900L) + "'", long5 == (-115139900L));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int10 = dateTimeZone8.getOffsetFromLocal((long) 10);
        boolean boolean11 = dateTimeZone6.equals((java.lang.Object) 10);
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) dateTimeZone6);
        java.lang.String str14 = dateTimeZone1.getShortName((long) (short) 1);
        java.lang.String str16 = dateTimeZone1.getName(230340010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.previousTransition((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone2.getShortName(233940000L);
        int int15 = dateTimeZone2.getOffset((-115199939L));
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int19 = dateTimeZone17.getOffsetFromLocal((-1L));
        boolean boolean20 = dateTimeZone17.isFixed();
        long long24 = dateTimeZone17.convertLocalToUTC((-115139900L), false, (long) '4');
        int int26 = dateTimeZone17.getOffsetFromLocal(115200010L);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        long long29 = dateTimeZone17.getMillisKeepLocal(dateTimeZone27, (long) 187260000);
        long long31 = dateTimeZone2.getMillisKeepLocal(dateTimeZone17, (long) 360000000);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-230339900L) + "'", long24 == (-230339900L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115200000 + "'", int26 == 115200000);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 302460000L + "'", long29 == 302460000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 244860000L + "'", long31 == 244860000L);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        int int20 = dateTimeZone1.getStandardOffset((-115139948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        long long12 = dateTimeZone1.nextTransition(115200010L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int16 = dateTimeZone14.getOffsetFromLocal((-1L));
        boolean boolean17 = dateTimeZone14.isFixed();
        long long19 = dateTimeZone14.convertUTCToLocal((long) 10);
        boolean boolean21 = dateTimeZone14.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone14.isLocalDateTimeGap(localDateTime22);
        long long27 = dateTimeZone14.convertLocalToUTC(115199999L, false, (long) (short) 0);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) false);
        int int30 = dateTimeZone1.getOffsetFromLocal((long) 60000);
        java.lang.String str32 = dateTimeZone1.getNameKey(302400010L);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int36 = dateTimeZone34.getOffsetFromLocal((-1L));
        boolean boolean37 = dateTimeZone34.isFixed();
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone34.getOffset(readableInstant38);
        int int41 = dateTimeZone34.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone42 = dateTimeZone34.toTimeZone();
        long long46 = dateTimeZone34.convertLocalToUTC((-115199903L), true, (long) 'a');
        boolean boolean47 = dateTimeZone1.equals((java.lang.Object) (-115199903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200010L + "'", long12 == 115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200010L + "'", long19 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 115200000 + "'", int36 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 115200000 + "'", int39 == 115200000);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 115200000 + "'", int41 == 115200000);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-230399903L) + "'", long46 == (-230399903L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(1L, false);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) 100);
        long long16 = dateTimeZone1.convertLocalToUTC(115200001L, true, (long) ' ');
        long long18 = dateTimeZone1.nextTransition((long) 187260000);
        long long21 = dateTimeZone1.convertLocalToUTC((-115139948L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115199999L) + "'", long8 == (-115199999L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 187260000L + "'", long18 == 187260000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-230339948L) + "'", long21 == (-230339948L));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone9.getShortName((long) 100, locale16);
        boolean boolean19 = dateTimeZone9.isStandardOffset((-115199966L));
        java.lang.String str21 = dateTimeZone9.getShortName(115200035L);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:01" + "'", str17, "+52:01");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+52:01" + "'", str21, "+52:01");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        long long17 = dateTimeZone1.nextTransition((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone19.getShortName((long) (byte) 10, locale21);
        java.lang.String str23 = dateTimeZone19.getID();
        java.lang.String str24 = dateTimeZone19.getID();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean28 = dateTimeZone19.equals((java.lang.Object) dateTimeZone27);
        java.lang.String str30 = dateTimeZone27.getNameKey((long) (byte) 1);
        boolean boolean31 = dateTimeZone27.isFixed();
        java.util.TimeZone timeZone32 = dateTimeZone27.toTimeZone();
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone27.getShortName((long) 100, locale34);
        long long37 = dateTimeZone1.getMillisKeepLocal(dateTimeZone27, (-229799949L));
        long long39 = dateTimeZone1.previousTransition(3660000L);
        int int41 = dateTimeZone1.getOffset((-115139948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+52:01" + "'", str35, "+52:01");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-301859949L) + "'", long37 == (-301859949L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 3660000L + "'", long39 == 3660000L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 115200000 + "'", int41 == 115200000);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        int int4 = dateTimeZone2.getStandardOffset((-345599965L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long7 = dateTimeZone3.getMillisKeepLocal(dateTimeZone5, (long) '4');
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) '4');
        java.lang.String str9 = dateTimeZone1.getID();
        java.lang.String str10 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        long long4 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (-385319990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-500519990L) + "'", long4 == (-500519990L));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        long long8 = dateTimeZone1.adjustOffset((-115140000L), false);
        org.joda.time.tz.Provider provider9 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider9);
        org.joda.time.DateTimeZone.setProvider(provider9);
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) provider9);
        org.joda.time.DateTimeZone.setProvider(provider9);
        java.lang.Class<?> wildcardClass14 = provider9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115140000L) + "'", long8 == (-115140000L));
        org.junit.Assert.assertNotNull(provider9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset(115200035L);
        boolean boolean9 = dateTimeZone2.equals((java.lang.Object) (-187260001L));
        boolean boolean10 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str13 = dateTimeZone1.getName((-115079990L));
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        boolean boolean17 = dateTimeZone1.isStandardOffset(3600101L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        int int11 = dateTimeZone1.getOffset((long) (byte) 0);
        long long15 = dateTimeZone1.convertLocalToUTC(0L, false, 115200032L);
        long long18 = dateTimeZone1.adjustOffset((long) 3600000, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass20 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200000L) + "'", long15 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3600000L + "'", long18 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        boolean boolean18 = dateTimeZone1.isStandardOffset(302400010L);
        long long21 = dateTimeZone1.convertLocalToUTC((-115140000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-230340000L) + "'", long21 == (-230340000L));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) 1);
        boolean boolean5 = dateTimeZone1.isStandardOffset(52L);
        java.lang.String str6 = dateTimeZone1.toString();
        int int8 = dateTimeZone1.getOffset(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        long long16 = dateTimeZone4.convertLocalToUTC((long) (short) 100, true);
        boolean boolean18 = dateTimeZone4.isStandardOffset((-187320000L));
        long long20 = dateTimeZone4.nextTransition((-230339900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-230339900L) + "'", long20 == (-230339900L));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((-115200001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115200001L) + "'", long3 == (-115200001L));
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone31.getName((-25L), locale40);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+32:00" + "'", str41, "+32:00");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(1L, false);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115199999L) + "'", long8 == (-115199999L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        long long31 = dateTimeZone17.adjustOffset(0L, true);
        java.lang.String str33 = dateTimeZone17.getNameKey(3540000L);
        java.lang.Class<?> wildcardClass34 = dateTimeZone17.getClass();
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        int int26 = dateTimeZone11.getStandardOffset(0L);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115200000 + "'", int26 == 115200000);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        long long21 = dateTimeZone2.adjustOffset((-115199947L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115139999L + "'", long10 == 115139999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115139948L) + "'", long16 == (-115139948L));
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-115199947L) + "'", long21 == (-115199947L));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.Class<?> wildcardClass11 = timeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        long long3 = dateTimeZone1.nextTransition((-115139958L));
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName((-115140000L), locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115139958L) + "'", long3 == (-115139958L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.010" + "'", str6, "+00:00:00.010");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        int int9 = dateTimeZone1.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone10.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone12.nextTransition((long) 'a');
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, 101L);
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) long16);
        boolean boolean19 = dateTimeZone1.isStandardOffset((long) 'a');
        java.lang.String str21 = dateTimeZone1.getShortName(43139999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60101L + "'", long16 == 60101L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        long long23 = dateTimeZone4.convertLocalToUTC(115200000L, false, (long) 100);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone4.getOffset(readableInstant24);
        long long28 = dateTimeZone4.convertLocalToUTC((-115199947L), false);
        int int30 = dateTimeZone4.getOffsetFromLocal((-72119990L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115140000L + "'", long19 == 115140000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 115200000 + "'", int25 == 115200000);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-230399947L) + "'", long28 == (-230399947L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone1.isStandardOffset(111540100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long5 = dateTimeZone3.convertUTCToLocal((-187199900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-187199900L) + "'", long5 == (-187199900L));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        boolean boolean6 = dateTimeZone2.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getShortName(230339999L, locale8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        boolean boolean19 = dateTimeZone4.isStandardOffset(60010L);
        java.lang.String str21 = dateTimeZone4.getName((long) '#');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        java.lang.String str12 = dateTimeZone9.getNameKey((long) (byte) 1);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone14.previousTransition((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int23 = dateTimeZone21.getOffsetFromLocal((long) 10);
        boolean boolean24 = dateTimeZone19.equals((java.lang.Object) 10);
        boolean boolean25 = dateTimeZone14.equals((java.lang.Object) dateTimeZone19);
        long long27 = dateTimeZone9.getMillisKeepLocal(dateTimeZone19, (long) '#');
        java.lang.String str29 = dateTimeZone9.getNameKey((-229799899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 35L + "'", long27 == 35L);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        int int18 = dateTimeZone4.getOffsetFromLocal((long) 1);
        long long20 = dateTimeZone4.nextTransition((-3659900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60010L + "'", long16 == 60010L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3659900L) + "'", long20 == (-3659900L));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        long long16 = dateTimeZone4.convertLocalToUTC((long) (short) 100, true);
        java.lang.String str18 = dateTimeZone4.getNameKey((long) (short) 10);
        boolean boolean20 = dateTimeZone4.equals((java.lang.Object) (-115139990L));
        java.lang.String str22 = dateTimeZone4.getShortName((-115199958L));
        long long25 = dateTimeZone4.adjustOffset((-111480100L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-111480100L) + "'", long25 == (-111480100L));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.adjustOffset((long) (byte) -1, true);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone8.previousTransition((long) (byte) -1);
        long long14 = dateTimeZone8.convertLocalToUTC(115199999L, true, (long) '#');
        long long16 = dateTimeZone8.nextTransition((long) 10);
        int int18 = dateTimeZone8.getOffsetFromLocal((-115199900L));
        long long20 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone8.getOffset(readableInstant21);
        long long26 = dateTimeZone8.convertLocalToUTC(51L, true, (-115199949L));
        long long28 = dateTimeZone8.convertUTCToLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str32 = dateTimeZone31.toString();
        long long35 = dateTimeZone31.adjustOffset((long) (byte) -1, true);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long39 = dateTimeZone37.previousTransition((long) (byte) -1);
        long long43 = dateTimeZone37.convertLocalToUTC(115199999L, true, (long) '#');
        long long45 = dateTimeZone37.nextTransition((long) 10);
        int int47 = dateTimeZone37.getOffsetFromLocal((-115199900L));
        long long49 = dateTimeZone31.getMillisKeepLocal(dateTimeZone37, (long) (byte) 1);
        long long53 = dateTimeZone31.convertLocalToUTC((long) (-1), false, (long) 187260000);
        org.joda.time.ReadableInstant readableInstant54 = null;
        int int55 = dateTimeZone31.getOffset(readableInstant54);
        long long57 = dateTimeZone8.getMillisKeepLocal(dateTimeZone31, 51L);
        long long59 = dateTimeZone31.convertUTCToLocal((-230159990L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-115139999L) + "'", long20 == (-115139999L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115199949L) + "'", long26 == (-115199949L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 115200000L + "'", long28 == 115200000L);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:01" + "'", str32, "+00:01");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 115200000 + "'", int47 == 115200000);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-115139999L) + "'", long49 == (-115139999L));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-60001L) + "'", long53 == (-60001L));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 60000 + "'", int55 == 60000);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 115140051L + "'", long57 == 115140051L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-230099990L) + "'", long59 == (-230099990L));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        boolean boolean9 = dateTimeZone1.isStandardOffset(101L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str12 = dateTimeZone11.toString();
        boolean boolean13 = dateTimeZone11.isFixed();
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) boolean13);
        boolean boolean15 = dateTimeZone1.isFixed();
        boolean boolean17 = dateTimeZone1.isStandardOffset((-230399998L));
        long long19 = dateTimeZone1.convertUTCToLocal(60001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60001L + "'", long19 == 60001L);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) 100, locale8);
        long long12 = dateTimeZone1.adjustOffset(97L, false);
        int int14 = dateTimeZone1.getOffset((long) 1);
        int int16 = dateTimeZone1.getOffset(60001L);
        long long18 = dateTimeZone1.nextTransition((-111600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-111600000L) + "'", long18 == (-111600000L));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        boolean boolean4 = dateTimeZone0.isStandardOffset((-233939900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+32:00" + "'", str1, "+32:00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:00" + "'", str2, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long4 = dateTimeZone1.adjustOffset(115200052L, true);
        long long6 = dateTimeZone1.previousTransition(115200052L);
        long long8 = dateTimeZone1.convertUTCToLocal((long) 3600000);
        int int10 = dateTimeZone1.getStandardOffset((-111600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200052L + "'", long4 == 115200052L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200052L + "'", long6 == 115200052L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3660000L + "'", long8 == 3660000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        boolean boolean6 = dateTimeZone2.isFixed();
        java.lang.String str8 = dateTimeZone2.getName(115140099L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) 115200000, locale7);
        int int10 = dateTimeZone1.getStandardOffset(230399999L);
        java.lang.String str12 = dateTimeZone1.getNameKey(43020000L);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        long long16 = dateTimeZone1.convertUTCToLocal(230399997L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 230399997L + "'", long16 == 230399997L);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long14 = dateTimeZone1.convertLocalToUTC((-115139999L), true);
        java.lang.String str16 = dateTimeZone1.getName(0L);
        java.lang.String str18 = dateTimeZone1.getShortName((-187259990L));
        long long20 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str22 = dateTimeZone1.getNameKey(60101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-230339999L) + "'", long14 == (-230339999L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115200000L + "'", long20 == 115200000L);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str11 = dateTimeZone1.getID();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((long) (byte) 10, locale13);
        java.lang.String str15 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        long long10 = dateTimeZone1.adjustOffset((-115140001L), true);
        java.lang.String str12 = dateTimeZone1.getShortName(34L);
        java.lang.String str13 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115140001L) + "'", long10 == (-115140001L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        long long16 = dateTimeZone4.convertLocalToUTC((long) (short) 100, true);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone4.getName((-230459903L), locale18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int23 = dateTimeZone21.getStandardOffset((-1L));
        java.lang.String str25 = dateTimeZone21.getShortName((-115139948L));
        org.joda.time.tz.NameProvider nameProvider26 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider26);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider26);
        boolean boolean29 = dateTimeZone21.equals((java.lang.Object) nameProvider26);
        boolean boolean30 = dateTimeZone4.equals((java.lang.Object) dateTimeZone21);
        boolean boolean31 = dateTimeZone21.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertNotNull(nameProvider26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName(0L, locale10);
        long long14 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115200000L) + "'", long14 == (-115200000L));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        long long16 = dateTimeZone4.convertLocalToUTC((long) (short) 100, true);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone4.getName((-230459903L), locale18);
        java.lang.String str21 = dateTimeZone4.getShortName((-3599901L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone16.getName(0L, locale30);
        long long33 = dateTimeZone16.previousTransition(0L);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        long long12 = dateTimeZone1.nextTransition(115200010L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int16 = dateTimeZone14.getOffsetFromLocal((-1L));
        boolean boolean17 = dateTimeZone14.isFixed();
        long long19 = dateTimeZone14.convertUTCToLocal((long) 10);
        boolean boolean21 = dateTimeZone14.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone14.isLocalDateTimeGap(localDateTime22);
        long long27 = dateTimeZone14.convertLocalToUTC(115199999L, false, (long) (short) 0);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) false);
        long long31 = dateTimeZone1.adjustOffset((-115139990L), false);
        long long33 = dateTimeZone1.nextTransition(0L);
        int int35 = dateTimeZone1.getOffset((-115199999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200010L + "'", long12 == 115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200010L + "'", long19 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115139990L) + "'", long31 == (-115139990L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 115200000 + "'", int35 == 115200000);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getName((-115199989L), locale20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115200000L) + "'", long17 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long3 = dateTimeZone1.convertUTCToLocal((long) 1);
        java.lang.String str5 = dateTimeZone1.getShortName((long) 3600000);
        boolean boolean7 = dateTimeZone1.isStandardOffset(115199900L);
        boolean boolean8 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        long long13 = dateTimeZone1.convertLocalToUTC((-302459900L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-417659900L) + "'", long13 == (-417659900L));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        int int19 = dateTimeZone1.getStandardOffset(187200000L);
        int int21 = dateTimeZone1.getStandardOffset((long) 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 115200000 + "'", int21 == 115200000);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        java.lang.Class<?> wildcardClass23 = dateTimeZone17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.nextTransition(230399999L);
        boolean boolean14 = dateTimeZone1.isFixed();
        java.lang.String str15 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone17.getShortName((long) (byte) 10, locale19);
        int int22 = dateTimeZone17.getOffsetFromLocal((long) (byte) 1);
        java.lang.String str24 = dateTimeZone17.getNameKey((long) 115200000);
        int int26 = dateTimeZone17.getOffsetFromLocal(115200000L);
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) dateTimeZone17);
        long long31 = dateTimeZone17.convertLocalToUTC(0L, true, 120010L);
        long long33 = dateTimeZone17.nextTransition(120000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 230399999L + "'", long13 == 230399999L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115200000 + "'", int26 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115200000L) + "'", long31 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 120000L + "'", long33 == 120000L);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone1.getShortName(0L, locale23);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str13 = dateTimeZone1.getName((-115079990L));
        int int15 = dateTimeZone1.getOffset((-151199899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        java.lang.String str27 = dateTimeZone10.getName((long) (-3600000));
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        int int5 = dateTimeZone1.getStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getShortName((long) (byte) 10, locale9);
        java.lang.String str11 = dateTimeZone7.getID();
        boolean boolean13 = dateTimeZone7.isStandardOffset(10L);
        int int15 = dateTimeZone7.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone17.getShortName((long) (byte) 10, locale19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone17.getOffset(readableInstant21);
        java.lang.String str24 = dateTimeZone17.getName(1L);
        long long26 = dateTimeZone7.getMillisKeepLocal(dateTimeZone17, (long) (short) 1);
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) dateTimeZone17);
        long long29 = dateTimeZone1.convertUTCToLocal(59975L);
        java.lang.String str31 = dateTimeZone1.getName(51L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 119975L + "'", long29 == 119975L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(60010L, locale10);
        int int13 = dateTimeZone1.getStandardOffset((-3599901L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        java.lang.String str16 = dateTimeZone3.getName(72000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199958L) + "'", long14 == (-115199958L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset((-111540000L));
        long long5 = dateTimeZone1.convertUTCToLocal(115200000L);
        java.lang.String str6 = dateTimeZone1.toString();
        int int8 = dateTimeZone1.getOffsetFromLocal(230339910L);
        long long10 = dateTimeZone1.nextTransition(115140035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115200000L + "'", long5 == 115200000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115140035L + "'", long10 == 115140035L);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone4.getName(115199999L, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:01");
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        long long5 = dateTimeZone1.convertUTCToLocal(118740000L);
        int int7 = dateTimeZone1.getStandardOffset((-59900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118800000L + "'", long5 == 118800000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        int int21 = dateTimeZone2.getStandardOffset((-230339999L));
        long long23 = dateTimeZone2.nextTransition((-230399965L));
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-230399965L) + "'", long23 == (-230399965L));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        int int10 = dateTimeZone2.getOffset((-115139999L));
        boolean boolean11 = dateTimeZone2.isFixed();
        java.util.TimeZone timeZone12 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 1);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) 115200000);
        int int10 = dateTimeZone1.getOffsetFromLocal(115200000L);
        boolean boolean12 = dateTimeZone1.isStandardOffset((long) 115200000);
        java.lang.String str13 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) 100);
        java.lang.String str18 = dateTimeZone1.getShortName(115139999L);
        long long20 = dateTimeZone1.convertUTCToLocal((long) (byte) 100);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone1.getOffset(readableInstant21);
        boolean boolean23 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115200100L + "'", long20 == 115200100L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int8 = dateTimeZone6.getOffsetFromLocal((-1L));
        boolean boolean9 = dateTimeZone6.isFixed();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone6.getOffset(readableInstant10);
        int int13 = dateTimeZone6.getStandardOffset((long) 'a');
        long long16 = dateTimeZone6.convertLocalToUTC((-115199900L), true);
        int int18 = dateTimeZone6.getOffset(35L);
        boolean boolean19 = dateTimeZone2.equals((java.lang.Object) 35L);
        boolean boolean20 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-230399900L) + "'", long16 == (-230399900L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName((-115200001L), locale2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-345359990L), locale5);
        java.lang.Class<?> wildcardClass7 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.convertLocalToUTC((-345599896L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-345659896L) + "'", long8 == (-345659896L));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        long long11 = dateTimeZone2.convertUTCToLocal((-230399903L));
        long long15 = dateTimeZone2.convertLocalToUTC(0L, false, 60001L);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone2.isLocalDateTimeGap(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-230339903L) + "'", long11 == (-230339903L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-60000L) + "'", long15 == (-60000L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(600000, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 60000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str11 = dateTimeZone1.getID();
        int int13 = dateTimeZone1.getOffset((long) (byte) 100);
        java.lang.String str14 = dateTimeZone1.toString();
        int int16 = dateTimeZone1.getOffset(187200000L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone1.getShortName(43080000L, locale18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long8 = dateTimeZone1.convertLocalToUTC((-115139900L), false, (long) '4');
        int int10 = dateTimeZone1.getOffsetFromLocal(115200010L);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) 187260000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-230339900L) + "'", long8 == (-230339900L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 187260000L + "'", long13 == 187260000L);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long3 = dateTimeZone0.nextTransition((-115199899L));
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        java.lang.String str6 = dateTimeZone0.getName(115320000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115199899L) + "'", long3 == (-115199899L));
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        long long22 = dateTimeZone1.adjustOffset(44L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 302400000L + "'", long19 == 302400000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 44L + "'", long22 == 44L);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        long long10 = dateTimeZone2.adjustOffset(101L, true);
        boolean boolean11 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 101L + "'", long10 == 101L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str11 = dateTimeZone1.getID();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((long) (byte) 10, locale13);
        java.lang.String str15 = dateTimeZone1.getID();
        java.lang.String str16 = dateTimeZone1.getID();
        boolean boolean18 = dateTimeZone1.isStandardOffset((-120001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        boolean boolean9 = dateTimeZone2.isFixed();
        java.lang.String str11 = dateTimeZone2.getNameKey((-115199949L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        java.lang.String str17 = dateTimeZone1.getName(115139999L);
        int int19 = dateTimeZone1.getOffsetFromLocal((-115319900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115200000L) + "'", long9 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone3.convertUTCToLocal((-115139900L));
        java.util.TimeZone timeZone6 = dateTimeZone3.toTimeZone();
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) timeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone9.convertUTCToLocal((long) 1);
        boolean boolean13 = dateTimeZone9.isStandardOffset(120010L);
        long long15 = dateTimeZone2.getMillisKeepLocal(dateTimeZone9, (-230339903L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-115139900L) + "'", long5 == (-115139900L));
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 101L + "'", long11 == 101L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-230340003L) + "'", long15 == (-230340003L));
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        java.lang.String str20 = dateTimeZone1.getNameKey((-230219990L));
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone1.getOffset(readableInstant21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+35:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+35:00\" is malformed at \"35:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:00");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((-1L), locale6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone9.toString();
        java.lang.String str11 = dateTimeZone9.getID();
        long long13 = dateTimeZone9.convertUTCToLocal((-115199990L));
        long long17 = dateTimeZone9.convertLocalToUTC((-1L), false, 115260000L);
        long long19 = dateTimeZone2.getMillisKeepLocal(dateTimeZone9, 32L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:10" + "'", str7, "+00:10");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:10" + "'", str10, "+00:10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:10" + "'", str11, "+00:10");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-114599990L) + "'", long13 == (-114599990L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-600001L) + "'", long17 == (-600001L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-3600000));
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        int int10 = dateTimeZone2.getOffset((-3599900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.previousTransition((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long7 = dateTimeZone1.previousTransition((-115139990L));
        java.lang.String str8 = dateTimeZone1.getID();
        long long11 = dateTimeZone1.adjustOffset((-115199949L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115139990L) + "'", long7 == (-115139990L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115199949L) + "'", long11 == (-115199949L));
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        long long15 = dateTimeZone4.convertLocalToUTC((long) (byte) -1, true, 10L);
        java.util.TimeZone timeZone16 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200001L) + "'", long15 == (-115200001L));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        int int10 = dateTimeZone1.getStandardOffset((long) (byte) 100);
        boolean boolean12 = dateTimeZone1.isStandardOffset(115260010L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean15 = dateTimeZone1.isStandardOffset((-230279900L));
        long long17 = dateTimeZone1.previousTransition((long) 360000000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 360000000L + "'", long17 == 360000000L);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) 115200000);
        long long13 = dateTimeZone1.convertLocalToUTC(115200000L, true);
        long long15 = dateTimeZone1.convertUTCToLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone9.getShortName((long) (short) 0, locale16);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone9.isLocalDateTimeGap(localDateTime18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone9.getName((-230339900L), locale21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone9.getShortName((long) (-3600000), locale24);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:01" + "'", str17, "+52:01");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+52:01" + "'", str22, "+52:01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+52:01" + "'", str25, "+52:01");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) ' ');
        int int4 = dateTimeZone2.getOffset((-474659949L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 361920000 + "'", int4 == 361920000);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        boolean boolean10 = dateTimeZone1.isStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        long long25 = dateTimeZone20.convertUTCToLocal(0L);
        int int27 = dateTimeZone20.getStandardOffset((long) ' ');
        long long29 = dateTimeZone20.previousTransition(230399999L);
        java.lang.String str31 = dateTimeZone20.getName((long) '4');
        int int33 = dateTimeZone20.getStandardOffset((-230399900L));
        long long35 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, 51L);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone1.getShortName(115260000L, locale37);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 115200000L + "'", long25 == 115200000L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115200000 + "'", int27 == 115200000);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 230399999L + "'", long29 == 230399999L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 115200000 + "'", int33 == 115200000);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 51L + "'", long35 == 51L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+32:00" + "'", str38, "+32:00");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone19.getShortName((long) (byte) 10, locale21);
        java.lang.String str23 = dateTimeZone19.getID();
        java.lang.String str24 = dateTimeZone19.getID();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean28 = dateTimeZone19.equals((java.lang.Object) dateTimeZone27);
        java.lang.String str30 = dateTimeZone27.getNameKey((long) (byte) 1);
        boolean boolean31 = dateTimeZone27.isFixed();
        java.util.TimeZone timeZone32 = dateTimeZone27.toTimeZone();
        int int34 = dateTimeZone27.getStandardOffset((-345599965L));
        java.lang.String str35 = dateTimeZone27.getID();
        java.lang.String str36 = dateTimeZone27.toString();
        long long38 = dateTimeZone27.convertUTCToLocal(115140000L);
        boolean boolean39 = dateTimeZone1.equals((java.lang.Object) 115140000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 187260000 + "'", int34 == 187260000);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+52:01" + "'", str35, "+52:01");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+52:01" + "'", str36, "+52:01");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 302400000L + "'", long38 == 302400000L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long4 = dateTimeZone1.adjustOffset(115200052L, true);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        boolean boolean9 = dateTimeZone7.isStandardOffset(0L);
        java.lang.String str10 = dateTimeZone7.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200052L + "'", long4 == 115200052L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        long long4 = dateTimeZone2.convertUTCToLocal(0L);
        long long6 = dateTimeZone2.convertUTCToLocal((-230279900L));
        long long8 = dateTimeZone2.nextTransition(3600101L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 187200000L + "'", long4 == 187200000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-43079900L) + "'", long6 == (-43079900L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600101L + "'", long8 == 3600101L);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false);
        int int15 = dateTimeZone1.getOffsetFromLocal((long) 1);
        long long17 = dateTimeZone1.convertUTCToLocal(115800001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 231000001L + "'", long17 == 231000001L);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.previousTransition((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getShortName((long) (byte) 10, locale9);
        java.lang.String str12 = dateTimeZone7.getName(10L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone7.getName((long) 100, locale14);
        java.lang.String str16 = dateTimeZone7.toString();
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone7.getOffset(readableInstant17);
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) readableInstant17);
        java.lang.String str21 = dateTimeZone1.getNameKey(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        long long11 = dateTimeZone1.adjustOffset(43080000L, true);
        long long13 = dateTimeZone1.previousTransition(115200001L);
        long long15 = dateTimeZone1.nextTransition((long) 60000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 43080000L + "'", long11 == 43080000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115200001L + "'", long13 == 115200001L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60000L + "'", long15 == 60000L);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertLocalToUTC((-115199903L), true, (long) 'a');
        long long16 = dateTimeZone1.adjustOffset(115200035L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399903L) + "'", long13 == (-230399903L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115200035L + "'", long16 == 115200035L);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        long long20 = dateTimeZone4.adjustOffset((long) (byte) 1, true);
        java.lang.String str22 = dateTimeZone4.getNameKey(115139999L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60010L + "'", long16 == 60010L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int5 = dateTimeZone3.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone6 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) 100);
        int int12 = dateTimeZone7.getOffset((-115199958L));
        long long14 = dateTimeZone7.nextTransition((-115199939L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 99L + "'", long10 == 99L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199939L) + "'", long14 == (-115199939L));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        int int5 = dateTimeZone1.getStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getShortName((long) (byte) 10, locale9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone7.getName((long) (-1), locale12);
        long long16 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false);
        int int18 = dateTimeZone7.getOffsetFromLocal((long) 115200000);
        long long21 = dateTimeZone7.adjustOffset((long) (byte) -1, false);
        int int23 = dateTimeZone7.getOffsetFromLocal((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone7.getOffset(readableInstant24);
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone7.isLocalDateTimeGap(localDateTime26);
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (-1));
        long long32 = dateTimeZone1.adjustOffset((-72119990L), false);
        java.lang.String str34 = dateTimeZone1.getShortName((-115140000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115200001L) + "'", long16 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 115200000 + "'", int25 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-72119990L) + "'", long32 == (-72119990L));
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+32:00" + "'", str34, "+32:00");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone15.getShortName((long) (byte) 10, locale17);
        java.lang.String str19 = dateTimeZone15.getID();
        boolean boolean21 = dateTimeZone15.isStandardOffset(10L);
        long long23 = dateTimeZone15.convertUTCToLocal(115199999L);
        int int25 = dateTimeZone15.getStandardOffset((-1L));
        boolean boolean26 = dateTimeZone15.isFixed();
        boolean boolean27 = dateTimeZone4.equals((java.lang.Object) boolean26);
        long long29 = dateTimeZone4.previousTransition((-187320000L));
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone4.getOffset(readableInstant30);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 230399999L + "'", long23 == 230399999L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 115200000 + "'", int25 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-187320000L) + "'", long29 == (-187320000L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 115200000 + "'", int31 == 115200000);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        int int12 = dateTimeZone1.getOffset((long) (short) 0);
        java.lang.String str14 = dateTimeZone1.getName((long) (short) 0);
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone17.previousTransition((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone17.isLocalDateTimeGap(localDateTime20);
        long long23 = dateTimeZone17.previousTransition(115200010L);
        long long25 = dateTimeZone1.getMillisKeepLocal(dateTimeZone17, 230339910L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 115200010L + "'", long23 == 115200010L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 230339910L + "'", long25 == 230339910L);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.nextTransition(230399999L);
        boolean boolean14 = dateTimeZone1.isFixed();
        int int16 = dateTimeZone1.getStandardOffset(115200000L);
        java.lang.String str18 = dateTimeZone1.getNameKey((-460799965L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 230399999L + "'", long13 == 230399999L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:10");
        long long4 = dateTimeZone1.adjustOffset((long) '4', false);
        long long8 = dateTimeZone1.convertLocalToUTC(0L, true, 230219999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-600000L) + "'", long8 == (-600000L));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertUTCToLocal((-115199990L));
        int int6 = dateTimeZone0.getStandardOffset(115200032L);
        java.lang.String str8 = dateTimeZone0.getNameKey(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+32:00" + "'", str1, "+32:00");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:00" + "'", str2, "+32:00");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
// flaky:         org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone18.getOffset(readableInstant19);
        java.lang.String str21 = dateTimeZone18.getID();
        long long23 = dateTimeZone18.previousTransition((-1L));
        long long25 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, 0L);
        java.util.TimeZone timeZone26 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        long long38 = dateTimeZone1.previousTransition(0L);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone1.getName((-187320000L), locale40);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
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
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+32:00" + "'", str41, "+32:00");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        boolean boolean8 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.String str12 = dateTimeZone1.getName((long) (short) 10);
        long long15 = dateTimeZone1.adjustOffset(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(361920000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        long long8 = dateTimeZone1.nextTransition((long) '4');
        int int10 = dateTimeZone1.getStandardOffset((-115139900L));
        int int12 = dateTimeZone1.getOffsetFromLocal((-115140001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        long long9 = dateTimeZone1.nextTransition((long) 10);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.previousTransition((-60000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-60000L) + "'", long3 == (-60000L));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition(115200010L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        long long8 = dateTimeZone1.convertLocalToUTC((-187259948L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115200010L + "'", long3 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-187259947L) + "'", long8 == (-187259947L));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        java.util.TimeZone timeZone20 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
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
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        java.lang.String str26 = dateTimeZone11.getName((long) ' ');
        java.lang.String str27 = dateTimeZone11.toString();
        long long29 = dateTimeZone11.previousTransition(3600101L);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 3600101L + "'", long29 == 3600101L);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(115199999L, locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        long long38 = dateTimeZone1.previousTransition(0L);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone1.getName((-187320000L), locale40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = dateTimeZone1.getOffset(readableInstant42);
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
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+32:00" + "'", str41, "+32:00");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 115200000 + "'", int43 == 115200000);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        int int9 = dateTimeZone1.getOffsetFromLocal(230339999L);
        java.lang.String str11 = dateTimeZone1.getShortName((-115259958L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        org.joda.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = dateTimeZone15.isLocalDateTimeGap(localDateTime36);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.lang.String str7 = dateTimeZone1.getNameKey(0L);
        java.lang.String str9 = dateTimeZone1.getNameKey(0L);
        boolean boolean11 = dateTimeZone1.isStandardOffset((-72059948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) 115200000, locale7);
        int int10 = dateTimeZone1.getStandardOffset(230399999L);
        java.lang.String str12 = dateTimeZone1.getNameKey(115140000L);
        java.lang.Object obj13 = null;
        boolean boolean14 = dateTimeZone1.equals(obj13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int28 = dateTimeZone26.getOffsetFromLocal(43020000L);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone26.getOffset(readableInstant29);
        java.util.TimeZone timeZone31 = dateTimeZone26.toTimeZone();
        long long33 = dateTimeZone26.nextTransition((-600000L));
        boolean boolean34 = dateTimeZone1.equals((java.lang.Object) (-600000L));
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-600000L) + "'", long33 == (-600000L));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long3 = dateTimeZone0.nextTransition((-115199899L));
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115199899L) + "'", long3 == (-115199899L));
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        long long9 = dateTimeZone1.nextTransition((long) (byte) -1);
        int int11 = dateTimeZone1.getOffset(115199900L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone12.toString();
        java.lang.String str14 = dateTimeZone12.getID();
        long long16 = dateTimeZone12.convertUTCToLocal(60010L);
        java.lang.String str17 = dateTimeZone12.toString();
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 3660000L);
        int int21 = dateTimeZone1.getOffsetFromLocal((long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115260010L + "'", long16 == 115260010L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3660000L + "'", long19 == 3660000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 115200000 + "'", int21 == 115200000);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        java.util.TimeZone timeZone23 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int27 = dateTimeZone25.getOffsetFromLocal((-1L));
        boolean boolean28 = dateTimeZone25.isFixed();
        long long30 = dateTimeZone25.convertUTCToLocal((long) 10);
        boolean boolean32 = dateTimeZone25.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone25.isLocalDateTimeGap(localDateTime33);
        java.util.TimeZone timeZone35 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        int int38 = dateTimeZone36.getOffsetFromLocal((-233939900L));
        boolean boolean39 = dateTimeZone11.equals((java.lang.Object) dateTimeZone36);
        int int41 = dateTimeZone11.getOffset((-111480100L));
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
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115200000 + "'", int27 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 115200010L + "'", long30 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 115200000 + "'", int41 == 115200000);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        long long13 = dateTimeZone1.adjustOffset(60001L, false);
        long long16 = dateTimeZone1.adjustOffset(51L, false);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60001L + "'", long13 == 60001L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 51L + "'", long16 == 51L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int3 = dateTimeZone1.getOffsetFromLocal(43020000L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        int int8 = dateTimeZone1.getOffset((-115259899L));
        long long11 = dateTimeZone1.adjustOffset(115140099L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115140099L + "'", long11 == 115140099L);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str11 = dateTimeZone1.getID();
        int int13 = dateTimeZone1.getOffsetFromLocal((-118799900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115200000L) + "'", long9 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        java.lang.String str17 = dateTimeZone1.getNameKey(3540062L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-183660000L) + "'", long15 == (-183660000L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str13 = dateTimeZone1.getName((-115079990L));
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        boolean boolean17 = dateTimeZone1.isStandardOffset(3600101L);
        long long21 = dateTimeZone1.convertLocalToUTC((-72059948L), true, (long) 361920000);
        long long24 = dateTimeZone1.adjustOffset((-72000001L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-187259948L) + "'", long21 == (-187259948L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-72000001L) + "'", long24 == (-72000001L));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.String str10 = dateTimeZone9.getID();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone9.isLocalDateTimeGap(localDateTime11);
        long long15 = dateTimeZone9.convertLocalToUTC((long) (byte) 10, true);
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (long) '#');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getShortName((-230339948L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.035" + "'", str10, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-25L) + "'", long15 == (-25L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone2.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone2.getShortName((-72120000L), locale10);
        java.lang.String str13 = dateTimeZone2.getName(72059975L);
        long long15 = dateTimeZone2.previousTransition(118740062L);
        boolean boolean17 = dateTimeZone2.isStandardOffset((-114659949L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 118740062L + "'", long15 == 118740062L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        boolean boolean3 = dateTimeZone2.isFixed();
        long long5 = dateTimeZone2.nextTransition(32L);
        java.util.TimeZone timeZone6 = dateTimeZone2.toTimeZone();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getName(100L, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        long long3 = dateTimeZone1.previousTransition(115199999L);
        long long5 = dateTimeZone1.previousTransition((long) 60000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-230399998L), locale8);
        java.lang.String str11 = dateTimeZone1.getShortName(43080000L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int15 = dateTimeZone13.getOffsetFromLocal((-1L));
        boolean boolean16 = dateTimeZone13.isFixed();
        long long18 = dateTimeZone13.convertUTCToLocal((long) 10);
        boolean boolean20 = dateTimeZone13.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone13.isLocalDateTimeGap(localDateTime21);
        long long24 = dateTimeZone13.nextTransition(10L);
        long long26 = dateTimeZone13.previousTransition((-115199900L));
        int int28 = dateTimeZone13.getOffsetFromLocal(0L);
        java.lang.String str30 = dateTimeZone13.getShortName((long) (short) -1);
        java.lang.String str32 = dateTimeZone13.getName(115140035L);
        boolean boolean33 = dateTimeZone1.equals((java.lang.Object) str32);
        java.util.TimeZone timeZone34 = dateTimeZone1.toTimeZone();
        int int36 = dateTimeZone1.getOffsetFromLocal((-59980L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115199999L + "'", long3 == 115199999L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60000L + "'", long5 == 60000L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115200010L + "'", long18 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115199900L) + "'", long26 == (-115199900L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115200000 + "'", int28 == 115200000);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 115200000 + "'", int36 == 115200000);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone2.getOffset(115199999L);
        long long11 = dateTimeZone2.convertLocalToUTC(3480062L, true, (-3539990L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3420062L + "'", long11 == 3420062L);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long4 = dateTimeZone1.adjustOffset(115200052L, true);
        long long6 = dateTimeZone1.previousTransition(115200052L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200052L + "'", long4 == 115200052L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200052L + "'", long6 == 115200052L);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone9.getShortName((long) 100, locale16);
        java.lang.String str19 = dateTimeZone9.getNameKey((long) 100);
        java.lang.String str21 = dateTimeZone9.getShortName((-183660000L));
        long long23 = dateTimeZone9.previousTransition((-589799949L));
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:01" + "'", str17, "+52:01");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+52:01" + "'", str21, "+52:01");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-589799949L) + "'", long23 == (-589799949L));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(52L, locale6);
        java.lang.String str9 = dateTimeZone1.getShortName((long) 10);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.Class<?> wildcardClass12 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(0L, locale3);
        long long6 = dateTimeZone1.nextTransition((-120001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-120001L) + "'", long6 == (-120001L));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        int int35 = dateTimeZone18.getStandardOffset(396540000L);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60000 + "'", int35 == 60000);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        int int33 = dateTimeZone4.getOffsetFromLocal(0L);
        long long35 = dateTimeZone4.nextTransition((-345659903L));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 115200000 + "'", int33 == 115200000);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-345659903L) + "'", long35 == (-345659903L));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName(43080000L, locale7);
        java.lang.String str10 = dateTimeZone1.getName((-115260000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinated Universal Time" + "'", str10, "Coordinated Universal Time");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int5 = dateTimeZone3.getOffsetFromLocal((-1L));
        long long7 = dateTimeZone3.convertUTCToLocal((-1L));
        java.lang.String str9 = dateTimeZone3.getName((-1L));
        java.util.TimeZone timeZone10 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 43080000L);
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        long long8 = dateTimeZone2.convertLocalToUTC(43080000L, false, 60010L);
        long long11 = dateTimeZone2.adjustOffset((-115080011L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 43020000L + "'", long8 == 43020000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115080011L) + "'", long11 == (-115080011L));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        long long3 = dateTimeZone1.previousTransition(115199999L);
        long long5 = dateTimeZone1.previousTransition((long) 60000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((-230399998L), locale8);
        java.lang.String str11 = dateTimeZone1.getShortName(43080000L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int15 = dateTimeZone13.getOffsetFromLocal((-1L));
        boolean boolean16 = dateTimeZone13.isFixed();
        long long18 = dateTimeZone13.convertUTCToLocal((long) 10);
        boolean boolean20 = dateTimeZone13.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone13.isLocalDateTimeGap(localDateTime21);
        long long24 = dateTimeZone13.nextTransition(10L);
        long long26 = dateTimeZone13.previousTransition((-115199900L));
        int int28 = dateTimeZone13.getOffsetFromLocal(0L);
        java.lang.String str30 = dateTimeZone13.getShortName((long) (short) -1);
        java.lang.String str32 = dateTimeZone13.getName(115140035L);
        boolean boolean33 = dateTimeZone1.equals((java.lang.Object) str32);
        long long35 = dateTimeZone1.convertUTCToLocal(43139999L);
        long long39 = dateTimeZone1.convertLocalToUTC((long) (short) 10, true, (long) 361920000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115199999L + "'", long3 == 115199999L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60000L + "'", long5 == 60000L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115200010L + "'", long18 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115199900L) + "'", long26 == (-115199900L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115200000 + "'", int28 == 115200000);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 158339999L + "'", long35 == 158339999L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-115199990L) + "'", long39 == (-115199990L));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long14 = dateTimeZone12.convertUTCToLocal((-72120000L));
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (-187259990L));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone21.getShortName((long) (byte) 10, locale23);
        java.lang.String str25 = dateTimeZone21.getID();
        java.lang.String str26 = dateTimeZone21.getID();
        long long28 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, 100L);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone21.getName((long) (byte) -1, locale30);
        long long33 = dateTimeZone21.previousTransition(60010L);
        java.lang.String str34 = dateTimeZone21.toString();
        int int36 = dateTimeZone21.getOffsetFromLocal((-115199999L));
        long long38 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, (-259319990L));
        java.lang.String str39 = dateTimeZone21.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-72060000L) + "'", long14 == (-72060000L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-72119990L) + "'", long16 == (-72119990L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-115139900L) + "'", long28 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 60010L + "'", long33 == 60010L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+32:00" + "'", str34, "+32:00");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 115200000 + "'", int36 == 115200000);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-259319990L) + "'", long38 == (-259319990L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+32:00" + "'", str39, "+32:00");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        long long12 = dateTimeZone1.convertUTCToLocal((long) (byte) 1);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200001L + "'", long12 == 115200001L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) 115200000, locale7);
        int int10 = dateTimeZone1.getStandardOffset(230399999L);
        java.lang.String str12 = dateTimeZone1.getNameKey(115140000L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        boolean boolean8 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.String str12 = dateTimeZone1.getName((long) (short) 10);
        java.lang.String str14 = dateTimeZone1.getNameKey(101L);
        int int16 = dateTimeZone1.getOffsetFromLocal((-115199999L));
        java.lang.String str17 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        java.lang.String str15 = dateTimeZone9.getID();
        java.lang.String str17 = dateTimeZone9.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+52:01" + "'", str15, "+52:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:01" + "'", str17, "+52:01");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long13 = dateTimeZone10.convertLocalToUTC(3480062L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3480062L + "'", long13 == 3480062L);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        int int19 = dateTimeZone1.getStandardOffset((long) '4');
        java.lang.String str21 = dateTimeZone1.getName((-3599900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        int int35 = dateTimeZone1.getStandardOffset((-115259949L));
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long39 = dateTimeZone1.getMillisKeepLocal(dateTimeZone37, 115200032L);
        java.lang.String str41 = dateTimeZone37.getName(99L);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 115200000 + "'", int35 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 230399997L + "'", long39 == 230399997L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.035" + "'", str41, "+00:00:00.035");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone9.getShortName((long) (short) 0, locale16);
        long long20 = dateTimeZone9.convertLocalToUTC((-230340000L), false);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:01" + "'", str17, "+52:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-417600000L) + "'", long20 == (-417600000L));
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.052");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        long long9 = dateTimeZone1.nextTransition((long) 10);
        int int11 = dateTimeZone1.getOffsetFromLocal((-115199900L));
        int int13 = dateTimeZone1.getOffset((-115139900L));
        long long17 = dateTimeZone1.convertLocalToUTC((long) (short) 100, false, 115139999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getShortName((-230399965L), locale20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115139999L + "'", long7 == 115139999L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-59900L) + "'", long17 == (-59900L));
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, 187260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187260000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        int int5 = dateTimeZone1.getStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getShortName((long) (byte) 10, locale9);
        java.lang.String str11 = dateTimeZone7.getID();
        boolean boolean13 = dateTimeZone7.isStandardOffset(10L);
        int int15 = dateTimeZone7.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone17.getShortName((long) (byte) 10, locale19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone17.getOffset(readableInstant21);
        java.lang.String str24 = dateTimeZone17.getName(1L);
        long long26 = dateTimeZone7.getMillisKeepLocal(dateTimeZone17, (long) (short) 1);
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) dateTimeZone17);
        long long29 = dateTimeZone1.convertUTCToLocal(59975L);
        long long32 = dateTimeZone1.adjustOffset(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 115259975L + "'", long29 == 115259975L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.lang.String str6 = dateTimeZone2.getNameKey(60001L);
        java.lang.String str7 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:10" + "'", str7, "+00:10");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        java.lang.String str4 = dateTimeZone2.getName((-417659900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:01" + "'", str4, "+52:01");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean9 = dateTimeZone1.isFixed();
        boolean boolean10 = dateTimeZone1.isFixed();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((-229859900L), locale12);
        org.joda.time.tz.Provider provider14 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider14);
        org.joda.time.DateTimeZone.setProvider(provider14);
        org.joda.time.DateTimeZone.setProvider(provider14);
        org.joda.time.DateTimeZone.setProvider(provider14);
        org.joda.time.DateTimeZone.setProvider(provider14);
        org.joda.time.DateTimeZone.setProvider(provider14);
        org.joda.time.DateTimeZone.setProvider(provider14);
        org.joda.time.DateTimeZone.setProvider(provider14);
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) provider14);
        java.lang.Class<?> wildcardClass24 = provider14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertNotNull(provider14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        long long9 = dateTimeZone1.nextTransition((long) 10);
        int int11 = dateTimeZone1.getOffsetFromLocal((-115199900L));
        boolean boolean12 = dateTimeZone1.isFixed();
        java.lang.String str13 = dateTimeZone1.getID();
        java.lang.String str15 = dateTimeZone1.getName((-111540000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long3 = dateTimeZone0.nextTransition((-115199899L));
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115199899L) + "'", long3 == (-115199899L));
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360000000);
        java.lang.String str3 = dateTimeZone1.getShortName(115800001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+100:00" + "'", str3, "+100:00");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str3 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone5.getShortName((long) (byte) 10, locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getName((long) (-1), locale10);
        long long14 = dateTimeZone5.convertLocalToUTC((long) (short) -1, false);
        int int16 = dateTimeZone5.getOffsetFromLocal((long) 115200000);
        long long19 = dateTimeZone5.adjustOffset((long) (byte) -1, false);
        java.lang.String str21 = dateTimeZone5.getShortName((-302459900L));
        java.lang.String str22 = dateTimeZone5.getID();
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) str22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.032" + "'", str3, "+00:00:00.032");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115200001L) + "'", long14 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(349200000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        java.lang.String str5 = dateTimeZone2.getID();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int9 = dateTimeZone7.getOffsetFromLocal((-1L));
        long long11 = dateTimeZone7.convertUTCToLocal((-1L));
        java.lang.String str13 = dateTimeZone7.getName((-1L));
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone7.getOffset(readableInstant14);
        int int17 = dateTimeZone7.getOffset((long) (byte) 0);
        boolean boolean18 = dateTimeZone2.equals((java.lang.Object) dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone21.getShortName(0L, locale23);
        int int26 = dateTimeZone21.getOffsetFromLocal(187200000L);
        long long28 = dateTimeZone2.getMillisKeepLocal(dateTimeZone21, 111540100L);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone2.getOffset(readableInstant29);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115199999L + "'", long11 == 115199999L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 111540100L + "'", long28 == 111540100L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60000 + "'", int30 == 60000);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 115140010L);
        java.lang.String str7 = dateTimeZone1.getName(115200052L);
        long long10 = dateTimeZone1.adjustOffset(10L, false);
        java.lang.String str11 = dateTimeZone1.toString();
        int int13 = dateTimeZone1.getOffset(52L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 118740062L + "'", long5 == 118740062L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.052" + "'", str7, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.052" + "'", str11, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        int int11 = dateTimeZone1.getOffset((long) (byte) 0);
        long long15 = dateTimeZone1.convertLocalToUTC(0L, false, 115200032L);
        long long18 = dateTimeZone1.adjustOffset((long) 3600000, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean21 = dateTimeZone1.isStandardOffset(187200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200000L) + "'", long15 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3600000L + "'", long18 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        long long26 = dateTimeZone11.nextTransition(51L);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone11.getOffset(readableInstant27);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 51L + "'", long26 == 51L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115200000 + "'", int28 == 115200000);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        java.lang.String str30 = dateTimeZone29.getID();
        java.lang.Class<?> wildcardClass31 = dateTimeZone29.getClass();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:01" + "'", str30, "+00:01");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(126000000, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        long long21 = dateTimeZone1.convertLocalToUTC((-187260000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115200000L) + "'", long17 == (-115200000L));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-302460000L) + "'", long21 == (-302460000L));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long5 = dateTimeZone2.nextTransition((long) (byte) -1);
        int int7 = dateTimeZone2.getOffset((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean9 = dateTimeZone2.isFixed();
        java.lang.String str11 = dateTimeZone2.getShortName(187200010L);
        long long14 = dateTimeZone2.convertLocalToUTC((-43079900L), true);
        java.lang.String str15 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-43139900L) + "'", long14 == (-43139900L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        int int13 = dateTimeZone1.getStandardOffset((-115199999L));
        long long15 = dateTimeZone1.nextTransition(115200000L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        java.lang.String str5 = dateTimeZone2.getID();
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone2.isLocalDateTimeGap(localDateTime6);
        boolean boolean9 = dateTimeZone2.isStandardOffset(120010L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str11 = dateTimeZone1.getShortName((-115260000L));
        java.lang.String str12 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115200000L) + "'", long9 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        long long24 = dateTimeZone4.adjustOffset((-115259948L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-72060001L) + "'", long21 == (-72060001L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-115259948L) + "'", long24 == (-115259948L));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str11 = dateTimeZone1.getID();
        java.lang.String str12 = dateTimeZone1.toString();
        int int14 = dateTimeZone1.getOffset((-115139900L));
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getName((-115319900L), locale16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        java.util.TimeZone timeZone23 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int27 = dateTimeZone25.getOffsetFromLocal((-1L));
        boolean boolean28 = dateTimeZone25.isFixed();
        long long30 = dateTimeZone25.convertUTCToLocal((long) 10);
        boolean boolean32 = dateTimeZone25.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone25.isLocalDateTimeGap(localDateTime33);
        java.util.TimeZone timeZone35 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        int int38 = dateTimeZone36.getOffsetFromLocal((-233939900L));
        boolean boolean39 = dateTimeZone11.equals((java.lang.Object) dateTimeZone36);
        boolean boolean41 = dateTimeZone11.isStandardOffset((-345659903L));
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
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115200000 + "'", int27 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 115200010L + "'", long30 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        boolean boolean11 = dateTimeZone1.isFixed();
        long long14 = dateTimeZone1.convertLocalToUTC(360000000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 244800000L + "'", long14 == 244800000L);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        boolean boolean30 = dateTimeZone1.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        boolean boolean9 = dateTimeZone1.isStandardOffset(101L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str12 = dateTimeZone11.toString();
        boolean boolean13 = dateTimeZone11.isFixed();
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) boolean13);
        boolean boolean15 = dateTimeZone1.isFixed();
        boolean boolean17 = dateTimeZone1.isStandardOffset((-230399998L));
        int int19 = dateTimeZone1.getStandardOffset(115200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        long long12 = dateTimeZone1.previousTransition(115260000L);
        java.lang.String str14 = dateTimeZone1.getNameKey((long) (byte) 0);
        int int16 = dateTimeZone1.getOffsetFromLocal(230400001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115260000L + "'", long12 == 115260000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) ' ');
        java.lang.String str8 = dateTimeZone1.toString();
        int int10 = dateTimeZone1.getOffset((-115080011L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone25.getShortName((long) (byte) 10, locale27);
        java.lang.String str30 = dateTimeZone25.getName(10L);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone25.getOffset(readableInstant31);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        boolean boolean34 = dateTimeZone16.equals((java.lang.Object) dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int38 = dateTimeZone36.getOffsetFromLocal((-1L));
        boolean boolean39 = dateTimeZone36.isFixed();
        org.joda.time.ReadableInstant readableInstant40 = null;
        int int41 = dateTimeZone36.getOffset(readableInstant40);
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone36.getShortName((long) 60000, locale43);
        java.util.TimeZone timeZone45 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        int int48 = dateTimeZone46.getStandardOffset((-115080011L));
        long long50 = dateTimeZone25.getMillisKeepLocal(dateTimeZone46, (-474599949L));
        long long52 = dateTimeZone25.convertUTCToLocal((-230339999L));
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
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:00" + "'", str28, "+32:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 115200000 + "'", int32 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 115200000 + "'", int38 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 115200000 + "'", int41 == 115200000);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+32:00" + "'", str44, "+32:00");
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-359399949L) + "'", long50 == (-359399949L));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-115139999L) + "'", long52 == (-115139999L));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        long long7 = dateTimeZone1.convertUTCToLocal((-230339900L));
        long long9 = dateTimeZone1.convertUTCToLocal((-345659903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115139900L) + "'", long7 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-230459903L) + "'", long9 == (-230459903L));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        long long15 = dateTimeZone1.adjustOffset((long) (byte) -1, false);
        int int17 = dateTimeZone1.getOffsetFromLocal((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        long long21 = dateTimeZone1.previousTransition((long) (short) 100);
        java.util.TimeZone timeZone22 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (byte) 10);
        long long4 = dateTimeZone2.previousTransition(115200052L);
        java.lang.String str6 = dateTimeZone2.getName(0L);
        long long10 = dateTimeZone2.convertLocalToUTC(0L, false, 119990L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200052L + "'", long4 == 115200052L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:10" + "'", str6, "+10:10");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-36600000L) + "'", long10 == (-36600000L));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getStandardOffset((long) 'a');
        long long11 = dateTimeZone1.convertLocalToUTC((long) 10, true);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName(0L, locale13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115199990L) + "'", long11 == (-115199990L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        int int20 = dateTimeZone1.getOffset(230399997L);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone1.getOffset(readableInstant21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        long long25 = dateTimeZone23.nextTransition((-115199899L));
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-115199899L) + "'", long25 == (-115199899L));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName((long) (byte) -1, locale7);
        java.lang.String str9 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        java.lang.String str5 = dateTimeZone2.getID();
        java.util.TimeZone timeZone6 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 10);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) 10);
        long long11 = dateTimeZone2.convertLocalToUTC(115140000L, true, (long) 100);
        java.lang.String str13 = dateTimeZone2.getNameKey((long) 60000);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getName((-230399900L), locale15);
        boolean boolean17 = dateTimeZone2.isFixed();
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone2.isLocalDateTimeGap(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-72120000L) + "'", long11 == (-72120000L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+52:01" + "'", str16, "+52:01");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) ' ');
        long long9 = dateTimeZone1.convertUTCToLocal(43080000L);
        boolean boolean11 = dateTimeZone1.isStandardOffset((-72060001L));
        long long13 = dateTimeZone1.nextTransition((-187260000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 43080000L + "'", long9 == 43080000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-187260000L) + "'", long13 == (-187260000L));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        java.lang.String str20 = dateTimeZone11.getNameKey((long) 3600000);
        java.lang.String str22 = dateTimeZone11.getNameKey(72000000L);
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone19.getShortName((long) (byte) 10, locale21);
        java.lang.String str23 = dateTimeZone19.getID();
        long long25 = dateTimeZone4.getMillisKeepLocal(dateTimeZone19, 115200001L);
        java.lang.String str27 = dateTimeZone4.getNameKey(115200100L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 115200001L + "'", long25 == 115200001L);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone2.nextTransition((long) 'a');
        long long6 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, 101L);
        boolean boolean8 = dateTimeZone0.isStandardOffset(43080000L);
        int int10 = dateTimeZone0.getOffset((-187259948L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+32:00" + "'", str1, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200101L + "'", long6 == 115200101L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 1L);
        int int12 = dateTimeZone5.getOffsetFromLocal((long) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone14.getShortName((long) (byte) 10, locale16);
        java.lang.String str18 = dateTimeZone14.getID();
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean23 = dateTimeZone14.equals((java.lang.Object) dateTimeZone22);
        java.lang.String str25 = dateTimeZone22.getNameKey((long) (byte) 1);
        boolean boolean26 = dateTimeZone22.isFixed();
        long long28 = dateTimeZone5.getMillisKeepLocal(dateTimeZone22, 115140000L);
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone22.isLocalDateTimeGap(localDateTime29);
        java.lang.String str32 = dateTimeZone22.getName(187260000L);
        long long36 = dateTimeZone22.convertLocalToUTC(230339910L, true, (long) (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 43080000L + "'", long28 == 43080000L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+52:01" + "'", str32, "+52:01");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 43079910L + "'", long36 == 43079910L);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        long long13 = dateTimeZone2.nextTransition(118740000L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getShortName((-72060001L), locale15);
        java.util.TimeZone timeZone17 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 118740000L + "'", long13 == 118740000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        int int11 = dateTimeZone1.getOffsetFromLocal((-345539903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone10.isLocalDateTimeGap(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        java.lang.String str25 = dateTimeZone1.toString();
        long long27 = dateTimeZone1.nextTransition(115200010L);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115200010L + "'", long27 == 115200010L);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360000000);
        int int3 = dateTimeZone1.getOffsetFromLocal(230339910L);
        java.lang.String str5 = dateTimeZone1.getName(115200100L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long9 = dateTimeZone7.previousTransition((-72060002L));
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-151199899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 360000000 + "'", int3 == 360000000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+100:00" + "'", str5, "+100:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-72060002L) + "'", long9 == (-72060002L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-151199899L) + "'", long11 == (-151199899L));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(600000);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:10");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        int int5 = dateTimeZone3.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        int int35 = dateTimeZone18.getOffset((-302459900L));
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60000 + "'", int35 == 60000);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        long long15 = dateTimeZone1.adjustOffset((long) 3600000, false);
        long long17 = dateTimeZone1.nextTransition((long) 'a');
        long long20 = dateTimeZone1.adjustOffset((-187260001L), true);
        boolean boolean21 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600000L + "'", long15 == 3600000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-187260001L) + "'", long20 == (-187260001L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        int int38 = dateTimeZone33.getStandardOffset((-345599965L));
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60000 + "'", int38 == 60000);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition(115200010L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long10 = dateTimeZone1.convertLocalToUTC((long) '4', false, (-115139900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115200010L + "'", long3 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 53L + "'", long10 == 53L);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((-1L), locale6);
        java.lang.String str9 = dateTimeZone2.getShortName((long) 187200000);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:10" + "'", str7, "+00:10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:10" + "'", str9, "+00:10");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-115199903L), locale4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int8 = dateTimeZone1.getStandardOffset((-341939900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long5 = dateTimeZone2.previousTransition((-187199900L));
        int int7 = dateTimeZone2.getOffsetFromLocal((-230459903L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-187199900L) + "'", long5 == (-187199900L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        long long15 = dateTimeZone1.adjustOffset((long) (byte) -1, false);
        java.lang.String str17 = dateTimeZone1.getShortName((-302459900L));
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        java.lang.String str24 = dateTimeZone17.getNameKey(42L);
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
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.previousTransition((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getShortName((long) (byte) 10, locale9);
        java.lang.String str12 = dateTimeZone7.getName(10L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone7.getName((long) 100, locale14);
        java.lang.String str16 = dateTimeZone7.toString();
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone7.getOffset(readableInstant17);
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) readableInstant17);
        int int21 = dateTimeZone1.getStandardOffset((long) (byte) 100);
        long long23 = dateTimeZone1.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3600000 + "'", int21 == 3600000);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        java.lang.String str10 = dateTimeZone2.getName((long) 60000);
        int int12 = dateTimeZone2.getStandardOffset(32L);
        long long14 = dateTimeZone2.nextTransition((-230399903L));
        java.lang.String str16 = dateTimeZone2.getShortName(60000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-230399903L) + "'", long14 == (-230399903L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone22.getName(43080000L, locale24);
        boolean boolean26 = dateTimeZone5.equals((java.lang.Object) str25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115199900L) + "'", long15 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone22);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Coordinated Universal Time" + "'", str25, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        java.lang.String str33 = dateTimeZone2.getNameKey(101L);
        long long35 = dateTimeZone2.convertUTCToLocal((-230400000L));
        int int37 = dateTimeZone2.getOffset(60001L);
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-230340000L) + "'", long35 == (-230340000L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 60000 + "'", int37 == 60000);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        java.lang.String str21 = dateTimeZone17.getID();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        long long24 = dateTimeZone17.getMillisKeepLocal(dateTimeZone22, 187200000L);
        java.lang.Class<?> wildcardClass25 = dateTimeZone17.getClass();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 187200000L + "'", long24 == 187200000L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(361920000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        boolean boolean7 = dateTimeZone5.isStandardOffset((long) (short) 10);
        java.lang.String str9 = dateTimeZone5.getShortName((long) (short) 100);
        boolean boolean11 = dateTimeZone5.isStandardOffset(100L);
        boolean boolean13 = dateTimeZone5.isStandardOffset(115260000L);
        long long15 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (-230339900L));
        int int17 = dateTimeZone5.getOffset((-115139958L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-230279900L) + "'", long15 == (-230279900L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        java.lang.String str5 = dateTimeZone2.getID();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int9 = dateTimeZone7.getOffsetFromLocal((-1L));
        long long11 = dateTimeZone7.convertUTCToLocal((-1L));
        java.lang.String str13 = dateTimeZone7.getName((-1L));
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone7.getOffset(readableInstant14);
        int int17 = dateTimeZone7.getOffset((long) (byte) 0);
        boolean boolean18 = dateTimeZone2.equals((java.lang.Object) dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone21.getShortName(0L, locale23);
        int int26 = dateTimeZone21.getOffsetFromLocal(187200000L);
        long long28 = dateTimeZone2.getMillisKeepLocal(dateTimeZone21, 111540100L);
        java.util.TimeZone timeZone29 = dateTimeZone2.toTimeZone();
        int int31 = dateTimeZone2.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115199999L + "'", long11 == 115199999L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 111540100L + "'", long28 == 111540100L);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60000 + "'", int31 == 60000);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        java.lang.String str11 = dateTimeZone1.toString();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName(43080000L, locale13);
        int int16 = dateTimeZone1.getStandardOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int20 = dateTimeZone18.getOffsetFromLocal((-1L));
        boolean boolean21 = dateTimeZone18.isFixed();
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone18.getOffset(readableInstant22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone18.getShortName((long) 60000, locale25);
        long long30 = dateTimeZone18.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        boolean boolean32 = dateTimeZone1.equals((java.lang.Object) dateTimeZone18);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone1.getName((-115139958L), locale34);
        long long37 = dateTimeZone1.previousTransition((-72060000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-115199999L) + "'", long30 == (-115199999L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+32:00" + "'", str35, "+32:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-72060000L) + "'", long37 == (-72060000L));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        int int9 = dateTimeZone1.getOffset((long) '4');
        boolean boolean11 = dateTimeZone1.isStandardOffset(360000000L);
        long long14 = dateTimeZone1.convertLocalToUTC(230279999L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115079999L + "'", long14 == 115079999L);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone2.isLocalDateTimeGap(localDateTime20);
        long long24 = dateTimeZone2.adjustOffset((-115199966L), true);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-115199966L) + "'", long24 == (-115199966L));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone2.getOffset(115199999L);
        java.lang.String str9 = dateTimeZone2.getName((-115139900L));
        int int11 = dateTimeZone2.getOffset((-72060001L));
        long long15 = dateTimeZone2.convertLocalToUTC(115200001L, true, (-230339948L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone2.getShortName(115200035L, locale17);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115140001L + "'", long15 == 115140001L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.lang.String str7 = dateTimeZone1.getNameKey(0L);
        java.lang.String str9 = dateTimeZone1.getNameKey(0L);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone11.previousTransition((-1L));
        int int15 = dateTimeZone11.getStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone17.getShortName((long) (byte) 10, locale19);
        java.lang.String str21 = dateTimeZone17.getID();
        boolean boolean23 = dateTimeZone17.isStandardOffset(10L);
        int int25 = dateTimeZone17.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone27.getShortName((long) (byte) 10, locale29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone27.getOffset(readableInstant31);
        java.lang.String str34 = dateTimeZone27.getName(1L);
        long long36 = dateTimeZone17.getMillisKeepLocal(dateTimeZone27, (long) (short) 1);
        boolean boolean37 = dateTimeZone11.equals((java.lang.Object) dateTimeZone27);
        long long39 = dateTimeZone11.convertUTCToLocal((long) 60000);
        boolean boolean40 = dateTimeZone1.equals((java.lang.Object) long39);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 115200000 + "'", int25 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 115200000 + "'", int32 == 115200000);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+32:00" + "'", str34, "+32:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 120000L + "'", long39 == 120000L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        long long15 = dateTimeZone4.nextTransition(0L);
        java.lang.String str17 = dateTimeZone4.getShortName(396540000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        int int13 = dateTimeZone1.getStandardOffset((-115199999L));
        long long16 = dateTimeZone1.adjustOffset(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        java.lang.String str33 = dateTimeZone2.getNameKey(101L);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone35.getShortName((long) (byte) 10, locale37);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone35.getName((long) (-1), locale40);
        long long44 = dateTimeZone35.convertLocalToUTC((long) (short) -1, false);
        long long46 = dateTimeZone35.nextTransition(115200010L);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int50 = dateTimeZone48.getOffsetFromLocal((-1L));
        boolean boolean51 = dateTimeZone48.isFixed();
        long long53 = dateTimeZone48.convertUTCToLocal((long) 10);
        boolean boolean55 = dateTimeZone48.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime56 = null;
        boolean boolean57 = dateTimeZone48.isLocalDateTimeGap(localDateTime56);
        long long61 = dateTimeZone48.convertLocalToUTC(115199999L, false, (long) (short) 0);
        boolean boolean62 = dateTimeZone35.equals((java.lang.Object) false);
        int int64 = dateTimeZone35.getOffsetFromLocal((long) 60000);
        java.lang.String str66 = dateTimeZone35.getNameKey(302400010L);
        boolean boolean67 = dateTimeZone2.equals((java.lang.Object) dateTimeZone35);
        long long69 = dateTimeZone35.previousTransition((-114599949L));
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+32:00" + "'", str38, "+32:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+32:00" + "'", str41, "+32:00");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-115200001L) + "'", long44 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 115200010L + "'", long46 == 115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 115200000 + "'", int50 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 115200010L + "'", long53 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 115200000 + "'", int64 == 115200000);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-114599949L) + "'", long69 == (-114599949L));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        long long15 = dateTimeZone4.convertLocalToUTC((long) (byte) -1, true, 10L);
        java.util.TimeZone timeZone16 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone19.getShortName((long) (byte) 10, locale21);
        java.lang.String str23 = dateTimeZone19.getID();
        java.lang.String str24 = dateTimeZone19.getID();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean28 = dateTimeZone19.equals((java.lang.Object) dateTimeZone27);
        java.lang.String str30 = dateTimeZone27.getNameKey((long) (byte) 1);
        boolean boolean31 = dateTimeZone27.isFixed();
        java.util.TimeZone timeZone32 = dateTimeZone27.toTimeZone();
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone27.getShortName((long) (short) 0, locale34);
        long long39 = dateTimeZone27.convertLocalToUTC(115200052L, false, 230339999L);
        boolean boolean40 = dateTimeZone27.isFixed();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = dateTimeZone43.isLocalDateTimeGap(localDateTime44);
        java.util.TimeZone timeZone46 = dateTimeZone43.toTimeZone();
        java.lang.Object obj47 = null;
        boolean boolean48 = dateTimeZone43.equals(obj47);
        boolean boolean49 = dateTimeZone27.equals(obj47);
        boolean boolean50 = dateTimeZone17.equals(obj47);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200001L) + "'", long15 == (-115200001L));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+52:01" + "'", str35, "+52:01");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-72059948L) + "'", long39 == (-72059948L));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "GMT+00:10");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getName(3480062L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        boolean boolean6 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-01:00" + "'", str3, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int27 = dateTimeZone25.getOffsetFromLocal((-1L));
        boolean boolean28 = dateTimeZone25.isFixed();
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone25.getOffset(readableInstant29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone25.getShortName((long) 60000, locale32);
        long long37 = dateTimeZone25.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int42 = dateTimeZone40.getOffsetFromLocal((-1L));
        boolean boolean43 = dateTimeZone40.isFixed();
        long long45 = dateTimeZone40.convertUTCToLocal(0L);
        int int47 = dateTimeZone40.getOffset(115200010L);
        boolean boolean49 = dateTimeZone40.equals((java.lang.Object) 115200000);
        java.util.TimeZone timeZone50 = dateTimeZone40.toTimeZone();
        java.lang.String str52 = dateTimeZone40.getNameKey((long) (byte) 100);
        boolean boolean53 = dateTimeZone25.equals((java.lang.Object) str52);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str57 = dateTimeZone56.toString();
        long long59 = dateTimeZone56.nextTransition((long) (byte) -1);
        int int61 = dateTimeZone56.getOffset((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone56);
        long long64 = dateTimeZone25.getMillisKeepLocal(dateTimeZone56, 3600000L);
        long long66 = dateTimeZone16.getMillisKeepLocal(dateTimeZone25, (-115080001L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
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
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115200000 + "'", int27 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:00" + "'", str33, "+32:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-115199999L) + "'", long37 == (-115199999L));
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 115200000 + "'", int42 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 115200000L + "'", long45 == 115200000L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 115200000 + "'", int47 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:01" + "'", str57, "+00:01");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 60000 + "'", int61 == 60000);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 118740000L + "'", long64 == 118740000L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-115080001L) + "'", long66 == (-115080001L));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str12 = dateTimeZone1.getNameKey(0L);
        java.lang.String str13 = dateTimeZone1.getID();
        long long15 = dateTimeZone1.previousTransition((-115199900L));
        int int17 = dateTimeZone1.getOffset(302400000L);
        java.lang.String str19 = dateTimeZone1.getShortName((-115199990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115199900L) + "'", long15 == (-115199900L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str12 = dateTimeZone1.toString();
        long long14 = dateTimeZone1.nextTransition(302400010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 302400010L + "'", long14 == 302400010L);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        int int10 = dateTimeZone1.getStandardOffset((long) (byte) 100);
        boolean boolean12 = dateTimeZone1.isStandardOffset(115260010L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean15 = dateTimeZone1.isStandardOffset((-230279900L));
        long long18 = dateTimeZone1.convertLocalToUTC((-114659949L), false);
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-229859949L) + "'", long18 == (-229859949L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long5 = dateTimeZone2.nextTransition((long) (byte) -1);
        int int7 = dateTimeZone2.getOffset((long) (short) 0);
        boolean boolean9 = dateTimeZone2.isStandardOffset(100L);
        java.lang.String str11 = dateTimeZone2.getShortName((long) 0);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone2.getName((-230219990L), locale13);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(115199999L, false, (long) (short) 0);
        long long17 = dateTimeZone1.adjustOffset(0L, false);
        java.lang.String str19 = dateTimeZone1.getName((-345599896L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str11 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        int int15 = dateTimeZone1.getOffsetFromLocal((-230339948L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115200000L) + "'", long9 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        boolean boolean8 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        boolean boolean11 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }
}
