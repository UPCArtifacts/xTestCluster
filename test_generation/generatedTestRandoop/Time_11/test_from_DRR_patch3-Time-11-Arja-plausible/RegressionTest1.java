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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder9.addRecurringSavings("", (int) ' ', (int) ' ', (int) (byte) -1, 'a', (int) (short) 100, (int) ' ', (int) (byte) 10, true, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder31.setFixedSavings("", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder34.addCutover(0, '4', 1, (int) (short) -1, (int) (short) 1, false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset(10);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder13.writeTo("hi!", outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.addRecurringSavings("hi!", 10, 100, 10, '#', 1, (int) (byte) 10, (int) (short) 1, true, (int) (short) -1);
        java.io.DataOutput dataOutput32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder30.writeTo("", dataOutput32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder2.addRecurringSavings("", (-1), (int) (byte) 1, (-1), 'a', (int) (byte) -1, (-1), (int) (short) 0, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder2.setStandardOffset((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder2.addCutover((int) (short) -1, 'a', (int) (short) 10, (int) (byte) 100, (int) (short) 1, false, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder40.addRecurringSavings("", 0, (int) '4', (int) 'a', ' ', (int) '4', (int) (short) 0, (int) '#', false, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) '4', (int) 'a', (int) 'a', '4', (int) (short) -1, (int) (byte) 100, (int) (short) 0, true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        java.lang.Class<?> wildcardClass44 = dateTimeZoneBuilder35.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder2.addRecurringSavings("", (-1), (int) (byte) 1, (-1), 'a', (int) (byte) -1, (-1), (int) (short) 0, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder2.setFixedSavings("", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder22.addCutover((int) '#', '4', (int) 'a', (int) '4', 100, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.setStandardOffset((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setFixedSavings("hi!", 1);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder6.writeTo("hi!", outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder35.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder35.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder35.setFixedSavings("hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass47 = dateTimeZoneBuilder35.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder9.addRecurringSavings("", (int) ' ', (int) ' ', (int) (byte) -1, 'a', (int) (short) 100, (int) ' ', (int) (byte) 10, true, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder9.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass35 = dateTimeZone34.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeZoneBuilder2.toDateTimeZone("hi!", true);
        java.io.DataOutput dataOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("hi!", dataOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder12.addRecurringSavings("", (int) (byte) 100, (int) '4', (int) (byte) 0, 'a', (int) (short) 10, (int) (short) 1, (int) (byte) 1, false, (int) '#');
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder12.writeTo("", outputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder2.addRecurringSavings("", (-1), (int) (byte) 1, (-1), 'a', (int) (byte) -1, (-1), (int) (short) 0, false, (int) '#');
        java.io.DataOutput dataOutput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", dataOutput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder9.addRecurringSavings("", (int) ' ', (int) ' ', (int) (byte) -1, 'a', (int) (short) 100, (int) ' ', (int) (byte) 10, true, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder9.setFixedSavings("", 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder34.addRecurringSavings("hi!", 100, 0, (int) (short) 10, 'a', 0, (int) (short) 0, 1, false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = dateTimeZoneBuilder6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addCutover((int) (short) 10, '#', (int) (byte) 100, (int) '4', 0, true, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.addRecurringSavings("hi!", (int) (short) 100, (int) (short) 10, (int) 'a', 'a', (int) '4', 10, (int) (byte) 0, false, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder36.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder13.setFixedSavings("", 0);
        java.lang.Class<?> wildcardClass19 = dateTimeZoneBuilder18.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder8.addRecurringSavings("hi!", (int) (short) -1, (int) 'a', 10, ' ', (-1), (int) (byte) 0, (int) (short) 1, false, 0);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder21.toDateTimeZone("", false);
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder21.writeTo("hi!", outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) -1, (int) (short) 0, 1, '#', (int) (byte) -1, 0, (-1), true, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset(100);
        java.lang.Class<?> wildcardClass8 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder30.addRecurringSavings("hi!", (int) (byte) 10, (int) '4', 0, 'a', 10, 100, (int) (byte) 0, false, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeZoneBuilder41.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass45 = dateTimeZone44.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.addCutover(10, ' ', 10, (int) (short) 10, (int) ' ', true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeZoneBuilder6.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass10 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder13.setFixedSavings("", 0);
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder13.writeTo("", outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder20.addRecurringSavings("", (int) 'a', (int) (short) 10, (int) (short) -1, '4', (-1), (int) (short) 0, (int) (short) 1, true, 0);
        java.io.DataOutput dataOutput36 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder34.writeTo("", dataOutput36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = dateTimeZoneBuilder15.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) 'a');
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("", dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder24.setFixedSavings("", (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("hi!", dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setStandardOffset(0);
        java.lang.Class<?> wildcardClass13 = dateTimeZoneBuilder12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder10.addCutover((int) 'a', ' ', 0, (int) (short) 1, (int) (short) 1, false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset((int) (byte) 0);
        java.io.DataOutput dataOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder13.writeTo("", dataOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder15.setFixedSavings("hi!", 1);
        java.io.DataOutput dataOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder15.writeTo("hi!", dataOutput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder9.addRecurringSavings("", (int) ' ', (int) ' ', (int) (byte) -1, 'a', (int) (short) 100, (int) ' ', (int) (byte) 10, true, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder9.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder9.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder38.addCutover((-1), '4', 0, (int) 'a', (int) (byte) -1, false, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) '#');
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder23.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder23.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder23.addRecurringSavings("hi!", (int) (short) 100, (int) (byte) 0, (int) (byte) 0, '#', 1, 10, 0, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.addCutover((int) (short) -1, 'a', (-1), (int) (byte) 10, (int) (byte) 0, true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("", (int) 'a');
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder2.addRecurringSavings("", (-1), (int) (byte) 1, (-1), 'a', (int) (byte) -1, (-1), (int) (short) 0, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder2.setStandardOffset((int) '4');
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("", outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("hi!", 0);
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder11.writeTo("", dataOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder10.setStandardOffset((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder12.addCutover((int) (byte) -1, ' ', (int) (byte) -1, 100, (int) (short) 0, false, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder13.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addCutover((int) '#', '#', (int) (short) 100, (int) '#', (int) (byte) 0, false, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("", 0);
        java.io.DataOutput dataOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("", dataOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder19.setFixedSavings("", (int) ' ');
        java.lang.Class<?> wildcardClass26 = dateTimeZoneBuilder25.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder8.addRecurringSavings("", (int) (short) 10, (int) (short) 1, (int) (byte) 1, 'a', 100, (int) (byte) -1, (int) (short) 100, true, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (short) 10);
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("hi!", dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", 1);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder23.toDateTimeZone("hi!", true);
        java.io.DataOutput dataOutput28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder23.writeTo("hi!", dataOutput28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder38.addCutover((int) (short) 0, ' ', (-1), (int) (short) 1, (int) (short) 1, false, 10);
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
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder10.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass20 = dateTimeZoneBuilder10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder27.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeZoneBuilder27.toDateTimeZone("", true);
        java.io.DataOutput dataOutput48 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder27.writeTo("", dataOutput48);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(dateTimeZone46);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder8.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder13.addRecurringSavings("", (int) ' ', 1, (int) (byte) -1, '#', (int) (short) 10, (int) (short) 10, (int) (byte) 1, true, 100);
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder13.writeTo("hi!", outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 0, (int) (short) 100, (int) (byte) 0, 'a', (int) (byte) 0, (int) (short) 0, (int) (short) -1, true, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder0.addRecurringSavings("", (-1), (int) (byte) -1, (int) (short) 100, 'a', 100, (-1), (int) (short) 10, false, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
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
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeZoneBuilder30.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass36 = dateTimeZone35.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder8.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder13.addRecurringSavings("", (int) ' ', 1, (int) (byte) -1, '#', (int) (short) 10, (int) (short) 10, (int) (byte) 1, true, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder24.addCutover((int) '4', '#', (int) ' ', (int) (short) 0, (int) (short) -1, true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        java.io.OutputStream outputStream37 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("", outputStream37);
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
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder9.addCutover(1, ' ', (int) (short) 10, 0, (int) (short) 1, true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder2.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder38.addRecurringSavings("hi!", 100, 0, (int) (short) 100, '#', (int) (byte) 0, (int) (byte) -1, (int) '4', true, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addCutover((int) (short) 1, 'a', (int) (byte) 10, 0, (int) (short) 10, true, 0);
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
        org.junit.Assert.assertNotNull(dateTimeZone36);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder19.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder41.addCutover((int) '#', '#', (int) '4', 1, (int) (short) 10, true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        java.io.DataOutput dataOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder8.writeTo("hi!", dataOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) ' ');
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("", dataOutput16);
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
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.setStandardOffset((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder20.addRecurringSavings("hi!", (int) (short) -1, 0, (int) (short) 10, ' ', 1, (int) (short) 10, (int) (byte) 0, false, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
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
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder23.addCutover((int) (byte) -1, ' ', (int) '#', (int) (byte) 0, (int) '#', true, (int) (byte) 1);
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder24.setStandardOffset((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder29.addCutover((-1), '4', (int) (short) -1, (int) (short) 10, 0, false, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeZoneBuilder38.toDateTimeZone("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder38.addRecurringSavings("hi!", (int) '4', 1, 1, ' ', (-1), 10, (int) (short) -1, true, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.addRecurringSavings("", 10, 0, (int) (byte) -1, 'a', 0, (-1), (int) (byte) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setFixedSavings("hi!", 0);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("hi!", outputStream27);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder12.addRecurringSavings("hi!", (int) (byte) 1, 0, (int) ' ', ' ', (int) '#', (int) (short) 100, (int) (byte) 1, false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("hi!", dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = dateTimeZoneBuilder5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = dateTimeZoneBuilder12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset(100);
        java.lang.Class<?> wildcardClass8 = dateTimeZoneBuilder7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        java.io.OutputStream outputStream31 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("", outputStream31);
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
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder20.addRecurringSavings("hi!", (int) (byte) 10, (int) ' ', (int) (short) 1, '#', (int) (byte) -1, 0, (int) (short) -1, true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("hi!", 1, (int) '4', 1, '4', (int) (byte) 1, 1, (int) '4', false, 10);
        java.io.DataOutput dataOutput46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("", dataOutput46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder3.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder15.setFixedSavings("", (int) (byte) -1);
        java.io.DataOutput dataOutput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder18.writeTo("", dataOutput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        java.io.OutputStream outputStream35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("", outputStream35);
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
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("hi!", outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        java.lang.Class<?> wildcardClass18 = dateTimeZoneBuilder17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder26.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder29.addRecurringSavings("", (int) (byte) 10, (int) ' ', 0, '4', (int) (short) 1, (int) ' ', 10, true, 0);
        java.io.DataOutput dataOutput42 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder29.writeTo("", dataOutput42);
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
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = dateTimeZoneBuilder9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addRecurringSavings("hi!", 100, (int) (byte) 100, 0, '4', (int) (short) 100, 0, (int) (byte) -1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder15.addRecurringSavings("", (int) (short) 1, (int) (byte) 1, 10, ' ', 10, (int) ' ', (int) (short) 10, false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset((int) (short) 10);
        java.io.DataOutput dataOutput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("", dataOutput23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.addCutover((int) 'a', '4', 10, (int) (byte) 100, (int) (short) 10, true, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset(100);
        java.lang.Class<?> wildcardClass39 = dateTimeZoneBuilder36.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder11.addRecurringSavings("", (int) 'a', 100, 0, 'a', (-1), (int) '#', (int) (byte) 100, true, (int) (short) 0);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder25.writeTo("hi!", outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder3.addCutover(100, 'a', (int) '4', (int) (byte) 0, (int) (short) -1, true, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder6.setStandardOffset((-1));
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder13.writeTo("hi!", dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder10.addRecurringSavings("", (-1), (int) (short) 1, (int) (short) 0, ' ', 0, (-1), (int) (byte) 0, true, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = dateTimeZoneBuilder24.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass6 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder9.addRecurringSavings("", (int) ' ', (int) ' ', (int) (byte) -1, 'a', (int) (short) 100, (int) ' ', (int) (byte) 10, true, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder31.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder34.setFixedSavings("", (int) ' ');
        java.io.DataOutput dataOutput39 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder37.writeTo("hi!", dataOutput39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder10.addCutover((int) ' ', '4', 100, (-1), (int) '#', false, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder18.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder18.setFixedSavings("hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder24.addCutover((int) (byte) -1, 'a', (int) '4', 0, (int) (byte) 10, false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass30 = dateTimeZone29.getClass();
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
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("", dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset((int) (byte) 100);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("", outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder8.addCutover((-1), 'a', 0, (int) (short) 10, (int) ' ', false, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder2.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.addCutover((int) 'a', ' ', (int) (short) 10, (int) (short) -1, (int) ' ', true, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder10.addRecurringSavings("", 100, (int) (short) 0, (int) (short) 10, '4', (int) '#', (int) (short) 100, 10, true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(10);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) ' ', 1, (int) (byte) 0, '#', (int) (byte) 1, (int) (short) 10, (-1), false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) '#');
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder22.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder22.addCutover((int) '4', '#', (int) (byte) -1, (int) (byte) -1, (int) (byte) 1, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset((int) (byte) 100);
        java.io.DataOutput dataOutput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("hi!", dataOutput24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = dateTimeZoneBuilder22.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder24.setStandardOffset((int) (short) 0);
        java.io.DataOutput dataOutput31 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder29.writeTo("hi!", dataOutput31);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder15.addCutover((int) (short) 100, '#', (int) (byte) -1, (int) (short) -1, (int) (byte) -1, true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) ' ');
        java.io.DataOutput dataOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder15.writeTo("hi!", dataOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) -1, (int) '#', (int) (byte) -1, ' ', (int) (byte) -1, (int) (short) 100, 0, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder28.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass34 = dateTimeZoneBuilder28.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass24 = dateTimeZoneBuilder20.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder12.addRecurringSavings("", 0, (int) (byte) 100, (int) 'a', 'a', (int) (short) 0, (-1), (int) (short) 0, false, (int) (byte) -1);
        java.io.OutputStream outputStream28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder12.writeTo("hi!", outputStream28);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder35.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder40.setFixedSavings("", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder40.addCutover((int) (short) 0, 'a', (int) (byte) 10, 10, (int) (byte) -1, false, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder9.addRecurringSavings("", (int) ' ', (int) ' ', (int) (byte) -1, 'a', (int) (short) 100, (int) ' ', (int) (byte) 10, true, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder9.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder9.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset((int) (byte) 10);
        java.io.OutputStream outputStream40 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder36.writeTo("hi!", outputStream40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder7.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder16.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder16.addRecurringSavings("hi!", (int) (short) 10, (int) (short) 0, (int) (short) -1, '4', (int) (byte) 10, (int) (byte) 1, (int) (short) 10, true, 0);
        java.io.OutputStream outputStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder16.writeTo("hi!", outputStream32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder7.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder7.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder7.addCutover(10, '4', (int) ' ', (-1), 0, false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder2.addRecurringSavings("hi!", (int) (byte) 10, 1, 0, 'a', (int) (short) 10, (int) (short) 0, 0, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset((int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = dateTimeZoneBuilder21.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("", (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder15.setFixedSavings("hi!", 100);
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder15.writeTo("hi!", outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder35.addCutover((-1), 'a', (int) ' ', (int) (short) 10, (int) ' ', true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
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
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder2.addCutover((int) (byte) 100, '4', (-1), (int) (short) 1, (int) (byte) 10, false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder33.setStandardOffset((int) 'a');
        java.io.DataOutput dataOutput40 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("", dataOutput40);
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
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder33.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder38.setFixedSavings("", (int) (byte) -1);
        java.io.DataOutput dataOutput45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder43.writeTo("", dataOutput45);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 0, (int) (short) 100, (int) (byte) 0, 'a', (int) (byte) 0, (int) (short) 0, (int) (short) -1, true, 10);
        java.io.DataOutput dataOutput35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("", dataOutput35);
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
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) 'a');
        java.io.DataOutput dataOutput41 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("", dataOutput41);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (-1), (int) 'a', (int) (short) 10, 'a', (int) ' ', (int) (short) 0, (int) (byte) 10, true, (int) (short) -1);
        java.lang.Class<?> wildcardClass29 = dateTimeZoneBuilder17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("", (int) (short) 1);
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
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("hi!", 100);
        java.io.OutputStream outputStream35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder30.writeTo("", outputStream35);
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
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder24.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder24.addCutover(0, '#', (int) (short) 10, (int) (byte) 100, (int) (short) -1, false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder20.addRecurringSavings("hi!", (int) (byte) 10, (int) ' ', (int) (short) 1, '#', (int) (byte) -1, 0, (int) (short) -1, true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("hi!", 1, (int) '4', 1, '4', (int) (byte) 1, 1, (int) '4', false, 10);
        java.lang.Class<?> wildcardClass45 = dateTimeZoneBuilder44.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder35.setFixedSavings("", (int) 'a');
        java.io.OutputStream outputStream43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("hi!", outputStream43);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder28.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder28.setFixedSavings("", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder36.addCutover((int) (short) 100, ' ', (int) (short) 1, 10, (int) (short) 100, false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", true);
        java.io.DataOutput dataOutput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", dataOutput24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream31 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("hi!", outputStream31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("hi!", 100);
        java.io.OutputStream outputStream35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("", outputStream35);
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
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) (short) 0, 0, (int) (short) 100, '#', (int) (byte) 0, (int) (byte) 1, (int) (byte) 1, true, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) ' ', (int) (short) -1, (int) (byte) 10, '4', (int) (byte) 100, (-1), (int) (byte) 0, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder40.addRecurringSavings("", (int) (short) -1, (int) '4', 100, '4', (-1), (int) '4', (int) (byte) 100, false, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", outputStream26);
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
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(10);
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = dateTimeZoneBuilder10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder35.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder35.setStandardOffset((int) (byte) 1);
        java.lang.Class<?> wildcardClass44 = dateTimeZoneBuilder43.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder35.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder35.setStandardOffset((int) (byte) 1);
        java.io.OutputStream outputStream45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("hi!", outputStream45);
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
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder7.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder16.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder16.addRecurringSavings("hi!", (int) (short) 10, (int) (short) 0, (int) (short) -1, '4', (int) (byte) 10, (int) (byte) 1, (int) (short) 10, true, 0);
        java.io.DataOutput dataOutput32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder30.writeTo("", dataOutput32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.addCutover(100, 'a', (int) (short) 0, (int) (byte) -1, (int) '4', false, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) -1, (int) '#', (int) (byte) -1, ' ', (int) (byte) -1, (int) (short) 100, 0, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder28.setStandardOffset((int) (byte) -1);
        java.io.OutputStream outputStream34 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder32.writeTo("", outputStream34);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) (short) 0);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder15.writeTo("", outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder20.addRecurringSavings("", (int) 'a', (int) (short) 10, (int) (short) -1, '4', (-1), (int) (short) 0, (int) (short) 1, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder20.addRecurringSavings("", 1, (int) (byte) 100, 100, 'a', 10, (int) ' ', (int) (short) 1, true, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        java.io.OutputStream outputStream47 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder45.writeTo("hi!", outputStream47);
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
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder10.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 0);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("", outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) (short) 1, 0, (int) (byte) 1, 'a', (int) (byte) 1, (int) (byte) 100, (int) (short) 0, true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass21 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder17.setStandardOffset((int) 'a');
        java.io.DataOutput dataOutput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("", dataOutput24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.addRecurringSavings("", 10, (int) (short) 1, (int) (short) -1, 'a', (int) (byte) 0, (int) (short) 100, (int) (short) -1, false, 10);
        java.io.DataOutput dataOutput27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder25.writeTo("hi!", dataOutput27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (byte) 10);
        java.io.DataOutput dataOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder6.writeTo("", dataOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder10.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("hi!", outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder9.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) '#');
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder16.writeTo("hi!", outputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder10.addCutover((int) (byte) 0, '4', 1, (-1), (int) ' ', false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder15.setFixedSavings("hi!", 100);
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder18.writeTo("hi!", outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass7 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) 'a');
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("hi!", outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder12.addCutover((int) (short) -1, 'a', (-1), (int) (short) 1, (int) (short) 100, false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder20.addRecurringSavings("", (int) 'a', (int) (short) 10, (int) (short) -1, '4', (-1), (int) (short) 0, (int) (short) 1, true, 0);
        java.io.DataOutput dataOutput36 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder34.writeTo("hi!", dataOutput36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.setStandardOffset((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder14.addCutover((int) '#', 'a', (int) (short) 10, 0, (int) (byte) 0, true, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder36.setFixedSavings("hi!", 10);
        java.io.DataOutput dataOutput41 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder36.writeTo("hi!", dataOutput41);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeZoneBuilder6.toDateTimeZone("", true);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder6.writeTo("", outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("", outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass23 = dateTimeZone22.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder12.addRecurringSavings("hi!", (int) (short) 100, (int) (byte) 10, (int) (short) -1, '4', (int) (byte) 0, (int) (byte) 0, (int) (byte) 10, false, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder23.addRecurringSavings("hi!", (int) (byte) 100, 1, (int) (short) 10, '#', (int) (short) -1, 0, 100, true, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder10.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset((-1));
        java.io.DataOutput dataOutput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("", dataOutput26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder2.setStandardOffset((int) (short) -1);
        java.io.DataOutput dataOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder4.writeTo("hi!", dataOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 10);
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("hi!", dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (byte) 100);
        java.lang.Class<?> wildcardClass36 = dateTimeZoneBuilder30.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("", outputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder13.addRecurringSavings("", (int) (byte) -1, (int) ' ', (int) (short) 10, 'a', (int) (byte) -1, (int) (short) 10, (int) (short) 10, false, 0);
        java.io.DataOutput dataOutput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder24.writeTo("", dataOutput26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeZoneBuilder6.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder6.addRecurringSavings("", (-1), (int) (short) 0, (int) (byte) -1, ' ', (int) '4', (int) (short) -1, (int) (short) 10, false, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder20.addCutover((int) (byte) 0, ' ', 0, (int) (byte) 100, (int) ' ', false, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        java.io.DataOutput dataOutput42 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder27.writeTo("", dataOutput42);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder40.addRecurringSavings("hi!", (int) (byte) 0, (int) '4', (int) '4', 'a', (int) (short) 10, (int) '4', (int) (short) -1, true, (int) ' ');
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (short) 100, (int) '#', (int) (byte) 10, ' ', (int) (byte) -1, 0, 0, true, (int) (byte) 1);
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", outputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder19.addCutover((int) ' ', ' ', (int) '4', 10, (int) (short) 100, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder24.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder24.setFixedSavings("hi!", (-1));
        java.io.DataOutput dataOutput34 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder32.writeTo("hi!", dataOutput34);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder2.addRecurringSavings("hi!", (int) '#', (int) '4', (int) (short) 0, '4', (int) (short) -1, (-1), (int) (byte) -1, false, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder18.addCutover((int) ' ', '4', (int) (short) 1, (int) (short) 0, (int) '#', true, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeZoneBuilder9.toDateTimeZone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addCutover((int) (byte) 100, '4', 100, 0, (int) (short) 0, false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setFixedSavings("hi!", (-1));
        java.lang.Class<?> wildcardClass26 = dateTimeZoneBuilder20.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        java.lang.Class<?> wildcardClass47 = dateTimeZoneBuilder46.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder19.addCutover((int) (short) 100, 'a', 100, (int) '#', (-1), false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder2.addRecurringSavings("hi!", (int) '#', (int) '4', (int) (short) 0, '4', (int) (short) -1, (-1), (int) (byte) -1, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder2.addCutover((int) (byte) 1, '#', (-1), (int) (short) 10, (int) (short) -1, true, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder35.setStandardOffset((int) (short) 100);
        java.lang.Class<?> wildcardClass41 = dateTimeZoneBuilder35.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("", 10);
        java.io.DataOutput dataOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", dataOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder20.addRecurringSavings("", (int) 'a', (int) (short) 10, (int) (short) -1, '4', (-1), (int) (short) 0, (int) (short) 1, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) 'a');
        java.io.OutputStream outputStream39 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("hi!", outputStream39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) '4', (int) '#', (int) ' ', '#', (int) (short) 10, (int) (short) 10, (int) 'a', true, (int) (byte) 1);
        java.io.OutputStream outputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("", outputStream30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) (short) 10);
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("hi!", dataOutput12);
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
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.addRecurringSavings("hi!", 10, 100, 10, '#', 1, (int) (byte) 10, (int) (short) 1, true, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder14.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        java.io.OutputStream outputStream38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("", outputStream38);
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
        org.junit.Assert.assertNotNull(dateTimeZone36);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder20.addCutover((int) '#', '#', (int) (byte) 1, (int) (short) 1, (int) (byte) 10, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.addCutover((int) (short) 0, '4', (int) '#', (int) 'a', 0, true, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("", dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addCutover((int) (byte) 1, 'a', (int) (short) 10, 10, 0, true, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (short) 10);
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("", dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = dateTimeZoneBuilder7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder30.setFixedSavings("", (int) (short) 100);
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder30.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder11.addRecurringSavings("", (int) 'a', 100, 0, 'a', (-1), (int) '#', (int) (byte) 100, true, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder11.setStandardOffset((int) (short) 10);
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder11.writeTo("", outputStream29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) -1, (int) '#', (int) (byte) -1, ' ', (int) (byte) -1, (int) (short) 100, 0, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder28.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder28.addRecurringSavings("", 0, (int) (byte) -1, (int) (byte) 1, '4', (int) (byte) 10, (int) (byte) 10, 0, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.addRecurringSavings("", 10, 0, (int) (byte) -1, 'a', 0, (-1), (int) (byte) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = dateTimeZoneBuilder7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("hi!", 0);
        java.io.OutputStream outputStream40 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder38.writeTo("hi!", outputStream40);
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
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.setFixedSavings("", (int) 'a');
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder33.setStandardOffset((int) 'a');
        java.io.OutputStream outputStream40 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("", outputStream40);
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
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder30.addCutover(0, '4', 0, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder17.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder17.setStandardOffset((int) (byte) 10);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder25.writeTo("hi!", outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder7.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder17.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder17.addCutover((int) (byte) 1, ' ', 10, (int) (byte) 10, (int) (short) 1, true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addCutover((int) (short) 10, '#', (int) (short) 0, 10, (int) (byte) 1, false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder9.addRecurringSavings("", (int) ' ', (int) ' ', (int) (byte) -1, 'a', (int) (short) 100, (int) ' ', (int) (byte) 10, true, (int) (byte) 1);
        java.io.DataOutput dataOutput33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder31.writeTo("", dataOutput33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder35.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder35.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeZoneBuilder35.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass45 = dateTimeZone44.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) -1, (int) '#', (int) (byte) -1, ' ', (int) (byte) -1, (int) (short) 100, 0, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder28.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder28.addRecurringSavings("hi!", 0, (int) 'a', (int) '#', ' ', (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, false, (int) (short) 1);
        java.io.OutputStream outputStream45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder28.writeTo("hi!", outputStream45);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder30.addCutover(0, '4', (int) (byte) 10, (int) (short) 0, 10, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
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
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder20.addRecurringSavings("", (int) ' ', (int) (byte) 10, 0, 'a', (int) 'a', (int) '4', (int) (short) -1, false, (int) (byte) 0);
        java.io.DataOutput dataOutput36 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder34.writeTo("hi!", dataOutput36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder31.addCutover((int) (short) 0, 'a', (int) (short) 1, (int) (short) 1, (int) (short) 0, false, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder28.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder28.setFixedSavings("", (int) ' ');
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder36.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder27.setFixedSavings("hi!", 10);
        java.io.DataOutput dataOutput45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder43.writeTo("hi!", dataOutput45);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("hi!", outputStream27);
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
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder8.addCutover((int) '4', ' ', 0, (int) '4', (int) (short) 10, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder9.addRecurringSavings("", (int) ' ', (int) ' ', (int) (byte) -1, 'a', (int) (short) 100, (int) ' ', (int) (byte) 10, true, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder9.setFixedSavings("", 10);
        java.io.OutputStream outputStream36 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder34.writeTo("hi!", outputStream36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder8.setFixedSavings("hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder8.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 0, (int) (short) 100, '4', 10, (int) (byte) 10, (int) '#', true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder17.addCutover(10, ' ', (int) (short) -1, (int) (byte) 10, 100, false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder12.addCutover((int) (short) 100, '4', 10, 0, 10, true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder11.setStandardOffset((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder11.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder11.addCutover((int) (byte) -1, 'a', (int) (byte) -1, (int) '4', (int) (short) 100, true, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeZoneBuilder40.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZone43);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.addRecurringSavings("", 10, 0, (int) (byte) -1, 'a', 0, (-1), (int) (byte) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder7.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder24.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder24.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.lang.Class<?> wildcardClass42 = dateTimeZoneBuilder38.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder17.toDateTimeZone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 10, (int) '#', ' ', (int) (byte) 0, 100, (int) (short) 100, true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addRecurringSavings("hi!", 100, (int) (byte) 100, 0, '4', (int) (short) 100, 0, (int) (byte) -1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder15.setFixedSavings("hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder15.addCutover((int) (short) 10, '4', (int) ' ', 10, 0, false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 100, (int) '4', (int) (byte) 0, ' ', (-1), (int) (short) -1, (int) ' ', false, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder0.addCutover((int) (byte) -1, '4', (int) (short) 10, (int) (byte) 100, (int) '#', false, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) (byte) 100);
        java.io.DataOutput dataOutput38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder36.writeTo("hi!", dataOutput38);
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
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder36.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder39.setFixedSavings("", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder39.addRecurringSavings("", 100, (int) (byte) 100, (int) (byte) 100, ' ', 100, (int) ' ', (int) (byte) 1, false, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) -1, '4', (int) (short) 10, (int) '#', (int) '4', true, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder27.addCutover((int) (short) 0, '#', (int) (byte) 0, (int) (byte) 10, 10, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((-1));
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("", outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addRecurringSavings("hi!", 100, (int) (byte) 100, 0, '4', (int) (short) 100, 0, (int) (byte) -1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 0);
        java.io.DataOutput dataOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder15.writeTo("", dataOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) -1, (int) '#', (int) (byte) -1, ' ', (int) (byte) -1, (int) (short) 100, 0, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder28.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder28.addRecurringSavings("hi!", 0, (int) 'a', (int) '#', ' ', (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, false, (int) (short) 1);
        java.io.OutputStream outputStream45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder43.writeTo("", outputStream45);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) (short) 0);
        java.io.DataOutput dataOutput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder24.writeTo("hi!", dataOutput26);
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
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeZoneBuilder2.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder2.setStandardOffset(10);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("", outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder28.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder28.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder28.setStandardOffset((int) '4');
        java.lang.Class<?> wildcardClass39 = dateTimeZoneBuilder28.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = dateTimeZoneBuilder22.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (short) 10);
        java.lang.Class<?> wildcardClass8 = dateTimeZoneBuilder2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 10);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("", outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) ' ', (int) (byte) 0, (int) (byte) 10, '#', (int) (byte) -1, (int) 'a', (int) (byte) 10, false, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder15.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder15.setStandardOffset((int) (byte) 0);
        java.io.DataOutput dataOutput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder15.writeTo("", dataOutput24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) '4', (int) '#', (int) ' ', '#', (int) (short) 10, (int) (short) 10, (int) 'a', true, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder17.toDateTimeZone("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("hi!", 10, 0, 0, '4', (int) (short) 0, (int) '4', 100, true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((int) 'a');
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder12.writeTo("", outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        java.io.DataOutput dataOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", dataOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) ' ');
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder12.writeTo("", outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass37 = dateTimeZone36.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = dateTimeZoneBuilder14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        java.io.OutputStream outputStream35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("", outputStream35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.addRecurringSavings("hi!", 10, 100, 10, '#', 1, (int) (byte) 10, (int) (short) 1, true, (int) (short) -1);
        java.lang.Class<?> wildcardClass31 = dateTimeZoneBuilder14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder35.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder35.addCutover((int) (byte) 100, 'a', (int) (short) 100, (int) (short) 10, (int) (short) 0, true, (int) '4');
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder7.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset((int) (short) 0);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder13.writeTo("", outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder18.addCutover(1, 'a', (int) (byte) 1, (int) (byte) 100, (int) (byte) 100, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset((int) 'a');
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder15.writeTo("hi!", outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) -1, (int) '#', (int) (byte) -1, ' ', (int) (byte) -1, (int) (short) 100, 0, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) 0);
        java.io.DataOutput dataOutput32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder30.writeTo("hi!", dataOutput32);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.addRecurringSavings("", 10, 0, (int) (byte) -1, 'a', 0, (-1), (int) (byte) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("hi!", outputStream26);
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
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder8.setFixedSavings("hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder8.addRecurringSavings("", (int) (byte) -1, (int) (byte) 1, (int) ' ', 'a', (int) 'a', 0, (int) ' ', false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder40.setStandardOffset((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder42.addRecurringSavings("", (int) (short) 10, (int) '#', (int) '4', '4', (int) (byte) 1, (int) (byte) 10, (int) (byte) 100, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeZoneBuilder2.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeZoneBuilder2.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.addRecurringSavings("", 10, 0, (int) (byte) -1, 'a', 0, (-1), (int) (byte) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder25.addCutover((int) '#', 'a', (int) (byte) 100, (int) 'a', (int) (short) 10, false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("hi!", 1);
        java.io.OutputStream outputStream28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("hi!", outputStream28);
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
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder12.addRecurringSavings("", 0, (int) (byte) 100, (int) 'a', 'a', (int) (short) 0, (-1), (int) (short) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder26.setStandardOffset(1);
        java.io.DataOutput dataOutput30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder28.writeTo("", dataOutput30);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 0);
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("hi!", dataOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset(1);
        java.lang.Class<?> wildcardClass11 = dateTimeZoneBuilder10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setFixedSavings("", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("", (-1), (int) (byte) 10, (int) (short) -1, ' ', 10, (int) (byte) -1, 0, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder36.setFixedSavings("", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder39.addRecurringSavings("", 100, (int) (byte) 100, (int) (byte) 100, '4', 100, 100, (int) '#', false, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) -1, '4', (int) (short) 10, (int) '#', (int) '4', true, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder27.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder29.addRecurringSavings("", (int) 'a', (int) (byte) 0, (int) (byte) 0, ' ', 0, (int) (byte) 10, (int) (short) 0, true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder35.toDateTimeZone("hi!", true);
        java.io.DataOutput dataOutput43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("hi!", dataOutput43);
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
        org.junit.Assert.assertNotNull(dateTimeZone41);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder26.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder29.addRecurringSavings("", (int) (byte) 10, (int) ' ', 0, '4', (int) (short) 1, (int) ' ', 10, true, 0);
        java.io.OutputStream outputStream42 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder29.writeTo("", outputStream42);
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
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) 'a');
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder36.addRecurringSavings("", (int) '4', (int) (short) 100, (int) (short) 0, ' ', 1, (int) (byte) 0, (int) (byte) -1, true, (int) 'a');
        java.io.DataOutput dataOutput51 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder36.writeTo("hi!", dataOutput51);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder2.setStandardOffset((int) '#');
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("hi!", dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder2.addRecurringSavings("hi!", (int) (byte) 10, 1, 0, 'a', (int) (short) 10, (int) (short) 0, 0, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder2.setStandardOffset((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder23.addRecurringSavings("", (int) (short) 10, (int) (short) 10, (int) (short) 100, '4', 0, (int) (short) 0, (-1), false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder7.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) (short) 10, 10, (int) (short) -1, ' ', (int) (short) 10, 1, (int) 'a', true, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder7.addCutover(10, 'a', (int) 'a', (int) (byte) 0, (int) (short) 10, false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("", (int) 'a');
        java.lang.Class<?> wildcardClass23 = dateTimeZoneBuilder22.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass23 = dateTimeZoneBuilder19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.setFixedSavings("", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) -1, (int) 'a', (int) (byte) 100, '#', (int) (byte) 0, (int) (byte) -1, (int) (short) 0, true, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder28.addCutover((int) (byte) 100, '#', (int) (byte) 1, 0, (int) (short) 10, true, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("hi!", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.addCutover((int) (short) 0, ' ', 10, 1, (int) (short) 0, true, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder8.addRecurringSavings("hi!", 0, (int) (short) 0, (int) (short) 100, '#', (int) (short) 10, (int) ' ', (int) ' ', false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder19.setFixedSavings("", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder19.addRecurringSavings("", 100, (int) ' ', (int) '4', '4', (int) (short) 100, (int) (byte) -1, 100, true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder10.addRecurringSavings("", (-1), (int) (short) 1, (int) (short) 0, ' ', 0, (-1), (int) (byte) 0, true, (int) (short) 0);
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder21.writeTo("", outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder20.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder20.setStandardOffset((int) (short) 0);
        java.io.DataOutput dataOutput33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder31.writeTo("", dataOutput33);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        java.io.DataOutput dataOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("hi!", dataOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder8.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder11.setStandardOffset((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = dateTimeZoneBuilder13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder59 = dateTimeZoneBuilder35.addRecurringSavings("hi!", (int) (short) 100, (int) (byte) 0, (int) ' ', ' ', (int) '4', (int) (short) 100, (int) (short) 10, false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder48);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) 'a');
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder12.writeTo("hi!", outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder23.addCutover(0, '#', (int) (short) 100, (int) (short) 0, (-1), true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
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
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder20.addRecurringSavings("hi!", (int) (byte) 10, (int) ' ', (int) (short) 1, '#', (int) (byte) -1, 0, (int) (short) -1, true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder32.setFixedSavings("hi!", (int) 'a');
        java.io.OutputStream outputStream37 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder32.writeTo("", outputStream37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        java.lang.Class<?> wildcardClass6 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder43.setFixedSavings("hi!", (int) '#');
        java.lang.Class<?> wildcardClass47 = dateTimeZoneBuilder46.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setFixedSavings("hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder25.addCutover((int) '#', 'a', 1, (int) (short) 0, 10, true, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder8.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder13.addRecurringSavings("", (int) ' ', 1, (int) (byte) -1, '#', (int) (short) 10, (int) (short) 10, (int) (byte) 1, true, 100);
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder24.writeTo("", outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder10.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setStandardOffset((int) (short) 1);
        java.io.DataOutput dataOutput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", dataOutput26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder6.addRecurringSavings("", 10, (int) (byte) -1, (int) '4', '4', 1, (int) (byte) 10, (int) (byte) -1, false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) 0);
        java.io.DataOutput dataOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder15.writeTo("hi!", dataOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("hi!", (int) 'a', (int) (byte) 1, (int) '#', 'a', (int) (short) 10, (int) 'a', (int) (short) 100, true, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder26.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder29.addRecurringSavings("", (int) (byte) 10, (int) ' ', 0, '4', (int) (short) 1, (int) ' ', 10, true, 0);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder35.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder35.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeZoneBuilder35.toDateTimeZone("", true);
        java.io.OutputStream outputStream46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("hi!", outputStream46);
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
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) -1, '4', (int) (short) 10, (int) '#', (int) '4', true, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder22.setFixedSavings("", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) 'a', 0, 100, '#', (int) (byte) 100, (int) (byte) 10, (int) (byte) 100, true, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder7.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) (short) 10, 10, (int) (short) -1, ' ', (int) (short) 10, 1, (int) 'a', true, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder21.addCutover((int) (short) 10, 'a', (int) (byte) -1, (int) '4', (int) (short) -1, false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder9.addRecurringSavings("", (int) ' ', (int) ' ', (int) (byte) -1, 'a', (int) (short) 100, (int) ' ', (int) (byte) 10, true, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder9.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder9.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (short) 1);
        java.io.OutputStream outputStream41 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", outputStream41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder9.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder16.setFixedSavings("", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder19.addCutover(0, '4', (int) ' ', 0, (int) (short) 100, false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder10.setStandardOffset(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder10.addRecurringSavings("", (int) 'a', (int) (byte) 0, 0, 'a', 100, (int) (short) 0, (int) (short) 0, false, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder10.addCutover(0, '#', 10, (int) (byte) -1, (int) (byte) 10, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder35.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeZoneBuilder35.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeZoneBuilder35.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream49 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("hi!", outputStream49);
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
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder30.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder30.setFixedSavings("", (int) (short) -1);
        java.io.DataOutput dataOutput41 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder30.writeTo("", dataOutput41);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder8.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) 'a', (int) '4', (int) (byte) 1, 'a', (int) (short) 100, (int) '#', (int) (short) -1, false, (int) 'a');
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder25.writeTo("", outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder20.addRecurringSavings("", (int) 'a', (int) (short) 10, (int) (short) -1, '4', (-1), (int) (short) 0, (int) (short) 1, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) 'a');
        java.io.DataOutput dataOutput39 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("hi!", dataOutput39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder8.setStandardOffset((int) (short) 100);
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder8.writeTo("", dataOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder10.setFixedSavings("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder19.addCutover((int) ' ', ' ', 100, (int) (short) 0, 100, false, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) '4', (int) '#', (int) ' ', '#', (int) (short) 10, (int) (short) 10, (int) 'a', true, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder17.toDateTimeZone("", false);
        java.io.DataOutput dataOutput33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("", dataOutput33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder40.addRecurringSavings("", (int) (byte) -1, (int) (byte) 100, (int) (short) 10, '#', (int) 'a', (-1), (int) (byte) 0, false, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder62 = dateTimeZoneBuilder40.addRecurringSavings("hi!", 1, (int) (short) 0, (int) (short) 1, '#', 10, (int) (byte) -1, (int) (byte) 10, true, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder35.setFixedSavings("", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder35.addCutover(10, ' ', (int) '#', (int) (short) 10, (int) 'a', false, (int) '4');
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder13.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder13.addRecurringSavings("hi!", (int) (byte) 100, 1, (int) (byte) 10, '#', (int) (byte) 100, 1, 100, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder2.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("hi!", false);
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("hi!", dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) ' ');
        java.lang.Class<?> wildcardClass15 = dateTimeZoneBuilder6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder9.addCutover((int) (byte) 10, ' ', 1, (int) (byte) 1, (int) (short) 10, true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) -1, (int) '#', (int) (byte) -1, ' ', (int) (byte) -1, (int) (short) 100, 0, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder28.setStandardOffset((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder32.addCutover(1, '#', 100, (int) (byte) 1, (int) (short) 0, true, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder5.addCutover((int) (short) 0, 'a', (int) (byte) 10, 0, (int) (short) 1, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder11.addRecurringSavings("", (int) 'a', 100, 0, 'a', (-1), (int) '#', (int) (byte) 100, true, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder11.setFixedSavings("", (int) (byte) 100);
        java.io.DataOutput dataOutput30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder11.writeTo("", dataOutput30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder10.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", true);
        java.io.DataOutput dataOutput27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("hi!", dataOutput27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder28.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder28.addRecurringSavings("", 0, 0, (-1), '#', (int) (byte) 100, (int) (short) 0, (int) (byte) 100, true, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (byte) 100, 10, 10, ' ', 10, (int) ' ', 100, false, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder23.addCutover((int) ' ', '#', (int) (short) 100, (int) '#', 1, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
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
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass14 = dateTimeZoneBuilder10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder3.addCutover((int) (short) 10, 'a', (int) 'a', 100, (int) (short) 0, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) (short) 100, (int) (byte) 1, '#', (int) ' ', (int) (short) 100, (int) (short) 0, true, 100);
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder11.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder11.setStandardOffset((int) (short) -1);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder11.writeTo("", outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder7.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.addCutover((int) (short) 1, ' ', (int) (short) 1, (int) '#', (int) (byte) 0, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder28.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder28.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder28.setStandardOffset((int) '4');
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder38.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder10.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 0);
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder24.writeTo("hi!", outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder15.addCutover(0, '#', (int) 'a', (int) ' ', (int) (byte) 0, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) 1, (int) (byte) 10, (int) '#', 'a', (int) (short) -1, 1, (int) (byte) 10, false, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder33.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder38.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder43.setFixedSavings("", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder46.addCutover((int) (short) 0, ' ', 100, 1, 1, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeZoneBuilder38.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeZoneBuilder38.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTimeZoneBuilder38.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder38.setStandardOffset((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder63 = dateTimeZoneBuilder38.addRecurringSavings("", 1, (int) (byte) 1, (int) (byte) 10, '#', (int) ' ', (int) (short) 10, 0, false, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addRecurringSavings("hi!", 100, (int) (byte) 100, 0, '4', (int) (short) 100, 0, (int) (byte) -1, true, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder13.addRecurringSavings("hi!", (int) '#', (-1), (int) (byte) 1, '4', 10, (int) 'a', (int) (short) 0, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder0.addCutover((int) (short) 0, '#', (int) (byte) 10, (int) 'a', 1, false, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) -1, '4', (int) (short) 10, (int) '#', (int) '4', true, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder25.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder25.addRecurringSavings("hi!", (int) (short) 0, (int) (short) 0, (int) (byte) 0, '4', (int) '4', (int) (byte) 100, (-1), true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (short) 1, 100, (int) (byte) -1, 'a', 0, (int) (byte) 1, (int) (byte) 0, true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = dateTimeZoneBuilder26.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 100, (int) '4', (int) (byte) 0, ' ', (-1), (int) (short) -1, (int) ' ', false, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) 'a');
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addRecurringSavings("", (int) (short) 0, 0, (int) 'a', '#', (int) (short) 100, (-1), (int) (short) 10, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder20.addCutover(1, '4', 0, (int) ' ', (int) (short) 100, false, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", (int) 'a', (int) '#', 100, ' ', (int) (byte) 100, (int) ' ', (int) ' ', false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder35.addRecurringSavings("hi!", (int) 'a', (int) (byte) 1, (int) (short) 1, ' ', (int) (short) 0, (int) 'a', (int) (byte) 10, false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder9.addRecurringSavings("", (int) ' ', (int) ' ', (int) (byte) -1, 'a', (int) (short) 100, (int) ' ', (int) (byte) 10, true, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder31.setFixedSavings("", (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeZoneBuilder34.toDateTimeZone("", true);
        java.io.OutputStream outputStream39 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder34.writeTo("hi!", outputStream39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder17.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addCutover((int) (byte) 100, '4', (int) (byte) 0, 0, 1, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", 0);
        java.io.DataOutput dataOutput40 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder38.writeTo("", dataOutput40);
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
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        java.io.DataOutput dataOutput43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder38.writeTo("", dataOutput43);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder33.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) (short) 100);
        java.lang.Class<?> wildcardClass41 = dateTimeZoneBuilder40.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder18.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder18.setFixedSavings("hi!", 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder10.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder10.setStandardOffset((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder10.addCutover(0, 'a', (int) (short) 0, 0, (-1), true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        java.io.DataOutput dataOutput51 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("", dataOutput51);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 0);
        java.io.DataOutput dataOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", dataOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("", (int) ' ', 0, (int) (byte) 0, '4', (int) (short) 1, 10, 1, false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.addCutover(100, ' ', 0, (int) (byte) 100, (int) (byte) 1, false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) -1, '4', (int) (short) 10, (int) '#', (int) '4', true, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("hi!", outputStream29);
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
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder2.addRecurringSavings("hi!", (int) '#', (int) '4', (int) (short) 0, '4', (int) (short) -1, (-1), (int) (byte) -1, false, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder18.addCutover((int) (byte) 0, 'a', (int) 'a', 0, 0, true, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder17.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) 'a', (-1), (int) (short) 0, ' ', (int) (short) 10, (int) ' ', (int) (byte) 100, false, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder35.setFixedSavings("", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder41.addRecurringSavings("hi!", (int) (short) 100, 0, (int) '4', '#', (int) (byte) 10, (int) (short) 100, 0, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 0);
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.addRecurringSavings("", (int) (byte) 10, 10, 0, 'a', (int) (byte) -1, (int) 'a', 10, false, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder28.addCutover(0, '#', (int) (short) -1, (int) (byte) 1, (int) '#', true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder28.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder28.setFixedSavings("", (int) ' ');
        java.io.DataOutput dataOutput38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder28.writeTo("hi!", dataOutput38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder26.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder29.addRecurringSavings("", (int) (byte) 10, (int) ' ', 0, '4', (int) (short) 1, (int) ' ', 10, true, 0);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeZoneBuilder40.toDateTimeZone("", false);
        java.io.OutputStream outputStream45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder40.writeTo("", outputStream45);
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
        org.junit.Assert.assertNotNull(dateTimeZone43);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder21.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder26.addRecurringSavings("", (int) (short) -1, (int) (short) 10, 0, '#', (int) (byte) -1, 10, (int) (byte) 10, false, (int) (short) 1);
        java.io.OutputStream outputStream39 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder26.writeTo("hi!", outputStream39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) 'a');
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("", dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.addRecurringSavings("", 10, 0, (int) (byte) -1, 'a', 0, (-1), (int) (byte) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder22.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        java.io.DataOutput dataOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("", dataOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset((int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = dateTimeZoneBuilder13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder45.addCutover(0, ' ', (int) (byte) 10, (int) 'a', (int) ' ', false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
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
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("hi!", (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder11.toDateTimeZone("", false);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder11.writeTo("", outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder15.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder15.setStandardOffset((int) (byte) 0);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder15.writeTo("", outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder36.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder41.setStandardOffset((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder43.addRecurringSavings("hi!", (int) (byte) -1, (int) (short) -1, 0, 'a', 10, (int) (short) 10, (int) (byte) 100, true, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("hi!", 0);
        java.lang.Class<?> wildcardClass15 = dateTimeZoneBuilder14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) -1, '4', (int) (short) 10, (int) '#', (int) '4', true, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder22.toDateTimeZone("", false);
        java.io.OutputStream outputStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("", outputStream32);
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
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder8.setFixedSavings("", (int) (byte) 0);
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder8.writeTo("hi!", dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder6.addCutover((int) (byte) -1, '#', 1, (int) (short) 10, (int) (short) 10, true, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder33.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder38.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder38.setFixedSavings("", (int) (short) 0);
        java.io.OutputStream outputStream48 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder46.writeTo("", outputStream48);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder9.addRecurringSavings("", (int) ' ', (int) ' ', (int) (byte) -1, 'a', (int) (short) 100, (int) ' ', (int) (byte) 10, true, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder9.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder34.setStandardOffset((int) (short) 1);
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder34.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder14.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.addRecurringSavings("", (int) (byte) 100, (int) (short) 100, (int) (short) 10, '#', (int) (byte) 0, 0, 0, false, 10);
        java.io.OutputStream outputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("", outputStream30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder2.addRecurringSavings("", (-1), (int) (byte) 1, (-1), 'a', (int) (byte) -1, (-1), (int) (short) 0, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder2.setStandardOffset((int) '4');
        java.lang.Class<?> wildcardClass22 = dateTimeZoneBuilder21.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder28.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder28.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder28.setStandardOffset((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder28.addRecurringSavings("hi!", (int) (short) 1, (int) (short) 10, (int) '#', '4', (int) ' ', (int) (short) 0, (int) (byte) 1, false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder8.setStandardOffset((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.addCutover(0, ' ', (int) 'a', (int) '#', (int) (byte) -1, false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder40.addCutover((int) (short) 100, '4', 100, (int) (short) 10, (int) (byte) 1, true, 100);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addRecurringSavings("hi!", 100, (int) (byte) 100, 0, '4', (int) (short) 100, 0, (int) (byte) -1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder13.setStandardOffset((int) (short) 10);
        java.lang.Class<?> wildcardClass18 = dateTimeZoneBuilder17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addRecurringSavings("hi!", 100, (int) (byte) 100, 0, '4', (int) (short) 100, 0, (int) (byte) -1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder13.setStandardOffset((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder13.addRecurringSavings("", (int) (short) 10, 1, (int) (short) 100, '#', (int) (byte) 0, (int) (byte) 0, (int) (short) 0, true, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder20.addCutover(0, 'a', (int) (byte) 100, (int) (short) -1, (int) '4', true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder12.addRecurringSavings("hi!", (int) (byte) -1, (int) (short) 0, (int) (byte) 10, 'a', (int) (short) 10, 0, 100, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder36.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder39.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeZoneBuilder41.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder17.addCutover((int) (short) -1, '#', (int) (byte) -1, (int) (short) 0, 100, true, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder20.toDateTimeZone("", true);
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder2.addRecurringSavings("hi!", (int) '#', (int) '4', (int) (short) 0, '4', (int) (short) -1, (-1), (int) (byte) -1, false, (int) (byte) 0);
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder18.writeTo("hi!", outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = dateTimeZoneBuilder20.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder40.addRecurringSavings("", (int) (byte) -1, (int) (byte) 100, (int) (short) 10, '#', (int) 'a', (-1), (int) (byte) 0, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder51.setStandardOffset(100);
        java.io.OutputStream outputStream55 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder53.writeTo("hi!", outputStream55);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder53);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder20.addRecurringSavings("hi!", (int) (byte) 10, (int) ' ', (int) (short) 1, '#', (int) (byte) -1, 0, (int) (short) -1, true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("hi!", 1, (int) '4', 1, '4', (int) (byte) 1, 1, (int) '4', false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder44.setStandardOffset((int) (short) 100);
        java.io.OutputStream outputStream48 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("hi!", outputStream48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder10.addCutover((int) 'a', '4', (int) (short) 10, 10, (int) (byte) 100, false, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder11.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder11.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder11.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder18.setFixedSavings("", 10);
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder18.writeTo("hi!", outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder29.addCutover((int) (byte) 1, 'a', (int) '#', 0, 0, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder38.addRecurringSavings("", (-1), (int) '4', (int) 'a', '#', (int) (byte) 10, (int) '#', (-1), true, (int) (byte) 0);
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
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder9.addRecurringSavings("", (int) ' ', (int) ' ', (int) (byte) -1, 'a', (int) (short) 100, (int) ' ', (int) (byte) 10, true, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder9.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder9.setStandardOffset(10);
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder12.addRecurringSavings("hi!", (int) (short) 100, (int) (byte) 10, (int) (short) -1, '4', (int) (byte) 0, (int) (byte) 0, (int) (byte) 10, false, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder12.addCutover(10, ' ', 1, 10, (int) (short) 10, true, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder25.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) (short) 10);
        java.io.OutputStream outputStream33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder25.writeTo("hi!", outputStream33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (-1), (int) 'a', (int) (short) 10, 'a', (int) ' ', (int) (short) 0, (int) (byte) 10, true, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (byte) 0);
        java.io.OutputStream outputStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder30.writeTo("hi!", outputStream32);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        java.lang.Class<?> wildcardClass18 = dateTimeZoneBuilder15.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.addRecurringSavings("hi!", 10, 100, 10, '#', 1, (int) (byte) 10, (int) (short) 1, true, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder14.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        java.io.DataOutput dataOutput38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("hi!", dataOutput38);
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
        org.junit.Assert.assertNotNull(dateTimeZone36);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder24.setStandardOffset((int) (short) 0);
        java.lang.Class<?> wildcardClass30 = dateTimeZoneBuilder29.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.addRecurringSavings("hi!", 10, 100, 10, '#', 1, (int) (byte) 10, (int) (short) 1, true, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder14.toDateTimeZone("", true);
        java.io.OutputStream outputStream35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("", outputStream35);
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
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder20.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("hi!", outputStream30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder36.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder39.setStandardOffset(0);
        java.io.OutputStream outputStream43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder39.writeTo("", outputStream43);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder28.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder28.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder28.setStandardOffset((int) '4');
        java.io.OutputStream outputStream40 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder28.writeTo("hi!", outputStream40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder23.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder29.setFixedSavings("hi!", 10);
        java.io.OutputStream outputStream34 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder32.writeTo("", outputStream34);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = dateTimeZoneBuilder13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder10.toDateTimeZone("hi!", true);
        java.io.DataOutput dataOutput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("hi!", dataOutput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) '#');
        java.io.DataOutput dataOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", dataOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder19.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) -1);
        java.io.DataOutput dataOutput29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", dataOutput29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder9.setStandardOffset((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder9.addCutover((int) '4', 'a', (int) (short) 100, 100, 100, false, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder5.addCutover((int) (short) 0, 'a', 0, (int) ' ', (int) ' ', false, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder35.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) (byte) 1);
        java.lang.Class<?> wildcardClass41 = dateTimeZoneBuilder38.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.addRecurringSavings("", 10, 0, (int) (byte) -1, 'a', 0, (-1), (int) (byte) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder22.setStandardOffset(0);
        java.lang.Class<?> wildcardClass27 = dateTimeZoneBuilder26.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = dateTimeZoneBuilder6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder22.setFixedSavings("", (int) ' ');
        java.io.DataOutput dataOutput30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder28.writeTo("hi!", dataOutput30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) '#', (int) (short) 100, 0, 'a', (int) (byte) 0, 0, (int) (byte) 1, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder22.addCutover((int) 'a', ' ', 0, (int) (short) 1, (int) (byte) 0, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder8.addRecurringSavings("hi!", (int) (byte) 0, (int) '4', (int) (short) 0, '#', (int) (short) 100, (int) (short) 1, 1, false, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder19.addCutover((int) (short) 100, 'a', (int) (short) 1, (int) (short) 0, (int) (byte) 10, true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder36.setFixedSavings("", (int) ' ');
        java.io.OutputStream outputStream41 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder39.writeTo("hi!", outputStream41);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder41.setFixedSavings("", 10);
        java.lang.Class<?> wildcardClass45 = dateTimeZoneBuilder41.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addRecurringSavings("", 10, (int) '4', (int) (byte) -1, '#', (int) (short) 1, (int) (short) 100, (int) '4', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) -1);
        java.io.DataOutput dataOutput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder33.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder41.setFixedSavings("", (int) (short) -1);
        java.io.OutputStream outputStream46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("", outputStream46);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addRecurringSavings("hi!", 100, (int) (byte) 100, 0, '4', (int) (short) 100, 0, (int) (byte) -1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder2.addCutover((int) (short) 10, 'a', (int) (short) 1, (int) (byte) 1, (int) (short) 100, true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) -1, '4', (int) (short) 10, (int) '#', (int) '4', true, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset(0);
        java.lang.Class<?> wildcardClass28 = dateTimeZoneBuilder27.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) -1, (int) (short) 0, (int) (byte) 1, '#', (int) (byte) 1, (int) '4', (int) 'a', true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder12.addRecurringSavings("", (int) (byte) 100, (int) '4', (int) (byte) 0, 'a', (int) (short) 10, (int) (short) 1, (int) (byte) 1, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder12.setStandardOffset(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder12.addRecurringSavings("", 100, (int) (byte) 0, (int) '#', '#', 0, (int) (short) 10, (int) (byte) 10, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder14.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.setStandardOffset((-1));
        java.io.DataOutput dataOutput35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("hi!", dataOutput35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder2.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (byte) 10);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("", outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 100);
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("", dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (-1), (int) (byte) 1, 0, '#', 10, (int) (byte) 1, 0, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder33.setStandardOffset((int) '4');
        java.lang.Class<?> wildcardClass38 = dateTimeZoneBuilder37.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder23.setFixedSavings("", (int) (short) 1);
        java.io.DataOutput dataOutput31 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder29.writeTo("", dataOutput31);
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
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        java.io.OutputStream outputStream42 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder40.writeTo("", outputStream42);
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
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (short) 100, (int) '#', (int) (byte) 10, ' ', (int) (byte) -1, 0, 0, true, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass24 = dateTimeZone23.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder2.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder4.addCutover((int) (short) 10, 'a', 0, (int) (byte) 0, (int) (byte) -1, true, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("hi!", 100, (int) (byte) 100, 1, 'a', (int) (byte) 0, (int) (byte) 10, (int) 'a', false, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("", (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = dateTimeZoneBuilder26.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.addCutover((int) (byte) -1, ' ', 0, 100, 1, true, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder11.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder11.setFixedSavings("hi!", (-1));
        java.lang.Class<?> wildcardClass17 = dateTimeZoneBuilder11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder36.addRecurringSavings("", (int) '4', (int) (short) 100, (int) (short) 0, ' ', 1, (int) (byte) 0, (int) (byte) -1, true, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder49.addRecurringSavings("", 10, (int) 'a', 10, 'a', (int) (short) 10, 10, 100, false, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone63 = dateTimeZoneBuilder60.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass64 = dateTimeZoneBuilder60.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addRecurringSavings("hi!", 100, (int) (byte) 100, 0, '4', (int) (short) 100, 0, (int) (byte) -1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder13.addCutover((int) (byte) 100, ' ', 0, (int) '4', (int) ' ', true, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (short) 100, (int) '#', (int) (byte) 10, ' ', (int) (byte) -1, 0, 0, true, (int) (byte) 1);
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("", outputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder11.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder11.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder11.setFixedSavings("", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder18.addCutover((int) (byte) 10, ' ', (int) (byte) -1, 100, 1, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) -1, '4', (int) (short) 10, (int) '#', (int) '4', true, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder27.addRecurringSavings("", (int) (short) 0, (int) ' ', (int) (short) 1, ' ', (int) ' ', (int) ' ', (int) (short) 100, false, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder38.addRecurringSavings("", 1, (int) (short) 10, (-1), '4', (int) (short) 10, (int) (short) 10, 0, false, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder49.addCutover((int) (byte) 1, '4', (int) (short) 10, (int) (byte) 100, (int) (byte) 100, false, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder20.addRecurringSavings("hi!", (int) (byte) 10, (int) ' ', (int) (short) 1, '#', (int) (byte) -1, 0, (int) (short) -1, true, (int) (byte) 10);
        java.lang.Class<?> wildcardClass34 = dateTimeZoneBuilder20.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder12.writeTo("hi!", outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder5.setFixedSavings("", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder10.addCutover((int) (short) 0, ' ', 0, 1, 0, true, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addRecurringSavings("hi!", 100, (int) (byte) 100, 0, '4', (int) (short) 100, 0, (int) (byte) -1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder15.setFixedSavings("hi!", (int) (short) 10);
        java.io.DataOutput dataOutput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder15.writeTo("hi!", dataOutput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder3.setFixedSavings("", 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder15.addCutover((int) (byte) 100, '4', (-1), 0, (int) ' ', false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = dateTimeZoneBuilder12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.addRecurringSavings("", 10, 0, (int) (byte) -1, 'a', 0, (-1), (int) (byte) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (byte) 10);
        java.io.DataOutput dataOutput32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder30.writeTo("hi!", dataOutput32);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder7.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder7.setFixedSavings("hi!", 0);
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("hi!", outputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder11.addRecurringSavings("", (int) 'a', 100, 0, 'a', (-1), (int) '#', (int) (byte) 100, true, (int) (short) 0);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder11.writeTo("hi!", outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder13.addRecurringSavings("", (int) (byte) -1, 0, (int) (short) 100, 'a', 0, 100, (int) (byte) 1, false, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder2.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder2.setStandardOffset((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder2.addCutover((int) (byte) 100, '4', (int) 'a', (int) (short) 10, (int) (byte) 1, true, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder15.setFixedSavings("", (int) '#');
        java.lang.Class<?> wildcardClass21 = dateTimeZoneBuilder15.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) ' ', 1, (int) (byte) 0, '#', (int) (byte) 1, (int) (short) 10, (-1), false, 10);
        java.io.DataOutput dataOutput35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("", dataOutput35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder20.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder20.addCutover((int) (short) -1, 'a', (int) '#', (int) (byte) 10, (int) (byte) 100, false, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder10.setStandardOffset(100);
        java.lang.Class<?> wildcardClass13 = dateTimeZoneBuilder10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = dateTimeZoneBuilder12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 0, (int) (byte) 0, (int) (short) 0, '4', (int) (short) -1, (int) (byte) 100, 100, false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("", (int) (short) 1);
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("hi!", dataOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setStandardOffset(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("hi!", (int) (short) 100, (int) (short) 100, (int) (short) 100, ' ', (-1), (int) '#', 10, true, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
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
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (short) 1, 100, (int) (byte) -1, 'a', 0, (int) (byte) 1, (int) (byte) 0, true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder9.addRecurringSavings("", 0, (int) (byte) -1, (int) (short) 1, 'a', (int) (short) 100, (int) (byte) 1, (int) (byte) 0, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder15.setFixedSavings("hi!", 1);
        java.lang.Class<?> wildcardClass21 = dateTimeZoneBuilder15.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder7.addRecurringSavings("", (int) (short) 10, 100, 0, 'a', (int) (byte) 10, (int) '4', (int) (byte) 10, true, (int) '#');
        java.io.DataOutput dataOutput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("", dataOutput23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) '4', (int) '#', (int) ' ', '#', (int) (short) 10, (int) (short) 10, (int) 'a', true, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (byte) 0);
        java.lang.Class<?> wildcardClass32 = dateTimeZoneBuilder31.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder10.setFixedSavings("hi!", 0);
        java.lang.Class<?> wildcardClass20 = dateTimeZoneBuilder19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        java.lang.Class<?> wildcardClass18 = dateTimeZoneBuilder15.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", 1, (int) (byte) 10, 0, 'a', 10, 1, (int) '4', false, (int) (short) 100);
        java.io.OutputStream outputStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", outputStream32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addCutover(10, ' ', (int) (short) 0, (int) '#', (int) (short) 0, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder7.addRecurringSavings("", (int) (byte) 10, 0, 100, '4', (-1), 0, (int) (byte) 100, true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder20.addRecurringSavings("", (int) 'a', (int) (short) 10, (int) (short) -1, '4', (-1), (int) (short) 0, (int) (short) 1, true, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder34.addCutover((int) (byte) 10, ' ', 100, 0, (int) (byte) 10, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder2.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder2.setStandardOffset((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder15.addCutover((int) (short) 1, '#', (int) (byte) 0, (int) 'a', 0, false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder15.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (-1), (int) 'a', (int) (short) 10, 'a', (int) ' ', (int) (short) 0, (int) (byte) 10, true, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder30.addCutover((int) '4', '#', 0, (int) (byte) -1, (int) (short) 100, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("", 10);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("", outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.addRecurringSavings("", 10, 0, (int) (byte) -1, 'a', 0, (-1), (int) (byte) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder7.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder24.setStandardOffset((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder26.addCutover((int) ' ', ' ', (int) '#', (int) (byte) -1, 10, true, 10);
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        java.io.DataOutput dataOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("", dataOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder2.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder2.addRecurringSavings("", (int) (byte) -1, (int) '4', (int) (byte) 1, '#', (int) (short) -1, (int) (short) 10, 0, true, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = dateTimeZoneBuilder2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (-1), 0, (int) (short) 1, '4', (int) (byte) -1, 0, 1, false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }
}

