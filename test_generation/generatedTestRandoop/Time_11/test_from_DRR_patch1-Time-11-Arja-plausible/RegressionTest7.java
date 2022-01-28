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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder6.setFixedSavings("", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder12.addCutover((int) (short) 100, 'a', 0, 1, (int) (short) 100, true, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder12.addRecurringSavings("", 0, (int) (byte) 100, (int) 'a', 'a', (int) (short) 0, (-1), (int) (short) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder12.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder28.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder13.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder13.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder13.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder13.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder13.setFixedSavings("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder20.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder32.setStandardOffset((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder34.addCutover((int) '#', ' ', (int) (byte) 100, 1, (int) (byte) 10, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        java.io.DataOutput dataOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("", dataOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder33.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder41.setStandardOffset((int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) -1, '4', (int) (short) 10, (int) '#', (int) '4', true, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder22.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder10.addCutover(10, ' ', (int) (short) -1, (int) ' ', (int) (short) 1, false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder6.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder6.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (byte) 1, (int) 'a', (int) '4', '4', (int) (short) 0, 100, (int) (byte) 100, false, (int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.addRecurringSavings("", 10, (int) 'a', (int) (byte) -1, '4', (int) 'a', (int) (short) 0, 0, true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder7.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder7.toDateTimeZone("hi!", true);
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("hi!", dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder20.setFixedSavings("hi!", (-1));
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder28.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder28.addCutover((int) (byte) 0, '4', 100, (int) (short) -1, (int) '4', true, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder25.setFixedSavings("", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder25.addRecurringSavings("", (int) (short) -1, (-1), (int) '#', '#', (int) 'a', (int) (byte) 100, (int) '#', false, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder8.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder8.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder8.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder8.setFixedSavings("", 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("hi!", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) (byte) -1);
        java.io.DataOutput dataOutput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder18.writeTo("hi!", dataOutput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("hi!", 100);
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder24.writeTo("", outputStream29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.addRecurringSavings("", 10, 0, (int) (byte) -1, 'a', 0, (-1), (int) (byte) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder22.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder26.addRecurringSavings("", 100, (int) (short) 1, 1, ' ', 10, 1, (int) (byte) 0, false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder13.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder13.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder13.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder13.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder13.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder35.addRecurringSavings("", (int) (byte) 1, 1, (int) (byte) 0, '4', (int) (byte) 1, (int) (byte) 10, (int) (byte) -1, false, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder35.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone51 = dateTimeZoneBuilder48.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder62 = dateTimeZoneBuilder48.addRecurringSavings("", (int) 'a', (int) ' ', (int) (short) 100, 'a', 1, 10, (int) (short) 1, true, 100);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder48);
        org.junit.Assert.assertNotNull(dateTimeZone51);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder33.setStandardOffset(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder33.addRecurringSavings("", (int) (byte) -1, 1, (int) (short) 100, ' ', (int) (short) 1, 1, (int) (byte) 1, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder35.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder35.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder35.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder35.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder48.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder61 = dateTimeZoneBuilder50.addRecurringSavings("hi!", (int) (byte) -1, (int) 'a', (int) (byte) 1, ' ', (int) (byte) 100, (int) 'a', 1, true, 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder48);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder61);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder14.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("", 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder38.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder38.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder38.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder38.addRecurringSavings("hi!", (int) (byte) 0, (int) (short) 10, (int) (byte) 1, '#', (int) (short) 100, 10, 1, true, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder68 = dateTimeZoneBuilder38.addRecurringSavings("hi!", (int) (byte) 100, (int) (byte) -1, 0, ' ', (int) (byte) 1, (int) (short) 1, (int) '4', true, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 10, (int) (byte) 100, (int) (byte) 1, '4', 1, 1, (int) (byte) 1, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder0.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        java.io.DataOutput dataOutput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", dataOutput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder6.addRecurringSavings("hi!", (int) (short) -1, (int) (byte) 1, (-1), 'a', (int) (byte) 1, (int) (short) 0, 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder23.addRecurringSavings("", (int) 'a', (int) '4', (int) (byte) 1, ' ', (int) 'a', (int) (byte) 1, (int) ' ', false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder34.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder34.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder9.addRecurringSavings("", (int) ' ', (int) ' ', (int) (byte) -1, 'a', (int) (short) 100, (int) ' ', (int) (byte) 10, true, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder9.setFixedSavings("", 10);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeZoneBuilder9.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setFixedSavings("hi!", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder20.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("hi!", (-1));
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder10.addCutover(10, '4', 10, 0, (int) (short) 1, true, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder15.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder15.setStandardOffset((int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = dateTimeZoneBuilder15.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder30.addRecurringSavings("hi!", (int) '#', 0, (int) (short) -1, '#', (int) (short) 100, (int) (byte) 10, 100, true, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder30.addCutover((int) (byte) 100, '4', (int) '#', (int) (byte) 0, (int) (short) 0, true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder2.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder17.setFixedSavings("", (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder14.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder14.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder38.setFixedSavings("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) (short) 0);
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder15.addCutover(10, 'a', 0, 1, 10, true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder28.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeZoneBuilder32.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder33.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder33.addRecurringSavings("hi!", 0, (int) '#', (int) (byte) 1, '4', (int) (short) 100, (int) '#', 10, true, 100);
        org.joda.time.DateTimeZone dateTimeZone55 = dateTimeZoneBuilder52.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZone55);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeZoneBuilder6.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder6.setFixedSavings("", (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeZoneBuilder6.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder6.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder18.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder18.addRecurringSavings("hi!", (int) ' ', 100, (int) (byte) -1, '4', 0, (int) (byte) 0, (int) (short) -1, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder32.setFixedSavings("hi!", (int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder20.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeZoneBuilder20.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass36 = dateTimeZone35.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeZoneBuilder6.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder6.setFixedSavings("", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder15.addRecurringSavings("", (int) (byte) 100, (int) '4', (int) (byte) 10, '4', (int) '#', (int) (short) -1, 0, false, (int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", 100);
        java.lang.Class<?> wildcardClass11 = dateTimeZoneBuilder10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass30 = dateTimeZoneBuilder20.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.addRecurringSavings("", 10, 0, (int) (byte) -1, 'a', 0, (-1), (int) (byte) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder22.toDateTimeZone("", true);
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("hi!", outputStream29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder10.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder22.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass28 = dateTimeZone27.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder35.addRecurringSavings("", (int) (byte) 1, 1, (int) (byte) 0, '4', (int) (byte) 1, (int) (byte) 10, (int) (byte) -1, false, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder46.setStandardOffset(10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder48);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder32.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeZoneBuilder32.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeZoneBuilder32.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.setFixedSavings("hi!", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder14.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder2.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder2.addRecurringSavings("", (int) (byte) -1, (int) '4', (int) (byte) 1, '#', (int) (short) -1, (int) (short) 10, 0, true, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder2.setFixedSavings("", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder2.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder15.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder15.setFixedSavings("", (int) 'a');
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder15.writeTo("", outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (short) 1);
        java.io.DataOutput dataOutput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder16.writeTo("hi!", dataOutput18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder20.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeZoneBuilder32.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder6.addRecurringSavings("hi!", (int) (short) -1, (int) (byte) 1, (-1), 'a', (int) (byte) 1, (int) (short) 0, 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder23.addRecurringSavings("", (int) 'a', (int) '4', (int) (byte) 1, ' ', (int) 'a', (int) (byte) 1, (int) ' ', false, (int) (byte) 100);
        java.io.DataOutput dataOutput36 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder23.writeTo("hi!", dataOutput36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder26.setStandardOffset((int) ' ');
        java.lang.Class<?> wildcardClass29 = dateTimeZoneBuilder26.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) '#');
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder35.setStandardOffset((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeZoneBuilder35.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder35.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder35.setFixedSavings("", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder59 = dateTimeZoneBuilder35.addRecurringSavings("hi!", 10, 0, 100, '#', 100, (int) (byte) 10, (int) (byte) -1, false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder48);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder15.addRecurringSavings("hi!", (int) (short) 0, (int) (byte) 100, (int) (short) 0, ' ', (int) ' ', (int) (short) 0, (int) (byte) 1, true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder15.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder15.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass37 = dateTimeZone36.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addRecurringSavings("hi!", 100, (int) (byte) 100, 0, '4', (int) (short) 100, 0, (int) (byte) -1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder15.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset((int) ' ');
        java.lang.Class<?> wildcardClass21 = dateTimeZoneBuilder20.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder26.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder26.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, ' ', 10, (int) (byte) -1, (-1), true, 0);
        java.io.DataOutput dataOutput42 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder40.writeTo("hi!", dataOutput42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder35.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder35.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeZoneBuilder35.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder35.setFixedSavings("", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder49.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder62 = dateTimeZoneBuilder51.addRecurringSavings("", (int) '#', (int) '#', (-1), ' ', (int) '#', (int) (short) 0, 0, true, (int) '#');
        java.io.OutputStream outputStream64 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder51.writeTo("", outputStream64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder62);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("hi!", (int) ' ');
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder24.writeTo("", outputStream29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) -1, '4', (int) (short) 10, (int) '#', (int) '4', true, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder27.addRecurringSavings("", (int) (short) 0, (int) ' ', (int) (short) 1, ' ', (int) ' ', (int) ' ', (int) (short) 100, false, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder27.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder40.addRecurringSavings("", (int) (byte) 0, (int) ' ', (int) (short) -1, 'a', (int) (byte) 100, (int) 'a', (int) '4', true, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder10.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder10.addCutover((int) ' ', ' ', (int) '#', (int) (byte) 10, (int) 'a', true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder35.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder35.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeZoneBuilder35.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeZoneBuilder35.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder35.addRecurringSavings("hi!", 10, (int) '4', 0, '#', (int) 'a', (int) (byte) 0, (int) 'a', true, (-1));
        java.io.DataOutput dataOutput62 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("", dataOutput62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("hi!", (int) ' ');
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("hi!", outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.setFixedSavings("", (int) 'a');
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder8.writeTo("hi!", outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder7.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder22.setFixedSavings("", (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder28.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder38.setFixedSavings("hi!", 10);
        java.lang.Class<?> wildcardClass42 = dateTimeZoneBuilder38.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder3.setStandardOffset((int) 'a');
        java.io.DataOutput dataOutput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", dataOutput18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder13.addRecurringSavings("", (int) (byte) -1, (int) ' ', (int) (short) 10, 'a', (int) (byte) -1, (int) (short) 10, (int) (short) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder13.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder13.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder13.setFixedSavings("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeZoneBuilder9.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.addCutover((int) (short) 10, '#', (int) (short) -1, 0, 10, true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder6.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder17.setStandardOffset((int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder2.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder7.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = dateTimeZoneBuilder7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder8.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder8.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder8.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder21.addCutover((-1), '4', (int) (short) 100, (int) (byte) 1, (int) (byte) 100, true, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setStandardOffset((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder24.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder24.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder24.setStandardOffset((int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder38.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder38.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder38.setFixedSavings("", (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder2.addRecurringSavings("", (-1), (int) (byte) 1, (-1), 'a', (int) (byte) -1, (-1), (int) (short) 0, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder2.setFixedSavings("", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("", (int) (byte) 10, (int) (byte) 0, (int) (byte) -1, '#', (int) (byte) 0, (int) (byte) 0, 1, true, 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", (-1));
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("", dataOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) -1, '4', (int) (short) 10, (int) '#', (int) '4', true, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder25.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder27.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder27.setStandardOffset((int) (short) 10);
        java.io.DataOutput dataOutput34 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder27.writeTo("hi!", dataOutput34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder8.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder8.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder20.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder28.setFixedSavings("hi!", 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.addRecurringSavings("hi!", 10, 100, 10, '#', 1, (int) (byte) 10, (int) (short) 1, true, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder14.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("hi!", outputStream35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeZoneBuilder38.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder38.writeTo("hi!", outputStream45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZone43);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder33.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder40.addRecurringSavings("", (int) (short) 10, (int) (byte) 100, 0, '4', (int) '4', (int) (byte) 1, (-1), false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder40.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder56 = dateTimeZoneBuilder54.setStandardOffset((int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder54);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder56);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder38.setStandardOffset((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTimeZoneBuilder38.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder38.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone50 = dateTimeZoneBuilder47.toDateTimeZone("hi!", false);
        java.io.DataOutput dataOutput52 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder47.writeTo("", dataOutput52);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder17.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder9.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder16.addRecurringSavings("hi!", (int) '#', (int) (short) 10, (int) (short) 0, 'a', (int) (byte) 10, (int) (short) 1, (-1), false, (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder12.addRecurringSavings("", 0, (int) (byte) 100, (int) 'a', 'a', (int) (short) 0, (-1), (int) (short) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder26.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder26.addRecurringSavings("", (int) (short) 0, (int) ' ', 0, '4', (int) ' ', (int) (short) 100, (int) (byte) 100, true, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder8.setStandardOffset((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder14.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass18 = dateTimeZone17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) ' ');
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("", outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeZoneBuilder12.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder12.setStandardOffset((int) (byte) 1);
        java.io.DataOutput dataOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder12.writeTo("hi!", dataOutput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) -1, '4', (int) (short) 10, (int) '#', (int) '4', true, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder25.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder27.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder27.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder27.addRecurringSavings("", (int) '4', (int) '#', (int) (byte) 0, '#', (int) (short) 100, (int) (byte) 100, (-1), false, (int) '4');
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder10.setStandardOffset(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder12.addCutover((int) (byte) -1, '4', 10, (int) '4', 100, false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.addRecurringSavings("", 10, 0, (int) (byte) -1, 'a', 0, (-1), (int) (byte) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) '#', (int) (short) 1, (int) (short) -1, '#', (int) (byte) -1, (int) 'a', (int) ' ', false, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder7.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        java.io.DataOutput dataOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", dataOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }
}

