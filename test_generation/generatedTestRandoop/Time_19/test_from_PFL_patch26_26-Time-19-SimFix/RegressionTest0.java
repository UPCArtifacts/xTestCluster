import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.Class<?> wildcardClass1 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+32:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+32:00\" is malformed at \"32:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        boolean boolean8 = dateTimeZone1.isFixed();
        long long10 = dateTimeZone1.convertUTCToLocal((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115199999L + "'", long10 == 115199999L);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        java.lang.String str5 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(60000, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 60000, locale8);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str16 = dateTimeZone1.getNameKey((-115199900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        long long11 = dateTimeZone1.convertLocalToUTC((long) (short) 100, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115199900L) + "'", long11 == (-115199900L));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getShortName((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        java.lang.Class<?> wildcardClass6 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        java.lang.Class<?> wildcardClass6 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        long long10 = dateTimeZone1.previousTransition((long) (short) 100);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName((long) (short) 0, locale2);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) (byte) -1);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone7.previousTransition((long) (byte) -1);
        long long13 = dateTimeZone7.convertLocalToUTC(115199999L, true, (long) '#');
        long long15 = dateTimeZone7.nextTransition((long) 10);
        boolean boolean16 = dateTimeZone0.equals((java.lang.Object) long15);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coordinated Universal Time" + "'", str3, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
        int int19 = dateTimeZone1.getOffsetFromLocal((-115199999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        boolean boolean10 = dateTimeZone1.isStandardOffset(1L);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getID();
        java.lang.String str9 = dateTimeZone1.getNameKey((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        int int12 = dateTimeZone1.getOffset((long) (short) 0);
        long long15 = dateTimeZone1.convertLocalToUTC((long) (byte) 0, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200000L) + "'", long15 == (-115200000L));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.lang.String str13 = dateTimeZone4.getShortName((-115200001L));
        java.lang.Class<?> wildcardClass14 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((long) 60000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115260000L + "'", long5 == 115260000L);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
        boolean boolean20 = dateTimeZone4.isStandardOffset((long) 100);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        long long12 = dateTimeZone1.nextTransition(115200010L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200010L + "'", long12 == 115200010L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        java.lang.String str10 = dateTimeZone1.getName((-115199999L));
        long long12 = dateTimeZone1.nextTransition((-115200000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115200000L) + "'", long12 == (-115200000L));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        long long7 = dateTimeZone1.convertUTCToLocal((-230339900L));
        boolean boolean8 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115139900L) + "'", long7 == (-115139900L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        int int9 = dateTimeZone1.getStandardOffset((long) 1);
        long long11 = dateTimeZone1.nextTransition((-115200000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115200000L) + "'", long11 == (-115200000L));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-115199903L), locale4);
        boolean boolean6 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone1.getOffset(readableInstant17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long4 = dateTimeZone1.adjustOffset(115200052L, true);
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200052L + "'", long4 == 115200052L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(1L, false);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115199999L) + "'", long8 == (-115199999L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        java.lang.String str21 = dateTimeZone1.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone5.getShortName((long) (byte) 10, locale7);
        java.lang.String str9 = dateTimeZone5.getID();
        long long11 = dateTimeZone5.convertUTCToLocal((-230339900L));
        long long13 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, 60010L);
        java.lang.Class<?> wildcardClass14 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115079990L) + "'", long13 == (-115079990L));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.lang.Class<?> wildcardClass3 = provider0.getClass();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        long long15 = dateTimeZone1.adjustOffset((long) (byte) -1, false);
        int int17 = dateTimeZone1.getOffsetFromLocal((-115199999L));
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        long long23 = dateTimeZone1.convertLocalToUTC(101L, false, (long) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-115199899L) + "'", long23 == (-115199899L));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (short) 10);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(115199999L, false, (long) (short) 0);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) 115200000);
        long long19 = dateTimeZone1.adjustOffset((-115139990L), true);
        boolean boolean20 = dateTimeZone1.isFixed();
        int int22 = dateTimeZone1.getOffsetFromLocal((long) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115139990L) + "'", long19 == (-115139990L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        long long15 = dateTimeZone1.adjustOffset((long) (byte) -1, false);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getShortName(115139999L, locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        java.lang.String str9 = dateTimeZone1.getNameKey((long) (byte) -1);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115199999L + "'", long7 == 115199999L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        java.lang.String str21 = dateTimeZone1.getName(43080000L, locale20);
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        java.lang.String str33 = dateTimeZone24.getNameKey((-115199999L));
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
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        long long9 = dateTimeZone1.nextTransition((long) 10);
        int int11 = dateTimeZone1.getOffsetFromLocal((-115199900L));
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean9 = dateTimeZone1.isFixed();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(0L, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+52:01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+52:01\" is malformed at \"52:01\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getStandardOffset((long) 'a');
        long long11 = dateTimeZone1.convertLocalToUTC((-115199900L), true);
        long long14 = dateTimeZone1.convertLocalToUTC((-115199965L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-230399900L) + "'", long11 == (-230399900L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-230399965L) + "'", long14 == (-230399965L));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.lang.String str5 = dateTimeZone3.getShortName((-1L));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone3.getShortName((-115199899L), locale7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(187260000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Class<?> wildcardClass3 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        boolean boolean22 = dateTimeZone11.isStandardOffset((-230399903L));
        long long24 = dateTimeZone11.convertUTCToLocal(32L);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115200032L + "'", long24 == 115200032L);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        long long11 = dateTimeZone2.convertUTCToLocal((-230399903L));
        boolean boolean12 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-230339903L) + "'", long11 == (-230339903L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 1L);
        java.lang.String str12 = dateTimeZone5.getShortName(230399999L);
        java.lang.String str14 = dateTimeZone5.getNameKey((long) 187260000);
        java.lang.String str16 = dateTimeZone5.getNameKey((long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115139999L) + "'", long10 == (-115139999L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(115199999L, false, (long) (short) 0);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) 115200000);
        long long19 = dateTimeZone1.adjustOffset((-115139990L), true);
        boolean boolean20 = dateTimeZone1.isFixed();
        java.lang.String str21 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115139990L) + "'", long19 == (-115139990L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertLocalToUTC((-115199903L), true, (long) 'a');
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
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
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 1L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone5.isLocalDateTimeGap(localDateTime11);
        int int14 = dateTimeZone5.getOffset((long) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115139999L) + "'", long10 == (-115139999L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        int int31 = dateTimeZone5.getStandardOffset((-72060000L));
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 115200000 + "'", int31 == 115200000);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        long long9 = dateTimeZone2.nextTransition((long) 100);
        java.lang.String str10 = dateTimeZone2.getID();
        java.lang.String str12 = dateTimeZone2.getNameKey((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        long long10 = dateTimeZone1.adjustOffset(230399999L, false);
        long long12 = dateTimeZone1.nextTransition(32L);
        java.lang.String str13 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((long) (short) 0, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.nextTransition((long) 'a');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getName((long) (short) 0, locale4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        java.lang.String str10 = dateTimeZone2.getName((long) 60000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.Class<?> wildcardClass12 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) 'a');
        long long12 = dateTimeZone1.convertLocalToUTC((-1L), true, (-187320000L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getShortName(96L, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115200001L) + "'", long12 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 10);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) 115200000);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        java.lang.String str14 = dateTimeZone1.getNameKey(230339999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) 115200000, locale7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-111540000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        java.lang.String str16 = dateTimeZone1.getShortName(51L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        long long4 = dateTimeZone2.previousTransition((-115139999L));
        java.lang.String str6 = dateTimeZone2.getName((long) 100);
        long long9 = dateTimeZone2.adjustOffset((long) (short) -1, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115139999L) + "'", long4 == (-115139999L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:10" + "'", str6, "+00:10");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        java.lang.Class<?> wildcardClass22 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        long long10 = dateTimeZone1.previousTransition(52L);
        long long13 = dateTimeZone1.adjustOffset((-115199966L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199966L) + "'", long13 == (-115199966L));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        int int3 = dateTimeZone1.getOffsetFromLocal((-115199990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 360000000 + "'", int3 == 360000000);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        int int11 = dateTimeZone1.getStandardOffset(230340010L);
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long4 = dateTimeZone1.adjustOffset(115200052L, true);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) 60000, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200052L + "'", long4 == 115200052L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean13 = dateTimeZone1.isStandardOffset((long) (short) 0);
        long long15 = dateTimeZone1.previousTransition((-302459900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-302459900L) + "'", long15 == (-302459900L));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getID();
        java.lang.String str9 = dateTimeZone1.getNameKey((long) (byte) -1);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean6 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        long long4 = dateTimeZone2.convertUTCToLocal(0L);
        int int6 = dateTimeZone2.getStandardOffset(10L);
        long long8 = dateTimeZone2.convertUTCToLocal(115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 187200000L + "'", long4 == 187200000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 302400010L + "'", long8 == 302400010L);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
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
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getStandardOffset((long) 'a');
        long long10 = dateTimeZone1.nextTransition((-187259990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-187259990L) + "'", long10 == (-187259990L));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone2.nextTransition((long) 'a');
        long long6 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, 101L);
        boolean boolean8 = dateTimeZone0.isStandardOffset(43080000L);
        java.lang.Class<?> wildcardClass9 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+01:00" + "'", str1, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600101L + "'", long6 == 3600101L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone1.getShortName(43080000L, locale26);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        java.lang.Class<?> wildcardClass41 = dateTimeZone32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        int int31 = dateTimeZone1.getStandardOffset((-115199965L));
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(187260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        long long16 = dateTimeZone1.convertLocalToUTC(51L, true, (-72060000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199949L) + "'", long16 == (-115199949L));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long3 = dateTimeZone0.nextTransition((-115199899L));
        boolean boolean4 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115199899L) + "'", long3 == (-115199899L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        int int11 = dateTimeZone1.getStandardOffset(230399999L);
        long long15 = dateTimeZone1.convertLocalToUTC((-115139999L), false, (-115199990L));
        int int17 = dateTimeZone1.getStandardOffset((long) '#');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115139999L) + "'", long15 == (-115139999L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 187260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187260000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.035");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-115199903L), locale4);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC((long) 'a', false);
        int int11 = dateTimeZone1.getStandardOffset(115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 96L + "'", long9 == 96L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        java.lang.String str33 = dateTimeZone2.getShortName((long) 3600000);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:01" + "'", str33, "+00:01");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean9 = dateTimeZone1.isFixed();
        boolean boolean10 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        long long8 = dateTimeZone1.nextTransition((long) '4');
        java.lang.String str9 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        java.lang.String str6 = dateTimeZone3.getID();
        long long8 = dateTimeZone3.convertUTCToLocal(96L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115200096L + "'", long8 == 115200096L);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        long long24 = dateTimeZone11.convertUTCToLocal((-230399900L));
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-115199900L) + "'", long24 == (-115199900L));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str4 = dateTimeZone1.getNameKey((long) 'a');
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone2.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        boolean boolean22 = dateTimeZone11.isStandardOffset((-230399903L));
        int int24 = dateTimeZone11.getStandardOffset(230399999L);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 115200000 + "'", int24 == 115200000);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        long long6 = dateTimeZone2.adjustOffset((long) (byte) -1, true);
        boolean boolean7 = dateTimeZone2.isFixed();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone2.getName(0L, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        long long21 = dateTimeZone9.nextTransition((-115199948L));
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-115199948L) + "'", long21 == (-115199948L));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(60010L, locale10);
        long long13 = dateTimeZone1.previousTransition((-230339948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230339948L) + "'", long13 == (-230339948L));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long3 = dateTimeZone1.convertUTCToLocal((long) 1);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName((-229859900L), locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        boolean boolean6 = dateTimeZone1.isStandardOffset(230399999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.035" + "'", str2, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        int int10 = dateTimeZone2.getOffset((-115139999L));
        java.lang.String str12 = dateTimeZone2.getName(35L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        long long8 = dateTimeZone2.convertLocalToUTC(43080000L, false, 60010L);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone2.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone2.convertUTCToLocal(3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 43020000L + "'", long8 == 43020000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3660000L + "'", long12 == 3660000L);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        java.lang.String str2 = dateTimeZone1.toString();
        int int4 = dateTimeZone1.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.010" + "'", str2, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        long long12 = dateTimeZone1.nextTransition((-115140001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115140001L) + "'", long12 == (-115140001L));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        java.util.TimeZone timeZone27 = dateTimeZone11.toTimeZone();
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
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(0L, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone8.getOffset(readableInstant9);
        long long12 = dateTimeZone2.getMillisKeepLocal(dateTimeZone8, (long) (byte) 10);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getName((long) (byte) 100, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60010L + "'", long12 == 60010L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinated Universal Time" + "'", str15, "Coordinated Universal Time");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        int int24 = dateTimeZone11.getStandardOffset(0L);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 115200000 + "'", int24 == 115200000);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        boolean boolean4 = dateTimeZone1.equals((java.lang.Object) timeZone3);
        boolean boolean6 = dateTimeZone1.isStandardOffset((-115199899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertLocalToUTC((-115199903L), true, (long) 'a');
        java.lang.String str15 = dateTimeZone1.getName((long) (short) -1);
        java.lang.Class<?> wildcardClass16 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399903L) + "'", long13 == (-230399903L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        long long7 = dateTimeZone1.previousTransition((-115199990L));
        int int9 = dateTimeZone1.getOffset((-115200001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115199990L) + "'", long7 == (-115199990L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        java.lang.Class<?> wildcardClass15 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199958L) + "'", long14 == (-115199958L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        java.lang.Class<?> wildcardClass10 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        java.lang.Class<?> wildcardClass7 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        int int10 = dateTimeZone1.getStandardOffset((long) (byte) 100);
        java.lang.String str12 = dateTimeZone1.getNameKey((long) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        java.lang.String str27 = dateTimeZone20.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+52:01" + "'", str27, "+52:01");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        long long7 = dateTimeZone1.previousTransition((-115199990L));
        java.lang.String str8 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115199990L) + "'", long7 == (-115199990L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        java.lang.String str20 = dateTimeZone4.getNameKey(115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        long long15 = dateTimeZone4.convertLocalToUTC((long) (byte) -1, true, 10L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone4.getShortName((long) (short) -1, locale17);
        java.lang.Class<?> wildcardClass19 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200001L) + "'", long15 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        long long20 = dateTimeZone5.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115199999L) + "'", long10 == (-115199999L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-115199903L), locale4);
        boolean boolean6 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC((long) 'a', false);
        long long13 = dateTimeZone1.convertLocalToUTC((-115199965L), true, (-230339999L));
        java.lang.String str15 = dateTimeZone1.getName(3660000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 96L + "'", long9 == 96L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199966L) + "'", long13 == (-115199966L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.001" + "'", str15, "+00:00:00.001");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) 115200000, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        long long21 = dateTimeZone5.convertLocalToUTC((-230399965L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-345599965L) + "'", long21 == (-345599965L));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        boolean boolean27 = dateTimeZone2.isStandardOffset((-115199958L));
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int15 = dateTimeZone1.getStandardOffset(101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        java.lang.String str33 = dateTimeZone1.getNameKey((long) (-1));
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
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (byte) 0, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((-1L), locale6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int11 = dateTimeZone9.getOffsetFromLocal((-1L));
        boolean boolean12 = dateTimeZone9.isFixed();
        long long14 = dateTimeZone9.convertUTCToLocal((long) 10);
        boolean boolean16 = dateTimeZone9.isStandardOffset((long) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        java.lang.String str19 = dateTimeZone9.getNameKey((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int23 = dateTimeZone21.getOffsetFromLocal((-1L));
        boolean boolean24 = dateTimeZone21.isFixed();
        long long26 = dateTimeZone21.convertUTCToLocal((long) 10);
        boolean boolean28 = dateTimeZone21.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone21.isLocalDateTimeGap(localDateTime29);
        long long34 = dateTimeZone21.convertLocalToUTC(115199999L, false, (long) (short) 0);
        boolean boolean35 = dateTimeZone21.isFixed();
        long long37 = dateTimeZone21.previousTransition((-115199999L));
        long long39 = dateTimeZone9.getMillisKeepLocal(dateTimeZone21, (-115079990L));
        long long41 = dateTimeZone2.getMillisKeepLocal(dateTimeZone21, 51L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:10" + "'", str7, "+00:10");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115200010L + "'", long14 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 115200010L + "'", long26 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-115199999L) + "'", long37 == (-115199999L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-115079990L) + "'", long39 == (-115079990L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-114599949L) + "'", long41 == (-114599949L));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        long long24 = dateTimeZone22.nextTransition(115200032L);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115200032L + "'", long24 == 115200032L);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) 100, locale8);
        long long12 = dateTimeZone1.adjustOffset(97L, false);
        int int14 = dateTimeZone1.getOffset((long) 1);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getName((-230459903L), locale16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        int int11 = dateTimeZone1.getStandardOffset(230399999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        java.lang.Class<?> wildcardClass17 = dateTimeZone16.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        int int6 = dateTimeZone1.getOffset((-72059948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName(1L, locale2);
        java.lang.String str5 = dateTimeZone0.getNameKey((-229859900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coordinated Universal Time" + "'", str3, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        long long10 = dateTimeZone1.adjustOffset(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        java.lang.Class<?> wildcardClass17 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60010L + "'", long12 == 60010L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115140000L + "'", long16 == 115140000L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.Class<?> wildcardClass13 = timeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        int int6 = dateTimeZone1.getStandardOffset((long) (byte) 0);
        java.lang.String str7 = dateTimeZone1.getID();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName(97L, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone2.getOffset(115199999L);
        java.lang.String str9 = dateTimeZone2.getName((-115139900L));
        java.lang.String str10 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:01" + "'", str9, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        int int16 = dateTimeZone2.getStandardOffset((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        int int11 = dateTimeZone1.getStandardOffset(230399999L);
        long long15 = dateTimeZone1.convertLocalToUTC((-115139999L), false, (-115199990L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone1.isLocalDateTimeGap(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115139999L) + "'", long15 == (-115139999L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        long long9 = dateTimeZone1.nextTransition((long) 10);
        int int11 = dateTimeZone1.getOffsetFromLocal((-115199900L));
        boolean boolean12 = dateTimeZone1.isFixed();
        long long16 = dateTimeZone1.convertLocalToUTC((-114599949L), true, (-114599949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115139999L + "'", long7 == 115139999L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-114659949L) + "'", long16 == (-114659949L));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone4.getOffset(readableInstant19);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199900L) + "'", long16 == (-115199900L));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getNameKey((long) (short) 1);
        java.lang.String str13 = dateTimeZone1.getShortName(96L);
        long long17 = dateTimeZone1.convertLocalToUTC((-230459903L), false, (long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-345659903L) + "'", long17 == (-345659903L));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        java.lang.Class<?> wildcardClass32 = dateTimeZone11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        long long15 = dateTimeZone1.convertUTCToLocal((-115199965L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200001L + "'", long12 == 115200001L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        long long15 = dateTimeZone1.adjustOffset((long) (byte) -1, false);
        int int17 = dateTimeZone1.getOffsetFromLocal((-115199999L));
        java.lang.String str18 = dateTimeZone1.getID();
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        long long20 = dateTimeZone2.convertLocalToUTC((-59900L), true, 3600101L);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-119900L) + "'", long20 == (-119900L));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        int int24 = dateTimeZone13.getStandardOffset((-115139958L));
        boolean boolean26 = dateTimeZone13.isStandardOffset(0L);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 115200000 + "'", int24 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.lang.String str7 = dateTimeZone1.getNameKey(0L);
        java.lang.String str8 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        java.lang.String str10 = dateTimeZone2.getName((long) 60000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone2.isLocalDateTimeGap(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        java.lang.String str18 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        long long23 = dateTimeZone4.adjustOffset((long) (short) 1, true);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int13 = dateTimeZone1.getStandardOffset(100L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset((-111540000L));
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        int int7 = dateTimeZone1.getOffset(100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187260000, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(60000);
        long long4 = dateTimeZone1.adjustOffset(115200052L, true);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        long long9 = dateTimeZone1.convertLocalToUTC(120010L, false, (long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200052L + "'", long4 == 115200052L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60010L + "'", long9 == 60010L);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone2.getOffset(115199999L);
        long long10 = dateTimeZone2.convertLocalToUTC((long) '4', true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-59948L) + "'", long10 == (-59948L));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        boolean boolean6 = dateTimeZone2.isStandardOffset((-115199900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', 0);
        long long6 = dateTimeZone2.convertLocalToUTC((-259319990L), false, 43139999L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-385319990L) + "'", long6 == (-385319990L));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        java.lang.String str18 = dateTimeZone1.getShortName(230339999L);
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        int int5 = dateTimeZone1.getStandardOffset(0L);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        java.lang.String str10 = dateTimeZone1.toString();
        int int12 = dateTimeZone1.getOffsetFromLocal((-115200000L));
        int int14 = dateTimeZone1.getOffset((-115139999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        long long16 = dateTimeZone1.nextTransition((-118799900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-118799900L) + "'", long16 == (-118799900L));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(115200032L, locale4);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone1.getShortName((-72060000L), locale33);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+32:00" + "'", str34, "+32:00");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        long long8 = dateTimeZone5.nextTransition((-230339948L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone10.getShortName((long) (byte) 10, locale12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone10.getOffset(readableInstant14);
        java.lang.String str17 = dateTimeZone10.getName(1L);
        int int19 = dateTimeZone10.getOffset(0L);
        long long21 = dateTimeZone10.nextTransition(0L);
        boolean boolean22 = dateTimeZone5.equals((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-230339948L) + "'", long8 == (-230339948L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        int int6 = dateTimeZone1.getStandardOffset((long) (byte) 0);
        java.lang.String str7 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str11 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115200000L) + "'", long9 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        java.lang.String str21 = dateTimeZone11.getID();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone11.getShortName(0L, locale23);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        java.lang.String str19 = dateTimeZone1.getShortName(101L);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone1.getShortName((long) 187200000, locale21);
        long long24 = dateTimeZone1.nextTransition((-114599949L));
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+32:00" + "'", str22, "+32:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-114599949L) + "'", long24 == (-114599949L));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        int int3 = dateTimeZone1.getOffset((-111540000L));
        long long5 = dateTimeZone1.convertUTCToLocal(115200000L);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115200000L + "'", long5 == 115200000L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        boolean boolean10 = dateTimeZone1.isStandardOffset(1L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        long long14 = dateTimeZone1.nextTransition((-115200001L));
        long long18 = dateTimeZone1.convertLocalToUTC((-230399903L), false, (-115139990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115200001L) + "'", long14 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-345599903L) + "'", long18 == (-345599903L));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        java.lang.Class<?> wildcardClass30 = timeZone28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.lang.String str26 = dateTimeZone10.getName(43139999L);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        long long5 = dateTimeZone0.adjustOffset(0L, false);
        int int7 = dateTimeZone0.getOffsetFromLocal((-230339999L));
        java.lang.Class<?> wildcardClass8 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 115200000 + "'", int2 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        java.lang.Class<?> wildcardClass22 = timeZone21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long3 = dateTimeZone0.nextTransition((-115199899L));
        long long6 = dateTimeZone0.adjustOffset((-59900L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-115199899L) + "'", long3 == (-115199899L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-59900L) + "'", long6 == (-59900L));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        int int10 = dateTimeZone1.getStandardOffset((long) (byte) 100);
        boolean boolean12 = dateTimeZone1.isStandardOffset(115260010L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long15 = dateTimeZone1.previousTransition((-230460003L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-230460003L) + "'", long15 == (-230460003L));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(1L, false);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName(0L, locale10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone16.getShortName((long) (byte) 10, locale18);
        java.lang.String str20 = dateTimeZone16.getID();
        java.lang.String str21 = dateTimeZone16.getID();
        long long23 = dateTimeZone14.getMillisKeepLocal(dateTimeZone16, 100L);
        java.lang.String str25 = dateTimeZone16.getShortName((long) '#');
        java.lang.String str27 = dateTimeZone16.getNameKey((-115139900L));
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) str27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115199999L) + "'", long8 == (-115199999L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-115139900L) + "'", long23 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertLocalToUTC((-115199903L), true, (long) 'a');
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean17 = dateTimeZone16.isFixed();
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone16.getName((long) 0, locale19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, (long) '#');
        long long25 = dateTimeZone16.previousTransition(43080000L);
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
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coordinated Universal Time" + "'", str20, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 115200035L + "'", long23 == 115200035L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 43080000L + "'", long25 == 43080000L);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long7 = dateTimeZone4.adjustOffset(115200010L, false);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long11 = dateTimeZone9.previousTransition((long) (byte) -1);
        boolean boolean13 = dateTimeZone9.isStandardOffset((long) '#');
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone9.getShortName((long) 115200000, locale15);
        int int18 = dateTimeZone9.getStandardOffset(230399999L);
        java.lang.String str20 = dateTimeZone9.getNameKey(115140000L);
        long long22 = dateTimeZone4.getMillisKeepLocal(dateTimeZone9, (-115079990L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115200010L + "'", long7 == 115200010L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
// flaky:         org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-115079990L) + "'", long22 == (-115079990L));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone11.isLocalDateTimeGap(localDateTime29);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        int int6 = dateTimeZone1.getStandardOffset((long) (byte) 0);
        java.lang.String str7 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone9.getShortName((long) (byte) 10, locale11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone9.getName((long) (-1), locale14);
        long long18 = dateTimeZone9.convertLocalToUTC((long) (short) -1, false);
        int int20 = dateTimeZone9.getOffsetFromLocal((long) 115200000);
        long long23 = dateTimeZone9.convertLocalToUTC((-115199998L), true);
        int int25 = dateTimeZone9.getStandardOffset((-59900L));
        boolean boolean26 = dateTimeZone1.equals((java.lang.Object) int25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115200001L) + "'", long18 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-230399998L) + "'", long23 == (-230399998L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 115200000 + "'", int25 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 1L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone5.isLocalDateTimeGap(localDateTime11);
        long long14 = dateTimeZone5.previousTransition((-72060001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115199999L) + "'", long10 == (-115199999L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-72060001L) + "'", long14 == (-72060001L));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        java.lang.String str34 = dateTimeZone14.toString();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:01" + "'", str34, "+00:01");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        java.lang.String str20 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115200000L) + "'", long19 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        boolean boolean9 = dateTimeZone2.isFixed();
        java.lang.String str11 = dateTimeZone2.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        long long9 = dateTimeZone1.nextTransition((long) 10);
        long long11 = dateTimeZone1.convertUTCToLocal((-115199958L));
        long long14 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115139999L + "'", long7 == 115139999L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139958L) + "'", long11 == (-115139958L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-60001L) + "'", long14 == (-60001L));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertUTCToLocal(60010L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getShortName(115200035L, locale6);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+00:01" + "'", str1, "+00:01");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 120010L + "'", long4 == 120010L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:01" + "'", str7, "+00:01");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        long long26 = dateTimeZone17.convertUTCToLocal((-72120000L));
        long long28 = dateTimeZone17.nextTransition((long) (byte) 1);
        java.lang.String str30 = dateTimeZone17.getName((-59900L));
        boolean boolean31 = dateTimeZone17.isFixed();
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 43080000L + "'", long26 == 43080000L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone1.isLocalDateTimeGap(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 43080000L + "'", long11 == 43080000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399900L) + "'", long13 == (-230399900L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        long long6 = dateTimeZone1.previousTransition((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        java.lang.String str7 = dateTimeZone1.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName(115139999L, locale9);
        java.lang.Object obj11 = null;
        boolean boolean12 = dateTimeZone1.equals(obj11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        java.util.TimeZone timeZone30 = dateTimeZone1.toTimeZone();
        java.lang.String str32 = dateTimeZone1.getName((-230399900L));
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
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.010" + "'", str32, "+00:00:00.010");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(115199999L, false, (long) (short) 0);
        long long17 = dateTimeZone1.adjustOffset(0L, false);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName(115200035L, locale19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        int int10 = dateTimeZone2.getStandardOffset(230279999L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str4 = dateTimeZone1.getShortName((-187320000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone4.getName((long) (byte) -1, locale13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone4.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+100:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:00\" is malformed at \"0:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone8.isLocalDateTimeGap(localDateTime27);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(115199999L, false, (long) (short) 0);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) 60000);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone1.getName((-230279900L), locale18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(115200035L, locale13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        long long27 = dateTimeZone19.convertUTCToLocal((long) (short) -1);
        long long31 = dateTimeZone19.convertLocalToUTC(115200010L, false, 115139999L);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115199999L + "'", long27 == 115199999L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false, (long) 60000);
        java.lang.String str13 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115200000L) + "'", long12 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        long long5 = dateTimeZone2.adjustOffset(101L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone2.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.TimeZone timeZone9 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:01");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-72000001L), locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        java.util.TimeZone timeZone30 = dateTimeZone1.toTimeZone();
        java.lang.String str32 = dateTimeZone1.getShortName((-345659903L));
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
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.010" + "'", str32, "+00:00:00.010");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone4.isLocalDateTimeGap(localDateTime23);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        java.lang.String str9 = dateTimeZone1.getName((-3659900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertLocalToUTC((-115199903L), true, (long) 'a');
        java.lang.String str15 = dateTimeZone1.getName((long) (short) -1);
        long long18 = dateTimeZone1.adjustOffset(3660000L, false);
        boolean boolean19 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399903L) + "'", long13 == (-230399903L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3660000L + "'", long18 == 3660000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.previousTransition((long) (short) -1);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        long long9 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false, 115200000L);
        long long11 = dateTimeZone1.previousTransition((-115199900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3599900L) + "'", long9 == (-3599900L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115199900L) + "'", long11 == (-115199900L));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean9 = dateTimeZone1.isFixed();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-72060000L), locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone24.getName(96L, locale30);
        boolean boolean32 = dateTimeZone24.isFixed();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        long long9 = dateTimeZone2.nextTransition((long) 100);
        int int11 = dateTimeZone2.getStandardOffset(1L);
        long long13 = dateTimeZone2.previousTransition((-345659903L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-345659903L) + "'", long13 == (-345659903L));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        java.util.TimeZone timeZone26 = dateTimeZone10.toTimeZone();
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
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone2.getOffset(115199999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        boolean boolean9 = dateTimeZone2.isFixed();
        java.lang.String str10 = dateTimeZone2.toString();
        long long14 = dateTimeZone2.convertLocalToUTC(60000L, true, 115200035L);
        long long16 = dateTimeZone2.nextTransition((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        int int8 = dateTimeZone1.getStandardOffset((-115139948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        long long9 = dateTimeZone1.convertLocalToUTC((-72120000L), false, (-115139999L));
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-187320000L) + "'", long9 == (-187320000L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 1L);
        java.lang.String str12 = dateTimeZone5.getShortName(230399999L);
        long long15 = dateTimeZone5.adjustOffset((-120001L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115139999L) + "'", long10 == (-115139999L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-120001L) + "'", long15 == (-120001L));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Coordinated Universal Time' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        java.lang.String str10 = dateTimeZone2.getName((long) 60000);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int14 = dateTimeZone12.getOffsetFromLocal((-1L));
        boolean boolean15 = dateTimeZone12.isFixed();
        long long17 = dateTimeZone12.convertUTCToLocal((long) 10);
        boolean boolean19 = dateTimeZone12.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone12.isLocalDateTimeGap(localDateTime20);
        long long24 = dateTimeZone12.convertLocalToUTC((long) 'a', true);
        long long26 = dateTimeZone2.getMillisKeepLocal(dateTimeZone12, 115140010L);
        long long29 = dateTimeZone2.convertLocalToUTC((-589739949L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 115200010L + "'", long17 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-115199903L) + "'", long24 == (-115199903L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-589799949L) + "'", long29 == (-589799949L));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str11 = dateTimeZone9.getShortName(32L);
        long long15 = dateTimeZone9.convertLocalToUTC((long) 187260000, true, (-111540000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-115139948L) + "'", long5 == (-115139948L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:01" + "'", str11, "+00:01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 187200000L + "'", long15 == 187200000L);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(115200035L, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone2.isLocalDateTimeGap(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115079990L) + "'", long13 == (-115079990L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        long long20 = dateTimeZone1.convertLocalToUTC((-3599900L), false, 0L);
        long long22 = dateTimeZone1.nextTransition((-115200000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-118799900L) + "'", long20 == (-118799900L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-115200000L) + "'", long22 == (-115200000L));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean13 = dateTimeZone1.isStandardOffset((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long16 = dateTimeZone1.convertUTCToLocal((-115199903L));
        java.lang.String str18 = dateTimeZone1.getNameKey((-115199966L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        java.lang.Class<?> wildcardClass35 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        java.lang.String str40 = dateTimeZone5.getName((-345659903L));
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
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Coordinated Universal Time" + "'", str40, "Coordinated Universal Time");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        long long11 = dateTimeZone2.convertLocalToUTC(230399999L, true);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone2.isLocalDateTimeGap(localDateTime12);
        long long15 = dateTimeZone2.previousTransition(118740000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 230339999L + "'", long11 == 230339999L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 118740000L + "'", long15 == 118740000L);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-115199990L), locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        boolean boolean11 = dateTimeZone1.isFixed();
        boolean boolean13 = dateTimeZone1.isStandardOffset(115140000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int13 = dateTimeZone11.getOffsetFromLocal((-1L));
        boolean boolean14 = dateTimeZone11.isFixed();
        long long16 = dateTimeZone11.convertUTCToLocal((long) 10);
        int int18 = dateTimeZone11.getStandardOffset((-115200001L));
        int int20 = dateTimeZone11.getStandardOffset((-115139999L));
        boolean boolean21 = dateTimeZone1.equals((java.lang.Object) int20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115200010L + "'", long16 == 115200010L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        java.lang.String str19 = dateTimeZone2.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:01" + "'", str19, "+00:01");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset(0L, true);
        java.lang.String str10 = dateTimeZone2.getNameKey(230399999L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str37 = dateTimeZone36.toString();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        boolean boolean41 = dateTimeZone39.isStandardOffset((long) (short) 10);
        java.lang.String str43 = dateTimeZone39.getShortName((long) (short) 100);
        boolean boolean45 = dateTimeZone39.isStandardOffset(100L);
        boolean boolean47 = dateTimeZone39.isStandardOffset(115260000L);
        long long49 = dateTimeZone36.getMillisKeepLocal(dateTimeZone39, (-230339900L));
        long long51 = dateTimeZone14.getMillisKeepLocal(dateTimeZone36, (long) 10);
        int int53 = dateTimeZone36.getOffset((-115139900L));
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
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:01" + "'", str37, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-230279900L) + "'", long49 == (-230279900L));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L + "'", long51 == 10L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 60000 + "'", int53 == 60000);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long12 = dateTimeZone1.nextTransition(10L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int5 = dateTimeZone3.getOffsetFromLocal((-1L));
        boolean boolean6 = dateTimeZone3.isFixed();
        long long8 = dateTimeZone3.convertUTCToLocal(0L);
        java.lang.String str10 = dateTimeZone3.getNameKey((long) 'a');
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) str10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName(3600000L, locale13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115200000L + "'", long8 == 115200000L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:00" + "'", str14, "+01:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3600000 + "'", int16 == 3600000);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        java.lang.String str27 = dateTimeZone2.getShortName(100L);
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((-345659903L), locale13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        long long10 = dateTimeZone1.convertLocalToUTC((-230460003L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-230460003L) + "'", long10 == (-230460003L));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        int int10 = dateTimeZone1.getOffset(0L);
        int int12 = dateTimeZone1.getOffset((-72059948L));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone14.getOffset(readableInstant15);
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 0L);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone1.isLocalDateTimeGap(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115199900L + "'", long18 == 115199900L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        boolean boolean15 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        long long3 = dateTimeZone1.previousTransition(115199999L);
        long long5 = dateTimeZone1.previousTransition((long) 60000);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName(115200032L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115199999L + "'", long3 == 115199999L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60000L + "'", long5 == 60000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        long long7 = dateTimeZone1.convertUTCToLocal((-230339900L));
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115139900L) + "'", long7 == (-115139900L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        boolean boolean21 = dateTimeZone8.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-115139999L) + "'", long20 == (-115139999L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 1L);
        java.lang.String str12 = dateTimeZone5.getShortName(230399999L);
        long long14 = dateTimeZone5.convertUTCToLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115200000L + "'", long14 == 115200000L);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        java.lang.Class<?> wildcardClass18 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115199900L) + "'", long15 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getNameKey((-115319900L));
        int int6 = dateTimeZone1.getOffsetFromLocal((-230399998L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(600000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        java.lang.String str20 = dateTimeZone1.getName((long) '#');
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
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getName(302400010L, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:01" + "'", str6, "+00:01");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        int int9 = dateTimeZone1.getOffset((long) '4');
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName((-187259990L), locale11);
        int int14 = dateTimeZone1.getOffsetFromLocal((long) 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int17 = dateTimeZone15.getOffsetFromLocal((-1L));
        long long19 = dateTimeZone15.convertUTCToLocal((-1L));
        java.lang.String str21 = dateTimeZone15.getName((-1L));
        int int23 = dateTimeZone15.getOffset((long) '4');
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone15.getShortName((-187259990L), locale25);
        java.lang.String str28 = dateTimeZone15.getName((long) 'a');
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone15.getShortName((-115139990L), locale30);
        boolean boolean32 = dateTimeZone1.equals((java.lang.Object) dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115199999L + "'", long19 == 115199999L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:00" + "'", str28, "+32:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 1);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) 115200000);
        int int10 = dateTimeZone1.getOffsetFromLocal(115200000L);
        boolean boolean12 = dateTimeZone1.isStandardOffset((long) 115200000);
        long long14 = dateTimeZone1.nextTransition((-301859949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-301859949L) + "'", long14 == (-301859949L));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        long long24 = dateTimeZone2.convertLocalToUTC((long) (-1), false, (long) 187260000);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean28 = dateTimeZone26.isStandardOffset((long) 60000);
        boolean boolean29 = dateTimeZone2.equals((java.lang.Object) dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-115139999L) + "'", long20 == (-115139999L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-60001L) + "'", long24 == (-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        java.lang.String str9 = dateTimeZone1.getShortName((-115199965L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        boolean boolean6 = dateTimeZone2.isFixed();
        long long10 = dateTimeZone2.convertLocalToUTC((long) (short) 0, false, (-59900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-60000L) + "'", long10 == (-60000L));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        boolean boolean23 = dateTimeZone22.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) 115200000, locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((long) '4', locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        long long19 = dateTimeZone2.adjustOffset((-230279900L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 118740000L + "'", long13 == 118740000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:01" + "'", str16, "+00:01");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-230279900L) + "'", long19 == (-230279900L));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean9 = dateTimeZone1.isFixed();
        boolean boolean10 = dateTimeZone1.isFixed();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((-229859900L), locale12);
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        java.lang.String str39 = dateTimeZone1.getName((-72119990L));
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
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
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        long long9 = dateTimeZone2.nextTransition((long) 100);
        int int11 = dateTimeZone2.getStandardOffset(1L);
        long long13 = dateTimeZone2.convertUTCToLocal((-25L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 59975L + "'", long13 == 59975L);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getName((long) 360000000, locale7);
        java.lang.String str10 = dateTimeZone2.getShortName((-345539900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        int int30 = dateTimeZone8.getOffsetFromLocal((-72119990L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-115139999L) + "'", long20 == (-115139999L));
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-115199949L) + "'", long26 == (-115199949L));
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 115200000L + "'", long28 == 115200000L);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        long long24 = dateTimeZone2.convertLocalToUTC((long) (-1), false, (long) 187260000);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone2.getOffset(readableInstant25);
        long long28 = dateTimeZone2.convertUTCToLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-115139999L) + "'", long20 == (-115139999L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-60001L) + "'", long24 == (-60001L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 60000L + "'", long28 == 60000L);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((-115139900L));
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        long long6 = dateTimeZone0.convertLocalToUTC((-230339999L), false);
        java.lang.String str8 = dateTimeZone0.getNameKey(34L);
        int int10 = dateTimeZone0.getOffsetFromLocal(115200032L);
        long long14 = dateTimeZone0.convertLocalToUTC(118800000L, false, (-230339900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-115139900L) + "'", long2 == (-115139900L));
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-230339999L) + "'", long6 == (-230339999L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 118800000L + "'", long14 == 118800000L);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        long long24 = dateTimeZone2.convertLocalToUTC((long) (-1), false, (long) 187260000);
        int int26 = dateTimeZone2.getStandardOffset(0L);
        java.lang.Class<?> wildcardClass27 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 115199999L + "'", long14 == 115199999L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60001L + "'", long20 == 60001L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-60001L) + "'", long24 == (-60001L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60000 + "'", int26 == 60000);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str11 = dateTimeZone1.getNameKey((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long15 = dateTimeZone1.adjustOffset((-115199990L), false);
        boolean boolean16 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115199990L) + "'", long15 == (-115199990L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        long long3 = dateTimeZone1.previousTransition(115199999L);
        long long5 = dateTimeZone1.previousTransition((long) 60000);
        boolean boolean6 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115199999L + "'", long3 == 115199999L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60000L + "'", long5 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        long long19 = dateTimeZone9.nextTransition((-111540000L));
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-111540000L) + "'", long19 == (-111540000L));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long7 = dateTimeZone1.convertLocalToUTC(115199999L, true, (long) '#');
        long long9 = dateTimeZone1.nextTransition((long) 10);
        int int11 = dateTimeZone1.getOffsetFromLocal((-115199900L));
        java.lang.String str13 = dateTimeZone1.getNameKey((-115259958L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115139999L + "'", long7 == 115139999L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        java.lang.String str30 = dateTimeZone24.getShortName((-59900L));
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        java.lang.String str32 = dateTimeZone1.getShortName((-230339948L));
        long long34 = dateTimeZone1.previousTransition((-345599965L));
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-345599965L) + "'", long34 == (-345599965L));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        long long8 = dateTimeZone2.convertLocalToUTC(3540062L, false, (-345599903L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3480062L + "'", long8 == 3480062L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        boolean boolean13 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        long long5 = dateTimeZone1.convertLocalToUTC((-115199899L), false, (-3599900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-151199899L) + "'", long5 == (-151199899L));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        boolean boolean9 = dateTimeZone1.isStandardOffset(101L);
        java.lang.String str11 = dateTimeZone1.getNameKey((-187320000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        long long15 = dateTimeZone1.convertLocalToUTC((-115199998L), true);
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-230399998L) + "'", long15 == (-230399998L));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getShortName((long) (byte) 10, locale6);
        java.lang.String str8 = dateTimeZone4.getID();
        java.lang.String str9 = dateTimeZone4.getID();
        long long11 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 100L);
        long long15 = dateTimeZone4.convertLocalToUTC((long) (byte) -1, true, 10L);
        java.util.TimeZone timeZone16 = dateTimeZone4.toTimeZone();
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone4.getOffset(readableInstant17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone4.getShortName(115140010L, locale20);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115200001L) + "'", long15 == (-115200001L));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        long long8 = dateTimeZone2.adjustOffset((-115200000L), false);
        boolean boolean9 = dateTimeZone2.isFixed();
        java.lang.String str10 = dateTimeZone2.toString();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName((long) ' ', locale12);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200000L) + "'", long8 == (-115200000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        int int9 = dateTimeZone1.getOffset((long) '4');
        int int11 = dateTimeZone1.getOffsetFromLocal((-59900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.lang.String str7 = dateTimeZone1.getNameKey(0L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName(60101L, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:01" + "'", str10, "+00:01");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        java.lang.String str19 = dateTimeZone10.getName((-151199899L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 115200000L + "'", long17 == 115200000L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertUTCToLocal(60010L);
        java.lang.String str5 = dateTimeZone0.toString();
        int int7 = dateTimeZone0.getStandardOffset((-345599903L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+00:01" + "'", str1, "+00:01");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:01" + "'", str2, "+00:01");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 120010L + "'", long4 == 120010L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getShortName((long) (byte) 100, locale20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone1.getName((long) 115200000, locale24);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone1.isLocalDateTimeGap(localDateTime27);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long7 = dateTimeZone2.previousTransition((-115319900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115319900L) + "'", long7 == (-115319900L));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str4 = dateTimeZone1.getNameKey((long) 'a');
        long long7 = dateTimeZone1.adjustOffset((long) 3600000, false);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        long long12 = dateTimeZone1.convertLocalToUTC((-111540000L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-111540000L) + "'", long12 == (-111540000L));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        java.lang.String str10 = dateTimeZone1.getName(115200001L);
        long long12 = dateTimeZone1.convertUTCToLocal((-59900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115140100L + "'", long12 == 115140100L);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 60000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        boolean boolean20 = dateTimeZone1.isStandardOffset((-345539900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone26.getShortName((long) (byte) 10, locale28);
        java.lang.String str30 = dateTimeZone26.getID();
        java.lang.String str31 = dateTimeZone26.getID();
        long long33 = dateTimeZone24.getMillisKeepLocal(dateTimeZone26, 100L);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone26.getName((long) (byte) -1, locale35);
        long long38 = dateTimeZone26.previousTransition(60010L);
        java.lang.String str39 = dateTimeZone26.toString();
        boolean boolean40 = dateTimeZone1.equals((java.lang.Object) dateTimeZone26);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-115139900L) + "'", long33 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 60010L + "'", long38 == 60010L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+32:00" + "'", str39, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        boolean boolean24 = dateTimeZone13.equals((java.lang.Object) 115200052L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str6 = dateTimeZone1.getName(10L);
        long long9 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str11 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone1.getOffset(readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int17 = dateTimeZone15.getOffsetFromLocal((-1L));
        boolean boolean18 = dateTimeZone15.isFixed();
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone15.getOffset(readableInstant19);
        int int22 = dateTimeZone15.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone24.getShortName((long) (byte) 10, locale26);
        java.lang.String str29 = dateTimeZone24.getName(10L);
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone24.getOffset(readableInstant30);
        boolean boolean33 = dateTimeZone24.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = dateTimeZone24.isLocalDateTimeGap(localDateTime35);
        long long38 = dateTimeZone15.getMillisKeepLocal(dateTimeZone24, (-1L));
        int int40 = dateTimeZone24.getOffset((-230339999L));
        long long42 = dateTimeZone1.getMillisKeepLocal(dateTimeZone24, (long) (byte) 100);
        java.lang.String str44 = dateTimeZone24.getName((-230219990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115200000L) + "'", long9 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 115200000 + "'", int31 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 115200000 + "'", int40 == 115200000);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+32:00" + "'", str44, "+32:00");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone25.getShortName((-230339903L), locale27);
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
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone9.getOffset(readableInstant17);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 187260000 + "'", int18 == 187260000);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        long long17 = dateTimeZone1.previousTransition((long) 187200000);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 187200000L + "'", long17 == 187200000L);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.lang.String str7 = dateTimeZone1.getNameKey((-115139948L));
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((long) (byte) -1, locale9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 3600101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600101L + "'", long13 == 3600101L);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        long long24 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, true);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-600000L) + "'", long24 == (-600000L));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        boolean boolean4 = dateTimeZone1.isFixed();
        long long7 = dateTimeZone1.convertLocalToUTC((-115080001L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115080011L) + "'", long7 == (-115080011L));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        long long5 = dateTimeZone2.adjustOffset((long) 10, false);
        boolean boolean6 = dateTimeZone2.isFixed();
        int int8 = dateTimeZone2.getStandardOffset((-115199949L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        long long8 = dateTimeZone1.adjustOffset((-115140000L), false);
        java.lang.Class<?> wildcardClass9 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115140000L) + "'", long8 == (-115140000L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((-115200000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str5 = dateTimeZone2.getShortName((long) (short) 1);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName((long) 'a', locale7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:01" + "'", str8, "+00:01");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone17.getOffset(readableInstant25);
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        java.util.TimeZone timeZone43 = dateTimeZone1.toTimeZone();
        java.lang.String str45 = dateTimeZone1.getNameKey((long) 187260000);
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
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        int int3 = dateTimeZone1.getStandardOffset((-115259948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 126000000 + "'", int3 == 126000000);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        java.lang.Class<?> wildcardClass23 = dateTimeZone4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        boolean boolean12 = dateTimeZone10.isStandardOffset((-72059948L));
        java.lang.String str14 = dateTimeZone10.getShortName((-115199903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        java.lang.String str18 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115199999L) + "'", long17 == (-115199999L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        boolean boolean26 = dateTimeZone4.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone5.getOffset(readableInstant9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone5.getShortName((long) 60000, locale12);
        long long17 = dateTimeZone5.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        java.util.TimeZone timeZone19 = dateTimeZone5.toTimeZone();
        java.lang.String str21 = dateTimeZone5.getNameKey((-187320000L));
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (-59948L));
        java.lang.String str24 = dateTimeZone5.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115199999L) + "'", long17 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-115259949L) + "'", long23 == (-115259949L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        long long11 = dateTimeZone1.adjustOffset(43080000L, true);
        long long13 = dateTimeZone1.nextTransition((-230399900L));
        long long15 = dateTimeZone1.previousTransition((-230279900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 43080000L + "'", long11 == 43080000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-230399900L) + "'", long13 == (-230399900L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-230279900L) + "'", long15 == (-230279900L));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        int int33 = dateTimeZone1.getStandardOffset(230339999L);
        java.lang.String str35 = dateTimeZone1.getShortName((long) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 115200000 + "'", int33 == 115200000);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+32:00" + "'", str35, "+32:00");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone9.getName((-72060001L), locale23);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+52:01" + "'", str24, "+52:01");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        long long8 = dateTimeZone1.convertLocalToUTC(1L, false);
        long long10 = dateTimeZone1.nextTransition(302400010L);
        long long12 = dateTimeZone1.nextTransition(3540101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115199999L) + "'", long8 == (-115199999L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 302400010L + "'", long10 == 302400010L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3540101L + "'", long12 == 3540101L);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        java.lang.String str7 = dateTimeZone1.getNameKey((-115139948L));
        java.lang.String str8 = dateTimeZone1.getID();
        java.lang.String str10 = dateTimeZone1.getName(119999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-230339900L));
        long long10 = dateTimeZone2.convertLocalToUTC((-345599903L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-345659903L) + "'", long10 == (-345659903L));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        boolean boolean23 = dateTimeZone22.isFixed();
        java.lang.String str24 = dateTimeZone22.getID();
        long long26 = dateTimeZone1.getMillisKeepLocal(dateTimeZone22, (-115259948L));
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
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.032" + "'", str24, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-59980L) + "'", long26 == (-59980L));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(115199999L, false, (long) (short) 0);
        boolean boolean15 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        int int19 = dateTimeZone1.getStandardOffset(115200001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateTimeZone2.equals(obj3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        int int7 = dateTimeZone2.getOffsetFromLocal((long) (short) -1);
        int int9 = dateTimeZone2.getOffsetFromLocal((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone1.getOffset(readableInstant11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int7 = dateTimeZone5.getOffsetFromLocal((-1L));
        boolean boolean8 = dateTimeZone5.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 1L);
        int int12 = dateTimeZone5.getOffsetFromLocal((long) 10);
        long long15 = dateTimeZone5.convertLocalToUTC((-59900L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115199899L) + "'", long10 == (-115199899L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115259900L) + "'", long15 == (-115259900L));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        int int12 = dateTimeZone1.getStandardOffset((-230339999L));
        java.lang.String str13 = dateTimeZone1.toString();
        long long16 = dateTimeZone1.adjustOffset(0L, false);
        long long18 = dateTimeZone1.convertUTCToLocal(115199999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 230399999L + "'", long18 == 230399999L);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3600000) + "'", int3 == (-3600000));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        boolean boolean4 = dateTimeZone1.equals((java.lang.Object) timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        int int6 = dateTimeZone4.getOffsetFromLocal((long) 10);
        boolean boolean7 = dateTimeZone2.equals((java.lang.Object) 10);
        long long11 = dateTimeZone2.convertLocalToUTC(115140000L, true, (long) 100);
        java.lang.String str13 = dateTimeZone2.getNameKey((long) 60000);
        long long15 = dateTimeZone2.nextTransition(115199999L);
        java.lang.Class<?> wildcardClass16 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-72120000L) + "'", long11 == (-72120000L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115199999L + "'", long15 == 115199999L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        int int11 = dateTimeZone9.getOffsetFromLocal((-114659949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName(115200032L, locale4);
        long long8 = dateTimeZone1.convertLocalToUTC((-187260000L), true);
        long long10 = dateTimeZone1.nextTransition(3540000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-187260001L) + "'", long8 == (-187260001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3540000L + "'", long10 == 3540000L);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        int int17 = dateTimeZone1.getOffset(100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199900L) + "'", long14 == (-115199900L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:10");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 0);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName(72059975L, locale4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        long long30 = dateTimeZone17.convertLocalToUTC(115200010L, true, 118740000L);
        long long32 = dateTimeZone17.previousTransition(100L);
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        boolean boolean10 = dateTimeZone1.isStandardOffset(0L);
        long long12 = dateTimeZone1.previousTransition((-115259949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115259949L) + "'", long12 == (-115259949L));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        java.lang.String str19 = dateTimeZone1.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+32:00" + "'", str19, "+32:00");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        int int8 = dateTimeZone1.getStandardOffset((-115200001L));
        int int10 = dateTimeZone1.getStandardOffset((-115139999L));
        int int12 = dateTimeZone1.getStandardOffset((-230339999L));
        java.lang.String str13 = dateTimeZone1.toString();
        long long16 = dateTimeZone1.adjustOffset(0L, false);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int20 = dateTimeZone18.getOffsetFromLocal((-1L));
        boolean boolean21 = dateTimeZone18.isFixed();
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone18.getOffset(readableInstant22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone18.getShortName((long) 60000, locale25);
        long long30 = dateTimeZone18.convertLocalToUTC(1L, false, (-115139900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        java.util.TimeZone timeZone32 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        long long37 = dateTimeZone18.getMillisKeepLocal(dateTimeZone34, (long) (byte) 10);
        boolean boolean38 = dateTimeZone1.equals((java.lang.Object) dateTimeZone34);
        java.lang.String str40 = dateTimeZone1.getShortName((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-115199999L) + "'", long30 == (-115199999L));
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+32:00" + "'", str40, "+32:00");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        long long3 = dateTimeZone1.previousTransition(115199999L);
        long long5 = dateTimeZone1.previousTransition((long) 60000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long8 = dateTimeZone1.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 115199999L + "'", long3 == 115199999L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60000L + "'", long5 == 60000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getStandardOffset((long) 'a');
        long long11 = dateTimeZone1.adjustOffset((-230399900L), true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-230399900L) + "'", long11 == (-230399900L));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        java.lang.String str27 = dateTimeZone10.toString();
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        long long31 = dateTimeZone29.previousTransition((-1L));
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int35 = dateTimeZone33.getOffsetFromLocal((-1L));
        boolean boolean36 = dateTimeZone33.isFixed();
        long long38 = dateTimeZone29.getMillisKeepLocal(dateTimeZone33, 1L);
        int int40 = dateTimeZone33.getOffsetFromLocal((long) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone42.getShortName((long) (byte) 10, locale44);
        java.lang.String str46 = dateTimeZone42.getID();
        java.lang.String str47 = dateTimeZone42.getID();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean51 = dateTimeZone42.equals((java.lang.Object) dateTimeZone50);
        java.lang.String str53 = dateTimeZone50.getNameKey((long) (byte) 1);
        boolean boolean54 = dateTimeZone50.isFixed();
        long long56 = dateTimeZone33.getMillisKeepLocal(dateTimeZone50, 115140000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        long long60 = dateTimeZone33.convertLocalToUTC(115260000L, false);
        java.util.Locale locale62 = null;
        java.lang.String str63 = dateTimeZone33.getShortName((-25L), locale62);
        long long66 = dateTimeZone33.adjustOffset((-114599949L), false);
        long long68 = dateTimeZone10.getMillisKeepLocal(dateTimeZone33, (-115199990L));
        java.lang.String str69 = dateTimeZone33.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 115200000 + "'", int35 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 115200000 + "'", int40 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+32:00" + "'", str45, "+32:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+32:00" + "'", str46, "+32:00");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+32:00" + "'", str47, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 43080000L + "'", long56 == 43080000L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 60000L + "'", long60 == 60000L);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+32:00" + "'", str63, "+32:00");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-114599949L) + "'", long66 == (-114599949L));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-115199990L) + "'", long68 == (-115199990L));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+32:00" + "'", str69, "+32:00");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        int int30 = dateTimeZone11.getOffsetFromLocal(72059975L);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str11 = dateTimeZone1.getID();
        java.lang.String str13 = dateTimeZone1.getShortName((-115080011L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        int int20 = dateTimeZone5.getOffsetFromLocal((long) '4');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((-115139900L));
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        long long6 = dateTimeZone0.convertLocalToUTC((-230339999L), false);
        java.lang.String str8 = dateTimeZone0.getNameKey(34L);
        boolean boolean10 = dateTimeZone0.isStandardOffset(72059975L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-115139900L) + "'", long2 == (-115139900L));
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-230339999L) + "'", long6 == (-230339999L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int3 = dateTimeZone1.getStandardOffset((-1L));
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        long long10 = dateTimeZone1.adjustOffset(230400000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230400000L + "'", long10 == 230400000L);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(600000, 349200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        int int10 = dateTimeZone1.getOffset(0L);
        boolean boolean12 = dateTimeZone1.isStandardOffset((-230340000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        java.lang.Class<?> wildcardClass23 = dateTimeZone1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone1.convertLocalToUTC(115199999L, false, (long) (short) 0);
        java.lang.String str16 = dateTimeZone1.getNameKey((long) 60000);
        java.lang.String str18 = dateTimeZone1.getShortName((-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+32:00" + "'", str18, "+32:00");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        boolean boolean19 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone24.getName(96L, locale30);
        java.lang.String str32 = dateTimeZone24.toString();
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone24.getOffset(readableInstant33);
        java.lang.String str36 = dateTimeZone24.getShortName(115140010L);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+32:00" + "'", str31, "+32:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 115200000 + "'", int34 == 115200000);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+32:00" + "'", str36, "+32:00");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        java.lang.String str28 = dateTimeZone1.getID();
        java.lang.String str29 = dateTimeZone1.toString();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:00" + "'", str28, "+32:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187260000, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 60000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 0);
        java.lang.String str3 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-01:00" + "'", str3, "-01:00");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        long long20 = dateTimeZone1.convertLocalToUTC((-3599900L), false, 0L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone1.getShortName((long) (byte) 10, locale22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-118799900L) + "'", long20 == (-118799900L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        int int9 = dateTimeZone1.getOffsetFromLocal(230339999L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        java.util.TimeZone timeZone16 = dateTimeZone5.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115139999L) + "'", long10 == (-115139999L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        long long25 = dateTimeZone4.convertLocalToUTC(51L, false);
        int int27 = dateTimeZone4.getStandardOffset((long) 115200000);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-115199949L) + "'", long25 == (-115199949L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 115200000 + "'", int27 == 115200000);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getOffset(115200010L);
        boolean boolean9 = dateTimeZone1.isFixed();
        boolean boolean10 = dateTimeZone1.isFixed();
        java.lang.String str11 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+32:00" + "'", str11, "+32:00");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        boolean boolean20 = dateTimeZone4.isStandardOffset((-345539900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115139900L) + "'", long11 == (-115139900L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60010L + "'", long16 == 60010L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        long long8 = dateTimeZone1.adjustOffset((long) (byte) 0, true);
        long long10 = dateTimeZone1.nextTransition((-230339900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-230339900L) + "'", long10 == (-230339900L));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        long long20 = dateTimeZone2.nextTransition(115200035L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60010L + "'", long12 == 60010L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115140000L + "'", long16 == 115140000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115200035L + "'", long20 == 115200035L);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        long long12 = dateTimeZone1.convertUTCToLocal(59975L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115259975L + "'", long12 == 115259975L);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        long long30 = dateTimeZone28.nextTransition((-230459903L));
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
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-230459903L) + "'", long30 == (-230459903L));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        java.lang.String str28 = dateTimeZone1.getNameKey(187200010L);
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
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal((long) 10);
        boolean boolean8 = dateTimeZone1.isStandardOffset((long) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200010L + "'", long6 == 115200010L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        long long5 = dateTimeZone1.convertUTCToLocal((-1L));
        java.lang.String str7 = dateTimeZone1.getName((-1L));
        int int9 = dateTimeZone1.getOffset((long) '4');
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getName(60010L, locale11);
        boolean boolean14 = dateTimeZone1.isStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 115199999L + "'", long5 == 115199999L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+32:00" + "'", str12, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) '4');
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        long long11 = dateTimeZone8.nextTransition((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        long long16 = dateTimeZone11.adjustOffset((-115260000L), false);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115260000L) + "'", long16 == (-115260000L));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        long long11 = dateTimeZone1.adjustOffset(43080000L, true);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 43080000L + "'", long11 == 43080000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertUTCToLocal((-115199990L));
        int int6 = dateTimeZone0.getOffset((-230219990L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+32:00" + "'", str1, "+32:00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:00" + "'", str2, "+32:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long4 = dateTimeZone1.nextTransition(115199999L);
        java.lang.String str6 = dateTimeZone1.getName((-589739949L));
        boolean boolean7 = dateTimeZone1.isFixed();
        java.lang.String str9 = dateTimeZone1.getName((-114659949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115199999L + "'", long4 == 115199999L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        int int6 = dateTimeZone1.getStandardOffset((long) (byte) 0);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-1), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        int int12 = dateTimeZone1.getOffsetFromLocal((long) 115200000);
        long long15 = dateTimeZone1.convertLocalToUTC((-115199998L), true);
        java.lang.String str17 = dateTimeZone1.getShortName((-115200001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200001L) + "'", long10 == (-115200001L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-230399998L) + "'", long15 == (-230399998L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName(1L);
        long long11 = dateTimeZone1.adjustOffset(43080000L, true);
        long long13 = dateTimeZone1.previousTransition(115200001L);
        boolean boolean15 = dateTimeZone1.isStandardOffset(99L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 43080000L + "'", long11 == 43080000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115200001L + "'", long13 == 115200001L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        boolean boolean33 = dateTimeZone1.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115200000 + "'", int6 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        java.lang.String str17 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 115200000 + "'", int14 == 115200000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffsetFromLocal(0L);
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.convertLocalToUTC((-115199903L), true, (long) 'a');
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        int int16 = dateTimeZone1.getOffset((-3599901L));
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        int int3 = dateTimeZone1.getOffsetFromLocal(43020000L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        boolean boolean7 = dateTimeZone1.isStandardOffset(302400010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone7.getOffset(readableInstant19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone22.getShortName((long) (byte) 10, locale24);
        java.lang.String str26 = dateTimeZone22.getID();
        java.lang.String str27 = dateTimeZone22.getID();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 1);
        boolean boolean31 = dateTimeZone22.equals((java.lang.Object) dateTimeZone30);
        long long33 = dateTimeZone22.convertUTCToLocal(115200000L);
        long long35 = dateTimeZone7.getMillisKeepLocal(dateTimeZone22, (-115139999L));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+32:00" + "'", str25, "+32:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+32:00" + "'", str26, "+32:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 230400000L + "'", long33 == 230400000L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-115139999L) + "'", long35 == (-115139999L));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone1.getName(187200010L, locale34);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+32:00" + "'", str35, "+32:00");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (byte) 1, locale6);
        java.lang.String str9 = dateTimeZone1.getName((-115199949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        boolean boolean29 = dateTimeZone21.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isStandardOffset(10L);
        long long9 = dateTimeZone1.convertUTCToLocal(115199999L);
        int int11 = dateTimeZone1.getStandardOffset((-1L));
        boolean boolean12 = dateTimeZone1.isFixed();
        java.lang.String str13 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 230399999L + "'", long9 == 230399999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int13 = dateTimeZone1.getStandardOffset((long) (-1));
        long long16 = dateTimeZone1.adjustOffset((-229799949L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-229799949L) + "'", long16 == (-229799949L));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int23 = dateTimeZone21.getOffsetFromLocal((-1L));
        long long25 = dateTimeZone21.convertUTCToLocal((-1L));
        java.lang.String str27 = dateTimeZone21.getName((-1L));
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = dateTimeZone21.getOffset(readableInstant28);
        java.util.TimeZone timeZone30 = dateTimeZone21.toTimeZone();
        long long32 = dateTimeZone11.getMillisKeepLocal(dateTimeZone21, 115200001L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        java.lang.String str37 = dateTimeZone36.toString();
        long long40 = dateTimeZone36.adjustOffset((long) (byte) -1, true);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        long long44 = dateTimeZone42.previousTransition((long) (byte) -1);
        long long48 = dateTimeZone42.convertLocalToUTC(115199999L, true, (long) '#');
        long long50 = dateTimeZone42.nextTransition((long) 10);
        int int52 = dateTimeZone42.getOffsetFromLocal((-115199900L));
        long long54 = dateTimeZone36.getMillisKeepLocal(dateTimeZone42, (long) (byte) 1);
        long long58 = dateTimeZone36.convertLocalToUTC((long) (-1), false, (long) 187260000);
        int int60 = dateTimeZone36.getStandardOffset(0L);
        long long62 = dateTimeZone21.getMillisKeepLocal(dateTimeZone36, (long) 0);
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
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 115199999L + "'", long25 == 115199999L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+32:00" + "'", str27, "+32:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 115200000 + "'", int29 == 115200000);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 115200001L + "'", long32 == 115200001L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:01" + "'", str37, "+00:01");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L + "'", long50 == 10L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 115200000 + "'", int52 == 115200000);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-115139999L) + "'", long54 == (-115139999L));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-60001L) + "'", long58 == (-60001L));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 60000 + "'", int60 == 60000);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 115140000L + "'", long62 == 115140000L);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-115199903L), locale4);
        long long7 = dateTimeZone1.nextTransition((-230399903L));
        boolean boolean8 = dateTimeZone1.isFixed();
        java.lang.String str9 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-230399903L) + "'", long7 == (-230399903L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.001" + "'", str9, "+00:00:00.001");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone2.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        int int10 = dateTimeZone2.getOffset((-115139990L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffsetFromLocal((-1L));
        boolean boolean4 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) 'a');
        long long12 = dateTimeZone1.convertLocalToUTC((-1L), true, (-187320000L));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean15 = dateTimeZone1.equals((java.lang.Object) dateTimeZone14);
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-115200001L) + "'", long12 == (-115200001L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
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
        org.junit.Assert.assertNotNull(dateTimeZone35);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        int int10 = dateTimeZone1.getStandardOffset((-301859949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        int int28 = dateTimeZone11.getOffsetFromLocal((-59980L));
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115200000 + "'", int28 == 115200000);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((long) 0, locale4);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass11 = timeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str2 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertUTCToLocal((-115199990L));
        long long8 = dateTimeZone0.convertLocalToUTC((-1L), false, 115260000L);
        long long10 = dateTimeZone0.previousTransition(115200035L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getShortName(230279999L, locale12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+32:00" + "'", str1, "+32:00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+32:00" + "'", str2, "+32:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115200001L) + "'", long8 == (-115200001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115200035L + "'", long10 == 115200035L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        long long3 = dateTimeZone1.previousTransition((long) (short) -1);
        int int5 = dateTimeZone1.getOffsetFromLocal(100L);
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getID();
        long long11 = dateTimeZone1.convertLocalToUTC((long) 115200000, true, (-114599949L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:00" + "'", str6, "+01:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 111600000L + "'", long11 == 111600000L);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 10, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal(0L);
        int int8 = dateTimeZone1.getStandardOffset((long) ' ');
        long long10 = dateTimeZone1.previousTransition(230399999L);
        long long13 = dateTimeZone1.convertLocalToUTC(1L, false);
        java.lang.String str15 = dateTimeZone1.getShortName(115260010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:00" + "'", str4, "+32:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200000L + "'", long6 == 115200000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 230399999L + "'", long10 == 230399999L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199999L) + "'", long13 == (-115199999L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        long long36 = dateTimeZone18.convertLocalToUTC((-230459903L), true, (-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
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
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-345659903L) + "'", long36 == (-345659903L));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (short) 10);
        java.lang.String str5 = dateTimeZone1.getShortName((long) (short) 100);
        boolean boolean7 = dateTimeZone1.isStandardOffset(100L);
        boolean boolean9 = dateTimeZone1.isStandardOffset(115260000L);
        boolean boolean11 = dateTimeZone1.isStandardOffset((-115139999L));
        java.lang.String str13 = dateTimeZone1.getName(111540100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        int int24 = dateTimeZone13.getStandardOffset((-230400000L));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 115200000 + "'", int24 == 115200000);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.lang.String str34 = dateTimeZone1.getShortName((-230339903L));
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+32:00" + "'", str34, "+32:00");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(10L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(52L, locale6);
        long long11 = dateTimeZone1.convertLocalToUTC((-230459903L), false, (-115199999L));
        boolean boolean12 = dateTimeZone1.isFixed();
        int int14 = dateTimeZone1.getOffset((-230400000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-230460003L) + "'", long11 == (-230460003L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
}
