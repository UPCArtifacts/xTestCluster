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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder8.addRecurringSavings("hi!", 0, (int) 'a', (int) ' ', '#', (int) (short) 100, (int) 'a', (int) (short) 1, false, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '#', (int) '#', (int) (byte) 1, 'a', 100, (int) (byte) 1, (int) (short) -1, false, 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder36.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder36.setFixedSavings("hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder42.addRecurringSavings("hi!", 100, (int) (short) 0, (int) (short) 100, '4', (int) 'a', (int) (byte) 1, (int) ' ', true, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("", (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder27.setFixedSavings("", (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder30.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("", false);
        java.io.DataOutput dataOutput38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("", dataOutput38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (short) 100, (int) (byte) -1, 0, '#', (int) (short) 0, 0, (int) 'a', false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder35.addRecurringSavings("", (int) 'a', (int) (short) 100, (int) (byte) -1, '4', (int) (short) 0, (int) (byte) -1, (int) (byte) -1, true, 1);
        java.io.OutputStream outputStream48 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("", outputStream48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder23.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("hi!", (int) 'a', (int) '#', (int) ' ', ' ', (int) (short) 0, 0, (int) (byte) 1, true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder36.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder36.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder36.setFixedSavings("hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder45.addCutover((int) (byte) 1, '#', (int) (byte) 10, (int) (byte) 0, (int) (byte) -1, true, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder18.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder18.addRecurringSavings("", 100, (int) (byte) 0, 10, '4', 10, (int) '#', (int) (byte) -1, true, (int) (byte) -1);
        java.io.OutputStream outputStream34 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder18.writeTo("hi!", outputStream34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder19.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (short) 0, (int) (byte) 100, (int) (short) 100, 'a', (-1), (int) (byte) 0, (int) (byte) 0, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", (int) (byte) 0, (-1), (int) (byte) -1, ' ', (int) ' ', (int) '#', (int) (byte) 0, true, (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder22.setStandardOffset((int) '4');
        java.io.OutputStream outputStream39 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder37.writeTo("hi!", outputStream39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (short) 10, 100, 0, 'a', (int) (byte) 10, (int) '4', (int) (byte) 10, true, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.setFixedSavings("", (int) '4');
        java.lang.Class<?> wildcardClass31 = dateTimeZoneBuilder5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder25.addRecurringSavings("", (int) (byte) 1, (int) (byte) 1, (int) 'a', '#', (int) (byte) 0, (int) 'a', (int) (byte) -1, true, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder25.addRecurringSavings("", 0, (int) (short) 0, (int) (byte) 1, ' ', (int) (byte) 1, (int) (short) 1, 10, true, 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder53);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder6.setFixedSavings("hi!", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.setStandardOffset((int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 1);
        java.io.DataOutput dataOutput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("hi!", dataOutput24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder0.setFixedSavings("", (int) (short) 1);
        java.io.OutputStream outputStream36 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("hi!", (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.addRecurringSavings("", (int) (byte) 100, (int) (byte) 1, (int) (byte) 100, '4', 100, (int) (byte) 100, (int) (byte) 10, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) 'a', 0, (int) (byte) -1, '#', (int) ' ', 1, (int) ' ', true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder14.addRecurringSavings("", (int) '4', (int) (short) 100, (int) (short) 100, ' ', (-1), (int) (short) 100, (int) 'a', false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder47.addRecurringSavings("", (int) (byte) 1, (int) '4', 100, ' ', 10, 100, 100, true, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder7.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder7.addRecurringSavings("", (int) (short) -1, (-1), 100, ' ', (int) (short) -1, (int) '#', (int) (byte) 10, false, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder7.addCutover((int) (short) 100, '#', (int) (short) 0, 0, (int) (byte) 100, false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) '#', (int) '#', (int) (short) 0, '4', (int) (short) -1, 100, (int) ' ', false, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder19.addRecurringSavings("", (-1), (int) '4', (int) (short) 100, 'a', (int) (short) 1, 100, (-1), false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder61 = dateTimeZoneBuilder58.setFixedSavings("hi!", (int) (short) -1);
        java.io.OutputStream outputStream63 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder61.writeTo("hi!", outputStream63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder61);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder7.addRecurringSavings("", 10, (int) (byte) 10, (-1), ' ', (int) 'a', (int) 'a', (int) ' ', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder25.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder25.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder25.setFixedSavings("", 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("hi!", 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder16.addRecurringSavings("", 100, (int) (short) 1, 1, ' ', 10, 1, (int) (byte) 0, false, (int) '#');
        java.io.DataOutput dataOutput29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder27.writeTo("", dataOutput29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) '#', 0, (int) (short) -1, '#', (int) (short) 100, (int) (byte) 10, 100, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder28.addRecurringSavings("hi!", (int) (byte) -1, (int) '4', (int) (short) 1, 'a', 0, (int) (short) 1, (int) (byte) 1, true, (int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder9.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder9.setFixedSavings("hi!", 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (short) -1, (int) (byte) 1, (-1), 'a', (int) (byte) 1, (int) (short) 0, 100, true, (int) (byte) 0);
        java.io.DataOutput dataOutput43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder41.writeTo("hi!", dataOutput43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder10.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder10.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder10.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder10.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder23.addCutover((int) (short) 10, 'a', (int) (short) 10, (int) (byte) -1, (int) ' ', true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass28 = dateTimeZoneBuilder27.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder36.setFixedSavings("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder13.setFixedSavings("", 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder9.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (short) 10, (int) (byte) 10, (int) (short) 0, 'a', (int) '#', (int) (byte) 1, (int) ' ', true, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder9.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder37.setFixedSavings("hi!", 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder9.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder9.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder30.addCutover((-1), '4', (int) (byte) 1, (int) (byte) -1, (int) (short) 100, false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder17.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", 0, (int) (short) 0, (int) 'a', 'a', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder47.addRecurringSavings("", (int) (byte) 0, (int) (short) 10, (int) (short) 100, ' ', (int) (byte) -1, (int) (short) -1, (int) (short) 100, false, (int) (byte) 0);
        java.io.OutputStream outputStream60 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder58.writeTo("", outputStream60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder21.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder21.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder30.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder32.setFixedSavings("hi!", (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder35.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder20.addRecurringSavings("", (int) (short) 1, (int) '4', 1, 'a', 0, (int) '4', (int) (short) 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder20.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder20.setStandardOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass36 = dateTimeZoneBuilder35.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder14.setFixedSavings("", (-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder16.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder16.addRecurringSavings("", 0, 10, (int) ' ', '4', (int) (byte) 100, 1, (int) (short) 10, true, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder30.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeZoneBuilder32.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder32.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset(10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder4.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addRecurringSavings("", (-1), 1, (int) (byte) 100, '#', (int) (byte) 1, (int) (short) 10, (int) (byte) 1, false, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder14.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.addRecurringSavings("", 1, (int) (short) 10, 0, '4', (int) (byte) -1, 0, (int) (short) 10, true, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", (int) (byte) 1, (int) '#', 0, 'a', (int) (byte) 0, (-1), (int) '#', true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder19.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 100, 'a', (int) '#', 0, 0, true, (int) (short) 100);
        java.io.OutputStream outputStream43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder41.writeTo("hi!", outputStream43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (byte) 100, (int) '4', (int) (short) -1, 'a', (int) (short) 0, 0, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder17.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder17.setFixedSavings("", 100);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeZoneBuilder49.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZone52);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) 1, (int) (short) 1, (int) (short) 1, 'a', 10, 1, (int) (short) 1, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) '#', (int) '4', (int) (short) 0, '4', (int) (short) -1, (-1), (int) (byte) -1, false, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeZoneBuilder46.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder46.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder62 = dateTimeZoneBuilder46.addRecurringSavings("", (int) (byte) 100, (int) (byte) 100, (int) (short) -1, '4', (int) (byte) 1, (int) '4', (int) (short) 1, true, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder62);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder28.setFixedSavings("", (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass35 = dateTimeZoneBuilder31.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.addRecurringSavings("hi!", 0, (int) ' ', 1, 'a', (int) (byte) 1, (int) (byte) 100, (int) (byte) 100, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) '#', (int) (byte) 100, (int) (short) 0, '#', (int) 'a', (int) (byte) 1, (int) (short) 10, false, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addCutover(1, '4', (int) (short) 10, (int) (short) 10, 0, true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder10.addRecurringSavings("", (-1), (-1), (int) (byte) 0, ' ', (int) '4', (int) (short) 0, (-1), true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder10.addRecurringSavings("", (int) '4', (int) (short) 0, (int) (short) 1, ' ', (int) '#', (int) (byte) 0, (int) (short) -1, false, 10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder35.toDateTimeZone("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder35.addCutover(0, '4', 1, (int) '4', (int) (byte) 1, true, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder14.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass35 = dateTimeZone34.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeZoneBuilder7.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 0, (int) ' ', ' ', (int) (short) -1, (int) (byte) 1, 10, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder46.setStandardOffset((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder56 = dateTimeZoneBuilder48.addCutover((int) (byte) 1, 'a', 0, (int) (short) 0, (int) (short) 1, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder48);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder27.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeZoneBuilder29.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeZoneBuilder29.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder29.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder29.setFixedSavings("", (int) (byte) 10);
        java.lang.Class<?> wildcardClass42 = dateTimeZoneBuilder29.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 1, (int) '4', (int) '#', '4', 10, (int) (byte) 10, 10, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("", 0, (-1), (int) (byte) 10, 'a', (int) (short) 10, (int) '#', (int) (short) 1, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder25.addRecurringSavings("", (int) (byte) -1, (int) '4', (int) (byte) 1, '#', (int) (short) -1, (int) (short) 10, 0, true, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder25.addRecurringSavings("", 0, 0, (int) (short) 0, 'a', (int) (short) 100, (int) '4', (int) ' ', true, 1);
        org.joda.time.DateTimeZone dateTimeZone61 = dateTimeZoneBuilder58.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
        org.junit.Assert.assertNotNull(dateTimeZone61);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) (byte) 10);
        java.io.OutputStream outputStream33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder31.writeTo("hi!", outputStream33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) 10, (int) ' ', (int) (byte) 0, ' ', (int) (byte) 1, (-1), (int) (short) 1, true, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder33.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass40 = dateTimeZone39.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder47.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder47.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder62 = dateTimeZoneBuilder47.addRecurringSavings("", (int) (byte) -1, (int) (short) 0, 100, ' ', (int) (short) 1, (int) (byte) 10, (int) '4', true, 100);
        java.io.OutputStream outputStream64 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder47.writeTo("hi!", outputStream64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder62);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (short) 10, 0, (int) (byte) 1, '4', (int) ' ', (int) (byte) 10, 100, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset((int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.addRecurringSavings("", 0, 100, 100, 'a', (int) (short) 1, (-1), (int) (short) 10, false, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder26.setStandardOffset((int) '#');
        java.io.DataOutput dataOutput30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder26.writeTo("", dataOutput30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 1, 10, (-1), 'a', 0, (int) (short) 100, (int) (byte) 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder27.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder29.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder29.addRecurringSavings("", (int) (byte) -1, (int) (short) -1, (int) (byte) 1, '4', (int) (short) 0, (-1), (int) ' ', true, 1);
        java.io.OutputStream outputStream45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder43.writeTo("hi!", outputStream45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (short) 100, (int) 'a', (int) (byte) 10, ' ', 100, (int) (byte) -1, 10, false, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder9.setFixedSavings("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder5.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder5.addRecurringSavings("hi!", (int) ' ', (int) (byte) 100, 10, 'a', (int) 'a', (int) '4', (int) (short) -1, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder27.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder27.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addCutover((int) (byte) -1, '4', (int) (byte) 0, (int) (short) -1, (int) (byte) 1, false, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder44.setStandardOffset((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeZoneBuilder44.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass53 = dateTimeZone52.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder3.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (short) 10, (-1), 0, '4', (int) '4', (int) (byte) 1, (int) (short) -1, true, (int) (short) -1);
        java.io.OutputStream outputStream35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("", outputStream35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder17.addRecurringSavings("", 10, (int) (byte) 10, (int) '4', '#', (int) (byte) 0, (int) 'a', (int) ' ', true, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone56 = dateTimeZoneBuilder17.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder59 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder70 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (short) 0, (int) '#', (int) (byte) 10, 'a', (int) 'a', (int) (byte) 10, (int) (byte) 0, false, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder73 = dateTimeZoneBuilder70.setFixedSavings("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder81 = dateTimeZoneBuilder70.addCutover((int) '#', 'a', (-1), (int) (short) 10, (int) (short) 0, false, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder53);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder59);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder70);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder73);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder47.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder47.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone54 = dateTimeZoneBuilder47.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass55 = dateTimeZoneBuilder47.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder47.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder47.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder51.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder51.setFixedSavings("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder54);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (short) 10, 0, (int) (byte) 1, '4', (int) ' ', (int) (byte) 10, 100, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder23.addCutover(0, 'a', (int) (byte) 1, (int) (byte) 1, (int) (short) 1, false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) '#');
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("", outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder25.addRecurringSavings("", (int) (byte) 1, (int) (byte) 1, (int) 'a', '#', (int) (byte) 0, (int) 'a', (int) (byte) -1, true, (int) (short) 100);
        java.io.OutputStream outputStream44 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder42.writeTo("", outputStream44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder10.addRecurringSavings("", (-1), (-1), (int) (byte) 0, ' ', (int) '4', (int) (short) 0, (-1), true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder10.addRecurringSavings("", (int) '4', (int) (short) 0, (int) (short) 1, ' ', (int) '#', (int) (byte) 0, (int) (short) -1, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder35.setStandardOffset((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeZoneBuilder37.toDateTimeZone("", true);
        java.io.OutputStream outputStream42 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder37.writeTo("", outputStream42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset(1);
        java.io.DataOutput dataOutput29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("", dataOutput29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', 0, (int) (byte) -1, ' ', 0, (int) (byte) 100, (int) (short) 10, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeZoneBuilder34.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 1, 0, (int) (short) 10, 'a', (int) (short) 1, 0, (int) '#', false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) 'a', '#', (int) (short) 10, (int) (short) 10, (int) 'a', true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder33.addRecurringSavings("", (int) (byte) 10, (int) (byte) 0, (int) '#', '4', 10, (int) (short) 0, (int) (short) 100, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder47.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTimeZoneBuilder47.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
        org.junit.Assert.assertNotNull(dateTimeZone53);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.addCutover(1, '4', 0, (int) (byte) 1, (int) (byte) 1, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder8.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder8.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder16.setFixedSavings("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder27.addRecurringSavings("hi!", (int) '#', (int) (byte) 0, (int) ' ', ' ', (-1), (int) (byte) 100, (int) (short) -1, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder4.addRecurringSavings("", (int) (short) 10, (int) (short) 0, (int) (short) -1, '4', (int) (byte) 100, (int) 'a', 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder4.addRecurringSavings("hi!", (-1), 100, (int) 'a', 'a', 0, (int) (short) 10, (int) (short) 0, true, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder4.addRecurringSavings("hi!", (int) (short) 0, 1, 0, 'a', (int) (short) 0, (int) 'a', (int) (byte) -1, false, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder40.setFixedSavings("", (int) '4');
        java.io.DataOutput dataOutput45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder40.writeTo("hi!", dataOutput45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = dateTimeZoneBuilder20.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder16.addRecurringSavings("hi!", (int) '#', (int) (byte) 10, (-1), '#', 0, (-1), (int) (short) 1, true, (int) (byte) 10);
        java.io.DataOutput dataOutput31 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder29.writeTo("hi!", dataOutput31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder5.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder5.addRecurringSavings("hi!", (int) ' ', (int) (byte) 100, 10, 'a', (int) 'a', (int) '4', (int) (short) -1, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder27.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder27.setFixedSavings("", (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 1, (int) '4', (int) '#', '4', 10, (int) (byte) 10, 10, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("", 0, (-1), (int) (byte) 10, 'a', (int) (short) 10, (int) '#', (int) (short) 1, true, 0);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder25.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder25.addCutover((int) (short) 1, '#', (int) (byte) 1, (int) (short) 0, 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder47.setFixedSavings("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder10.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder10.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder10.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder10.setStandardOffset((int) (short) -1);
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("", outputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder20.addCutover(1, '#', (int) (byte) -1, (int) (short) -1, (int) 'a', true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeZoneBuilder12.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder35.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder35.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder35.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder43.addRecurringSavings("hi!", (int) ' ', (int) '#', (int) ' ', '#', (int) 'a', (int) ' ', (int) (short) 0, true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder56 = dateTimeZoneBuilder54.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder54.setStandardOffset(0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder54);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder56);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("", outputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder19.addRecurringSavings("", (-1), (int) ' ', 10, ' ', (int) (byte) 10, 100, 0, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder19.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone51 = dateTimeZoneBuilder19.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder62 = dateTimeZoneBuilder19.addRecurringSavings("", (int) '#', (-1), (int) '#', '4', (int) (short) 1, (int) '4', (int) (byte) -1, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder64 = dateTimeZoneBuilder19.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder75 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (short) -1, (int) (short) 1, 0, 'a', (int) (byte) -1, (int) (byte) -1, (int) '#', false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder86 = dateTimeZoneBuilder75.addRecurringSavings("", 10, (int) ' ', 0, 'a', 1, 1, 10, true, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder48);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder62);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder64);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder75);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder86);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder8.writeTo("hi!", outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) 10, (int) ' ', (int) (byte) 0, ' ', (int) (byte) 1, (-1), (int) (short) 1, true, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder31.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset((int) (short) 0);
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder36.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder22.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder22.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder40.setFixedSavings("", (int) (byte) 100);
        java.io.DataOutput dataOutput45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder43.writeTo("", dataOutput45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass42 = dateTimeZone41.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder42.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder42.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder49.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder51.setFixedSavings("", (int) 'a');
        java.io.OutputStream outputStream56 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder54.writeTo("hi!", outputStream56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder54);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder25.addRecurringSavings("", (int) (byte) 1, (int) (byte) 1, (int) 'a', '#', (int) (byte) 0, (int) 'a', (int) (byte) -1, true, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTimeZoneBuilder42.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTimeZoneBuilder42.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTimeZone48);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder20.addRecurringSavings("", (int) (byte) 10, (int) (short) 10, (-1), 'a', (int) '4', (int) '#', 100, false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder34.addRecurringSavings("", (int) (byte) -1, (int) (short) 10, (int) '#', ' ', (int) (byte) 10, (int) (byte) 0, (int) (byte) 1, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder45.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder47.addRecurringSavings("", (-1), (int) (short) -1, (int) (byte) -1, '#', (int) '#', 10, (int) (short) 100, false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder58.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder68 = dateTimeZoneBuilder58.addCutover(0, 'a', (int) (byte) 100, (int) (short) 100, 10, false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", 100, (int) (byte) 10, (int) (byte) -1, ' ', (int) (byte) 100, (int) (short) 100, (-1), false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) (short) 10, (int) '4', (int) (short) 10, '4', (int) (byte) 1, 0, 10, false, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (byte) 10, (int) 'a', (int) (byte) 1, '4', 0, (int) '#', (-1), false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder66 = dateTimeZoneBuilder55.addRecurringSavings("", (int) (short) 1, 0, 0, 'a', (int) (byte) 10, 1, (int) (byte) -1, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder69 = dateTimeZoneBuilder55.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder71 = dateTimeZoneBuilder55.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone74 = dateTimeZoneBuilder55.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder66);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder69);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder71);
        org.junit.Assert.assertNotNull(dateTimeZone74);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder22.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder22.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder22.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTimeZoneBuilder42.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZone45);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.addCutover((int) (byte) 0, '4', 0, (int) (short) 1, 1, false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addCutover(0, 'a', (int) (byte) 100, (int) (byte) 0, (int) (short) 1, false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder4.addRecurringSavings("", (int) (short) 10, (int) (short) 0, (int) (short) -1, '4', (int) (byte) 100, (int) 'a', 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder4.addRecurringSavings("hi!", (-1), 100, (int) 'a', 'a', 0, (int) (short) 10, (int) (short) 0, true, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder4.addRecurringSavings("", 0, (int) '#', (int) (short) 1, ' ', (int) (short) -1, (int) (short) 10, 0, true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder40.addRecurringSavings("hi!", 1, (int) '#', 10, ' ', 1, 0, 0, true, 10);
        java.io.DataOutput dataOutput53 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder51.writeTo("hi!", dataOutput53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("hi!", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder26.setStandardOffset((int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder24.addRecurringSavings("", (int) (byte) 100, (int) (byte) 10, (int) 'a', '#', (int) (short) -1, 1, (int) (short) 100, false, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder35.addCutover((int) (byte) -1, 'a', 1, (int) '4', 1, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (byte) 0, (int) (short) 1, 100, 'a', 0, (int) 'a', (int) (byte) 0, true, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder0.setFixedSavings("", (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 100, 0, (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (byte) 10, false, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeZoneBuilder19.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder19.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder50.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone55 = dateTimeZoneBuilder50.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZone55);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 0, (int) '#', (int) (byte) 0, '4', (int) (byte) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder30.addRecurringSavings("hi!", (int) (byte) 10, (int) '4', 0, 'a', 10, 100, (int) (byte) 0, false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder41.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder41.setFixedSavings("", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder47.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder47.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder62 = dateTimeZoneBuilder47.addRecurringSavings("", 1, (int) '#', 0, 'a', (int) ' ', (int) (short) 0, (int) (short) 10, false, (-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder62);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("", outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder17.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder17.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (byte) 1, (int) (byte) -1, 0, '4', (int) ' ', (int) ' ', (int) (byte) 100, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 1, (-1), (int) (byte) 100, ' ', (int) '4', (int) (byte) 10, 100, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder35.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder35.addCutover((-1), '4', (-1), (int) (byte) 1, (int) (short) 10, false, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder8.setFixedSavings("hi!", (int) '#');
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder8.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder8.setFixedSavings("hi!", 0);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder8.writeTo("hi!", outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (short) -1, (int) (byte) 1, (-1), 'a', (int) (byte) 1, (int) (short) 0, 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass48 = dateTimeZoneBuilder19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder47.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder49.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder51.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder65 = dateTimeZoneBuilder54.addRecurringSavings("hi!", (int) '#', 1, (int) (short) -1, '4', (int) ' ', (int) (short) -1, 0, true, (int) '#');
        java.lang.Class<?> wildcardClass66 = dateTimeZoneBuilder65.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder54);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder33.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder33.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder33.setFixedSavings("", 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addRecurringSavings("hi!", 100, 100, (int) 'a', ' ', (int) (byte) 0, (int) (byte) 100, (int) (byte) -1, false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder11.addRecurringSavings("", (int) (byte) -1, (int) (short) 0, (int) (byte) 1, '#', (int) (byte) 1, (int) '4', (int) 'a', true, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder33.setFixedSavings("", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder33.setFixedSavings("hi!", 0);
        java.io.OutputStream outputStream44 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder42.writeTo("hi!", outputStream44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) '4', (int) (short) 100, 10, 'a', (int) (byte) 100, (int) (byte) 10, (int) '#', true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder7.setStandardOffset((int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder8.addCutover(100, ' ', (int) (byte) 100, (-1), (int) (byte) 10, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", (int) 'a', (int) '#', (int) (short) -1, '4', (int) (byte) -1, (int) ' ', 1, true, (int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder2.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (short) -1);
        java.io.DataOutput dataOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder8.writeTo("hi!", dataOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (byte) 100, (int) '#', (int) (short) 100, '#', (int) (byte) 1, (int) (byte) 1, (int) ' ', true, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.setFixedSavings("hi!", 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = dateTimeZoneBuilder7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (short) 0, (int) ' ', (int) (short) 1, ' ', (int) ' ', (int) ' ', (int) (short) 100, false, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder55.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder55.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder71 = dateTimeZoneBuilder60.addRecurringSavings("hi!", (int) '4', 100, (int) (byte) 10, 'a', (int) (short) 1, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder74 = dateTimeZoneBuilder71.setFixedSavings("hi!", (int) (short) 100);
        java.io.OutputStream outputStream76 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder71.writeTo("", outputStream76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder71);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder74);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 100, (int) (short) 100, (int) (byte) -1, 'a', (int) (short) -1, 100, (int) (byte) 1, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.addRecurringSavings("hi!", 0, (int) (short) 1, (int) (short) 0, ' ', (int) (byte) 1, (int) (byte) 10, (int) ' ', true, (int) (short) -1);
        java.lang.Class<?> wildcardClass36 = dateTimeZoneBuilder35.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.setFixedSavings("", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder5.addCutover((int) (short) 100, '#', (int) (short) 10, (int) (short) 1, (int) (byte) 0, false, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) 'a', (int) (short) 1, (int) 'a', '4', (int) ' ', (int) (short) 100, (int) ' ', true, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder22.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder39.setFixedSavings("hi!", (-1));
        java.io.DataOutput dataOutput44 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder39.writeTo("hi!", dataOutput44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 100, (int) (short) 100, (int) (byte) -1, 'a', (int) (short) -1, 100, (int) (byte) 1, false, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder18.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder18.addRecurringSavings("hi!", (int) (short) 1, (int) (short) 1, (int) '4', 'a', (int) (short) 1, (int) (short) 10, 0, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder35.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder35.setStandardOffset((int) (byte) -1);
        java.io.OutputStream outputStream42 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("", outputStream42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder36.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder36.addRecurringSavings("", (int) (short) 0, (int) (byte) 10, (int) (short) 0, ' ', (int) (byte) -1, (int) (byte) 1, (int) (byte) 0, false, 0);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTimeZoneBuilder36.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder36.setStandardOffset((int) (byte) 10);
        java.io.OutputStream outputStream57 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder55.writeTo("hi!", outputStream57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder20.addCutover((int) (byte) 0, '#', 1, 0, (int) (byte) 10, true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 100, (int) 'a', (int) (short) 1, '#', (int) (short) 100, (int) (short) 0, (int) (short) 10, true, (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder5.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder5.addRecurringSavings("hi!", (int) ' ', (int) (byte) 100, 10, 'a', (int) 'a', (int) '4', (int) (short) -1, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder27.setFixedSavings("", 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder30.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder30.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder30.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream41 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder30.writeTo("hi!", outputStream41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder14.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder27.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder20.addRecurringSavings("", (int) (byte) 10, (int) (short) 10, (-1), 'a', (int) '4', (int) '#', 100, false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder34.addRecurringSavings("", (int) (byte) -1, (int) (short) 10, (int) '#', ' ', (int) (byte) 10, (int) (byte) 0, (int) (byte) 1, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder45.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder45.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder45.addCutover(0, 'a', (int) '4', (int) (short) 1, (int) (byte) -1, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder0.setFixedSavings("", (-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder0.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder32.addCutover((int) (short) 0, 'a', (int) (short) -1, (int) (byte) 0, 0, false, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder6.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder21.addRecurringSavings("", 10, (int) (byte) -1, 0, ' ', (int) (byte) 1, (int) (short) 10, (int) (byte) 100, true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder21.setStandardOffset((int) (short) 0);
        java.lang.Class<?> wildcardClass35 = dateTimeZoneBuilder34.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", 100, (int) (byte) 10, (int) (byte) -1, ' ', (int) (byte) 100, (int) (short) 100, (-1), false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) (short) 10, (int) '4', (int) (short) 10, '4', (int) (byte) 1, 0, 10, false, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (byte) 10, (int) 'a', (int) (byte) 1, '4', 0, (int) '#', (-1), false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder66 = dateTimeZoneBuilder55.addRecurringSavings("", (int) (short) 1, 0, 0, 'a', (int) (byte) 10, 1, (int) (byte) -1, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder69 = dateTimeZoneBuilder55.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder71 = dateTimeZoneBuilder55.setStandardOffset(0);
        java.io.OutputStream outputStream73 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder55.writeTo("", outputStream73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder66);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder69);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder71);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("", 0, (int) (byte) 1, (int) (byte) 100, '#', (int) ' ', (int) (short) 10, (int) (short) 10, false, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder20.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass26 = dateTimeZone25.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) 1, (int) (short) 1, (int) (short) 1, 'a', 10, 1, (int) (short) 1, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) '#', (int) '4', (int) (short) 0, '4', (int) (short) -1, (-1), (int) (byte) -1, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (short) 0, (int) 'a', (int) (short) 1, 'a', (int) (short) -1, (int) '#', 100, true, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder59 = dateTimeZoneBuilder57.setStandardOffset((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone62 = dateTimeZoneBuilder57.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder59);
        org.junit.Assert.assertNotNull(dateTimeZone62);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder12.addCutover((int) '4', ' ', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, false, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder4.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder4.addRecurringSavings("", (int) (short) 1, (int) (short) -1, (int) (short) 10, ' ', (int) '#', (int) (byte) 10, (int) '4', true, (int) (short) 1);
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("hi!", outputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder14.setStandardOffset((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder14.addCutover((int) (short) -1, '#', (-1), (int) (byte) 10, 0, false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder17.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", 10, (int) (byte) -1, (int) 'a', ' ', (int) (byte) 10, (int) '#', (int) (short) -1, false, (int) '4');
        java.io.DataOutput dataOutput49 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder36.writeTo("hi!", dataOutput49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) '#', 0, (int) (short) -1, '#', (int) (short) 100, (int) (byte) 10, 100, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) (short) 1, (int) (short) 100, (int) (short) -1, ' ', (int) (short) 100, 0, (int) (byte) 0, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder39.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder41.setStandardOffset((int) (byte) 100);
        java.io.OutputStream outputStream45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder43.writeTo("hi!", outputStream45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 100, (int) '4', (int) (short) 0, '#', (int) ' ', (int) (byte) 0, 100, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder0.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder36.setFixedSavings("", 0);
        java.lang.Class<?> wildcardClass40 = dateTimeZoneBuilder39.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 100, (int) '4', (int) (short) 0, '#', (int) ' ', (int) (byte) 0, 100, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        java.io.DataOutput dataOutput37 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (short) -1, (int) (byte) 1, (-1), 'a', (int) (byte) 1, (int) (short) 0, 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder19.setStandardOffset(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder46.addCutover((int) ' ', '#', 1, (int) (byte) 10, (int) (short) 10, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.setStandardOffset(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.addCutover((int) (short) -1, '4', (int) (byte) -1, (int) (short) 0, (int) (short) 100, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder25.setStandardOffset((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder25.addCutover((int) (short) 1, '#', (int) (byte) 0, (int) '#', (int) (byte) 0, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) 1, (int) (short) 1, (int) (short) 1, 'a', 10, 1, (int) (short) 1, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) '#', (int) '4', (int) (short) 0, '4', (int) (short) -1, (-1), (int) (byte) -1, false, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeZoneBuilder46.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder46.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder51.setFixedSavings("hi!", 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder54);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (byte) 10, (int) (short) -1, 0, '4', (int) (byte) 100, (-1), (int) (byte) 0, false, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeZoneBuilder29.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.addRecurringSavings("", (int) 'a', (int) (short) 0, (int) '#', '#', (int) ' ', 100, (int) ' ', true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder16.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder16.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.addRecurringSavings("", 0, 100, 100, 'a', (int) (short) 1, (-1), (int) (short) 10, false, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("", 1);
        java.io.OutputStream outputStream28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("", outputStream28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", 100, (int) (byte) 10, (int) (byte) -1, ' ', (int) (byte) 100, (int) (short) 100, (-1), false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) (short) 10, (int) '4', (int) (short) 10, '4', (int) (byte) 1, 0, 10, false, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder44.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder49.addRecurringSavings("hi!", (int) (byte) 0, (int) (short) 10, (int) (byte) 0, '4', 10, (int) (short) -1, (int) (byte) 0, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder62 = dateTimeZoneBuilder60.setStandardOffset((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder70 = dateTimeZoneBuilder62.addCutover((int) '4', '4', (int) (byte) 10, (int) (short) -1, (int) (byte) 100, true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder62);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder26.setFixedSavings("", 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder20.addCutover((int) (byte) 10, ' ', (int) (short) 0, (int) '4', (int) ' ', false, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder22.addRecurringSavings("", 0, (int) (short) -1, 0, ' ', (int) 'a', (int) (byte) 100, 10, true, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone50 = dateTimeZoneBuilder47.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream52 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder47.writeTo("hi!", outputStream52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder19.addRecurringSavings("", 0, 100, (int) ' ', 'a', (int) 'a', 10, (int) (short) -1, false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder35.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder37.setStandardOffset((int) (short) -1);
        java.io.OutputStream outputStream41 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder37.writeTo("hi!", outputStream41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder47.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder49.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder49.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder49.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone61 = dateTimeZoneBuilder58.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
        org.junit.Assert.assertNotNull(dateTimeZone61);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 100, (int) '4', (int) (short) 0, '#', (int) ' ', (int) (byte) 0, 100, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder36.setFixedSavings("hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder39.addCutover((int) (byte) 0, '#', 100, (int) (short) 0, (-1), true, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (byte) -1, (int) (byte) 100, (int) (byte) 0, 'a', 10, 0, (int) 'a', false, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder9.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", outputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder24.addCutover(10, '#', (-1), 0, (int) '4', false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder14.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) 1, (int) (short) 100, (int) (short) 0, 'a', 100, (int) (byte) -1, (int) (short) 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.setFixedSavings("", (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder14.setFixedSavings("hi!", 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 100, (int) (short) 10, (int) (short) 100, ' ', (int) '#', 1, (int) (short) -1, false, (int) (short) 100);
        java.lang.Class<?> wildcardClass31 = dateTimeZoneBuilder30.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder11.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder11.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder11.addCutover((int) (short) -1, 'a', (int) (short) -1, (int) (byte) 10, (int) (short) 1, true, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder31.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder34.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder34.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder38.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder17.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder21.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder26.addRecurringSavings("", (int) (short) 0, (int) (byte) 1, 1, ' ', (int) ' ', 10, (-1), true, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder37.addRecurringSavings("", (int) '4', 1, 1, 'a', (int) (short) -1, (int) (byte) 100, (int) (byte) 1, true, (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder48);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("", 0, (int) (byte) 1, (int) (byte) 100, '#', (int) ' ', (int) (short) 10, (int) (short) 10, false, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder20.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder20.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder27.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '#', (int) 'a', (int) (short) 1, 'a', (int) (short) -1, (int) (short) -1, (int) ' ', false, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.addRecurringSavings("", 0, (int) (byte) -1, (int) '4', 'a', (int) (byte) 10, (int) '4', (-1), false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("hi!", (int) '#', (int) 'a', 10, '4', (int) (byte) 10, (int) (short) 1, (-1), false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder33.addRecurringSavings("hi!", 10, (int) '4', (int) (short) 0, '#', (int) ' ', (int) (byte) 0, 1, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder33.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone61 = dateTimeZoneBuilder33.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
        org.junit.Assert.assertNotNull(dateTimeZone61);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) 'a', (int) (short) 0, 1, '#', 1, (int) (byte) 100, 1, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder22.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder16.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder16.addRecurringSavings("", 0, 10, (int) ' ', '4', (int) (byte) 100, 1, (int) (short) 10, true, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder30.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeZoneBuilder32.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder32.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder32.setFixedSavings("", 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder40.setFixedSavings("", 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder31.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder31.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder37.setStandardOffset((int) (byte) 100);
        java.lang.Class<?> wildcardClass40 = dateTimeZoneBuilder37.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder35.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder35.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder35.setStandardOffset((int) (byte) 10);
        java.io.DataOutput dataOutput45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder43.writeTo("hi!", dataOutput45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.addRecurringSavings("", (int) (byte) 100, (int) (byte) 1, (int) (byte) 100, '4', 100, (int) (byte) 100, (int) (byte) 10, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) 'a', 0, (int) (byte) -1, '#', (int) ' ', 1, (int) ' ', true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder36.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (byte) 10, (int) (short) -1, 0, '4', (int) (byte) 100, (-1), (int) (byte) 0, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder29.setStandardOffset((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset((int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder9.addRecurringSavings("", 100, (int) ' ', (int) '4', '4', (int) (short) 100, (int) (byte) -1, 100, true, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("hi!", (int) '4');
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder23.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass30 = dateTimeZone29.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder27.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addRecurringSavings("hi!", 100, 100, (int) 'a', ' ', (int) (byte) 0, (int) (byte) 100, (int) (byte) -1, false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("", (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder25.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (short) 100, (int) (byte) -1, 0, '#', (int) (short) 0, 0, (int) 'a', false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder3.setFixedSavings("", (int) (byte) 10);
        java.lang.Class<?> wildcardClass39 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", 100, (int) (byte) 10, (int) (byte) -1, ' ', (int) (byte) 100, (int) (short) 100, (-1), false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) (short) 10, (int) '4', (int) (short) 10, '4', (int) (byte) 1, 0, 10, false, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder44.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder49.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder52.setStandardOffset((int) (byte) 1);
        java.io.DataOutput dataOutput56 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder54.writeTo("", dataOutput56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder54);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        java.io.DataOutput dataOutput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder13.writeTo("hi!", dataOutput18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 1, (int) ' ', (int) (byte) 100, 'a', 0, (int) (byte) -1, 1, false, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder22.addCutover((int) ' ', '#', 0, (int) (byte) 1, 1, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder5.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder5.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder5.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder5.addCutover((int) (short) 100, '#', (int) (byte) -1, 0, (int) (short) 0, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (byte) 10, (int) (short) -1, 0, '4', (int) (byte) 100, (-1), (int) (byte) 0, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder29.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder29.addRecurringSavings("hi!", (int) '#', (int) (byte) 1, (-1), 'a', (int) (short) 10, (int) (short) 100, 10, false, (int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder9.addRecurringSavings("", (int) '4', (int) (short) 100, (int) (short) 0, ' ', 1, (int) (byte) 0, (int) (byte) -1, true, (int) 'a');
        java.io.DataOutput dataOutput35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("", dataOutput35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (byte) 1, (int) (byte) -1, 0, '4', (int) ' ', (int) ' ', (int) (byte) 100, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 1, (-1), (int) (byte) 100, ' ', (int) '4', (int) (byte) 10, 100, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder22.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder22.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder22.setStandardOffset((int) (short) 1);
        java.io.DataOutput dataOutput46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("", dataOutput46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder6.addRecurringSavings("", (int) (byte) 100, 100, (int) (short) 1, 'a', (int) (short) 0, 0, 1, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder6.setStandardOffset((int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder20.addRecurringSavings("", (int) (byte) 10, (int) (short) 10, (-1), 'a', (int) '4', (int) '#', 100, false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder34.addRecurringSavings("", (int) (byte) -1, (int) (short) 10, (int) '#', ' ', (int) (byte) 10, (int) (byte) 0, (int) (byte) 1, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder45.setStandardOffset((int) ' ');
        java.lang.Class<?> wildcardClass48 = dateTimeZoneBuilder47.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 1, 0, (int) (short) 10, 'a', (int) (short) 1, 0, (int) '#', false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) 'a', '#', (int) (short) 10, (int) (short) 10, (int) 'a', true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder33.addRecurringSavings("", (int) (byte) 10, (int) (byte) 0, (int) '#', '4', 10, (int) (short) 0, (int) (short) 100, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder47.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder50.setStandardOffset(10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 100, 0, (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (byte) 10, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder19.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder46.addRecurringSavings("", (int) ' ', 0, 10, '4', (int) (byte) 100, (int) (byte) 1, (-1), true, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder46.setFixedSavings("", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder68 = dateTimeZoneBuilder46.addCutover(100, '4', (int) (byte) 1, (int) (byte) 1, (int) (short) -1, true, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setFixedSavings("", 1);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeZoneBuilder3.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 0, (int) '#', (int) (byte) 0, '4', (int) (byte) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder30.addRecurringSavings("hi!", (int) (byte) 10, (int) '4', 0, 'a', 10, 100, (int) (byte) 0, false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder41.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder41.setFixedSavings("", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder47.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder47.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder62 = dateTimeZoneBuilder51.addRecurringSavings("hi!", (int) (byte) 1, (int) (byte) 100, (int) (short) 0, ' ', (int) (byte) 0, (int) (byte) 10, 0, false, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone65 = dateTimeZoneBuilder51.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder62);
        org.junit.Assert.assertNotNull(dateTimeZone65);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset((int) 'a');
        java.lang.Class<?> wildcardClass24 = dateTimeZoneBuilder21.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) (short) 0, (int) (byte) 1, (int) (short) 0, '#', (int) (short) -1, 0, 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder20.addRecurringSavings("hi!", (int) ' ', (int) (short) 10, (int) 'a', '#', (int) '#', (int) (byte) 1, (int) (byte) -1, true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 100, (int) ' ', (int) (byte) 0, '#', 100, (int) (byte) 100, 0, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.setFixedSavings("", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder31.addCutover((int) (short) 10, '#', (int) (byte) 100, (int) (short) 1, (-1), true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 100, 0, (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (byte) 10, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) (short) 100, 'a', (int) (short) -1, (int) 'a', 10, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder44.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder44.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder63 = dateTimeZoneBuilder60.setFixedSavings("hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder63);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder27.setStandardOffset((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder29.addCutover((int) (short) 0, '4', (-1), (-1), (int) (byte) 1, false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (short) -1, (int) ' ', (int) (short) 100, 'a', (int) '4', (int) (byte) 1, (int) (short) 10, false, (int) (short) 10);
        java.io.DataOutput dataOutput38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder36.writeTo("hi!", dataOutput38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("", (-1), (int) 'a', (int) (short) 10, 'a', (int) ' ', (int) (short) 0, (int) (byte) 10, true, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder19.setFixedSavings("", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", (-1), (int) (short) 10, 0, 'a', (int) (short) -1, (int) '4', (int) (byte) 0, false, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTimeZoneBuilder47.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass51 = dateTimeZone50.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 100, 0, (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (byte) 10, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (byte) 0, (int) (short) 100, 0, ' ', (int) (byte) 100, 0, (int) '4', false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder44.setStandardOffset((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder65 = dateTimeZoneBuilder57.addCutover((int) (byte) -1, '4', 10, 0, 1, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("", 0, (int) (byte) 1, (int) (byte) 100, '#', (int) ' ', (int) (short) 10, (int) (short) 10, false, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder9.addCutover(1, ' ', (int) (short) 1, (int) '4', (int) (byte) 0, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder44.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder44.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder62 = dateTimeZoneBuilder51.addRecurringSavings("", (int) (byte) -1, (int) (byte) 0, (int) ' ', '#', 0, (int) (byte) 0, (int) (short) 100, false, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder70 = dateTimeZoneBuilder51.addCutover((-1), 'a', (int) (short) 0, (int) (short) 0, (int) (short) -1, false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder62);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder19.setFixedSavings("", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", (-1), (int) (short) 10, 0, 'a', (int) (short) -1, (int) '4', (int) (byte) 0, false, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTimeZoneBuilder47.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder47.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder63 = dateTimeZoneBuilder52.addRecurringSavings("hi!", (int) (short) 0, 10, (int) '#', ' ', 100, (int) '#', 0, true, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder14.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder16.addRecurringSavings("hi!", 0, (int) (byte) 10, (int) (byte) -1, ' ', 100, (int) (byte) 100, (int) (short) 1, true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder27.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder27.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder27.setFixedSavings("", (int) (byte) 1);
        java.lang.Class<?> wildcardClass36 = dateTimeZoneBuilder35.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder19.setFixedSavings("", 10);
        java.io.OutputStream outputStream43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("", outputStream43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder20.addCutover((int) (short) 0, ' ', (int) 'a', (int) (byte) 100, 0, true, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder10.addCutover(10, '#', (int) (short) 10, (int) (short) 100, (int) '#', false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', 10, '4', 100, (int) (byte) 0, (int) (byte) 100, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder18.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder21.addRecurringSavings("hi!", 100, 10, (int) (byte) 1, '#', 10, (int) (short) 10, (int) (short) 0, true, (int) (byte) 100);
        java.io.DataOutput dataOutput34 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder32.writeTo("hi!", dataOutput34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder5.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        java.io.OutputStream outputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", outputStream30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder5.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder5.addRecurringSavings("hi!", (int) ' ', (int) (byte) 100, 10, 'a', (int) 'a', (int) '4', (int) (short) -1, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder27.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder27.setFixedSavings("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (byte) 100, (int) '4', (int) (short) -1, 'a', (int) (short) 0, 0, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder17.setFixedSavings("hi!", (-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder7.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) ' ', (int) ' ', 0, 'a', 100, 1, 0, true, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder21.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder47.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder47.setStandardOffset((int) (short) 10);
        java.io.DataOutput dataOutput53 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder47.writeTo("", dataOutput53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("", 0, (int) (byte) 1, (int) (byte) 100, '#', (int) ' ', (int) (short) 10, (int) (short) 10, false, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder9.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder9.setStandardOffset((int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder47.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder49.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder49.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder66 = dateTimeZoneBuilder55.addRecurringSavings("", (-1), (int) (short) 100, (int) ' ', '#', (int) '#', (int) (short) 1, (int) (short) 0, false, (int) (byte) 0);
        java.lang.Class<?> wildcardClass67 = dateTimeZoneBuilder66.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) (short) -1);
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("", dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder5.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder5.addRecurringSavings("hi!", (int) ' ', (int) (byte) 100, 10, 'a', (int) 'a', (int) '4', (int) (short) -1, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder27.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass31 = dateTimeZoneBuilder27.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) 10, (int) ' ', (int) (byte) 0, ' ', (int) (byte) 1, (-1), (int) (short) 1, true, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder31.setFixedSavings("", (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder14.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) 1, (int) (short) 100, (int) (short) 0, 'a', 100, (int) (byte) -1, (int) (short) 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) 100, (int) (short) 100, (-1), ' ', (int) (byte) 100, (-1), (int) (short) 10, true, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder24.addRecurringSavings("hi!", 100, 0, 1, 'a', 10, (int) '4', 1, false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", 100, (int) (byte) 10, (int) (byte) -1, ' ', (int) (byte) 100, (int) (short) 100, (-1), false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) (short) 10, (int) '4', (int) (short) 10, '4', (int) (byte) 1, 0, 10, false, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder44.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder49.addRecurringSavings("hi!", (int) (byte) 0, (int) (short) 10, (int) (byte) 0, '4', 10, (int) (short) -1, (int) (byte) 0, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder62 = dateTimeZoneBuilder49.setStandardOffset((int) (short) 10);
        java.lang.Class<?> wildcardClass63 = dateTimeZoneBuilder62.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder27.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass31 = dateTimeZone30.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) -1, (-1), (-1), '#', (-1), (int) '4', (int) (byte) 1, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (short) 1, (int) 'a', (int) '#', '4', (int) (short) 0, (int) (short) 10, (int) (byte) 0, false, (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder22.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder22.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder22.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder22.setFixedSavings("", (int) '#');
        java.io.DataOutput dataOutput47 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder45.writeTo("", dataOutput47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.addRecurringSavings("", 0, 100, 100, 'a', (int) (short) 1, (-1), (int) (short) 10, false, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder20.setFixedSavings("", (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder12.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder12.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder12.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder12.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.addRecurringSavings("", (int) (byte) 100, (int) (byte) 1, (int) (byte) 100, '4', 100, (int) (byte) 100, (int) (byte) 10, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) -1, (int) '#', (int) (byte) -1, ' ', (int) (byte) -1, (int) (short) 100, 0, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder22.addRecurringSavings("", 1, (int) '#', (-1), '4', 10, 100, (int) (byte) -1, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder44.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeZoneBuilder44.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder44.addRecurringSavings("hi!", 0, 1, (int) (byte) 0, ' ', 0, (int) (short) 100, (int) '4', true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder63 = dateTimeZoneBuilder44.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder66 = dateTimeZoneBuilder44.setFixedSavings("", 1);
        org.joda.time.DateTimeZone dateTimeZone69 = dateTimeZoneBuilder44.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder63);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder66);
        org.junit.Assert.assertNotNull(dateTimeZone69);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder17.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (byte) 1, (int) (short) 10, 0, 'a', (int) '#', (int) 'a', (int) (byte) 100, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("hi!", 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) '#', 0, (int) (short) -1, '#', (int) (short) 100, (int) (byte) 10, 100, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) (short) 1, (int) (short) 100, (int) (short) -1, ' ', (int) (short) 100, 0, (int) (byte) 0, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', 10, '4', 100, (int) (byte) 0, (int) (byte) 100, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder18.addRecurringSavings("", (int) (short) 10, (int) '4', (int) (byte) 0, '#', (int) (byte) 1, (-1), (int) (byte) 10, true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder18.setFixedSavings("", (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (short) -1, true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder28.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder31.addRecurringSavings("", (int) (byte) 100, (int) (short) 10, 1, '#', (int) (short) -1, (int) (byte) -1, (-1), true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder42.setFixedSavings("", (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder33.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder33.setStandardOffset(1);
        java.io.OutputStream outputStream41 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder39.writeTo("", outputStream41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addRecurringSavings("hi!", 100, 100, (int) 'a', ' ', (int) (byte) 0, (int) (byte) 100, (int) (byte) -1, false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder11.addRecurringSavings("", (int) (byte) -1, (int) (short) 0, (int) (byte) 1, '#', (int) (byte) 1, (int) '4', (int) 'a', true, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder11.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder11.setStandardOffset(0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) 10, (int) ' ', (int) (byte) 0, ' ', (int) (byte) 1, (-1), (int) (short) 1, true, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder33.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", (int) (byte) 1, (int) '#', 0, 'a', (int) (byte) 0, (-1), (int) '#', true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder6.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder7.addRecurringSavings("", (int) 'a', (-1), (int) '#', ' ', (int) (byte) 1, (int) (byte) 0, (int) (byte) -1, false, (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) (byte) 0, '4', (int) (short) 10, (int) '#', (int) (short) 100, false, (-1));
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (short) -1, 10, (int) (byte) 1, 'a', (int) (byte) 100, (-1), (int) (short) 1, true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder19.setFixedSavings("", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder38.setFixedSavings("hi!", 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder21.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder26.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.addRecurringSavings("", 0, 1, (int) (byte) 100, ' ', (int) (byte) -1, 0, (int) (short) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset(0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) '4', (int) (byte) 100, (int) (short) 0, '4', (int) (short) 1, 10, (int) (short) -1, false, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        java.io.DataOutput dataOutput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("", dataOutput24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder22.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder22.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeZoneBuilder40.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder40.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder46.setFixedSavings("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder6.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder28.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (short) 10, (-1), (int) (short) 10, '#', (int) (byte) 1, (int) (short) 10, (int) (short) 1, true, (int) (short) 0);
        java.lang.Class<?> wildcardClass34 = dateTimeZoneBuilder19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder47.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder49.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder49.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder49.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder59 = dateTimeZoneBuilder49.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder70 = dateTimeZoneBuilder49.addRecurringSavings("hi!", (int) (short) 1, (int) '4', 0, '4', (int) '#', (int) '4', (int) (byte) 10, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder81 = dateTimeZoneBuilder70.addRecurringSavings("hi!", (int) 'a', 10, 0, '4', (int) (short) 0, 0, 0, true, 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder59);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder70);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder81);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 100, (int) (short) 100, (int) (byte) -1, 'a', (int) (short) -1, 100, (int) (byte) 1, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.addRecurringSavings("hi!", 0, (int) (short) 1, (int) (short) 0, ' ', (int) (byte) 1, (int) (byte) 10, (int) ' ', true, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", 0);
        java.io.DataOutput dataOutput40 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder38.writeTo("hi!", dataOutput40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("hi!", outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder33.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) '4');
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder16.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder23.addRecurringSavings("", (int) (short) 0, (int) (short) 1, 0, 'a', 10, (int) (short) 0, (int) (byte) 10, true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder23.addRecurringSavings("", 0, 10, 100, 'a', (int) (short) 1, (int) (byte) -1, (int) (byte) 100, false, 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) (short) 0, 100, (int) (short) -1, ' ', (-1), (int) ' ', 0, true, (int) '4');
        java.io.DataOutput dataOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", dataOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 0, (int) ' ', (int) (byte) 100, ' ', (int) 'a', (int) ' ', (int) (short) 1, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder22.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder22.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder22.setFixedSavings("hi!", (-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder10.addRecurringSavings("", (int) (byte) 10, (int) 'a', (int) (byte) 10, ' ', (int) (short) 10, (int) (byte) 1, (int) (short) 100, true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder21.setFixedSavings("", (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 100, (int) (short) 100, (int) (short) 10, ' ', (int) '4', (int) (byte) 100, (int) ' ', true, (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset(0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder4.addRecurringSavings("", (int) (short) 10, (int) (short) 0, (int) (short) -1, '4', (int) (byte) 100, (int) 'a', 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder4.addRecurringSavings("hi!", (-1), 100, (int) 'a', 'a', 0, (int) (short) 10, (int) (short) 0, true, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder4.addRecurringSavings("hi!", (int) (short) 0, 1, 0, 'a', (int) (short) 0, (int) 'a', (int) (byte) -1, false, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder40.addRecurringSavings("", (int) (short) 0, 0, (int) 'a', '#', (int) (short) 100, (-1), (int) (short) 10, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder62 = dateTimeZoneBuilder51.addRecurringSavings("", (int) (short) 10, 100, (int) 'a', 'a', (int) (short) 0, (int) ' ', (int) (byte) 10, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder65 = dateTimeZoneBuilder51.setFixedSavings("hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder62);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder65);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder19.addRecurringSavings("", (int) '#', (int) (byte) 0, (int) (short) 0, 'a', (int) (byte) 10, (int) (short) 10, (int) (byte) 10, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) 'a', (int) (short) 0, 1, '#', 1, (int) (byte) 100, 1, false, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("hi!", (int) (byte) 0, (int) (short) -1, (int) (short) -1, '4', (int) (short) 100, 100, (int) (byte) 100, false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder15.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder18.setStandardOffset((-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", (int) '4');
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder23.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder23.setFixedSavings("hi!", 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setFixedSavings("", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder8.addRecurringSavings("hi!", (int) (byte) 100, (int) ' ', (int) 'a', 'a', (int) (byte) 0, (int) (byte) 0, (int) (byte) 100, false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder44.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder44.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder62 = dateTimeZoneBuilder44.addRecurringSavings("", 0, (int) (short) 100, 0, ' ', (int) (short) 100, (int) (byte) 10, 10, true, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder70 = dateTimeZoneBuilder62.addCutover((int) (short) -1, '#', 0, (int) '#', (int) (short) 10, false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder62);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder9.addRecurringSavings("", (int) '4', 0, (int) (short) 0, '#', (int) (byte) -1, (int) (byte) 1, (int) (byte) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) '#');
        java.io.OutputStream outputStream28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("", outputStream28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) (byte) 0, '4', (int) (short) 10, (int) '#', (int) (short) 100, false, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder19.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder47.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeZoneBuilder49.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder49.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone57 = dateTimeZoneBuilder49.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder54);
        org.junit.Assert.assertNotNull(dateTimeZone57);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 100, (int) ' ', (int) (byte) 0, '#', 100, (int) (byte) 100, 0, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 10, 100, (int) ' ', 'a', 0, (int) (short) 1, (int) (short) 100, true, (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder13.addRecurringSavings("hi!", (int) (byte) 1, (int) 'a', (int) (byte) 1, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 10, false, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder13.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder13.toDateTimeZone("hi!", false);
        java.io.DataOutput dataOutput32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder13.writeTo("", dataOutput32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 100, (int) (byte) 1, 10, ' ', (int) '#', (-1), 0, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.setStandardOffset(10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder28.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder31.addRecurringSavings("", (int) (byte) -1, 10, (int) (short) 100, 'a', (int) (short) 0, (int) '#', 0, false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder31.setStandardOffset((int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", 100);
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("hi!", outputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder36.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder36.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder36.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder36.addRecurringSavings("", (int) (short) 0, (-1), (int) (byte) 1, 'a', (int) ' ', 10, (int) (byte) -1, false, 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (byte) 100, (int) '4', (int) (short) -1, 'a', (int) (short) 0, 0, (int) '#', true, 1);
        java.lang.Class<?> wildcardClass45 = dateTimeZoneBuilder44.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("", dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) (byte) 1, '4', 1, (int) (short) 1, (int) (short) 0, true, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder33.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (byte) 1, (int) (byte) -1, 0, '4', (int) ' ', (int) ' ', (int) (byte) 100, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder9.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder28.setFixedSavings("", (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder31.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder37.addRecurringSavings("", (int) 'a', 100, (int) '#', 'a', 1, 0, 0, false, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder48);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (short) 10, 100, 0, 'a', (int) (byte) 10, (int) '4', (int) (byte) 10, true, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.setFixedSavings("", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder5.addRecurringSavings("hi!", (int) (byte) -1, (int) (byte) 0, (int) (byte) 10, 'a', (int) (short) -1, (int) (short) 0, (int) (short) 0, false, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.addRecurringSavings("", 0, 0, 0, '4', (int) '4', 0, (int) (short) 100, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder3.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder31.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder14.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder16.addRecurringSavings("hi!", 0, (int) (byte) 10, (int) (byte) -1, ' ', 100, (int) (byte) 100, (int) (short) 1, true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder27.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder36.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder36.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder41.setStandardOffset(100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder16.addRecurringSavings("", 100, (int) (short) 1, 1, ' ', 10, 1, (int) (byte) 0, false, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder27.addCutover((-1), 'a', (int) '4', (int) (byte) -1, (int) (short) 100, false, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '#', (int) 'a', (int) (short) 1, 'a', (int) (short) -1, (int) (short) -1, (int) ' ', false, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.addRecurringSavings("", 0, (int) (byte) -1, (int) '4', 'a', (int) (byte) 10, (int) '4', (-1), false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder33.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder37.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder40.addRecurringSavings("", (int) (byte) 10, (int) '#', (int) '#', ' ', (int) (short) 10, (int) (short) -1, (int) (short) 10, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder51.setFixedSavings("", (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder54);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder3.setFixedSavings("", (-1));
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder23.writeTo("", outputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 1, 10, (-1), 'a', 0, (int) (short) 100, (int) (byte) 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.setFixedSavings("", 1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder30.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder42.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder47.setFixedSavings("hi!", (int) (byte) 100);
        java.io.OutputStream outputStream52 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder47.writeTo("hi!", outputStream52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder23.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder23.addRecurringSavings("", (int) (byte) 1, 100, 0, 'a', (int) '#', 100, (int) (byte) 100, false, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder23.setFixedSavings("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder22.addCutover((int) (byte) -1, ' ', (int) 'a', (int) 'a', (int) (short) 100, false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder30.setStandardOffset((int) (short) -1);
        java.lang.Class<?> wildcardClass33 = dateTimeZoneBuilder30.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (byte) 100, (int) '4', (int) (short) -1, 'a', (int) (short) 0, 0, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder17.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder46.addRecurringSavings("", (int) (byte) 100, 0, (int) ' ', 'a', (int) (byte) 100, (int) (byte) 0, 0, true, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone60 = dateTimeZoneBuilder46.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone63 = dateTimeZoneBuilder46.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass64 = dateTimeZone63.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", 100, (int) (byte) 10, (int) (byte) -1, ' ', (int) (byte) 100, (int) (short) 100, (-1), false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) (short) 10, (int) '4', (int) (short) 10, '4', (int) (byte) 1, 0, 10, false, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder44.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder49.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder52.setStandardOffset((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder65 = dateTimeZoneBuilder52.addRecurringSavings("hi!", (int) '#', (int) (short) -1, 100, 'a', (int) (short) 1, (int) (short) 1, (int) 'a', true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder54);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) (byte) 0, '4', (int) (short) 10, (int) '#', (int) (short) 100, false, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder11.setFixedSavings("hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = dateTimeZoneBuilder11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', 10, '4', 100, (int) (byte) 0, (int) (byte) 100, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setFixedSavings("hi!", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder21.addRecurringSavings("", (int) (byte) -1, (int) (short) 10, 10, '#', (int) (short) 100, (int) (byte) -1, (int) (byte) 1, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder32.setFixedSavings("", (int) '#');
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder35.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (byte) 1, (int) (short) 10, 0, 'a', (int) '#', (int) 'a', (int) (byte) 100, false, 100);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder23.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder23.addRecurringSavings("hi!", (int) (byte) 100, (int) (short) 100, (int) (short) 1, '4', 10, (int) (byte) 1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeZoneBuilder23.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder23.setFixedSavings("hi!", (int) ' ');
        java.lang.Class<?> wildcardClass44 = dateTimeZoneBuilder43.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) -1, (int) (byte) -1, (int) ' ', '#', 1, (int) (short) 1, (int) (byte) 0, false, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder33.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder47.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder49.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder49.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder49.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder59 = dateTimeZoneBuilder49.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder70 = dateTimeZoneBuilder49.addRecurringSavings("hi!", (int) (short) 1, (int) '4', 0, '4', (int) '#', (int) '4', (int) (byte) 10, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder72 = dateTimeZoneBuilder49.setStandardOffset(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder80 = dateTimeZoneBuilder49.addCutover(100, ' ', (int) (short) 10, (int) (short) -1, 100, true, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder59);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder70);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder72);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder0.addCutover((int) (short) -1, '4', (int) (short) 0, 0, (int) (byte) 1, true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 0, (int) (byte) 0, (int) (short) 10, '4', 100, (int) (short) 0, 10, true, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder17.addCutover(100, '#', (int) (short) 1, (-1), 0, false, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder18.setFixedSavings("", (int) (byte) 1);
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder18.writeTo("", outputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("", (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder11.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder11.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) 1, (int) (short) 1, (int) (short) 1, 'a', 10, 1, (int) (short) 1, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) '#', (int) '4', (int) (short) 0, '4', (int) (short) -1, (-1), (int) (byte) -1, false, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeZoneBuilder46.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder46.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTimeZoneBuilder46.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZone54);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder24.addCutover(100, '4', 0, (int) '4', (int) (byte) -1, false, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder9.addRecurringSavings("", 100, (int) ' ', (int) '4', '4', (int) (short) 100, (int) (byte) -1, 100, true, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder23.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder23.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder23.addRecurringSavings("hi!", (int) (short) -1, 100, (int) (short) 1, '4', 0, (int) '#', (int) (byte) 0, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder23.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTimeZoneBuilder42.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZone45);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder44.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder49.addRecurringSavings("", 100, (int) (byte) 100, (int) 'a', ' ', (int) 'a', (int) 'a', (int) 'a', false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder71 = dateTimeZoneBuilder49.addRecurringSavings("", (int) (short) -1, 0, (int) (short) 1, 'a', 10, 100, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder82 = dateTimeZoneBuilder71.addRecurringSavings("hi!", (int) (short) 0, (int) (byte) 0, (int) (byte) -1, '#', 0, (int) (short) 1, (int) '#', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder93 = dateTimeZoneBuilder82.addRecurringSavings("", 100, (int) (short) 100, (int) (short) 1, ' ', (int) ' ', 100, (int) (short) -1, true, (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder71);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder82);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder93);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 1, (int) '4', (int) '#', '4', 10, (int) (byte) 10, 10, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("", 0, (-1), (int) (byte) 10, 'a', (int) (short) 10, (int) '#', (int) (short) 1, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset(0);
        java.io.DataOutput dataOutput40 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder36.writeTo("hi!", dataOutput40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("", (int) '#');
        java.io.DataOutput dataOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", dataOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder5.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder30.addCutover((int) (byte) 100, ' ', 10, 0, (int) (byte) 0, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("hi!", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder23.setFixedSavings("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 100, (int) '4', (int) (short) 0, '#', (int) ' ', (int) (byte) 0, 100, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("hi!", (int) (short) 100, (int) (byte) 1, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 10, (int) (byte) 0, false, (int) (byte) 10);
        java.io.OutputStream outputStream46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("hi!", outputStream46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder26.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder26.addRecurringSavings("hi!", (-1), 100, (int) (byte) 1, '4', (int) '#', (-1), 10, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder40.addRecurringSavings("", (int) (byte) 100, (int) '4', (int) (byte) 10, '4', (int) '#', (int) (short) -1, 0, false, (int) (short) 100);
        java.io.OutputStream outputStream53 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder40.writeTo("", outputStream53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("hi!", 0);
        java.io.DataOutput dataOutput28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder23.writeTo("", dataOutput28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addCutover((int) (byte) 10, 'a', (int) (short) 1, (int) '#', 100, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) -1, 1, (-1), '#', (int) (byte) 100, (int) '#', (int) '4', true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '#', (int) (short) -1, (-1), ' ', (int) (byte) -1, (int) '4', (int) (byte) 1, true, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder41.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (-1));
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder10.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder22.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder22.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder40.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder43.setFixedSavings("hi!", (int) '#');
        java.lang.Class<?> wildcardClass47 = dateTimeZoneBuilder46.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) (short) 0, (int) (byte) 1, (int) (short) 0, '#', (int) (short) -1, 0, 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder3.setFixedSavings("", (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder23.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder23.addRecurringSavings("", 0, (int) (short) -1, (int) (short) -1, 'a', (int) '4', (int) (byte) 10, (int) (short) 10, false, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) 'a', (int) (short) 1, (int) 'a', '4', (int) ' ', (int) (short) 100, (int) ' ', true, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder22.setStandardOffset((int) (short) -1);
        java.io.OutputStream outputStream40 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder38.writeTo("", outputStream40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) '#');
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder25.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder25.addRecurringSavings("", (int) (short) 100, (-1), (int) (byte) -1, '4', (int) '#', (int) ' ', (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTimeZoneBuilder25.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder11.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder11.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder11.setFixedSavings("", 0);
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("", outputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder20.addRecurringSavings("", (int) (byte) 10, (int) (short) 10, (-1), 'a', (int) '4', (int) '#', 100, false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder34.addRecurringSavings("", (int) (byte) -1, (int) (short) 10, (int) '#', ' ', (int) (byte) 10, (int) (byte) 0, (int) (byte) 1, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder45.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder47.addRecurringSavings("", (-1), (int) (short) -1, (int) (byte) -1, '#', (int) '#', 10, (int) (short) 100, false, (int) ' ');
        java.io.DataOutput dataOutput60 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder47.writeTo("", dataOutput60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 100);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("", outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (short) 100, (int) 'a', (int) (byte) 10, ' ', 100, (int) (byte) -1, 10, false, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder9.setStandardOffset((int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder36.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder36.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder36.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) 'a', (int) (short) 1, (int) 'a', '4', (int) ' ', (int) (short) 100, (int) ' ', true, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", 10, (int) (byte) 10, 0, ' ', (int) (short) 1, (int) (byte) 10, (int) (byte) 100, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder47.setStandardOffset((int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeZoneBuilder6.toDateTimeZone("hi!", false);
        java.io.DataOutput dataOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder6.writeTo("hi!", dataOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 100, (int) (short) 100, (int) (byte) -1, 'a', (int) (short) -1, 100, (int) (byte) 1, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.addRecurringSavings("hi!", 0, (int) (short) 1, (int) (short) 0, ' ', (int) (byte) 1, (int) (byte) 10, (int) ' ', true, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", 0);
        java.io.DataOutput dataOutput40 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("hi!", dataOutput40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder6.setFixedSavings("hi!", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder36.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder36.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder36.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) ' ', (int) ' ', (int) (short) 100, '#', (int) (short) -1, (int) (byte) 1, 0, true, 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder28.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder31.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', 1, '4', 100, (-1), (int) (byte) 1, false, (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", (int) (byte) 1, (int) '#', 0, 'a', (int) (byte) 0, (-1), (int) '#', true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder24.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder26.toDateTimeZone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder26.addCutover((int) (short) 0, '#', (-1), (int) (short) -1, 0, true, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (byte) 10, (int) (short) -1, 0, '4', (int) (byte) 100, (-1), (int) (byte) 0, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 0);
        java.lang.Class<?> wildcardClass32 = dateTimeZoneBuilder31.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (byte) 100, (int) '4', (int) (short) -1, 'a', (int) (short) 0, 0, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder44.setStandardOffset(1);
        java.io.DataOutput dataOutput48 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("", dataOutput48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder23.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("hi!", (int) 'a', (int) '#', (int) ' ', ' ', (int) (short) 0, 0, (int) (byte) 1, true, 1);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder36.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass40 = dateTimeZoneBuilder36.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder0.addRecurringSavings("", 0, 0, (int) (short) 0, 'a', (int) (short) 1, 1, 100, true, (int) (short) 0);
        java.lang.Class<?> wildcardClass45 = dateTimeZoneBuilder44.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) (byte) 0, '4', (int) (short) 10, (int) '#', (int) (short) 100, false, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (short) 10, 100, (int) (short) 100, '4', (int) (byte) -1, (int) (short) 100, (int) (byte) 100, true, (int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addRecurringSavings("hi!", 100, 100, (int) 'a', ' ', (int) (byte) 0, (int) (byte) 100, (int) (byte) -1, false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("", 0, (int) (byte) 1, (int) (byte) 100, '#', (int) ' ', (int) (short) 10, (int) (short) 10, false, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder9.addRecurringSavings("", (-1), (int) ' ', (int) (short) 0, '#', (int) (byte) 10, (int) (short) 10, (int) '#', true, 10);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder9.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder9.setStandardOffset((int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("", (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder25.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) '4', (int) (short) 100, 10, 'a', (int) (byte) 100, (int) (byte) 10, (int) '#', true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) (short) -1, (int) '#', (int) ' ', '4', (int) (short) 10, (int) (byte) 0, (int) (byte) 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder34.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder36.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder47.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder49.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder49.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder55.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder68 = dateTimeZoneBuilder57.addRecurringSavings("hi!", (int) (byte) 0, 100, (int) '#', ' ', (int) '4', 1, (int) (byte) 1, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder70 = dateTimeZoneBuilder57.setStandardOffset((int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder68);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder70);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) (short) 100, (int) ' ', (int) (short) 10, 'a', (int) (short) 0, (int) (byte) -1, (int) (short) 10, true, 0);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder33.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) '#', (int) '#', (int) (short) 0, '4', (int) (short) -1, 100, (int) ' ', false, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("", (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder14.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder14.addRecurringSavings("", (int) '#', (int) (short) 10, (int) 'a', 'a', 100, (int) '#', (int) (byte) 100, false, (int) (short) 1);
        java.lang.Class<?> wildcardClass35 = dateTimeZoneBuilder34.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder3.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        java.io.OutputStream outputStream43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", outputStream43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) '#', 0, (int) (short) -1, '#', (int) (short) 100, (int) (byte) 10, 100, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) (short) 1, (int) (short) 100, (int) (short) -1, ' ', (int) (short) 100, 0, (int) (byte) 0, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder39.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder41.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder43.setStandardOffset(100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.addRecurringSavings("", (int) (byte) 100, (int) (byte) 1, (int) (byte) 100, '4', 100, (int) (byte) 100, (int) (byte) 10, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder32.setStandardOffset((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeZoneBuilder32.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((int) '#');
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder12.writeTo("hi!", dataOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }
}

