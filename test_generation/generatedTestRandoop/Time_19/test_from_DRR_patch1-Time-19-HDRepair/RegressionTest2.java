import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        java.lang.String str9 = dateTimeZone1.getNameKey((long) (byte) -1);
        long long12 = dateTimeZone1.convertLocalToUTC((-115200000L), false);
        java.lang.String str13 = dateTimeZone1.toString();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName((-111659899L), locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-230400000L) + "'", long12 == (-230400000L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:10");
        long long4 = dateTimeZone1.adjustOffset((long) '4', false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        java.lang.String str8 = dateTimeZone5.getID();
        long long10 = dateTimeZone5.previousTransition((-1L));
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-115199899L));
        int int14 = dateTimeZone1.getStandardOffset(3660000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-229799899L) + "'", long12 == (-229799899L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 600000 + "'", int14 == 600000);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        long long12 = dateTimeZone1.nextTransition(115200010L);
        boolean boolean13 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200010L + "'", long12 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(126000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        long long27 = dateTimeZone1.nextTransition((-259319990L));
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-259319990L) + "'", long27 == (-259319990L));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        long long11 = dateTimeZone1.convertLocalToUTC(115200010L, false, (-115199903L));
        java.lang.String str13 = dateTimeZone1.getNameKey((-345659903L));
        java.lang.String str15 = dateTimeZone1.getNameKey((-230339948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        int int28 = dateTimeZone20.getOffsetFromLocal((long) '#');
        long long31 = dateTimeZone20.adjustOffset((long) (-1), true);
        java.lang.String str33 = dateTimeZone20.getName(115199900L);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 187260000 + "'", int28 == 187260000);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+52:01" + "'", str33, "+52:01");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        java.lang.String str5 = dateTimeZone2.getID();
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone2.isLocalDateTimeGap(localDateTime6);
        java.lang.String str8 = dateTimeZone2.toString();
        long long11 = dateTimeZone2.adjustOffset(52L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str5 = dateTimeZone1.getShortName(230399999L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName(111600000L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone20.getOffset(readableInstant22);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone20.isLocalDateTimeGap(localDateTime24);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60000 + "'", int23 == 60000);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(126000000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean13 = dateTimeZone1.isStandardOffset((long) (short) 0);
        long long16 = dateTimeZone1.adjustOffset((-115199949L), true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199949L) + "'", long16 == (-115199949L));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str4 = dateTimeZone1.getNameKey((long) 'a');
        long long7 = dateTimeZone1.adjustOffset((long) 3600000, false);
        boolean boolean9 = dateTimeZone1.isStandardOffset(187200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((long) '#', locale12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int17 = dateTimeZone15.getOffsetFromLocal((-1L));
        long long19 = dateTimeZone15.convertUTCToLocal((-1L));
        java.lang.String str21 = dateTimeZone15.getName((-1L));
        int int23 = dateTimeZone15.getOffset((long) '4');
        java.lang.String str25 = dateTimeZone15.getNameKey((-115139948L));
        java.util.TimeZone timeZone26 = dateTimeZone15.toTimeZone();
        boolean boolean27 = dateTimeZone1.equals((java.lang.Object) timeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115199999L + "'", long19 == 115199999L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        int int5 = dateTimeZone3.getOffsetFromLocal(0L);
        long long7 = dateTimeZone3.nextTransition((-115199899L));
        boolean boolean9 = dateTimeZone3.isStandardOffset((-230399947L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115199899L) + "'", long7 == (-115199899L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115200101L + "'", long16 == 115200101L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        int int6 = dateTimeZone1.getStandardOffset((long) (byte) 0);
        java.lang.String str7 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) '#');
        int int4 = dateTimeZone2.getOffsetFromLocal((-115199949L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2100000 + "'", int4 == 2100000);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        org.joda.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = dateTimeZone24.isLocalDateTimeGap(localDateTime37);
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone24.isLocalDateTimeGap(localDateTime39);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        long long34 = dateTimeZone1.adjustOffset(115800001L, false);
        int int36 = dateTimeZone1.getOffset(115140035L);
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 115800001L + "'", long34 == 115800001L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 115200000 + "'", int36 == 115200000);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean5 = dateTimeZone4.isFixed();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone4.getName(115139999L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        java.lang.String str19 = dateTimeZone1.getShortName((-230219990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 10);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) 10);
        long long11 = dateTimeZone2.convertLocalToUTC(115140000L, true, (long) 100);
        java.lang.String str13 = dateTimeZone2.getNameKey((long) 60000);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getName((-230399900L), locale15);
        boolean boolean17 = dateTimeZone2.isFixed();
        java.lang.String str19 = dateTimeZone2.getName((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forID("+00:10");
        java.lang.String str23 = dateTimeZone21.getName((-115200001L));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int27 = dateTimeZone25.getOffsetFromLocal((-1L));
        boolean boolean28 = dateTimeZone25.isFixed();
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone25.getOffset(readableInstant29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone25.getShortName((long) 60000, locale32);
        long long37 = dateTimeZone25.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        java.lang.String str40 = dateTimeZone25.getNameKey((long) 100);
        java.lang.String str42 = dateTimeZone25.getShortName(115139999L);
        long long44 = dateTimeZone25.convertUTCToLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = dateTimeZone25.isLocalDateTimeGap(localDateTime45);
        long long49 = dateTimeZone25.convertLocalToUTC(43139999L, false);
        long long51 = dateTimeZone21.getMillisKeepLocal(dateTimeZone25, 230400001L);
        long long53 = dateTimeZone2.getMillisKeepLocal(dateTimeZone21, (-230399900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-72120000L) + "'", long11 == (-72120000L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+52:01" + "'", str16, "+52:01");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+52:01" + "'", str19, "+52:01");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:10" + "'", str23, "+00:10");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115200000 + "'", int27 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:00" + "'", str33, "+32:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-115199999L) + "'", long37 == (-115199999L));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+32:00" + "'", str42, "+32:00");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 115200100L + "'", long44 == 115200100L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-72060001L) + "'", long49 == (-72060001L));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 115800001L + "'", long51 == 115800001L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-43739900L) + "'", long53 == (-43739900L));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-25L), locale11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        java.lang.String str20 = dateTimeZone4.getName((-60000L));
        long long22 = dateTimeZone4.nextTransition((-460799965L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-460799965L) + "'", long22 == (-460799965L));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        int int31 = dateTimeZone7.getOffsetFromLocal((long) 0);
        long long33 = dateTimeZone7.nextTransition(115139999L);
        java.lang.String str35 = dateTimeZone7.getNameKey((-115259899L));
        java.lang.Class<?> wildcardClass36 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115200001L) + "'", long16 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 115200000 + "'", int25 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-115200001L) + "'", long29 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 115200000 + "'", int31 == 115200000);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 115139999L + "'", long33 == 115139999L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        int int39 = dateTimeZone18.getOffset(3540062L);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone41.getShortName((long) (byte) 10, locale43);
        java.lang.String str45 = dateTimeZone41.getID();
        java.lang.String str46 = dateTimeZone41.getID();
        java.lang.String str48 = dateTimeZone41.getShortName(1L);
        org.joda.time.ReadableInstant readableInstant49 = null;
        int int50 = dateTimeZone41.getOffset(readableInstant49);
        int int52 = dateTimeZone41.getOffsetFromLocal((long) ' ');
        long long55 = dateTimeZone41.adjustOffset((long) 3600000, false);
        long long57 = dateTimeZone41.nextTransition((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int64 = dateTimeZone62.getOffsetFromLocal((long) 10);
        boolean boolean65 = dateTimeZone60.equals((java.lang.Object) 10);
        long long69 = dateTimeZone60.convertLocalToUTC(115140000L, true, (long) 100);
        long long71 = dateTimeZone41.getMillisKeepLocal(dateTimeZone60, (-187259990L));
        long long73 = dateTimeZone18.getMillisKeepLocal(dateTimeZone60, 44L);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60000 + "'", int39 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+32:00" + "'", str44, "+32:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+32:00" + "'", str45, "+32:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+32:00" + "'", str46, "+32:00");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+32:00" + "'", str48, "+32:00");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 115200000 + "'", int50 == 115200000);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 115200000 + "'", int52 == 115200000);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 3600000L + "'", long55 == 3600000L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 97L + "'", long57 == 97L);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-72120000L) + "'", long69 == (-72120000L));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-259319990L) + "'", long71 == (-259319990L));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-187199956L) + "'", long73 == (-187199956L));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        long long5 = dateTimeZone2.convertLocalToUTC((long) (short) 100, false);
        java.lang.String str6 = dateTimeZone2.toString();
        java.lang.String str7 = dateTimeZone2.getID();
        boolean boolean8 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-187199900L) + "'", long5 == (-187199900L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+52:00" + "'", str6, "+52:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+52:00" + "'", str7, "+52:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str13 = dateTimeZone11.getName(115200032L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone11.getName((-345419990L), locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long3 = dateTimeZone1.convertUTCToLocal((long) 1);
        boolean boolean5 = dateTimeZone1.isStandardOffset(120010L);
        boolean boolean7 = dateTimeZone1.equals((java.lang.Object) (-359399949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
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
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset((-111540000L));
        long long5 = dateTimeZone1.convertUTCToLocal(115200000L);
        java.lang.String str6 = dateTimeZone1.toString();
        int int8 = dateTimeZone1.getOffsetFromLocal(230339910L);
        java.lang.String str9 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115200000L + "'", long5 == 115200000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        long long15 = dateTimeZone4.convertUTCToLocal((long) '#');
        boolean boolean17 = dateTimeZone4.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200035L + "'", long15 == 115200035L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        long long8 = dateTimeZone1.previousTransition((-120001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-120001L) + "'", long8 == (-120001L));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone1.isLocalDateTimeGap(localDateTime20);
        java.lang.Class<?> wildcardClass22 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC(115200052L, true, (long) (short) 0);
        int int9 = dateTimeZone1.getStandardOffset(115200000L);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getName((long) 'a');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName((-115199903L), locale4);
        java.lang.String str6 = dateTimeZone0.toString();
        boolean boolean8 = dateTimeZone0.isStandardOffset(230400010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coordinated Universal Time" + "'", str2, "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int5 = dateTimeZone3.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone6 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) 100);
        java.lang.Class<?> wildcardClass11 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 99L + "'", long10 == 99L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        long long12 = dateTimeZone2.convertLocalToUTC((-60001L), true, (long) 187200000);
        int int14 = dateTimeZone2.getOffset(53L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-120001L) + "'", long12 == (-120001L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        java.lang.String str10 = dateTimeZone2.getName((long) 60000);
        int int12 = dateTimeZone2.getStandardOffset(32L);
        java.lang.String str13 = dateTimeZone2.toString();
        long long15 = dateTimeZone2.nextTransition((-359399949L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-359399949L) + "'", long15 == (-359399949L));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone2.getOffset(115199999L);
        java.lang.String str9 = dateTimeZone2.getName((-115139900L));
        java.lang.String str10 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset((-111540000L));
        long long5 = dateTimeZone1.convertUTCToLocal(115200000L);
        java.lang.String str6 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long10 = dateTimeZone1.previousTransition(115140100L);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115200000L + "'", long5 == 115200000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115140100L + "'", long10 == 115140100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3600000);
        int int3 = dateTimeZone1.getStandardOffset((-230399896L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3600000 + "'", int3 == 3600000);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        boolean boolean10 = dateTimeZone1.isStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        java.lang.Object obj13 = null;
        boolean boolean14 = dateTimeZone1.equals(obj13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone1.isLocalDateTimeGap(localDateTime30);
        int int33 = dateTimeZone1.getOffset((-345539896L));
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 115200000 + "'", int33 == 115200000);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        boolean boolean30 = dateTimeZone5.isLocalDateTimeGap(localDateTime29);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone5.getName((-229859900L), locale33);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+32:00" + "'", str34, "+32:00");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        long long10 = dateTimeZone1.adjustOffset((-115140001L), true);
        java.lang.String str12 = dateTimeZone1.getShortName(34L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115140001L) + "'", long10 == (-115140001L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(115199999L, false, (long) (short) 0);
        long long17 = dateTimeZone1.adjustOffset(0L, false);
        boolean boolean18 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        long long21 = dateTimeZone19.nextTransition((long) 'a');
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone19.getShortName(52L, locale23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, (-114599949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 600051L + "'", long27 == 600051L);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        java.lang.String str43 = dateTimeZone1.getNameKey((long) 361920000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-111540000L) + "'", long7 == (-111540000L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-589739949L) + "'", long9 == (-589739949L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115200001L) + "'", long26 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115200000 + "'", int28 == 115200000);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 115200000 + "'", int33 == 115200000);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 115200000 + "'", int35 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-115200001L) + "'", long39 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 115800000L + "'", long41 == 115800000L);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        int int9 = dateTimeZone1.getOffset((long) '4');
        java.lang.String str11 = dateTimeZone1.getNameKey((-115139948L));
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        boolean boolean13 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(1L, false);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(3600000L, locale10);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone1.isLocalDateTimeGap(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115199999L) + "'", long8 == (-115199999L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        boolean boolean25 = dateTimeZone17.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName(43020000L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int6 = dateTimeZone1.getOffset(115140000L);
        long long8 = dateTimeZone1.previousTransition(3660000L);
        java.lang.String str9 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3660000L + "'", long8 == 3660000L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        int int10 = dateTimeZone2.getOffset((-115139999L));
        boolean boolean11 = dateTimeZone2.isFixed();
        java.lang.String str12 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        long long16 = dateTimeZone1.convertLocalToUTC(53L, true);
        long long20 = dateTimeZone1.convertLocalToUTC((-59948L), true, (-111659938L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199947L) + "'", long16 == (-115199947L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-115259948L) + "'", long20 == (-115259948L));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        long long19 = dateTimeZone9.previousTransition((long) 1);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        java.lang.String str27 = dateTimeZone10.getShortName((-230399900L));
        long long30 = dateTimeZone10.adjustOffset(60001L, true);
        java.lang.String str32 = dateTimeZone10.getNameKey(60000L);
        java.lang.String str33 = dateTimeZone10.toString();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone35.getShortName((long) (byte) 10, locale37);
        java.lang.String str39 = dateTimeZone35.getID();
        boolean boolean41 = dateTimeZone35.isStandardOffset(10L);
        long long43 = dateTimeZone35.convertUTCToLocal(115199999L);
        int int45 = dateTimeZone35.getStandardOffset((-1L));
        java.lang.String str47 = dateTimeZone35.getName((long) '#');
        long long49 = dateTimeZone10.getMillisKeepLocal(dateTimeZone35, 10L);
        long long51 = dateTimeZone35.previousTransition(59975L);
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 60001L + "'", long30 == 60001L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:00" + "'", str33, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+32:00" + "'", str38, "+32:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+32:00" + "'", str39, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 230399999L + "'", long43 == 230399999L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 115200000 + "'", int45 == 115200000);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+32:00" + "'", str47, "+32:00");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L + "'", long49 == 10L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 59975L + "'", long51 == 59975L);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getID();
        boolean boolean12 = dateTimeZone1.isStandardOffset((-302459900L));
        boolean boolean13 = dateTimeZone1.isFixed();
        long long15 = dateTimeZone1.previousTransition((-115199899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115199899L) + "'", long15 == (-115199899L));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        java.util.TimeZone timeZone22 = dateTimeZone17.toTimeZone();
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
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187260000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        long long4 = dateTimeZone2.convertUTCToLocal(0L);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone2.getOffset(readableInstant5);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime7);
        int int10 = dateTimeZone2.getOffsetFromLocal((long) 3600000);
        java.util.TimeZone timeZone11 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 187200000L + "'", long4 == 187200000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 187200000 + "'", int10 == 187200000);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getName((long) 'a');
        long long4 = dateTimeZone0.convertUTCToLocal(10L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coordinated Universal Time" + "'", str2, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        java.lang.String str37 = dateTimeZone20.getName(101L);
        int int39 = dateTimeZone20.getOffset((-385319990L));
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+32:00" + "'", str37, "+32:00");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 115200000 + "'", int39 == 115200000);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone4.isLocalDateTimeGap(localDateTime18);
        java.lang.String str20 = dateTimeZone4.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        java.lang.Class<?> wildcardClass28 = timeZone26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        boolean boolean27 = dateTimeZone1.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.lang.String str12 = dateTimeZone1.toString();
        java.lang.String str14 = dateTimeZone1.getNameKey((-115139948L));
        long long16 = dateTimeZone1.convertUTCToLocal(10L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115200010L + "'", long16 == 115200010L);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        long long15 = dateTimeZone1.adjustOffset((long) (byte) -1, false);
        java.lang.String str17 = dateTimeZone1.getShortName((-302459900L));
        java.lang.String str18 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass19 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone45.getShortName((long) (byte) 10, locale47);
        java.lang.String str49 = dateTimeZone45.getID();
        java.lang.String str50 = dateTimeZone45.getID();
        long long52 = dateTimeZone43.getMillisKeepLocal(dateTimeZone45, 100L);
        java.util.Locale locale54 = null;
        java.lang.String str55 = dateTimeZone45.getName((long) (byte) -1, locale54);
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeZone45.getShortName(60010L, locale57);
        long long62 = dateTimeZone45.convertLocalToUTC(43139999L, false, (long) (short) 0);
        boolean boolean63 = dateTimeZone5.equals((java.lang.Object) long62);
        java.util.TimeZone timeZone64 = dateTimeZone5.toTimeZone();
        java.util.Locale locale66 = null;
        java.lang.String str67 = dateTimeZone5.getShortName(120000L, locale66);
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
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+32:00" + "'", str48, "+32:00");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+32:00" + "'", str49, "+32:00");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+32:00" + "'", str50, "+32:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-115139900L) + "'", long52 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+32:00" + "'", str55, "+32:00");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+32:00" + "'", str58, "+32:00");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-72060001L) + "'", long62 == (-72060001L));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(timeZone64);
        org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "UTC" + "'", str67, "UTC");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        java.lang.String str10 = dateTimeZone1.getName(115200001L);
        long long12 = dateTimeZone1.convertUTCToLocal((-59900L));
        boolean boolean14 = dateTimeZone1.isStandardOffset(600035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115140100L + "'", long12 == 115140100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        java.lang.String str8 = dateTimeZone1.getID();
        java.lang.String str10 = dateTimeZone1.getShortName((long) 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        int int12 = dateTimeZone1.getStandardOffset((-230339999L));
        long long15 = dateTimeZone1.adjustOffset((-115260000L), false);
        java.lang.Class<?> wildcardClass16 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115260000L) + "'", long15 == (-115260000L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        long long11 = dateTimeZone1.adjustOffset(43080000L, true);
        long long13 = dateTimeZone1.nextTransition((-115140000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 43080000L + "'", long11 == 43080000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115140000L) + "'", long13 == (-115140000L));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        java.lang.String str12 = dateTimeZone9.getNameKey((long) (byte) 1);
        java.lang.String str13 = dateTimeZone9.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+52:01" + "'", str13, "+52:01");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str18 = dateTimeZone17.getID();
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
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertUTCToLocal((-115199990L));
        long long8 = dateTimeZone0.convertLocalToUTC((-1L), false, 115260000L);
        long long10 = dateTimeZone0.previousTransition(115200035L);
        long long13 = dateTimeZone0.adjustOffset((-600000L), true);
        int int15 = dateTimeZone0.getOffsetFromLocal((-229859900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199990L) + "'", long4 == (-115199990L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115200035L + "'", long10 == 115200035L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-600000L) + "'", long13 == (-600000L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean6 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        long long11 = dateTimeZone2.convertLocalToUTC(230399999L, true);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone2.isLocalDateTimeGap(localDateTime12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int17 = dateTimeZone15.getOffsetFromLocal((-1L));
        long long19 = dateTimeZone15.convertUTCToLocal((-1L));
        java.lang.String str21 = dateTimeZone15.getName((-1L));
        long long23 = dateTimeZone15.nextTransition((long) (byte) -1);
        long long25 = dateTimeZone2.getMillisKeepLocal(dateTimeZone15, 35L);
        long long29 = dateTimeZone15.convertLocalToUTC(230459975L, false, (-115079990L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 230339999L + "'", long11 == 230339999L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115199999L + "'", long19 == 115199999L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-115139965L) + "'", long25 == (-115139965L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 115259975L + "'", long29 == 115259975L);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        int int4 = dateTimeZone2.getOffset(115200010L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        int int8 = dateTimeZone6.getOffset((-111540000L));
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long12 = dateTimeZone10.previousTransition((long) (byte) -1);
        boolean boolean14 = dateTimeZone10.isStandardOffset((long) '#');
        java.lang.String str16 = dateTimeZone10.getNameKey((-115139948L));
        long long18 = dateTimeZone6.getMillisKeepLocal(dateTimeZone10, 3600000L);
        long long20 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, 32L);
        long long23 = dateTimeZone2.convertLocalToUTC((long) 60000, true);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int27 = dateTimeZone25.getOffsetFromLocal(43020000L);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone25.getOffset(readableInstant28);
        java.util.TimeZone timeZone30 = dateTimeZone25.toTimeZone();
        long long33 = dateTimeZone25.convertLocalToUTC((-187320000L), true);
        long long35 = dateTimeZone2.getMillisKeepLocal(dateTimeZone25, (-460799965L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3540000L + "'", long18 == 3540000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60032L + "'", long20 == 60032L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-187320000L) + "'", long33 == (-187320000L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-460739965L) + "'", long35 == (-460739965L));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str11 = dateTimeZone1.getID();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((long) (byte) 10, locale13);
        long long18 = dateTimeZone1.convertLocalToUTC((long) 115200000, false, (-187260000L));
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone1.getOffset(readableInstant19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.nextTransition((long) 'a');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName(52L, locale4);
        long long8 = dateTimeZone0.adjustOffset((long) 'a', false);
        long long10 = dateTimeZone0.previousTransition((long) 1);
        java.lang.String str12 = dateTimeZone0.getName((-115259900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinated Universal Time" + "'", str12, "Coordinated Universal Time");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        long long3 = dateTimeZone1.nextTransition((-115139958L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone6.getShortName((long) (byte) 10, locale8);
        java.lang.String str10 = dateTimeZone6.getID();
        boolean boolean12 = dateTimeZone6.isStandardOffset(10L);
        int int14 = dateTimeZone6.getStandardOffset((long) 1);
        boolean boolean15 = dateTimeZone1.equals((java.lang.Object) dateTimeZone6);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName(35L, locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115139958L) + "'", long3 == (-115139958L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(115140000L, locale10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str14 = dateTimeZone1.getShortName((-704999949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        long long12 = dateTimeZone1.previousTransition(115260000L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((-25L), locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115260000L + "'", long12 == 115260000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        long long15 = dateTimeZone1.adjustOffset((long) (byte) -1, false);
        int int17 = dateTimeZone1.getOffsetFromLocal((long) (short) 1);
        java.lang.String str18 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        boolean boolean6 = dateTimeZone2.isFixed();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getShortName(230339999L, locale8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) (byte) 10, locale13);
        java.lang.String str15 = dateTimeZone11.getID();
        java.lang.String str16 = dateTimeZone11.getID();
        java.lang.String str17 = dateTimeZone11.getID();
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone11.getOffset(readableInstant18);
        boolean boolean20 = dateTimeZone2.equals((java.lang.Object) readableInstant18);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (short) 10);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (short) 100);
        java.lang.String str7 = dateTimeZone1.getShortName((-3599900L));
        java.lang.String str9 = dateTimeZone1.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.previousTransition((long) (short) -1);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName(230399997L, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:00" + "'", str6, "+01:00");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        boolean boolean30 = dateTimeZone17.isStandardOffset(115139999L);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone17.getOffset(readableInstant31);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 115200000 + "'", int32 == 115200000);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        long long11 = dateTimeZone2.convertLocalToUTC(230399999L, true);
        int int13 = dateTimeZone2.getOffset((-230400000L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getShortName(115200052L, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 230339999L + "'", long11 == 230339999L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) 'a');
        int int10 = dateTimeZone1.getStandardOffset((-187260000L));
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        long long21 = dateTimeZone1.nextTransition(187200010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115200000L) + "'", long19 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 187200010L + "'", long21 == 187200010L);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        java.lang.String str22 = dateTimeZone1.getShortName(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass24 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        int int13 = dateTimeZone9.getStandardOffset((long) '#');
        int int15 = dateTimeZone9.getStandardOffset((-115199999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 187260000 + "'", int13 == 187260000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 187260000 + "'", int15 == 187260000);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:00");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+01:00");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getStandardOffset((long) 'a');
        boolean boolean9 = dateTimeZone1.isFixed();
        java.lang.String str11 = dateTimeZone1.getShortName((long) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone4.getName((long) (byte) -1, locale13);
        int int16 = dateTimeZone4.getStandardOffset((-417659900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        java.util.TimeZone timeZone27 = dateTimeZone20.toTimeZone();
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
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(1L, false);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(3600000L, locale10);
        java.lang.String str13 = dateTimeZone1.getName((-72119990L));
        long long15 = dateTimeZone1.nextTransition((-223259899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115199999L) + "'", long8 == (-115199999L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-223259899L) + "'", long15 == (-223259899L));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        java.lang.String str15 = dateTimeZone4.getShortName((-589739949L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        long long23 = dateTimeZone1.convertLocalToUTC((-345539900L), false);
        long long26 = dateTimeZone1.adjustOffset(10L, true);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-460739900L) + "'", long23 == (-460739900L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        long long12 = dateTimeZone1.convertUTCToLocal(115200000L);
        java.lang.String str13 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 230400000L + "'", long12 == 230400000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-115199903L), locale4);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC((long) 'a', false);
        long long13 = dateTimeZone1.convertLocalToUTC((-115199965L), true, (-230339999L));
        java.lang.String str14 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 96L + "'", long9 == 96L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199966L) + "'", long13 == (-115199966L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        int int28 = dateTimeZone20.getOffsetFromLocal((long) '#');
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone20.getOffset(readableInstant29);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 187260000 + "'", int28 == 187260000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 187260000 + "'", int30 == 187260000);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone6 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long5 = dateTimeZone2.nextTransition((long) (byte) -1);
        int int7 = dateTimeZone2.getOffset((long) (short) 0);
        boolean boolean9 = dateTimeZone2.isStandardOffset(100L);
        long long13 = dateTimeZone2.convertLocalToUTC(118800000L, false, (-187199900L));
        java.lang.String str14 = dateTimeZone2.toString();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone2.getName((-115200001L), locale16);
        long long20 = dateTimeZone2.adjustOffset(115200035L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 118740000L + "'", long13 == 118740000L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115200035L + "'", long20 == 115200035L);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        java.lang.String str32 = dateTimeZone9.getID();
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
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        java.lang.String str22 = dateTimeZone1.getNameKey((-3539990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        int int10 = dateTimeZone1.getStandardOffset((long) (byte) 100);
        int int12 = dateTimeZone1.getOffset((-111659899L));
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        int int10 = dateTimeZone2.getOffsetFromLocal((-115139900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        java.lang.String str15 = dateTimeZone1.getShortName((long) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        long long26 = dateTimeZone17.previousTransition((-230219990L));
        int int28 = dateTimeZone17.getStandardOffset(0L);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-230219990L) + "'", long26 == (-230219990L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115200000 + "'", int28 == 115200000);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.lang.String str10 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        boolean boolean9 = dateTimeZone2.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getName((-25L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone17.getShortName((long) (byte) 10, locale19);
        java.lang.String str21 = dateTimeZone17.getID();
        long long23 = dateTimeZone17.convertUTCToLocal((-230339900L));
        long long25 = dateTimeZone14.getMillisKeepLocal(dateTimeZone17, 60010L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone14.getShortName((-230399900L), locale27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone14.getName((-345599965L), locale30);
        long long33 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (-3599900L));
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone14.getOffset(readableInstant34);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-115139900L) + "'", long23 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-115079990L) + "'", long25 == (-115079990L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-3659900L) + "'", long33 == (-3659900L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60000 + "'", int35 == 60000);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) 'a');
        boolean boolean9 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        long long3 = dateTimeZone1.previousTransition(115199999L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115199999L + "'", long3 == 115199999L);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        java.lang.String str32 = dateTimeZone1.getNameKey((long) 187260000);
        long long36 = dateTimeZone1.convertLocalToUTC((-244680000L), false, (-345539903L));
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
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-359880000L) + "'", long36 == (-359880000L));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, 2100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 2100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone1.getShortName((long) 100, locale24);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int29 = dateTimeZone27.getOffsetFromLocal((-1L));
        long long31 = dateTimeZone27.convertUTCToLocal((-1L));
        long long34 = dateTimeZone27.convertLocalToUTC(1L, false);
        org.joda.time.ReadableInstant readableInstant35 = null;
        int int36 = dateTimeZone27.getOffset(readableInstant35);
        boolean boolean38 = dateTimeZone27.equals((java.lang.Object) 100);
        long long42 = dateTimeZone27.convertLocalToUTC(115200001L, true, (long) ' ');
        boolean boolean43 = dateTimeZone1.equals((java.lang.Object) 115200001L);
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone1.getName(230400010L, locale45);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 115200000 + "'", int29 == 115200000);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 115199999L + "'", long31 == 115199999L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-115199999L) + "'", long34 == (-115199999L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 115200000 + "'", int36 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+32:00" + "'", str46, "+32:00");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        long long20 = dateTimeZone1.convertUTCToLocal(72000000L);
        java.lang.String str22 = dateTimeZone1.getNameKey((-301859949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 43080000L + "'", long11 == 43080000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399900L) + "'", long13 == (-230399900L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 187200000L + "'", long20 == 187200000L);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        long long26 = dateTimeZone17.previousTransition((-72000001L));
        java.lang.String str28 = dateTimeZone17.getNameKey((-230159990L));
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-72000001L) + "'", long26 == (-72000001L));
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        java.lang.String str3 = dateTimeZone1.getName(233940000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coordinated Universal Time" + "'", str3, "Coordinated Universal Time");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(1L, false);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(0L, locale10);
        boolean boolean12 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115199999L) + "'", long8 == (-115199999L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        long long18 = dateTimeZone1.nextTransition(3540062L);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3540062L + "'", long18 == 3540062L);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        boolean boolean11 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone14.getShortName(0L, locale16);
        java.util.TimeZone timeZone18 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long24 = dateTimeZone21.adjustOffset((long) 10, false);
        long long27 = dateTimeZone21.adjustOffset(0L, true);
        long long29 = dateTimeZone21.previousTransition(60000L);
        boolean boolean30 = dateTimeZone14.equals((java.lang.Object) dateTimeZone21);
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 118740000L);
        long long35 = dateTimeZone1.adjustOffset(230219999L, false);
        java.lang.String str36 = dateTimeZone1.toString();
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone1.getName((long) (-1), locale38);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 60000L + "'", long29 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 233880000L + "'", long32 == 233880000L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 230219999L + "'", long35 == 230219999L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+32:00" + "'", str39, "+32:00");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        int int10 = dateTimeZone2.getOffset((-36600000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        long long9 = dateTimeZone1.nextTransition((long) 10);
        int int11 = dateTimeZone1.getOffsetFromLocal((-115199900L));
        int int13 = dateTimeZone1.getOffset((-115139900L));
        long long17 = dateTimeZone1.convertLocalToUTC((long) (short) 100, false, 115139999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115199900L) + "'", long17 == (-115199900L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        long long13 = dateTimeZone1.adjustOffset(60001L, false);
        long long16 = dateTimeZone1.adjustOffset(51L, false);
        long long18 = dateTimeZone1.convertUTCToLocal((-111480100L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60001L + "'", long13 == 60001L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 51L + "'", long16 == 51L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3719900L + "'", long18 == 3719900L);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        int int11 = dateTimeZone1.getOffset((long) (byte) 0);
        long long15 = dateTimeZone1.convertLocalToUTC(0L, false, 115200032L);
        long long18 = dateTimeZone1.adjustOffset((long) 3600000, false);
        java.lang.String str20 = dateTimeZone1.getName((-230339999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200000L) + "'", long15 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3600000L + "'", long18 == 3600000L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) 115200000);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.lang.String str13 = dateTimeZone1.getNameKey((long) (byte) 100);
        long long17 = dateTimeZone1.convertLocalToUTC(60010L, false, (-359880000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115139990L) + "'", long17 == (-115139990L));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:00");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 600000, locale3);
        int int6 = dateTimeZone1.getStandardOffset(111600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3600000 + "'", int6 == 3600000);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone1.getOffset(readableInstant13);
        long long16 = dateTimeZone1.previousTransition((-115199903L));
        java.lang.String str17 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199903L) + "'", long16 == (-115199903L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        java.lang.Class<?> wildcardClass8 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str13 = dateTimeZone11.getName(115200032L);
        java.lang.String str15 = dateTimeZone11.getNameKey((long) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 0);
        long long4 = dateTimeZone2.nextTransition((long) 360000000);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName(34L, locale6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone9.getShortName((long) (byte) 10, locale11);
        java.lang.String str13 = dateTimeZone9.getID();
        boolean boolean15 = dateTimeZone9.isStandardOffset(10L);
        int int17 = dateTimeZone9.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone19.getShortName((long) (byte) 10, locale21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone19.getOffset(readableInstant23);
        java.lang.String str26 = dateTimeZone19.getName(1L);
        long long28 = dateTimeZone9.getMillisKeepLocal(dateTimeZone19, (long) (short) 1);
        long long30 = dateTimeZone19.nextTransition(115200000L);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone32.getShortName((long) (byte) 10, locale34);
        java.lang.String str37 = dateTimeZone32.getName(10L);
        long long39 = dateTimeZone19.getMillisKeepLocal(dateTimeZone32, (-115139900L));
        java.lang.String str40 = dateTimeZone19.toString();
        long long42 = dateTimeZone19.convertUTCToLocal((-115140000L));
        boolean boolean43 = dateTimeZone2.equals((java.lang.Object) long42);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 360000000L + "'", long4 == 360000000L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 115200000 + "'", int24 == 115200000);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 115200000L + "'", long30 == 115200000L);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+32:00" + "'", str35, "+32:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+32:00" + "'", str37, "+32:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-115139900L) + "'", long39 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+32:00" + "'", str40, "+32:00");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 60000L + "'", long42 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(52L, locale6);
        java.lang.String str9 = dateTimeZone1.getShortName((long) 10);
        long long11 = dateTimeZone1.nextTransition((-114659899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-114659899L) + "'", long11 == (-114659899L));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        java.lang.Class<?> wildcardClass30 = timeZone26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        int int10 = dateTimeZone1.getStandardOffset((long) (byte) 100);
        int int12 = dateTimeZone1.getOffsetFromLocal(115320000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.nextTransition((-115259900L));
        java.lang.String str5 = dateTimeZone1.getName(187200010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115259900L) + "'", long3 == (-115259900L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(349200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertUTCToLocal((-115199990L));
        long long8 = dateTimeZone0.convertLocalToUTC((-1L), false, 115260000L);
        java.lang.String str9 = dateTimeZone0.getID();
        java.lang.String str11 = dateTimeZone0.getNameKey((-115199939L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+00:00:00.100" + "'", str1, "+00:00:00.100");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199890L) + "'", long4 == (-115199890L));
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-101L) + "'", long8 == (-101L));
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.String str12 = dateTimeZone1.getID();
        long long14 = dateTimeZone1.nextTransition(44L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 44L + "'", long14 == 44L);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getID();
        java.lang.String str11 = dateTimeZone1.getID();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((-115139900L), locale13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        long long19 = dateTimeZone1.convertLocalToUTC((-230219990L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-345419990L) + "'", long19 == (-345419990L));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        int int20 = dateTimeZone1.getOffsetFromLocal((-115200000L));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3600000 + "'", int20 == 3600000);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false);
        int int15 = dateTimeZone1.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone1.isLocalDateTimeGap(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        long long17 = dateTimeZone8.convertLocalToUTC((-187320000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-115199948L) + "'", long5 == (-115199948L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-187320000L) + "'", long17 == (-187320000L));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        java.lang.String str27 = dateTimeZone10.getShortName((-230399900L));
        long long30 = dateTimeZone10.adjustOffset(60001L, true);
        java.lang.String str32 = dateTimeZone10.getShortName((-115199966L));
        java.lang.String str34 = dateTimeZone10.getShortName(230339910L);
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 60001L + "'", long30 == 60001L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+32:00" + "'", str34, "+32:00");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName(0L, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition(115200010L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName((long) '4', locale5);
        java.lang.String str8 = dateTimeZone1.getShortName(34L);
        java.lang.String str10 = dateTimeZone1.getShortName((-111659938L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115200010L + "'", long3 == 115200010L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str11 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone13.getShortName((long) (byte) 10, locale15);
        java.lang.String str17 = dateTimeZone13.getID();
        java.lang.String str18 = dateTimeZone13.getID();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean22 = dateTimeZone13.equals((java.lang.Object) dateTimeZone21);
        java.lang.String str24 = dateTimeZone21.getNameKey((long) (byte) 1);
        boolean boolean25 = dateTimeZone21.isFixed();
        java.util.TimeZone timeZone26 = dateTimeZone21.toTimeZone();
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone21.getShortName((long) 100, locale28);
        boolean boolean30 = dateTimeZone1.equals((java.lang.Object) dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115200000L) + "'", long9 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+52:01" + "'", str29, "+52:01");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+97:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+97:00\" is malformed at \"97:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        java.lang.String str27 = dateTimeZone2.getName((-120001L));
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:01" + "'", str27, "+00:01");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition(115200010L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.lang.String str7 = dateTimeZone1.getShortName(0L);
        long long10 = dateTimeZone1.convertLocalToUTC((-230280090L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115200010L + "'", long3 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-230280089L) + "'", long10 == (-230280089L));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 187260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187260000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        long long5 = dateTimeZone2.convertLocalToUTC((long) (short) 100, false);
        java.lang.String str6 = dateTimeZone2.toString();
        java.lang.String str7 = dateTimeZone2.getID();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long11 = dateTimeZone9.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int15 = dateTimeZone13.getOffsetFromLocal((-1L));
        boolean boolean16 = dateTimeZone13.isFixed();
        long long18 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 1L);
        int int20 = dateTimeZone13.getOffsetFromLocal((long) 10);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone13.getName(230399999L, locale22);
        long long25 = dateTimeZone13.nextTransition(43080000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long28 = dateTimeZone2.getMillisKeepLocal(dateTimeZone13, 230340010L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-187199900L) + "'", long5 == (-187199900L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+52:00" + "'", str6, "+52:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+52:00" + "'", str7, "+52:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115139999L) + "'", long18 == (-115139999L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 43080000L + "'", long25 == 43080000L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 302340010L + "'", long28 == 302340010L);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        long long25 = dateTimeZone1.convertUTCToLocal(115200010L);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 118800010L + "'", long25 == 118800010L);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.lang.String str6 = dateTimeZone1.getShortName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.035" + "'", str2, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        long long22 = dateTimeZone1.adjustOffset(230399999L, false);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 230399999L + "'", long22 == 230399999L);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long30 = dateTimeZone28.nextTransition((-115259900L));
        long long32 = dateTimeZone18.getMillisKeepLocal(dateTimeZone28, 187200000L);
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
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-115259900L) + "'", long30 == (-115259900L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 187260001L + "'", long32 == 187260001L);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        java.lang.String str9 = dateTimeZone2.getShortName((-226859949L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        int int10 = dateTimeZone2.getOffset((-115139999L));
        int int12 = dateTimeZone2.getStandardOffset((-60000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int3 = dateTimeZone1.getStandardOffset((-1L));
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone1.getOffsetFromLocal((-60000L));
        int int9 = dateTimeZone1.getStandardOffset((-114539965L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str14 = dateTimeZone12.getNameKey(97L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertUTCToLocal((-115199990L));
        long long8 = dateTimeZone0.convertLocalToUTC((-1L), false, 115260000L);
        long long10 = dateTimeZone0.previousTransition(115200035L);
        long long13 = dateTimeZone0.adjustOffset((-600000L), true);
        java.lang.String str15 = dateTimeZone0.getShortName(115140010L);
        java.lang.String str17 = dateTimeZone0.getName((-36600000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+00:01" + "'", str1, "+00:01");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115139990L) + "'", long4 == (-115139990L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60001L) + "'", long8 == (-60001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115200035L + "'", long10 == 115200035L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-600000L) + "'", long13 == (-600000L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        java.lang.String str18 = dateTimeZone1.getShortName((-72060001L));
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int22 = dateTimeZone20.getOffsetFromLocal((-1L));
        long long24 = dateTimeZone20.convertUTCToLocal((-1L));
        long long27 = dateTimeZone20.convertLocalToUTC(1L, false);
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, (-230399998L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean33 = dateTimeZone32.isFixed();
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone32.getName((-115199903L), locale35);
        long long38 = dateTimeZone32.nextTransition((-230399903L));
        long long42 = dateTimeZone32.convertLocalToUTC((-115139990L), true, (-43139900L));
        java.lang.String str43 = dateTimeZone32.toString();
        long long45 = dateTimeZone1.getMillisKeepLocal(dateTimeZone32, 119990L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115199999L + "'", long24 == 115199999L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-115199999L) + "'", long27 == (-115199999L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-230399998L) + "'", long29 == (-230399998L));
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.001" + "'", str36, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-230399903L) + "'", long38 == (-230399903L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-115139991L) + "'", long42 == (-115139991L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.001" + "'", str43, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 115319989L + "'", long45 == 115319989L);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        java.lang.String str15 = dateTimeZone1.getName((-115199998L));
        java.lang.String str17 = dateTimeZone1.getShortName((-229799899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        long long4 = dateTimeZone2.convertUTCToLocal(0L);
        int int6 = dateTimeZone2.getOffset((-115139958L));
        boolean boolean7 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 187200000L + "'", long4 == 187200000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        int int19 = dateTimeZone5.getOffset((long) 360000000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 43080000L + "'", long17 == 43080000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        java.lang.String str37 = dateTimeZone2.getID();
        java.lang.String str38 = dateTimeZone2.getID();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:01" + "'", str37, "+00:01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:01" + "'", str38, "+00:01");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        java.lang.String str3 = dateTimeZone0.toString();
        int int5 = dateTimeZone0.getStandardOffset((-187259990L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+00:01" + "'", str1, "+00:01");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (short) 10);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (short) 100);
        boolean boolean7 = dateTimeZone1.isStandardOffset(100L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName(32L, locale9);
        int int12 = dateTimeZone1.getOffset((-302459900L));
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) 3480062L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinated Universal Time" + "'", str10, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        java.util.TimeZone timeZone6 = dateTimeZone2.toTimeZone();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long10 = dateTimeZone8.previousTransition((long) (byte) -1);
        long long14 = dateTimeZone8.convertLocalToUTC(115199999L, true, (long) '#');
        long long16 = dateTimeZone8.nextTransition((long) 10);
        int int18 = dateTimeZone8.getOffsetFromLocal((-115199900L));
        boolean boolean19 = dateTimeZone8.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        boolean boolean21 = dateTimeZone2.equals((java.lang.Object) dateTimeZone8);
        java.lang.Class<?> wildcardClass22 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115139999L + "'", long14 == 115139999L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        int int12 = dateTimeZone1.getStandardOffset((-230339999L));
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 360060000 + "'", int4 == 360060000);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone2.getOffset(readableInstant22);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 600000 + "'", int21 == 600000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 600000 + "'", int23 == 600000);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(0L, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone8.getOffset(readableInstant9);
        long long12 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (long) (byte) 10);
        int int14 = dateTimeZone2.getStandardOffset((long) (short) 1);
        java.lang.String str15 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60010L + "'", long12 == 60010L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) 'a');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int13 = dateTimeZone11.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone14 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        long long18 = dateTimeZone15.nextTransition((-230339948L));
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone20.getShortName((long) (byte) 10, locale22);
        java.lang.String str25 = dateTimeZone20.getName(10L);
        long long28 = dateTimeZone20.convertLocalToUTC(0L, true);
        java.lang.String str29 = dateTimeZone20.toString();
        java.lang.String str30 = dateTimeZone20.toString();
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone20.getOffset(readableInstant31);
        long long34 = dateTimeZone20.nextTransition(10L);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone36.getShortName((long) (byte) 10, locale38);
        java.lang.String str40 = dateTimeZone36.getID();
        java.lang.String str41 = dateTimeZone36.getID();
        java.lang.String str42 = dateTimeZone36.getID();
        org.joda.time.ReadableInstant readableInstant43 = null;
        int int44 = dateTimeZone36.getOffset(readableInstant43);
        int int46 = dateTimeZone36.getStandardOffset(230340010L);
        boolean boolean47 = dateTimeZone20.equals((java.lang.Object) dateTimeZone36);
        org.joda.time.ReadableInstant readableInstant48 = null;
        int int49 = dateTimeZone20.getOffset(readableInstant48);
        java.lang.String str51 = dateTimeZone20.getShortName((-230339948L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        long long54 = dateTimeZone15.getMillisKeepLocal(dateTimeZone20, (-230099990L));
        boolean boolean55 = dateTimeZone1.equals((java.lang.Object) long54);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-230339948L) + "'", long18 == (-230339948L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-115200000L) + "'", long28 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 115200000 + "'", int32 == 115200000);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+32:00" + "'", str39, "+32:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+32:00" + "'", str40, "+32:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+32:00" + "'", str41, "+32:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+32:00" + "'", str42, "+32:00");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 115200000 + "'", int44 == 115200000);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 115200000 + "'", int46 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 115200000 + "'", int49 == 115200000);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+32:00" + "'", str51, "+32:00");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-345299990L) + "'", long54 == (-345299990L));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        long long30 = dateTimeZone1.convertLocalToUTC((-230339900L), true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone33.getShortName((long) (byte) 10, locale35);
        java.lang.String str37 = dateTimeZone33.getID();
        boolean boolean39 = dateTimeZone33.isStandardOffset(10L);
        int int41 = dateTimeZone33.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone43.getShortName((long) (byte) 10, locale45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        int int48 = dateTimeZone43.getOffset(readableInstant47);
        java.lang.String str50 = dateTimeZone43.getName(1L);
        long long52 = dateTimeZone33.getMillisKeepLocal(dateTimeZone43, (long) (short) 1);
        java.util.TimeZone timeZone53 = dateTimeZone33.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        long long58 = dateTimeZone54.convertLocalToUTC(10L, true, 115200035L);
        long long60 = dateTimeZone1.getMillisKeepLocal(dateTimeZone54, 0L);
        org.joda.time.ReadableInstant readableInstant61 = null;
        int int62 = dateTimeZone54.getOffset(readableInstant61);
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-345539900L) + "'", long30 == (-345539900L));
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+32:00" + "'", str37, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 115200000 + "'", int41 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+32:00" + "'", str46, "+32:00");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 115200000 + "'", int48 == 115200000);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+32:00" + "'", str50, "+32:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 10L + "'", long58 == 10L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 115200000L + "'", long60 == 115200000L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        long long38 = dateTimeZone33.convertUTCToLocal(115199900L);
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
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 115259900L + "'", long38 == 115259900L);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 1);
        long long9 = dateTimeZone1.adjustOffset(43020000L, false);
        long long11 = dateTimeZone1.previousTransition((-111659899L));
        int int13 = dateTimeZone1.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 43020000L + "'", long9 == 43020000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-111659899L) + "'", long11 == (-111659899L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        boolean boolean14 = dateTimeZone12.isStandardOffset(115800001L);
        boolean boolean16 = dateTimeZone12.isStandardOffset((-115259949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone20.getOffset(readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone20.getOffset(readableInstant24);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60000 + "'", int23 == 60000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60000 + "'", int25 == 60000);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        long long30 = dateTimeZone1.convertLocalToUTC((-230339900L), true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone33.getShortName((long) (byte) 10, locale35);
        java.lang.String str37 = dateTimeZone33.getID();
        boolean boolean39 = dateTimeZone33.isStandardOffset(10L);
        int int41 = dateTimeZone33.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone43.getShortName((long) (byte) 10, locale45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        int int48 = dateTimeZone43.getOffset(readableInstant47);
        java.lang.String str50 = dateTimeZone43.getName(1L);
        long long52 = dateTimeZone33.getMillisKeepLocal(dateTimeZone43, (long) (short) 1);
        java.util.TimeZone timeZone53 = dateTimeZone33.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        long long58 = dateTimeZone54.convertLocalToUTC(10L, true, 115200035L);
        long long60 = dateTimeZone1.getMillisKeepLocal(dateTimeZone54, 0L);
        int int62 = dateTimeZone54.getStandardOffset((-345539896L));
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-345539900L) + "'", long30 == (-345539900L));
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+32:00" + "'", str37, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 115200000 + "'", int41 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+32:00" + "'", str46, "+32:00");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 115200000 + "'", int48 == 115200000);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+32:00" + "'", str50, "+32:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 10L + "'", long58 == 10L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 115200000L + "'", long60 == 115200000L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        java.lang.String str3 = dateTimeZone0.getID();
        long long5 = dateTimeZone0.previousTransition((-1L));
        int int7 = dateTimeZone0.getOffsetFromLocal((-589739949L));
        java.lang.Class<?> wildcardClass8 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        java.lang.String str13 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int4 = dateTimeZone0.getStandardOffset((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone0.getOffset(readableInstant5);
        long long8 = dateTimeZone0.convertUTCToLocal((-230399900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-230339900L) + "'", long8 == (-230339900L));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        boolean boolean9 = dateTimeZone2.isStandardOffset((long) (byte) 10);
        int int11 = dateTimeZone2.getOffsetFromLocal((long) (byte) -1);
        java.lang.Class<?> wildcardClass12 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long3 = dateTimeZone1.nextTransition((-115199890L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115199890L) + "'", long3 == (-115199890L));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((-230339903L), locale3);
        boolean boolean6 = dateTimeZone1.isStandardOffset((-72059948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        java.lang.String str16 = dateTimeZone1.getShortName((-230399947L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.toString();
        long long6 = dateTimeZone1.adjustOffset((-115139990L), false);
        int int8 = dateTimeZone1.getStandardOffset((-417600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-115139990L) + "'", long6 == (-115139990L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        java.lang.String str22 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        boolean boolean8 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.String str12 = dateTimeZone1.getName((long) (short) 10);
        long long14 = dateTimeZone1.convertUTCToLocal((-115199958L));
        int int16 = dateTimeZone1.getOffset((-500519990L));
        java.util.TimeZone timeZone17 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 42L + "'", long14 == 42L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition(115200010L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName((long) '4', locale5);
        java.lang.String str8 = dateTimeZone1.getShortName(34L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName(118740062L, locale10);
        long long14 = dateTimeZone1.convertLocalToUTC((-229799949L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115200010L + "'", long3 == 115200010L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-229799948L) + "'", long14 == (-229799948L));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int5 = dateTimeZone3.getOffsetFromLocal((-1L));
        boolean boolean6 = dateTimeZone3.isFixed();
        long long8 = dateTimeZone3.convertUTCToLocal(0L);
        java.lang.String str10 = dateTimeZone3.getNameKey((long) 'a');
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) str10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(3600000L, locale13);
        long long16 = dateTimeZone1.previousTransition(244860000L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone1.getName((long) 349200000, locale18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115200000L + "'", long8 == 115200000L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:00" + "'", str14, "+01:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 244860000L + "'", long16 == 244860000L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+01:00" + "'", str19, "+01:00");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getID();
        java.lang.String str11 = dateTimeZone1.getID();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((-115139900L), locale13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        java.lang.String str18 = dateTimeZone1.getNameKey(52L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        java.lang.String str3 = dateTimeZone1.getNameKey((-111540000L));
        int int5 = dateTimeZone1.getOffset(111540100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertLocalToUTC(0L, true, (-230399947L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115200000L) + "'", long13 == (-115200000L));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        java.lang.String str35 = dateTimeZone2.getNameKey((-114659949L));
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
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        long long10 = dateTimeZone2.previousTransition(60000L);
        int int12 = dateTimeZone2.getOffset(115200101L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone2.getName((-230339900L), locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long19 = dateTimeZone2.convertLocalToUTC((-233939900L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60000L + "'", long10 == 60000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-233999900L) + "'", long19 == (-233999900L));
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        boolean boolean2 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        long long15 = dateTimeZone4.convertLocalToUTC((long) (byte) -1, true, 10L);
        int int17 = dateTimeZone4.getStandardOffset((-115199990L));
        java.lang.String str19 = dateTimeZone4.getName((long) 187200000);
        java.lang.String str21 = dateTimeZone4.getName(3480062L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200001L) + "'", long15 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone18.getName((-111480100L), locale33);
        boolean boolean36 = dateTimeZone18.isStandardOffset((-60000L));
        int int38 = dateTimeZone18.getOffset(34L);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60000 + "'", int38 == 60000);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((-115139900L));
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        long long6 = dateTimeZone0.convertLocalToUTC((-230339999L), false);
        java.lang.String str8 = dateTimeZone0.getNameKey(34L);
        int int10 = dateTimeZone0.getOffsetFromLocal(115200032L);
        java.lang.String str11 = dateTimeZone0.getID();
        java.lang.String str13 = dateTimeZone0.getNameKey(10L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-115139900L) + "'", long2 == (-115139900L));
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-230339999L) + "'", long6 == (-230339999L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        java.lang.String str30 = dateTimeZone16.getShortName((-59900L));
        long long34 = dateTimeZone16.convertLocalToUTC(115200000L, false, 600035L);
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(32, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        int int9 = dateTimeZone1.getOffset((long) '4');
        java.lang.String str11 = dateTimeZone1.getNameKey((-115139948L));
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        boolean boolean14 = dateTimeZone1.isStandardOffset((-230399903L));
        java.lang.String str16 = dateTimeZone1.getNameKey((-230279990L));
        java.lang.String str18 = dateTimeZone1.getName((-111659938L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        java.util.TimeZone timeZone29 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass30 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition(115200010L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName((long) '4', locale5);
        int int8 = dateTimeZone1.getStandardOffset(3600101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115200010L + "'", long3 == 115200010L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        long long9 = dateTimeZone2.nextTransition((long) 100);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone2.isLocalDateTimeGap(localDateTime10);
        long long13 = dateTimeZone2.convertUTCToLocal((long) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60000L + "'", long13 == 60000L);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        int int9 = dateTimeZone1.getOffset((long) '4');
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-187259990L), locale11);
        long long14 = dateTimeZone1.nextTransition((-59980L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59980L) + "'", long14 == (-59980L));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        int int8 = dateTimeZone5.getStandardOffset(231000001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffsetFromLocal(115260000L);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-115199999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        boolean boolean9 = dateTimeZone2.isStandardOffset((long) (byte) 10);
        long long11 = dateTimeZone2.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertUTCToLocal((-115199990L));
        int int6 = dateTimeZone0.getStandardOffset(115200032L);
        java.lang.String str7 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+00:01" + "'", str1, "+00:01");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115139990L) + "'", long4 == (-115139990L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (short) -1, locale6);
        java.lang.String str9 = dateTimeZone4.getName((long) (byte) 10);
        java.lang.String str10 = dateTimeZone4.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long39 = dateTimeZone36.adjustOffset((long) 10, false);
        long long42 = dateTimeZone36.adjustOffset((-115200000L), false);
        java.lang.String str44 = dateTimeZone36.getName((long) 60000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        boolean boolean46 = dateTimeZone17.equals((java.lang.Object) dateTimeZone36);
        org.joda.time.ReadableInstant readableInstant47 = null;
        int int48 = dateTimeZone36.getOffset(readableInstant47);
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
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-115200000L) + "'", long42 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:01" + "'", str44, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 60000 + "'", int48 == 60000);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 1L);
        java.lang.String str12 = dateTimeZone5.getShortName(230399999L);
        java.lang.String str14 = dateTimeZone5.getNameKey((long) 187260000);
        boolean boolean15 = dateTimeZone5.isFixed();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone5.getShortName((-115199998L), locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115139999L) + "'", long10 == (-115139999L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        long long10 = dateTimeZone2.previousTransition(60000L);
        int int12 = dateTimeZone2.getOffset(115200101L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone2.getName((-230339900L), locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        int int18 = dateTimeZone2.getStandardOffset((-301859949L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60000L + "'", long10 == 60000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        boolean boolean3 = dateTimeZone2.isFixed();
        long long5 = dateTimeZone2.nextTransition(32L);
        java.util.TimeZone timeZone6 = dateTimeZone2.toTimeZone();
        long long8 = dateTimeZone2.convertUTCToLocal((long) (-1));
        java.lang.Class<?> wildcardClass9 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 59999L + "'", long8 == 59999L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getNameKey((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int15 = dateTimeZone13.getOffsetFromLocal((-1L));
        boolean boolean16 = dateTimeZone13.isFixed();
        long long18 = dateTimeZone13.convertUTCToLocal((long) 10);
        boolean boolean20 = dateTimeZone13.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone13.isLocalDateTimeGap(localDateTime21);
        long long26 = dateTimeZone13.convertLocalToUTC(115199999L, false, (long) (short) 0);
        boolean boolean27 = dateTimeZone13.isFixed();
        long long29 = dateTimeZone13.previousTransition((-115199999L));
        long long31 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (-115079990L));
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone13.getShortName(230400000L, locale33);
        long long37 = dateTimeZone13.adjustOffset(51L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115200010L + "'", long18 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-115199999L) + "'", long29 == (-115199999L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115079990L) + "'", long31 == (-115079990L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+32:00" + "'", str34, "+32:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 51L + "'", long37 == 51L);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone2.nextTransition((long) 'a');
        long long6 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, 101L);
        boolean boolean8 = dateTimeZone0.isStandardOffset(43080000L);
        int int10 = dateTimeZone0.getStandardOffset(230399999L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean13 = dateTimeZone12.isFixed();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone12.getName((long) 0, locale15);
        java.lang.String str18 = dateTimeZone12.getNameKey((long) ' ');
        long long20 = dateTimeZone12.nextTransition((long) 115200000);
        java.lang.Class<?> wildcardClass21 = dateTimeZone12.getClass();
        boolean boolean22 = dateTimeZone0.equals((java.lang.Object) wildcardClass21);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+32:00" + "'", str1, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200101L + "'", long6 == 115200101L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115200000L + "'", long20 == 115200000L);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        long long28 = dateTimeZone11.convertLocalToUTC(111540100L, true, 230340010L);
        java.util.TimeZone timeZone29 = dateTimeZone11.toTimeZone();
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-3659900L) + "'", long28 == (-3659900L));
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        java.lang.String str8 = dateTimeZone5.getShortName((-230399903L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getName((-120001L), locale10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str15 = dateTimeZone14.toString();
        long long18 = dateTimeZone14.adjustOffset((long) (byte) -1, true);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long22 = dateTimeZone20.previousTransition((long) (byte) -1);
        long long26 = dateTimeZone20.convertLocalToUTC(115199999L, true, (long) '#');
        long long28 = dateTimeZone20.nextTransition((long) 10);
        int int30 = dateTimeZone20.getOffsetFromLocal((-115199900L));
        long long32 = dateTimeZone14.getMillisKeepLocal(dateTimeZone20, (long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone20.getOffset(readableInstant33);
        long long36 = dateTimeZone5.getMillisKeepLocal(dateTimeZone20, 52L);
        int int38 = dateTimeZone20.getStandardOffset((-233939900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 115199999L + "'", long26 == 115199999L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 60001L + "'", long32 == 60001L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 52L + "'", long36 == 52L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str3 = dateTimeZone1.getName((long) (short) 10);
        java.lang.String str4 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        long long26 = dateTimeZone11.convertLocalToUTC((long) '#', false, (long) (short) 0);
        java.lang.String str28 = dateTimeZone11.getShortName((long) (byte) 0);
        java.lang.String str30 = dateTimeZone11.getShortName(100L);
        java.lang.Class<?> wildcardClass31 = dateTimeZone11.getClass();
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115199965L) + "'", long26 == (-115199965L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:00" + "'", str28, "+32:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        long long5 = dateTimeZone1.convertLocalToUTC(0L, false, (-114539965L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-97L) + "'", long5 == (-97L));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        java.lang.String str21 = dateTimeZone4.toString();
        long long24 = dateTimeZone4.convertLocalToUTC((long) 361920000, false);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 246720000L + "'", long24 == 246720000L);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        boolean boolean5 = dateTimeZone2.isStandardOffset((-115199958L));
        long long8 = dateTimeZone2.adjustOffset((-59900L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-59900L) + "'", long8 == (-59900L));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone1.getOffset(readableInstant23);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 115200000 + "'", int24 == 115200000);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (byte) 10);
        long long4 = dateTimeZone2.previousTransition(115200052L);
        java.lang.String str6 = dateTimeZone2.getName(0L);
        long long8 = dateTimeZone2.convertUTCToLocal(115200100L);
        java.lang.String str10 = dateTimeZone2.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200052L + "'", long4 == 115200052L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:10" + "'", str6, "+10:10");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 151800100L + "'", long8 == 151800100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:10" + "'", str10, "+10:10");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        long long10 = dateTimeZone2.previousTransition(60000L);
        int int12 = dateTimeZone2.getOffset(115200101L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone2.getName((-230339900L), locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str18 = dateTimeZone2.getName((-115259966L));
        int int20 = dateTimeZone2.getStandardOffset((-111600000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60000L + "'", long10 == 60000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:01" + "'", str18, "+00:01");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone19.getShortName((long) (byte) 10, locale21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone19.getName((long) (-1), locale24);
        long long28 = dateTimeZone19.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str29 = dateTimeZone19.getID();
        int int31 = dateTimeZone19.getOffset((long) (byte) 100);
        java.lang.String str32 = dateTimeZone19.toString();
        int int34 = dateTimeZone19.getOffset(187200000L);
        boolean boolean35 = dateTimeZone1.equals((java.lang.Object) dateTimeZone19);
        long long37 = dateTimeZone19.convertUTCToLocal((-59899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115200000L) + "'", long17 == (-115200000L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-115200001L) + "'", long28 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 115200000 + "'", int31 == 115200000);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 115200000 + "'", int34 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 115140101L + "'", long37 == 115140101L);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        long long9 = dateTimeZone2.nextTransition((long) 100);
        int int11 = dateTimeZone2.getStandardOffset(1L);
        long long13 = dateTimeZone2.convertUTCToLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60000L + "'", long13 == 60000L);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        java.lang.String str18 = dateTimeZone1.getShortName((-72060001L));
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int22 = dateTimeZone20.getOffsetFromLocal((-1L));
        long long24 = dateTimeZone20.convertUTCToLocal((-1L));
        long long27 = dateTimeZone20.convertLocalToUTC(1L, false);
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, (-230399998L));
        int int31 = dateTimeZone20.getStandardOffset(0L);
        java.lang.String str32 = dateTimeZone20.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115199999L + "'", long24 == 115199999L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-115199999L) + "'", long27 == (-115199999L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-230399998L) + "'", long29 == (-230399998L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 115200000 + "'", int31 == 115200000);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
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
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        long long11 = dateTimeZone1.nextTransition((-115199999L));
        long long13 = dateTimeZone1.convertUTCToLocal(52L);
        java.lang.String str14 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115199999L) + "'", long11 == (-115199999L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        boolean boolean9 = dateTimeZone2.isStandardOffset((long) (byte) 10);
        int int11 = dateTimeZone2.getOffsetFromLocal((long) (byte) -1);
        java.lang.String str12 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getShortName((-183660000L), locale20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-229859949L) + "'", long18 == (-229859949L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        java.lang.String str12 = dateTimeZone1.getName((long) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        long long3 = dateTimeZone1.nextTransition((long) 60000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isStandardOffset((long) 187200000);
        java.lang.String str8 = dateTimeZone1.getNameKey((-417600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60000L + "'", long3 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        long long19 = dateTimeZone1.previousTransition((-36600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115199899L + "'", long7 == 115199899L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-589799849L) + "'", long16 == (-589799849L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-36600000L) + "'", long19 == (-36600000L));
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        long long17 = dateTimeZone1.convertUTCToLocal(230400001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600000L + "'", long15 == 3600000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 345600001L + "'", long17 == 345600001L);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        long long3 = dateTimeZone1.nextTransition((long) 60000);
        long long7 = dateTimeZone1.convertLocalToUTC(230340010L, true, (-60000L));
        long long10 = dateTimeZone1.adjustOffset(244800000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60000L + "'", long3 == 60000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 230339910L + "'", long7 == 230339910L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 244800000L + "'", long10 == 244800000L);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        long long11 = dateTimeZone1.adjustOffset(43080000L, true);
        long long13 = dateTimeZone1.previousTransition(115200001L);
        boolean boolean14 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 43080000L + "'", long11 == 43080000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115200001L + "'", long13 == 115200001L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(126000000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        int int11 = dateTimeZone1.getStandardOffset(230399999L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        long long15 = dateTimeZone13.previousTransition((long) (byte) -1);
        boolean boolean17 = dateTimeZone13.isStandardOffset((long) '#');
        java.lang.String str19 = dateTimeZone13.getNameKey((-115139948L));
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone13.getShortName(230279999L, locale21);
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) locale21);
        int int25 = dateTimeZone1.getStandardOffset(115320000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        java.lang.Class<?> wildcardClass18 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        long long19 = dateTimeZone1.convertUTCToLocal(52L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200052L + "'", long19 == 115200052L);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        int int6 = dateTimeZone1.getOffset((-114659949L));
        int int8 = dateTimeZone1.getStandardOffset(226800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.035" + "'", str2, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        boolean boolean10 = dateTimeZone1.isStandardOffset(1L);
        java.lang.String str11 = dateTimeZone1.getID();
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        boolean boolean13 = dateTimeZone1.isFixed();
        java.lang.String str15 = dateTimeZone1.getName((long) 1);
        java.lang.String str17 = dateTimeZone1.getShortName(115260000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        long long17 = dateTimeZone1.convertUTCToLocal((-230399965L));
        long long20 = dateTimeZone1.adjustOffset(230340010L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115199965L) + "'", long17 == (-115199965L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 230340010L + "'", long20 == 230340010L);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        int int30 = dateTimeZone17.getOffset((long) 126000000);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int4 = dateTimeZone0.getStandardOffset((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone0.getOffset(readableInstant5);
        long long8 = dateTimeZone0.previousTransition((-230399947L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115200000 + "'", int4 == 115200000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-230399947L) + "'", long8 == (-230399947L));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(0L, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone8.getOffset(readableInstant9);
        long long12 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (long) (byte) 10);
        int int14 = dateTimeZone2.getStandardOffset((long) (short) 1);
        int int16 = dateTimeZone2.getStandardOffset(115140010L);
        long long20 = dateTimeZone2.convertLocalToUTC((-345419990L), false, (-187199900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60010L + "'", long12 == 60010L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-345479990L) + "'", long20 == (-345479990L));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        int int10 = dateTimeZone2.getOffset((-115139999L));
        boolean boolean11 = dateTimeZone2.isFixed();
        int int13 = dateTimeZone2.getOffset((-460799965L));
        java.lang.String str14 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.lang.String str6 = dateTimeZone1.toString();
        java.lang.String str8 = dateTimeZone1.getShortName(115200035L);
        java.lang.String str10 = dateTimeZone1.getName((-345599903L));
        boolean boolean12 = dateTimeZone1.isStandardOffset((-115199900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        long long42 = dateTimeZone1.convertLocalToUTC((-115140000L), false, (long) '#');
        java.lang.String str44 = dateTimeZone1.getNameKey((-115139965L));
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-230340000L) + "'", long42 == (-230340000L));
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 0);
        long long4 = dateTimeZone2.previousTransition(0L);
        java.lang.String str6 = dateTimeZone2.getNameKey(0L);
        java.lang.String str7 = dateTimeZone2.getID();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone2.getOffset(readableInstant8);
        boolean boolean10 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:00" + "'", str7, "-01:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3600000) + "'", int9 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        long long33 = dateTimeZone7.convertLocalToUTC((-115200001L), false, (long) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115200001L) + "'", long16 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 115200000 + "'", int25 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-230400001L) + "'", long33 == (-230400001L));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) 115200000);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        int int14 = dateTimeZone1.getStandardOffset((-115199958L));
        long long16 = dateTimeZone1.nextTransition(187200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 187200000L + "'", long16 == 187200000L);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getID();
        java.lang.String str9 = dateTimeZone1.getNameKey((long) (byte) -1);
        java.lang.String str10 = dateTimeZone1.toString();
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        long long3 = dateTimeZone1.previousTransition(115199999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115199999L + "'", long3 == 115199999L);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(0L, locale4);
        java.util.TimeZone timeZone6 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        java.util.TimeZone timeZone22 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
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
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        java.lang.String str33 = dateTimeZone24.getShortName(118740000L);
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone24.isLocalDateTimeGap(localDateTime34);
        boolean boolean37 = dateTimeZone24.isStandardOffset((-230219990L));
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:00" + "'", str33, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 1);
        long long8 = dateTimeZone1.nextTransition((-43139900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-43139900L) + "'", long8 == (-43139900L));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long15 = dateTimeZone11.convertLocalToUTC((-3599901L), false, 115200009L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3599901L) + "'", long15 == (-3599901L));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        java.lang.String str32 = dateTimeZone11.getID();
        boolean boolean34 = dateTimeZone11.isStandardOffset(115260010L);
        boolean boolean35 = dateTimeZone11.isFixed();
        int int37 = dateTimeZone11.getOffset((-187259990L));
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int43 = dateTimeZone41.getOffsetFromLocal((-1L));
        long long45 = dateTimeZone41.convertUTCToLocal((-1L));
        java.lang.String str47 = dateTimeZone41.getName((-1L));
        java.util.TimeZone timeZone48 = dateTimeZone41.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        long long52 = dateTimeZone39.getMillisKeepLocal(dateTimeZone50, 43080000L);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeZone54.getShortName((long) (byte) 10, locale56);
        java.util.Locale locale59 = null;
        java.lang.String str60 = dateTimeZone54.getName((long) (-1), locale59);
        long long63 = dateTimeZone54.convertLocalToUTC((long) (short) -1, false);
        int int65 = dateTimeZone54.getOffsetFromLocal((long) 115200000);
        org.joda.time.ReadableInstant readableInstant66 = null;
        int int67 = dateTimeZone54.getOffset(readableInstant66);
        java.lang.String str69 = dateTimeZone54.getName((long) ' ');
        int int71 = dateTimeZone54.getStandardOffset((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale75 = null;
        java.lang.String str76 = dateTimeZone73.getShortName((long) (byte) 10, locale75);
        long long78 = dateTimeZone73.convertUTCToLocal(0L);
        int int80 = dateTimeZone73.getStandardOffset((long) ' ');
        long long82 = dateTimeZone73.previousTransition(230399999L);
        java.lang.String str84 = dateTimeZone73.getName((long) '4');
        int int86 = dateTimeZone73.getStandardOffset((-230399900L));
        long long88 = dateTimeZone54.getMillisKeepLocal(dateTimeZone73, 51L);
        long long90 = dateTimeZone39.getMillisKeepLocal(dateTimeZone54, 51L);
        boolean boolean91 = dateTimeZone11.equals((java.lang.Object) dateTimeZone54);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 115200000 + "'", int37 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 115200000 + "'", int43 == 115200000);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 115199999L + "'", long45 == 115199999L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+32:00" + "'", str47, "+32:00");
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 43080010L + "'", long52 == 43080010L);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+32:00" + "'", str57, "+32:00");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+32:00" + "'", str60, "+32:00");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-115200001L) + "'", long63 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 115200000 + "'", int65 == 115200000);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 115200000 + "'", int67 == 115200000);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+32:00" + "'", str69, "+32:00");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 115200000 + "'", int71 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "+32:00" + "'", str76, "+32:00");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 115200000L + "'", long78 == 115200000L);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 115200000 + "'", int80 == 115200000);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 230399999L + "'", long82 == 230399999L);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "+32:00" + "'", str84, "+32:00");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 115200000 + "'", int86 == 115200000);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 51L + "'", long88 == 51L);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + (-115199939L) + "'", long90 == (-115199939L));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        boolean boolean30 = dateTimeZone5.isLocalDateTimeGap(localDateTime29);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        java.lang.String str32 = dateTimeZone5.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115139999L) + "'", long10 == (-115139999L));
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        long long8 = dateTimeZone2.convertLocalToUTC(43080000L, false, 60010L);
        int int10 = dateTimeZone2.getOffsetFromLocal(600051L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 43080000L + "'", long8 == 43080000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:00");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        long long8 = dateTimeZone1.convertLocalToUTC(3540000L, false, 118740000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60000L) + "'", long8 == (-60000L));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getID();
        java.lang.String str11 = dateTimeZone1.getID();
        java.lang.String str12 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(35);
        int int3 = dateTimeZone1.getOffsetFromLocal(158339999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 126000000 + "'", int3 == 126000000);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3600000);
        long long4 = dateTimeZone1.adjustOffset((-72120000L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-72120000L) + "'", long4 == (-72120000L));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.lang.String str6 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        java.lang.String str6 = dateTimeZone2.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone8.getOffset(readableInstant9);
        java.lang.String str12 = dateTimeZone8.getShortName(230399999L);
        int int14 = dateTimeZone8.getOffsetFromLocal(97L);
        long long16 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, 43020000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3600000 + "'", int10 == 3600000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+01:00" + "'", str12, "+01:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3600000 + "'", int14 == 3600000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 39480000L + "'", long16 == 39480000L);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        boolean boolean8 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.String str12 = dateTimeZone1.getName((long) (short) 10);
        long long14 = dateTimeZone1.convertUTCToLocal((-115199958L));
        long long16 = dateTimeZone1.convertUTCToLocal(0L);
        int int18 = dateTimeZone1.getOffset((-114659949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 42L + "'", long14 == 42L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115200000L + "'", long16 == 115200000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-115199903L), locale4);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC((long) 'a', false);
        long long13 = dateTimeZone1.convertLocalToUTC((-115199965L), true, (-230339999L));
        java.lang.String str14 = dateTimeZone1.getID();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName(115140010L, locale16);
        long long19 = dateTimeZone1.nextTransition((-704999949L));
        long long21 = dateTimeZone1.previousTransition((-359399949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 96L + "'", long9 == 96L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199966L) + "'", long13 == (-115199966L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-704999949L) + "'", long19 == (-704999949L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-359399949L) + "'", long21 == (-359399949L));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(52L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200052L + "'", long6 == 115200052L);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone17.getShortName((long) (byte) 10, locale19);
        java.lang.String str21 = dateTimeZone17.getID();
        long long23 = dateTimeZone17.convertUTCToLocal((-230339900L));
        long long25 = dateTimeZone14.getMillisKeepLocal(dateTimeZone17, 60010L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone14.getShortName((-230399900L), locale27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone14.getName((-345599965L), locale30);
        long long33 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (-3599900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-115139900L) + "'", long23 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-115079990L) + "'", long25 == (-115079990L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:01" + "'", str28, "+00:01");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-3659900L) + "'", long33 == (-3659900L));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset((-111540000L));
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long7 = dateTimeZone5.previousTransition((long) (byte) -1);
        boolean boolean9 = dateTimeZone5.isStandardOffset((long) '#');
        java.lang.String str11 = dateTimeZone5.getNameKey((-115139948L));
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 3600000L);
        java.lang.String str15 = dateTimeZone5.getNameKey(43139999L);
        java.lang.String str16 = dateTimeZone5.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3540000L + "'", long13 == 3540000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(1L, locale4);
        long long7 = dateTimeZone2.previousTransition((-59899L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:10" + "'", str5, "+00:10");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-59899L) + "'", long7 == (-59899L));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone2.nextTransition((long) 'a');
        long long6 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, 101L);
        boolean boolean8 = dateTimeZone0.isStandardOffset(43080000L);
        int int10 = dateTimeZone0.getStandardOffset(230399999L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone0.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+00:01" + "'", str1, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60101L + "'", long6 == 60101L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        int int20 = dateTimeZone1.getStandardOffset(72060000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 230340010L + "'", long18 == 230340010L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        boolean boolean31 = dateTimeZone29.isFixed();
        java.lang.String str32 = dateTimeZone29.toString();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:01" + "'", str32, "+00:01");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition(115200010L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115200010L + "'", long3 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str11 = dateTimeZone1.getShortName((-115260000L));
        java.lang.String str13 = dateTimeZone1.getShortName(119999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115200000L) + "'", long9 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        int int37 = dateTimeZone15.getOffsetFromLocal((-115199949L));
        java.lang.String str39 = dateTimeZone15.getShortName((-115199989L));
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
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 60000 + "'", int37 == 60000);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:01" + "'", str39, "+00:01");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset((-111540000L));
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) '#');
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, 115139999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 113039999L + "'", long8 == 113039999L);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        long long22 = dateTimeZone1.previousTransition((long) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(115199999L, false, (long) (short) 0);
        boolean boolean15 = dateTimeZone1.isFixed();
        int int17 = dateTimeZone1.getOffsetFromLocal((-230099990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        java.lang.String str27 = dateTimeZone10.getShortName((-230399900L));
        long long30 = dateTimeZone10.adjustOffset(60001L, true);
        java.lang.String str32 = dateTimeZone10.getNameKey(60000L);
        java.lang.String str33 = dateTimeZone10.getID();
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 60001L + "'", long30 == 60001L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:00" + "'", str33, "+32:00");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone1.getName((-115199900L), locale21);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 1);
        long long9 = dateTimeZone1.adjustOffset(43020000L, false);
        long long11 = dateTimeZone1.previousTransition((-111659899L));
        java.lang.String str13 = dateTimeZone1.getShortName((long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 43020000L + "'", long9 == 43020000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-111659899L) + "'", long11 == (-111659899L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str3 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffsetFromLocal((-119900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.032" + "'", str3, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.032" + "'", str4, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        java.lang.String str36 = dateTimeZone21.getID();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(0L, locale4);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone7.previousTransition((long) (byte) -1);
        long long13 = dateTimeZone7.convertLocalToUTC(115199999L, true, (long) '#');
        long long15 = dateTimeZone7.nextTransition((long) 10);
        int int17 = dateTimeZone7.getOffsetFromLocal((-115199900L));
        boolean boolean18 = dateTimeZone7.isFixed();
        long long20 = dateTimeZone7.convertUTCToLocal((-72060001L));
        boolean boolean21 = dateTimeZone2.equals((java.lang.Object) long20);
        java.lang.String str23 = dateTimeZone2.getName((-230399965L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 43139999L + "'", long20 == 43139999L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:01" + "'", str23, "+00:01");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        boolean boolean3 = dateTimeZone1.isStandardOffset((-500519990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        java.lang.String str20 = dateTimeZone1.getNameKey((-359399949L));
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
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone1.isLocalDateTimeGap(localDateTime30);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115200001L) + "'", long16 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 115200000 + "'", int25 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str14 = dateTimeZone12.getShortName(187200000L);
        java.lang.Class<?> wildcardClass15 = dateTimeZone12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        long long9 = dateTimeZone2.nextTransition((long) 100);
        int int11 = dateTimeZone2.getStandardOffset(1L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone2.getShortName(115260010L, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone2.getShortName((-230399958L), locale16);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getID();
        java.lang.String str11 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int15 = dateTimeZone13.getOffsetFromLocal((-1L));
        boolean boolean16 = dateTimeZone13.isFixed();
        long long18 = dateTimeZone13.convertUTCToLocal(0L);
        int int20 = dateTimeZone13.getOffset(115200010L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, 101L);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone27.getShortName((long) (byte) 10, locale29);
        java.lang.String str31 = dateTimeZone27.getID();
        java.lang.String str32 = dateTimeZone27.getID();
        long long34 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, 100L);
        java.lang.String str36 = dateTimeZone27.getShortName((-115200001L));
        long long39 = dateTimeZone27.convertLocalToUTC((long) (short) 100, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        java.util.TimeZone timeZone41 = dateTimeZone27.toTimeZone();
        long long43 = dateTimeZone1.getMillisKeepLocal(dateTimeZone27, (-115079990L));
        org.joda.time.ReadableInstant readableInstant44 = null;
        int int45 = dateTimeZone27.getOffset(readableInstant44);
        java.lang.String str47 = dateTimeZone27.getNameKey(230400001L);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale51 = null;
        java.lang.String str52 = dateTimeZone49.getShortName((long) (byte) 10, locale51);
        java.lang.String str53 = dateTimeZone49.getID();
        java.lang.String str54 = dateTimeZone49.getID();
        java.lang.String str55 = dateTimeZone49.getID();
        org.joda.time.ReadableInstant readableInstant56 = null;
        int int57 = dateTimeZone49.getOffset(readableInstant56);
        int int59 = dateTimeZone49.getStandardOffset((-187260000L));
        boolean boolean60 = dateTimeZone27.equals((java.lang.Object) dateTimeZone49);
        long long62 = dateTimeZone27.nextTransition((-60000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115200000L + "'", long18 == 115200000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 101L + "'", long22 == 101L);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-115139900L) + "'", long34 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-115199900L) + "'", long39 == (-115199900L));
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-115079990L) + "'", long43 == (-115079990L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 115200000 + "'", int45 == 115200000);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+32:00" + "'", str52, "+32:00");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+32:00" + "'", str53, "+32:00");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+32:00" + "'", str54, "+32:00");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+32:00" + "'", str55, "+32:00");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 115200000 + "'", int57 == 115200000);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 115200000 + "'", int59 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-60000L) + "'", long62 == (-60000L));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone10.getShortName((long) (byte) 10, locale12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone10.getOffset(readableInstant14);
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 115200000L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName(101L, locale19);
        java.lang.String str21 = dateTimeZone1.getID();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone1.getShortName(43079910L, locale23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 115200000L + "'", long17 == 115200000L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int5 = dateTimeZone3.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone6 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) 100);
        long long12 = dateTimeZone7.previousTransition(4260000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 99L + "'", long10 == 99L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 4260000L + "'", long12 == 4260000L);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        long long28 = dateTimeZone4.adjustOffset((long) 52, false);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone4.getShortName((-187259990L), locale30);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:01");
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        boolean boolean5 = dateTimeZone1.isStandardOffset((-230400000L));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((-187199956L), locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.lang.String str4 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        long long24 = dateTimeZone1.adjustOffset((-115259899L), true);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-115259899L) + "'", long24 == (-115259899L));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        boolean boolean40 = dateTimeZone5.isStandardOffset((long) 2100000);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        long long18 = dateTimeZone1.convertLocalToUTC((-114599990L), true, (-229859900L));
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-229799990L) + "'", long18 == (-229799990L));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        long long4 = dateTimeZone2.convertUTCToLocal(0L);
        long long6 = dateTimeZone2.convertUTCToLocal((-230279900L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getShortName(34L, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 187200000L + "'", long4 == 187200000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-43079900L) + "'", long6 == (-43079900L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getOffsetFromLocal((long) 1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 600000 + "'", int2 == 600000);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 600000 + "'", int4 == 600000);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        long long20 = dateTimeZone1.adjustOffset((-3659900L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3659900L) + "'", long20 == (-3659900L));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) ' ');
        long long9 = dateTimeZone1.convertUTCToLocal(43080000L);
        long long11 = dateTimeZone1.previousTransition((-115259900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 43080000L + "'", long9 == 43080000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115259900L) + "'", long11 == (-115259900L));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        long long11 = dateTimeZone1.convertLocalToUTC(115200010L, false, (-115199903L));
        java.lang.String str13 = dateTimeZone1.getNameKey((-345659903L));
        java.lang.String str15 = dateTimeZone1.getNameKey(115200010L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        java.lang.Class<?> wildcardClass18 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-114599948L) + "'", long5 == (-114599948L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:10");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 114600010L + "'", long11 == 114600010L);
// flaky:         org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 600000 + "'", int17 == 600000);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        long long20 = dateTimeZone2.nextTransition((-115200000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:10");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 114599999L + "'", long10 == 114599999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 600000 + "'", int14 == 600000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115139948L) + "'", long16 == (-115139948L));
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 600000 + "'", int18 == 600000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-115200000L) + "'", long20 == (-115200000L));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone21.isLocalDateTimeGap(localDateTime39);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-115199903L), locale4);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC((long) 'a', false);
        long long13 = dateTimeZone1.convertLocalToUTC((-115199965L), true, (-230339999L));
        boolean boolean15 = dateTimeZone1.isStandardOffset(3540000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 96L + "'", long9 == 96L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199966L) + "'", long13 == (-115199966L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getShortName((long) (byte) 1, locale19);
        java.lang.String str21 = dateTimeZone1.toString();
        long long24 = dateTimeZone1.adjustOffset((long) (short) -1, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        long long18 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str19 = dateTimeZone1.getID();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115200000L) + "'", long18 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        java.lang.String str10 = dateTimeZone1.getID();
        java.lang.String str11 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int15 = dateTimeZone13.getOffsetFromLocal((-1L));
        boolean boolean16 = dateTimeZone13.isFixed();
        long long18 = dateTimeZone13.convertUTCToLocal(0L);
        int int20 = dateTimeZone13.getOffset(115200010L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, 101L);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone27.getShortName((long) (byte) 10, locale29);
        java.lang.String str31 = dateTimeZone27.getID();
        java.lang.String str32 = dateTimeZone27.getID();
        long long34 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, 100L);
        java.lang.String str36 = dateTimeZone27.getShortName((-115200001L));
        long long39 = dateTimeZone27.convertLocalToUTC((long) (short) 100, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        java.util.TimeZone timeZone41 = dateTimeZone27.toTimeZone();
        long long43 = dateTimeZone1.getMillisKeepLocal(dateTimeZone27, (-115079990L));
        java.lang.String str45 = dateTimeZone1.getNameKey((-72059948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115200000L + "'", long18 == 115200000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 101L + "'", long22 == 101L);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-115139900L) + "'", long34 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-115199900L) + "'", long39 == (-115199900L));
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-115079990L) + "'", long43 == (-115079990L));
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        int int10 = dateTimeZone1.getOffset(0L);
        long long14 = dateTimeZone1.convertLocalToUTC((-115260000L), true, (-115260000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-230460000L) + "'", long14 == (-230460000L));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        boolean boolean20 = dateTimeZone4.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115140000L + "'", long19 == 115140000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int3 = dateTimeZone1.getStandardOffset((-1L));
        int int5 = dateTimeZone1.getOffset(115199999L);
        long long7 = dateTimeZone1.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean3 = dateTimeZone1.isFixed();
        int int5 = dateTimeZone1.getOffsetFromLocal(302340010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.010" + "'", str2, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        java.lang.String str27 = dateTimeZone10.getShortName((-230399900L));
        java.util.TimeZone timeZone28 = dateTimeZone10.toTimeZone();
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone10.isLocalDateTimeGap(localDateTime29);
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
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        long long13 = dateTimeZone1.adjustOffset((-72060001L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-72060001L) + "'", long13 == (-72060001L));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone25.getOffset(readableInstant26);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-115139948L) + "'", long5 == (-115139948L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        long long37 = dateTimeZone1.nextTransition(3540000L);
        java.lang.String str39 = dateTimeZone1.getShortName((-345599903L));
        long long41 = dateTimeZone1.previousTransition((-60000L));
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 3540000L + "'", long37 == 3540000L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+32:00" + "'", str39, "+32:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-60000L) + "'", long41 == (-60000L));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        java.lang.String str25 = dateTimeZone1.getNameKey((-3599901L));
        boolean boolean27 = dateTimeZone1.isStandardOffset((-97L));
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        int int9 = dateTimeZone1.getOffset((long) '4');
        java.lang.String str11 = dateTimeZone1.getNameKey((-115139948L));
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        long long14 = dateTimeZone1.convertUTCToLocal((-115199989L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 1);
        int int8 = dateTimeZone1.getOffset((-115200001L));
        boolean boolean9 = dateTimeZone1.isFixed();
        int int11 = dateTimeZone1.getOffset((-301859949L));
        int int13 = dateTimeZone1.getStandardOffset(3600101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        long long6 = dateTimeZone1.nextTransition(0L);
        java.lang.String str8 = dateTimeZone1.getName((-115199966L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.035" + "'", str2, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.035" + "'", str8, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        long long11 = dateTimeZone1.convertLocalToUTC(60101L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139899L) + "'", long11 == (-115139899L));
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(360060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        long long46 = dateTimeZone11.convertLocalToUTC(115199999L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-111540000L) + "'", long7 == (-111540000L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-589739949L) + "'", long9 == (-589739949L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3600000) + "'", int15 == (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115200001L) + "'", long26 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115200000 + "'", int28 == 115200000);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 115200000 + "'", int33 == 115200000);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 115200000 + "'", int35 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-118800001L) + "'", long39 == (-118800001L));
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 119400000L + "'", long41 == 119400000L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 115260000L + "'", long43 == 115260000L);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 118799999L + "'", long46 == 118799999L);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (byte) 10);
        long long4 = dateTimeZone2.previousTransition(115200052L);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 360000000);
        java.lang.String str9 = dateTimeZone2.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200052L + "'", long4 == 115200052L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 400200000L + "'", long7 == 400200000L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:10" + "'", str9, "+10:10");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(0L, locale4);
        int int7 = dateTimeZone2.getOffsetFromLocal(187200000L);
        java.lang.String str9 = dateTimeZone2.getName((-230340003L));
        java.lang.String str10 = dateTimeZone2.toString();
        int int12 = dateTimeZone2.getOffset(72060000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition(115200010L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName((long) '4', locale5);
        long long10 = dateTimeZone1.convertLocalToUTC((-115139899L), true, (-59980L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115200010L + "'", long3 == 115200010L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115139898L) + "'", long10 == (-115139898L));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.nextTransition((long) 'a');
        long long6 = dateTimeZone0.convertLocalToUTC(118800010L, false, 113039999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 118800010L + "'", long6 == 118800010L);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        java.lang.String str20 = dateTimeZone4.getName((-60000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        java.lang.String str6 = dateTimeZone3.getID();
        java.lang.String str8 = dateTimeZone3.getName((-72060001L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone3.isLocalDateTimeGap(localDateTime9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone3.isLocalDateTimeGap(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean21 = dateTimeZone20.isFixed();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone20.getName((long) 0, locale23);
        java.lang.String str26 = dateTimeZone20.getNameKey((long) ' ');
        java.lang.String str28 = dateTimeZone20.getNameKey((-119900L));
        boolean boolean29 = dateTimeZone1.equals((java.lang.Object) str28);
        java.lang.String str30 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coordinated Universal Time" + "'", str24, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-115199903L), locale4);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC((long) 'a', false);
        long long13 = dateTimeZone1.convertLocalToUTC((-115199965L), true, (-230339999L));
        java.lang.String str14 = dateTimeZone1.getID();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName(115140010L, locale16);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone1.isLocalDateTimeGap(localDateTime18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone22.isLocalDateTimeGap(localDateTime23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        boolean boolean27 = dateTimeZone22.isStandardOffset(115200035L);
        boolean boolean29 = dateTimeZone22.equals((java.lang.Object) (-187260001L));
        boolean boolean30 = dateTimeZone1.equals((java.lang.Object) (-187260001L));
        java.lang.String str31 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 96L + "'", long9 == 96L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199966L) + "'", long13 == (-115199966L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.001" + "'", str17, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.001" + "'", str31, "+00:00:00.001");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.String str11 = dateTimeZone1.getID();
        long long13 = dateTimeZone1.nextTransition((-114599949L));
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-114599949L) + "'", long13 == (-114599949L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getShortName((long) (byte) 1, locale19);
        long long23 = dateTimeZone1.adjustOffset(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        java.lang.String str24 = dateTimeZone8.getName(35L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone8.getName((-115080001L), locale26);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.lang.String str5 = dateTimeZone2.getID();
        int int7 = dateTimeZone2.getOffset((-115139898L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+100:00" + "'", str5, "+100:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360000000 + "'", int7 == 360000000);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        int int14 = dateTimeZone1.getOffsetFromLocal(115200101L);
        long long17 = dateTimeZone1.convertLocalToUTC((-59980L), true);
        long long20 = dateTimeZone1.adjustOffset(115200009L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115259980L) + "'", long17 == (-115259980L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115200009L + "'", long20 == 115200009L);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.lang.String str7 = dateTimeZone1.getNameKey((-115139948L));
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((long) (byte) -1, locale9);
        long long13 = dateTimeZone1.convertLocalToUTC(3540101L, true);
        java.lang.String str15 = dateTimeZone1.getShortName(230459975L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-111659899L) + "'", long13 == (-111659899L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((-115139900L));
        long long6 = dateTimeZone0.convertLocalToUTC((long) 360000000, false, 115200100L);
        java.lang.String str8 = dateTimeZone0.getNameKey(115200096L);
        long long10 = dateTimeZone0.convertUTCToLocal(3660000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-115139900L) + "'", long2 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 360000000L + "'", long6 == 360000000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3660000L + "'", long10 == 3660000L);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        java.lang.String str11 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean12 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        java.util.TimeZone timeZone27 = dateTimeZone18.toTimeZone();
        java.util.TimeZone timeZone28 = dateTimeZone18.toTimeZone();
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
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        java.lang.String str24 = dateTimeZone8.getName(35L);
        java.lang.String str26 = dateTimeZone8.getNameKey(115200096L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115139999L + "'", long14 == 115139999L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60000 + "'", int22 == 60000);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:01" + "'", str24, "+00:01");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((-3599901L), locale12);
        boolean boolean14 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        java.lang.String str22 = dateTimeZone1.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int3 = dateTimeZone1.getOffsetFromLocal(44L);
        long long7 = dateTimeZone1.convertLocalToUTC((-230280089L), false, (-111540000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-230280089L) + "'", long7 == (-230280089L));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.previousTransition((long) (short) -1);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset((long) 349200000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        long long10 = dateTimeZone1.adjustOffset((-115140001L), true);
        java.lang.String str12 = dateTimeZone1.getShortName(34L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName((long) 3600000, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115140001L) + "'", long10 == (-115140001L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertUTCToLocal((-115199990L));
        long long8 = dateTimeZone0.convertLocalToUTC((-1L), false, 115260000L);
        long long10 = dateTimeZone0.previousTransition(115200035L);
        boolean boolean12 = dateTimeZone0.isStandardOffset((-111540000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+00:01" + "'", str1, "+00:01");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115139990L) + "'", long4 == (-115139990L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60001L) + "'", long8 == (-60001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115200035L + "'", long10 == 115200035L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(2100000);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2100000 + "'", int3 == 2100000);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean13 = dateTimeZone1.isStandardOffset((long) (short) 0);
        long long16 = dateTimeZone1.adjustOffset((-115199949L), true);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone21.getShortName((long) (byte) 10, locale23);
        java.lang.String str25 = dateTimeZone21.getID();
        java.lang.String str26 = dateTimeZone21.getID();
        long long28 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, 100L);
        java.lang.String str30 = dateTimeZone21.getShortName((-115200001L));
        long long33 = dateTimeZone21.convertLocalToUTC((long) (short) 100, true);
        boolean boolean35 = dateTimeZone21.isStandardOffset((-187320000L));
        long long37 = dateTimeZone21.convertUTCToLocal((-115199966L));
        java.lang.String str38 = dateTimeZone21.getID();
        java.lang.String str40 = dateTimeZone21.getName(230339910L);
        long long42 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, 115200100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199949L) + "'", long16 == (-115199949L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-115139900L) + "'", long28 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-115199900L) + "'", long33 == (-115199900L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 34L + "'", long37 == 34L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+32:00" + "'", str38, "+32:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+32:00" + "'", str40, "+32:00");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 115200100L + "'", long42 == 115200100L);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        java.lang.String str14 = dateTimeZone1.getShortName((-115079990L));
        java.lang.String str16 = dateTimeZone1.getShortName((-118799900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        boolean boolean9 = dateTimeZone2.isFixed();
        long long12 = dateTimeZone2.convertLocalToUTC(230339910L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 230279910L + "'", long12 == 230279910L);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int8 = dateTimeZone6.getOffsetFromLocal((-1L));
        boolean boolean9 = dateTimeZone6.isFixed();
        long long11 = dateTimeZone6.convertUTCToLocal((long) 10);
        boolean boolean13 = dateTimeZone6.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone6.isLocalDateTimeGap(localDateTime14);
        long long17 = dateTimeZone6.nextTransition(10L);
        long long19 = dateTimeZone6.previousTransition((-115199900L));
        long long22 = dateTimeZone6.convertLocalToUTC(0L, true);
        java.lang.String str24 = dateTimeZone6.getShortName(101L);
        long long26 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (-115080001L));
        boolean boolean28 = dateTimeZone6.isStandardOffset((-345599903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115200010L + "'", long11 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115199900L) + "'", long19 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-115200000L) + "'", long22 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115080001L) + "'", long26 == (-115080001L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str11 = dateTimeZone1.getShortName((-115260000L));
        long long14 = dateTimeZone1.adjustOffset((-115199989L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115200000L) + "'", long9 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199989L) + "'", long14 == (-115199989L));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        long long3 = dateTimeZone1.nextTransition((long) 60000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long7 = dateTimeZone1.adjustOffset((-115200000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60000L + "'", long3 == 60000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115200000L) + "'", long7 == (-115200000L));
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        java.lang.String str20 = dateTimeZone4.getName((-60000L));
        long long23 = dateTimeZone4.adjustOffset((-120001L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-120001L) + "'", long23 == (-120001L));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        boolean boolean15 = dateTimeZone2.isStandardOffset((-345599903L));
        java.lang.String str17 = dateTimeZone2.getShortName((long) 600000);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:01" + "'", str17, "+00:01");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone30.getShortName((long) (byte) 10, locale32);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone30.getName((long) (-1), locale35);
        long long39 = dateTimeZone30.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str40 = dateTimeZone30.getID();
        int int42 = dateTimeZone30.getOffset((long) (byte) 100);
        java.lang.String str43 = dateTimeZone30.toString();
        int int45 = dateTimeZone30.getOffset(187200000L);
        boolean boolean47 = dateTimeZone30.isStandardOffset(115200101L);
        boolean boolean48 = dateTimeZone24.equals((java.lang.Object) dateTimeZone30);
        long long51 = dateTimeZone30.convertLocalToUTC((-223259899L), false);
        java.lang.Class<?> wildcardClass52 = dateTimeZone30.getClass();
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
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:00" + "'", str33, "+32:00");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-115200001L) + "'", long39 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+32:00" + "'", str40, "+32:00");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 115200000 + "'", int42 == 115200000);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+32:00" + "'", str43, "+32:00");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 115200000 + "'", int45 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-338459899L) + "'", long51 == (-338459899L));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        java.lang.String str6 = dateTimeZone2.getNameKey(35L);
        boolean boolean7 = dateTimeZone2.isFixed();
        long long11 = dateTimeZone2.convertLocalToUTC((-230219990L), false, 115200032L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone13.getShortName((long) (byte) 10, locale15);
        java.lang.String str18 = dateTimeZone13.getName(10L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone13.getOffset(readableInstant19);
        boolean boolean22 = dateTimeZone13.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        java.lang.String str25 = dateTimeZone13.getName((-115079990L));
        int int27 = dateTimeZone13.getOffset(100L);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str31 = dateTimeZone30.toString();
        long long33 = dateTimeZone30.nextTransition((long) (byte) -1);
        int int35 = dateTimeZone30.getOffset((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        long long38 = dateTimeZone13.getMillisKeepLocal(dateTimeZone30, (-230339900L));
        java.util.TimeZone timeZone39 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone41.getShortName((long) (byte) 10, locale43);
        java.lang.String str46 = dateTimeZone41.getName(10L);
        java.lang.String str47 = dateTimeZone41.toString();
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone41.getShortName(115139999L, locale49);
        long long52 = dateTimeZone30.getMillisKeepLocal(dateTimeZone41, (-118799900L));
        int int54 = dateTimeZone30.getOffset(115260000L);
        boolean boolean55 = dateTimeZone2.equals((java.lang.Object) 115260000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-230279990L) + "'", long11 == (-230279990L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115200000 + "'", int27 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:01" + "'", str31, "+00:01");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60000 + "'", int35 == 60000);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-115199900L) + "'", long38 == (-115199900L));
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+32:00" + "'", str44, "+32:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+32:00" + "'", str46, "+32:00");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+32:00" + "'", str47, "+32:00");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+32:00" + "'", str50, "+32:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-233939900L) + "'", long52 == (-233939900L));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 60000 + "'", int54 == 60000);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone5.getShortName((long) (byte) 10, locale7);
        java.lang.String str9 = dateTimeZone5.getID();
        long long11 = dateTimeZone5.convertUTCToLocal((-230339900L));
        long long13 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, 60010L);
        java.lang.String str15 = dateTimeZone5.getName((-72060002L));
        java.lang.String str17 = dateTimeZone5.getShortName((-233939900L));
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone5.getName((-43139900L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115079990L) + "'", long13 == (-115079990L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        boolean boolean10 = dateTimeZone1.isStandardOffset(1L);
        java.lang.String str11 = dateTimeZone1.getID();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((-114659899L), locale13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str11 = dateTimeZone9.getShortName(32L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone9.getName(396540000L, locale13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forID("+00:01");
        java.lang.Class<?> wildcardClass17 = dateTimeZone16.getClass();
        boolean boolean18 = dateTimeZone9.equals((java.lang.Object) dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-115139948L) + "'", long5 == (-115139948L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        java.lang.String str10 = dateTimeZone1.getShortName((-115139900L));
        long long12 = dateTimeZone1.previousTransition((-187260001L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName((-230399896L), locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187260001L) + "'", long12 == (-187260001L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        java.lang.String str35 = dateTimeZone18.getNameKey(244860000L);
        int int37 = dateTimeZone18.getStandardOffset(60001L);
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
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 60000 + "'", int37 == 60000);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.previousTransition((long) (short) -1);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+01:00");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(1L, locale4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone9.isLocalDateTimeGap(localDateTime11);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone9, (-114659899L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:10" + "'", str5, "+00:10");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-114119899L) + "'", long14 == (-114119899L));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str4 = dateTimeZone1.getName((-345419990L));
        long long7 = dateTimeZone1.adjustOffset((long) 3600000, false);
        long long9 = dateTimeZone1.previousTransition((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        long long4 = dateTimeZone2.convertUTCToLocal(0L);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone2.getOffset(readableInstant5);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime7);
        java.lang.String str10 = dateTimeZone2.getName(417600000L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone2.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 187200000L + "'", long4 == 187200000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+52:00" + "'", str10, "+52:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 187200000 + "'", int12 == 187200000);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        java.lang.String str21 = dateTimeZone5.getNameKey((-600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115139999L) + "'", long10 == (-115139999L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) ' ');
        long long9 = dateTimeZone1.convertUTCToLocal(43080000L);
        boolean boolean11 = dateTimeZone1.isStandardOffset((-72060001L));
        java.lang.String str13 = dateTimeZone1.getNameKey((-230339948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 43080000L + "'", long9 == 43080000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        long long15 = dateTimeZone4.convertLocalToUTC((long) (byte) -1, true, 10L);
        long long18 = dateTimeZone4.adjustOffset(233880000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200001L) + "'", long15 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 233880000L + "'", long18 == 233880000L);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(52, 32);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) 100, locale8);
        java.lang.String str10 = dateTimeZone1.toString();
        long long13 = dateTimeZone1.convertLocalToUTC((-72060000L), false);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName(233880000L, locale15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        boolean boolean20 = dateTimeZone1.equals((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-187260000L) + "'", long13 == (-187260000L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        int int13 = dateTimeZone10.getStandardOffset(100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-115199948L) + "'", long5 == (-115199948L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(0L, locale4);
        java.lang.String str7 = dateTimeZone2.getName((-600000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        boolean boolean21 = dateTimeZone1.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone15.getOffset(readableInstant19);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = dateTimeZone1.getOffset(readableInstant42);
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 115200000 + "'", int43 == 115200000);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        int int5 = dateTimeZone1.getOffsetFromLocal(119400000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 349200000 + "'", int3 == 349200000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 349200000 + "'", int5 == 349200000);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone10.getShortName((long) (byte) 10, locale12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone10.getName((long) (-1), locale15);
        long long19 = dateTimeZone10.convertLocalToUTC((long) (short) -1, false);
        int int21 = dateTimeZone10.getOffsetFromLocal((long) 115200000);
        long long24 = dateTimeZone10.convertLocalToUTC((-115199998L), true);
        long long26 = dateTimeZone10.previousTransition((long) (byte) 10);
        long long28 = dateTimeZone2.getMillisKeepLocal(dateTimeZone10, (long) (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115200001L) + "'", long19 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 115200000 + "'", int21 == 115200000);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-230399998L) + "'", long24 == (-230399998L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-118740000L) + "'", long28 == (-118740000L));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        java.lang.String str18 = dateTimeZone1.getShortName((-72060001L));
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int22 = dateTimeZone20.getOffsetFromLocal((-1L));
        long long24 = dateTimeZone20.convertUTCToLocal((-1L));
        long long27 = dateTimeZone20.convertLocalToUTC(1L, false);
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, (-230399998L));
        boolean boolean30 = dateTimeZone20.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115199999L + "'", long24 == 115199999L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-115199999L) + "'", long27 == (-115199999L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-230399998L) + "'", long29 == (-230399998L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        int int9 = dateTimeZone1.getOffset((long) '4');
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-187259990L), locale11);
        java.lang.String str14 = dateTimeZone1.getName((long) 'a');
        java.util.TimeZone timeZone15 = dateTimeZone1.toTimeZone();
        long long19 = dateTimeZone1.convertLocalToUTC((-59948L), false, (-25L));
        java.lang.String str20 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115259948L) + "'", long19 == (-115259948L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone2.isLocalDateTimeGap(localDateTime8);
        long long11 = dateTimeZone2.nextTransition((long) (short) 1);
        java.lang.String str12 = dateTimeZone2.toString();
        long long15 = dateTimeZone2.adjustOffset((long) (short) 0, false);
        java.lang.String str16 = dateTimeZone2.getID();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone18.getShortName((long) (byte) 10, locale20);
        java.lang.String str23 = dateTimeZone18.getName(10L);
        java.lang.String str24 = dateTimeZone18.toString();
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone18.getShortName(115139999L, locale26);
        java.lang.String str29 = dateTimeZone18.getNameKey((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone31.getShortName((long) (byte) 10, locale33);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone31.getName((long) (-1), locale36);
        boolean boolean38 = dateTimeZone31.isFixed();
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone31.isLocalDateTimeGap(localDateTime39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        int int42 = dateTimeZone31.getOffset(readableInstant41);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long47 = dateTimeZone44.adjustOffset(115200052L, true);
        java.util.TimeZone timeZone48 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        boolean boolean51 = dateTimeZone31.equals((java.lang.Object) dateTimeZone50);
        java.lang.String str52 = dateTimeZone50.getID();
        boolean boolean53 = dateTimeZone18.equals((java.lang.Object) dateTimeZone50);
        long long55 = dateTimeZone2.getMillisKeepLocal(dateTimeZone50, (-115259949L));
        int int57 = dateTimeZone50.getOffset(114600010L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+32:00" + "'", str34, "+32:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+32:00" + "'", str37, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 115200000 + "'", int42 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 115200052L + "'", long47 == 115200052L);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:01" + "'", str52, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-115259949L) + "'", long55 == (-115259949L));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 60000 + "'", int57 == 60000);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true);
        long long11 = dateTimeZone1.nextTransition(119999L);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115200000L) + "'", long9 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 119999L + "'", long11 == 119999L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone18.getName(302400010L, locale20);
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
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coordinated Universal Time" + "'", str21, "Coordinated Universal Time");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone2.isLocalDateTimeGap(localDateTime8);
        long long11 = dateTimeZone2.nextTransition((long) (short) 1);
        java.lang.String str12 = dateTimeZone2.toString();
        long long15 = dateTimeZone2.adjustOffset((long) (short) 0, false);
        java.lang.String str16 = dateTimeZone2.getID();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone18.getShortName((long) (byte) 10, locale20);
        java.lang.String str23 = dateTimeZone18.getName(10L);
        java.lang.String str24 = dateTimeZone18.toString();
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone18.getShortName(115139999L, locale26);
        java.lang.String str29 = dateTimeZone18.getNameKey((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone31.getShortName((long) (byte) 10, locale33);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone31.getName((long) (-1), locale36);
        boolean boolean38 = dateTimeZone31.isFixed();
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone31.isLocalDateTimeGap(localDateTime39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        int int42 = dateTimeZone31.getOffset(readableInstant41);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long47 = dateTimeZone44.adjustOffset(115200052L, true);
        java.util.TimeZone timeZone48 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        boolean boolean51 = dateTimeZone31.equals((java.lang.Object) dateTimeZone50);
        java.lang.String str52 = dateTimeZone50.getID();
        boolean boolean53 = dateTimeZone18.equals((java.lang.Object) dateTimeZone50);
        long long55 = dateTimeZone2.getMillisKeepLocal(dateTimeZone50, (-115259949L));
        java.lang.String str56 = dateTimeZone50.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+32:00" + "'", str34, "+32:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+32:00" + "'", str37, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 115200000 + "'", int42 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 115200052L + "'", long47 == 115200052L);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:01" + "'", str52, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-115259949L) + "'", long55 == (-115259949L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:01" + "'", str56, "+00:01");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) ' ');
        java.lang.String str9 = dateTimeZone1.getName((-115139900L));
        int int11 = dateTimeZone1.getOffset((-115080001L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getShortName((long) 1, locale13);
        int int16 = dateTimeZone1.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        java.lang.String str18 = dateTimeZone2.getNameKey(115140000L);
        int int20 = dateTimeZone2.getOffset((-115199990L));
        boolean boolean22 = dateTimeZone2.isStandardOffset((-345599896L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60010L + "'", long12 == 60010L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115140000L + "'", long16 == 115140000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60000 + "'", int20 == 60000);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        boolean boolean20 = dateTimeZone1.isFixed();
        long long22 = dateTimeZone1.convertUTCToLocal((-115139990L));
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-111539990L) + "'", long22 == (-111539990L));
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getName((long) 'a');
        long long4 = dateTimeZone0.previousTransition((-115139999L));
        long long6 = dateTimeZone0.nextTransition((-187259947L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coordinated Universal Time" + "'", str2, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115139999L) + "'", long4 == (-115139999L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-187259947L) + "'", long6 == (-187259947L));
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        long long25 = dateTimeZone1.convertLocalToUTC((-345299990L), false, 115800000L);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-460499990L) + "'", long25 == (-460499990L));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        boolean boolean3 = dateTimeZone2.isFixed();
        long long5 = dateTimeZone2.nextTransition(32L);
        long long9 = dateTimeZone2.convertLocalToUTC((-115200000L), false, 60010L);
        long long11 = dateTimeZone2.nextTransition((-230099990L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115260000L) + "'", long9 == (-115260000L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-230099990L) + "'", long11 == (-230099990L));
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition(115200010L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName((long) '4', locale5);
        java.lang.String str8 = dateTimeZone1.getShortName(34L);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115200010L + "'", long3 == 115200010L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone2.nextTransition((long) 'a');
        long long6 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, 101L);
        boolean boolean8 = dateTimeZone0.isStandardOffset(43080000L);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.Class<?> wildcardClass11 = timeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+32:00" + "'", str1, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200101L + "'", long6 == 115200101L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        int int11 = dateTimeZone1.getOffset((long) (byte) 0);
        long long15 = dateTimeZone1.convertLocalToUTC(0L, false, 115200032L);
        long long18 = dateTimeZone1.adjustOffset((long) 3600000, false);
        java.util.TimeZone timeZone19 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200000L) + "'", long15 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3600000L + "'", long18 == 3600000L);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        long long10 = dateTimeZone2.previousTransition(60000L);
        long long12 = dateTimeZone2.previousTransition((-115139999L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone2.getName((-119900L), locale14);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60000L + "'", long10 == 60000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115139999L) + "'", long12 == (-115139999L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:01" + "'", str15, "+00:01");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        int int11 = dateTimeZone1.getOffset((long) (byte) 0);
        long long15 = dateTimeZone1.convertLocalToUTC(0L, false, 115200032L);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone1.isLocalDateTimeGap(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200000L) + "'", long15 == (-115200000L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        long long13 = dateTimeZone2.previousTransition((-230339903L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getName((long) (byte) 1, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230339903L) + "'", long13 == (-230339903L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        boolean boolean11 = dateTimeZone1.isFixed();
        java.lang.String str12 = dateTimeZone1.getID();
        long long15 = dateTimeZone1.convertLocalToUTC((-345539896L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-460739896L) + "'", long15 == (-460739896L));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long13 = dateTimeZone11.previousTransition((-359880000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-359880000L) + "'", long13 == (-359880000L));
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str11 = dateTimeZone1.toString();
        java.lang.String str12 = dateTimeZone1.toString();
        java.lang.String str14 = dateTimeZone1.getShortName((-115139999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115200000L) + "'", long9 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long4 = dateTimeZone1.adjustOffset(115200052L, true);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        boolean boolean9 = dateTimeZone7.isStandardOffset(0L);
        int int11 = dateTimeZone7.getOffsetFromLocal((-115139999L));
        java.lang.String str12 = dateTimeZone7.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200052L + "'", long4 == 115200052L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        long long3 = dateTimeZone1.nextTransition((long) 60000);
        int int5 = dateTimeZone1.getOffset(43139999L);
        boolean boolean7 = dateTimeZone1.isStandardOffset((-345419990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60000L + "'", long3 == 60000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.lang.String str6 = dateTimeZone1.toString();
        java.lang.String str8 = dateTimeZone1.getShortName(115200035L);
        java.lang.String str10 = dateTimeZone1.getName((-345599903L));
        long long13 = dateTimeZone1.adjustOffset((-115259948L), false);
        java.lang.String str15 = dateTimeZone1.getNameKey((-115139958L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName(233940000L, locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115259948L) + "'", long13 == (-115259948L));
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int3 = dateTimeZone1.getStandardOffset((-1L));
        java.lang.String str5 = dateTimeZone1.getShortName((-115139948L));
        java.lang.String str6 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.nextTransition((-151199899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-151199899L) + "'", long8 == (-151199899L));
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (short) 0);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str5 = dateTimeZone2.getShortName(115140100L);
        boolean boolean6 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-01:00" + "'", str3, "-01:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        long long6 = dateTimeZone1.nextTransition(0L);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        long long9 = dateTimeZone1.nextTransition(230400000L);
        java.lang.String str10 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.035" + "'", str2, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 230400000L + "'", long9 == 230400000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.035" + "'", str10, "+00:00:00.035");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        boolean boolean4 = dateTimeZone2.isStandardOffset(115139999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forID("+00:10");
        long long9 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (-115199958L));
        java.lang.String str10 = dateTimeZone7.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115199958L) + "'", long9 == (-115199958L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:10" + "'", str10, "+00:10");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        boolean boolean21 = dateTimeZone1.isFixed();
        long long23 = dateTimeZone1.nextTransition(115319989L);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 115319989L + "'", long23 == 115319989L);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        long long20 = dateTimeZone1.convertUTCToLocal(115200001L);
        long long24 = dateTimeZone1.convertLocalToUTC((-230280090L), false, 113039999L);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 230400001L + "'", long20 == 230400001L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-345480090L) + "'", long24 == (-345480090L));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(52L, locale6);
        java.lang.String str9 = dateTimeZone1.getShortName((long) 10);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long14 = dateTimeZone11.convertLocalToUTC(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        int int9 = dateTimeZone1.getOffset((long) '4');
        java.lang.String str11 = dateTimeZone1.getNameKey((-115139948L));
        java.util.TimeZone timeZone12 = dateTimeZone1.toTimeZone();
        boolean boolean14 = dateTimeZone1.isStandardOffset((-230399903L));
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long20 = dateTimeZone17.adjustOffset((long) 10, false);
        long long23 = dateTimeZone17.adjustOffset(0L, true);
        long long25 = dateTimeZone17.previousTransition(60000L);
        int int27 = dateTimeZone17.getOffset(115200101L);
        java.util.TimeZone timeZone28 = dateTimeZone17.toTimeZone();
        long long30 = dateTimeZone1.getMillisKeepLocal(dateTimeZone17, (-230219990L));
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        long long34 = dateTimeZone32.previousTransition((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = dateTimeZone32.isLocalDateTimeGap(localDateTime35);
        java.lang.String str37 = dateTimeZone32.toString();
        java.lang.String str39 = dateTimeZone32.getShortName(115200035L);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone32.getName(3540062L, locale41);
        long long44 = dateTimeZone17.getMillisKeepLocal(dateTimeZone32, (-187259948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60000L + "'", long25 == 60000L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60000 + "'", int27 == 60000);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-115079990L) + "'", long30 == (-115079990L));
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+32:00" + "'", str37, "+32:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+32:00" + "'", str39, "+32:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+32:00" + "'", str42, "+32:00");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-302399948L) + "'", long44 == (-302399948L));
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getID();
        java.lang.String str9 = dateTimeZone1.getNameKey((long) (byte) -1);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long4 = dateTimeZone1.adjustOffset(115200052L, true);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.lang.String str9 = dateTimeZone7.getShortName(115199999L);
        long long12 = dateTimeZone7.adjustOffset(59975L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200052L + "'", long4 == 115200052L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 59975L + "'", long12 == 59975L);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        int int3 = dateTimeZone1.getOffset(244800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        boolean boolean18 = dateTimeZone1.isFixed();
        java.lang.String str19 = dateTimeZone1.toString();
        long long23 = dateTimeZone1.convertLocalToUTC((-230339903L), true, (-460799965L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 43080000L + "'", long11 == 43080000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399900L) + "'", long13 == (-230399900L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-345539903L) + "'", long23 == (-345539903L));
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(0L, locale4);
        int int7 = dateTimeZone2.getOffsetFromLocal(187200000L);
        java.lang.String str9 = dateTimeZone2.getName((-230340003L));
        int int11 = dateTimeZone2.getOffsetFromLocal((-72060002L));
        int int13 = dateTimeZone2.getOffset((-59948L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) -1);
        java.lang.String str11 = dateTimeZone1.getID();
        java.lang.String str13 = dateTimeZone1.getNameKey(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int3 = dateTimeZone1.getStandardOffset((-1L));
        java.lang.String str5 = dateTimeZone1.getShortName((-115139948L));
        org.joda.time.tz.NameProvider nameProvider6 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) nameProvider6);
        long long12 = dateTimeZone1.convertLocalToUTC((-230279990L), true);
        boolean boolean14 = dateTimeZone1.isStandardOffset(114599999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertNotNull(nameProvider6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-230280090L) + "'", long12 == (-230280090L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        java.lang.String str18 = dateTimeZone1.getShortName(230400000L, locale17);
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
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone3.getName(0L, locale7);
        java.lang.String str9 = dateTimeZone3.getID();
        boolean boolean10 = dateTimeZone3.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        int int12 = dateTimeZone1.getStandardOffset(51L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (byte) 10);
        long long4 = dateTimeZone2.previousTransition(115200052L);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 360000000);
        boolean boolean8 = dateTimeZone2.isFixed();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone2.getShortName((-25L), locale10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200052L + "'", long4 == 115200052L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 281400000L + "'", long7 == 281400000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:10" + "'", str11, "+10:10");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone9.getName((-25L), locale16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        long long20 = dateTimeZone9.getMillisKeepLocal(dateTimeZone18, 302400010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:01" + "'", str17, "+52:01");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 374460010L + "'", long20 == 374460010L);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long3 = dateTimeZone1.previousTransition(115200010L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName((long) '4', locale5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int10 = dateTimeZone8.getOffsetFromLocal((-1L));
        boolean boolean11 = dateTimeZone8.isFixed();
        long long13 = dateTimeZone8.convertUTCToLocal((long) 10);
        boolean boolean15 = dateTimeZone8.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone8.isLocalDateTimeGap(localDateTime16);
        java.util.TimeZone timeZone18 = dateTimeZone8.toTimeZone();
        long long20 = dateTimeZone8.nextTransition(230399999L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone8.getShortName((long) 60000, locale22);
        java.util.TimeZone timeZone24 = dateTimeZone8.toTimeZone();
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115200010L + "'", long3 == 115200010L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115200010L + "'", long13 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 230399999L + "'", long20 == 230399999L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(600000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        java.lang.String str18 = dateTimeZone1.getShortName(4260000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long7 = dateTimeZone1.convertLocalToUTC(115200052L, true, (long) (short) 0);
        int int9 = dateTimeZone1.getStandardOffset(115200000L);
        int int11 = dateTimeZone1.getOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.lang.String str13 = dateTimeZone1.getNameKey(60001L);
        java.lang.String str14 = dateTimeZone1.getID();
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        int int7 = dateTimeZone5.getOffsetFromLocal((-72059948L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        java.util.TimeZone timeZone22 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 10);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) 10);
        long long11 = dateTimeZone2.convertLocalToUTC(115140000L, true, (long) 100);
        java.lang.String str13 = dateTimeZone2.getNameKey((long) 60000);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone2.getName((-230399900L), locale15);
        java.lang.String str18 = dateTimeZone2.getName((-36600000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-72120000L) + "'", long11 == (-72120000L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+52:01" + "'", str16, "+52:01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+52:01" + "'", str18, "+52:01");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int11 = dateTimeZone9.getOffsetFromLocal((-1L));
        boolean boolean12 = dateTimeZone9.isFixed();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone9.getOffset(readableInstant13);
        int int16 = dateTimeZone9.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone17 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        boolean boolean20 = dateTimeZone18.isStandardOffset((-72059948L));
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, (-187260000L));
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int26 = dateTimeZone24.getOffsetFromLocal((-1L));
        long long28 = dateTimeZone24.convertUTCToLocal((-1L));
        java.lang.String str30 = dateTimeZone24.getName((-1L));
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, 118740000L);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone24.getShortName(230399999L, locale34);
        int int37 = dateTimeZone24.getStandardOffset(600035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-187260000L) + "'", long22 == (-187260000L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115200000 + "'", int26 == 115200000);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 115199999L + "'", long28 == 115199999L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3540000L + "'", long32 == 3540000L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+32:00" + "'", str35, "+32:00");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 115200000 + "'", int37 == 115200000);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        int int10 = dateTimeZone1.getStandardOffset((long) (byte) 100);
        java.lang.String str11 = dateTimeZone1.getID();
        java.lang.String str12 = dateTimeZone1.toString();
        long long14 = dateTimeZone1.previousTransition(115200100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115200100L + "'", long14 == 115200100L);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        java.lang.String str16 = dateTimeZone1.getName((long) 115200000);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int20 = dateTimeZone18.getOffsetFromLocal((-1L));
        boolean boolean21 = dateTimeZone18.isFixed();
        long long23 = dateTimeZone18.convertUTCToLocal((long) 10);
        boolean boolean25 = dateTimeZone18.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone18.isLocalDateTimeGap(localDateTime26);
        long long29 = dateTimeZone18.nextTransition(10L);
        long long31 = dateTimeZone18.previousTransition((-115199900L));
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone33.getShortName((long) (byte) 10, locale35);
        java.lang.String str38 = dateTimeZone33.getName(10L);
        long long40 = dateTimeZone18.getMillisKeepLocal(dateTimeZone33, 115200010L);
        java.lang.String str41 = dateTimeZone33.getID();
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = dateTimeZone33.getOffset(readableInstant42);
        long long45 = dateTimeZone1.getMillisKeepLocal(dateTimeZone33, (-589799949L));
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone1.getShortName(115199999L, locale47);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 115200010L + "'", long23 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-115199900L) + "'", long31 == (-115199900L));
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+32:00" + "'", str38, "+32:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 115200010L + "'", long40 == 115200010L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+32:00" + "'", str41, "+32:00");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 115200000 + "'", int43 == 115200000);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-704999949L) + "'", long45 == (-704999949L));
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "UTC" + "'", str48, "UTC");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-115199903L), locale4);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC((long) 'a', false);
        java.lang.String str11 = dateTimeZone1.getName((-115199900L));
        java.lang.String str13 = dateTimeZone1.getName((long) 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 96L + "'", long9 == 96L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.001" + "'", str11, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.001" + "'", str13, "+00:00:00.001");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-115199900L), locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        java.lang.String str32 = dateTimeZone11.getID();
        boolean boolean34 = dateTimeZone11.isStandardOffset(115260010L);
        boolean boolean35 = dateTimeZone11.isFixed();
        int int37 = dateTimeZone11.getOffset((-187259990L));
        java.lang.String str38 = dateTimeZone11.getID();
        boolean boolean40 = dateTimeZone11.isStandardOffset((-111659938L));
        java.util.Locale locale42 = null;
        java.lang.String str43 = dateTimeZone11.getName((-72119990L), locale42);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 115200000 + "'", int37 == 115200000);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+32:00" + "'", str38, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+32:00" + "'", str43, "+32:00");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long5 = dateTimeZone2.nextTransition((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone2.getOffset(readableInstant6);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long5 = dateTimeZone2.nextTransition((long) (byte) -1);
        int int7 = dateTimeZone2.getOffset((long) (short) 0);
        boolean boolean9 = dateTimeZone2.isStandardOffset(100L);
        long long13 = dateTimeZone2.convertLocalToUTC(118800000L, false, (-187199900L));
        java.lang.String str14 = dateTimeZone2.toString();
        long long16 = dateTimeZone2.previousTransition((-183660000L));
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone2.getName((long) 126000000, locale18);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 118740000L + "'", long13 == 118740000L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-183660000L) + "'", long16 == (-183660000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone14.getOffset(readableInstant16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int5 = dateTimeZone3.getOffsetFromLocal((-1L));
        long long7 = dateTimeZone3.convertUTCToLocal((-1L));
        java.lang.String str9 = dateTimeZone3.getName((-1L));
        java.util.TimeZone timeZone10 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 43080000L);
        long long17 = dateTimeZone1.adjustOffset((-115199958L), false);
        int int19 = dateTimeZone1.getStandardOffset((-115199989L));
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115199958L) + "'", long17 == (-115199958L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        long long4 = dateTimeZone0.convertLocalToUTC((-115199958L), false);
        java.lang.String str6 = dateTimeZone0.getName((-35999899L));
        java.lang.String str8 = dateTimeZone0.getName((-114119899L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199958L) + "'", long4 == (-115199958L));
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
    }
}
