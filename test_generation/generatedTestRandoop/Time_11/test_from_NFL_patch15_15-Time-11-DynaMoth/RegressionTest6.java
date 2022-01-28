import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) (short) 100, (int) ' ', (int) (short) 10, 'a', (int) (short) 0, (int) (byte) -1, (int) (short) 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder10.addRecurringSavings("", (-1), (-1), (int) (byte) 0, ' ', (int) '4', (int) (short) 0, (-1), true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder10.addRecurringSavings("", (int) '4', (int) (short) 0, (int) (short) 1, ' ', (int) '#', (int) (byte) 0, (int) (short) -1, false, 10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder10.toDateTimeZone("", true);
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
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder23.addRecurringSavings("", (int) (short) 0, (int) (byte) 1, (int) (byte) 10, '4', (int) ' ', (int) '#', 10, true, (int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder10.addCutover((int) (byte) 1, '#', 1, (-1), (int) (byte) -1, true, (int) '#');
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
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder21.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder26.setFixedSavings("hi!", (int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder8.setFixedSavings("", (int) (byte) 10);
        java.io.DataOutput dataOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder8.writeTo("hi!", dataOutput13);
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
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("hi!", 100);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder14.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass18 = dateTimeZone17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 0, (int) '4', (int) (byte) 0, 'a', (int) (byte) -1, 0, 1, false, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder17.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", 0, (int) (byte) 0, 10, 'a', (int) (byte) -1, (int) (short) -1, (int) (short) -1, false, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder31.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder34.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder36.setFixedSavings("", (int) (short) 10);
        java.lang.Class<?> wildcardClass40 = dateTimeZoneBuilder36.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder28.setFixedSavings("", (int) (byte) 10);
        java.io.DataOutput dataOutput33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder28.writeTo("hi!", dataOutput33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder17.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) '#');
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder28.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder28.addRecurringSavings("", 100, (int) '#', (int) 'a', ' ', (-1), 0, (int) (short) 100, true, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder17.addRecurringSavings("", 10, (int) (byte) 10, (int) '4', '#', (int) (byte) 0, (int) 'a', (int) ' ', true, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone56 = dateTimeZoneBuilder17.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder59 = dateTimeZoneBuilder17.setFixedSavings("", 100);
        java.io.DataOutput dataOutput61 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("", dataOutput61);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder53);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder59);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder8.setFixedSavings("", (-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (byte) 1, 100, (int) '4', ' ', (int) '4', (int) ' ', (int) (short) 10, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder17.setStandardOffset((int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '#');
        java.lang.Class<?> wildcardClass9 = dateTimeZoneBuilder8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder49.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder51.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone56 = dateTimeZoneBuilder53.toDateTimeZone("hi!", false);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder53);
        org.junit.Assert.assertNotNull(dateTimeZone56);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 0, (int) '4', (int) (byte) 0, 'a', (int) (byte) -1, 0, 1, false, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = dateTimeZoneBuilder17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (byte) 100, (int) '4', (int) (short) -1, 'a', (int) (short) 0, 0, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder44.addRecurringSavings("", 10, (int) (short) 100, (int) (short) 0, 'a', (-1), (int) (byte) 100, 0, false, 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder31.setStandardOffset((int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (byte) 1, (int) (byte) -1, 0, '4', (int) ' ', (int) ' ', (int) (byte) 100, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 10);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", outputStream27);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("", (-1), (int) 'a', (int) (short) 10, 'a', (int) ' ', (int) (short) 0, (int) (byte) 10, true, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeZoneBuilder44.toDateTimeZone("", true);
        java.io.OutputStream outputStream49 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("", outputStream49);
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
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = dateTimeZoneBuilder25.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder14.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder30.addRecurringSavings("", (int) '4', 100, (-1), '#', (int) '#', (int) (short) 10, 0, true, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addRecurringSavings("", (int) ' ', (int) (byte) 0, (int) '#', '4', (int) '4', (int) '#', (int) '4', true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder11.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("", (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '#', (int) 'a', (int) (short) 1, 'a', (int) (short) -1, (int) (short) -1, (int) ' ', false, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.addRecurringSavings("", 0, (int) (byte) -1, (int) '4', 'a', (int) (byte) 10, (int) '4', (-1), false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("hi!", (int) '#', (int) 'a', 10, '4', (int) (byte) 10, (int) (short) 1, (-1), false, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeZoneBuilder33.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder30.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder38.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        org.joda.time.DateTimeZone dateTimeZone45 = dateTimeZoneBuilder42.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZone45);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (byte) 10, 0, (int) ' ', '#', 0, 1, (int) (short) -1, true, (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder47.addRecurringSavings("", 100, 10, 0, ' ', (int) (short) 100, (int) ' ', (int) (byte) 1, false, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder69 = dateTimeZoneBuilder47.addRecurringSavings("", (int) (byte) 1, (int) (short) 10, (int) (byte) 100, '#', (int) (short) 100, (int) (short) 10, (int) '4', false, 0);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder69);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder63 = dateTimeZoneBuilder52.addRecurringSavings("", (int) (byte) -1, (-1), (int) (byte) 0, 'a', (int) (byte) 100, (int) (byte) 10, 0, false, (int) ' ');
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder63);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder35.setStandardOffset((int) (short) 1);
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
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder14.setFixedSavings("hi!", 10);
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder36.getClass();
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder14.setFixedSavings("", (int) ' ');
        java.io.OutputStream outputStream37 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("hi!", outputStream37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) -1);
        java.io.DataOutput dataOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder12.writeTo("", dataOutput19);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.addRecurringSavings("", 0, 0, 0, '4', (int) '4', 0, (int) (short) 100, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder3.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder31.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) '4');
        java.lang.Class<?> wildcardClass36 = dateTimeZoneBuilder33.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) 'a', (int) (short) 1, (int) 'a', '4', (int) ' ', (int) (short) 100, (int) ' ', true, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder22.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder38.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder40.setFixedSavings("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder12.toDateTimeZone("hi!", false);
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
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder17.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (short) 100, (int) (short) 0, (int) (byte) 0, '#', (int) '#', 0, 1, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder21.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 0);
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder21.writeTo("", outputStream23);
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
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.setStandardOffset(1);
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", dataOutput16);
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
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder10.setStandardOffset((int) ' ');
        java.io.DataOutput dataOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder15.writeTo("hi!", dataOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (byte) 10, (int) (short) -1, 0, '4', (int) (byte) 100, (-1), (int) (byte) 0, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder29.addRecurringSavings("", 1, (int) 'a', (int) (short) 100, '4', 0, (int) (short) 100, (int) (byte) 10, true, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("", (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder25.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass32 = dateTimeZoneBuilder25.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder27.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder27.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder32.setStandardOffset(100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder8.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder8.setFixedSavings("", (int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.addRecurringSavings("", (int) (byte) 100, (int) (byte) 1, (int) (byte) 100, '4', 100, (int) (byte) 100, (int) (byte) 10, true, (int) (short) 10);
        java.lang.Class<?> wildcardClass26 = dateTimeZoneBuilder14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder3.addRecurringSavings("", 0, (int) (byte) 1, (int) (short) 0, ' ', (int) (short) -1, (int) ' ', (int) (byte) 100, true, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '#', (int) 'a', (int) (short) 1, 'a', (int) (short) -1, (int) (short) -1, (int) ' ', false, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.addRecurringSavings("", 0, (int) (byte) -1, (int) '4', 'a', (int) (byte) 10, (int) '4', (-1), false, 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder30.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder30.setFixedSavings("", 1);
        java.io.DataOutput dataOutput38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder30.writeTo("hi!", dataOutput38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder38.setFixedSavings("hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass42 = dateTimeZoneBuilder41.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (short) 100, (int) '#', (int) (short) 1, 'a', 100, 1, (int) (byte) 0, false, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) (byte) 0, '4', (int) (short) 10, (int) '#', (int) (short) 100, false, (-1));
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder19.addRecurringSavings("", (int) '#', (int) ' ', (int) ' ', '4', (int) (byte) 0, 1, 0, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", 0, (int) (short) 0, (int) (short) 0, ' ', (int) (short) -1, (int) '#', (int) (short) 0, false, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder19.setFixedSavings("", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", (-1), (int) (short) 10, 0, 'a', (int) (short) -1, (int) '4', (int) (byte) 0, false, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder47.setFixedSavings("hi!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.addRecurringSavings("hi!", 0, (int) ' ', 1, 'a', (int) (byte) 1, (int) (byte) 100, (int) (byte) 100, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (short) 10, (int) '#', (-1), '4', (int) ' ', (int) 'a', (int) (byte) 0, true, (int) '4');
        java.lang.Class<?> wildcardClass29 = dateTimeZoneBuilder28.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) (byte) 0, '4', (int) (short) 10, (int) '#', (int) (short) 100, false, (-1));
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        java.io.DataOutput dataOutput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", dataOutput24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder12.addRecurringSavings("hi!", (-1), 100, (int) (byte) -1, '#', (int) (byte) 100, (int) (short) 1, (int) '#', false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("hi!", (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder23.setStandardOffset(1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("", 0, (int) (byte) 1, (int) (byte) 100, '#', (int) ' ', (int) (short) 10, (int) (short) 10, false, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("", 1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder9.toDateTimeZone("", false);
        java.io.OutputStream outputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", outputStream30);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder20.addRecurringSavings("", 100, (int) (byte) 0, (int) '#', '#', 0, (int) (short) 10, (int) (byte) 10, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder36.addRecurringSavings("", 10, (int) (short) 100, (int) (short) 100, '#', 0, 0, (-1), true, (int) '#');
        java.lang.Class<?> wildcardClass50 = dateTimeZoneBuilder36.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder3.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder3.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.setFixedSavings("hi!", 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addRecurringSavings("", (int) ' ', (int) (byte) 0, (int) '#', '4', (int) '4', (int) '#', (int) '4', true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder11.setFixedSavings("hi!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder18.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder18.setStandardOffset(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder24.addCutover((int) (short) -1, 'a', (int) (byte) 1, (int) (byte) -1, (int) (short) 0, false, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder5.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder5.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder5.addCutover((int) (byte) 100, '4', (int) (short) 10, (int) (byte) -1, 10, true, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
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
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (byte) 0, (int) (short) 1, 100, 'a', 0, (int) 'a', (int) (byte) 0, true, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder0.setStandardOffset(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder0.addCutover((int) (short) 0, '4', (int) (short) 1, 0, (int) 'a', false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) 1, (int) ' ', (int) (short) 10, '4', (-1), (int) ' ', (int) (short) -1, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder3.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder26.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder30.setStandardOffset((int) ' ');
        java.io.DataOutput dataOutput34 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder30.writeTo("", dataOutput34);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder81 = dateTimeZoneBuilder70.addRecurringSavings("hi!", 0, (int) (byte) 10, (int) (short) 0, 'a', (int) 'a', 0, 100, true, 0);
        java.io.DataOutput dataOutput83 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder81.writeTo("", dataOutput83);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder53);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder59);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder70);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder81);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder20.setStandardOffset((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder24.addRecurringSavings("hi!", (int) (short) -1, (-1), (int) (short) 100, 'a', (int) '4', (int) (short) 10, (int) (byte) -1, true, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder68 = dateTimeZoneBuilder44.addCutover((int) (short) 1, 'a', (int) 'a', 100, (int) ' ', false, (-1));
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder32.setStandardOffset((int) (byte) 10);
        java.io.DataOutput dataOutput36 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder32.writeTo("hi!", dataOutput36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (byte) 10, (int) 'a', 'a', (int) (short) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 0, '#', (-1), (-1), (-1), false, (int) (byte) 10);
        java.lang.Class<?> wildcardClass42 = dateTimeZoneBuilder41.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 100, (int) (short) 100, (int) (byte) -1, 'a', (int) (short) -1, 100, (int) (byte) 1, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.addRecurringSavings("hi!", 0, (int) (short) 1, (int) (short) 0, ' ', (int) (byte) 1, (int) (byte) 10, (int) ' ', true, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder22.addCutover((int) (byte) 0, '#', 1, (int) (byte) 100, (int) (byte) -1, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("hi!", (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = dateTimeZoneBuilder13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder16.setFixedSavings("hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder10.setStandardOffset((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder10.addCutover(100, ' ', (int) (byte) 100, (int) '4', (int) (byte) 0, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder23.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("hi!", (int) 'a', (int) '#', (int) ' ', ' ', (int) (short) 0, 0, (int) (byte) 1, true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset((int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) 'a', (int) ' ', '4', 0, (int) ' ', (int) 'a', false, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) '4');
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder16.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = dateTimeZoneBuilder9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder10.addRecurringSavings("", (int) '#', 100, (int) (byte) 0, 'a', 1, 100, 10, false, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder21.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.addCutover((int) (short) 10, 'a', (int) (short) 10, (int) (short) 0, (int) (short) 100, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        java.lang.Class<?> wildcardClass5 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder8.setFixedSavings("", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder8.addCutover((int) (short) 100, ' ', (int) (byte) -1, (int) (short) 100, (int) (short) 10, false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.addRecurringSavings("", 0, 0, 0, '4', (int) '4', 0, (int) (short) 100, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder3.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder31.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) '4');
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder35.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder30.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("", (int) '#');
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 10);
        java.io.DataOutput dataOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder8.writeTo("", dataOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder0.setStandardOffset(0);
        java.io.OutputStream outputStream34 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder32.writeTo("hi!", outputStream34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder23.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTimeZoneBuilder45.toDateTimeZone("hi!", false);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
        org.junit.Assert.assertNotNull(dateTimeZone48);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder17.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder21.addCutover((int) (short) 0, '#', (-1), (int) (short) 10, 10, true, (int) (byte) 10);
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
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder28.addRecurringSavings("", 0, (int) '#', (int) (byte) 10, '#', (int) (short) 1, (-1), (int) (short) 100, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder39.addRecurringSavings("", (int) (byte) 1, (int) '4', (int) 'a', ' ', (int) (byte) 0, 0, (int) (short) 0, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder50.setFixedSavings("", (int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder53);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass14 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder18.setFixedSavings("", 0);
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder18.writeTo("hi!", outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) '#', 0, (int) '#', '4', (int) (byte) 10, (int) (byte) 10, (-1), false, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addRecurringSavings("hi!", 100, 100, (int) 'a', ' ', (int) (byte) 0, (int) (byte) 100, (int) (byte) -1, false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("", (int) (byte) 1);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("", outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder7.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder17.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) -1, 1, (-1), '#', (int) (byte) 100, (int) '#', (int) '4', true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("hi!", (int) (short) 10, (int) (short) 1, (int) '#', '#', (int) (byte) 1, (-1), (int) (short) 0, true, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (short) 100, (int) '#', (int) (short) 1, 'a', 100, 1, (int) (byte) 0, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder3.setFixedSavings("", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder15.addCutover((int) '4', 'a', 100, (int) (byte) 0, (int) (short) 10, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeZoneBuilder3.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeZoneBuilder3.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder3.setFixedSavings("hi!", (-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("", outputStream24);
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
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", outputStream26);
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
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("", (-1), (int) 'a', (int) (short) 10, 'a', (int) ' ', (int) (short) 0, (int) (byte) 10, true, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeZoneBuilder44.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (short) 1, (-1), (int) '#', '#', 0, 1, (int) (byte) 0, true, (int) (byte) 10);
        java.io.DataOutput dataOutput60 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("", dataOutput60);
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
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder7.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder7.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder7.addRecurringSavings("hi!", 100, (int) '#', (int) (byte) -1, 'a', (-1), (int) (byte) 100, (int) (short) -1, false, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder7.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder17.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", 10, (int) (byte) -1, (int) 'a', ' ', (int) (byte) 10, (int) '#', (int) (short) -1, false, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone50 = dateTimeZoneBuilder47.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 100, (int) '4', (int) (short) 0, '#', (int) ' ', (int) (byte) 0, 100, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder0.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder38.setFixedSavings("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder28.addRecurringSavings("hi!", 10, 100, 0, '4', (int) (byte) 1, (-1), (int) 'a', true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder39.setStandardOffset((-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        java.io.OutputStream outputStream62 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("", outputStream62);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", 100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder23.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeZoneBuilder6.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder11.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder11.addRecurringSavings("", (int) ' ', (int) '4', 0, 'a', (int) (byte) 100, (int) (byte) 1, (int) (short) 100, false, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder37.addRecurringSavings("", 100, (int) (byte) 100, (int) (short) 1, 'a', (int) (byte) 0, (int) 'a', (int) (byte) 100, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder37.setFixedSavings("", (-1));
        java.io.DataOutput dataOutput56 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder54.writeTo("hi!", dataOutput56);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder54);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("hi!", 0, (int) '4', 10, '#', (int) (short) -1, (int) (byte) 100, (int) '4', false, (int) (byte) 10);
        java.lang.Class<?> wildcardClass56 = dateTimeZoneBuilder55.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (byte) 1, (int) (byte) -1, 0, '4', (int) ' ', (int) ' ', (int) (byte) 100, false, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder22.setFixedSavings("", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.addCutover(0, ' ', (int) (byte) 1, (int) (short) 1, (int) (byte) 100, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("hi!", 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder42.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder42.setFixedSavings("hi!", 1);
        java.io.OutputStream outputStream51 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder49.writeTo("", outputStream51);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder9.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = dateTimeZoneBuilder17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder49.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder58.setStandardOffset(10);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setFixedSavings("", 1);
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", (int) (byte) 1, (int) '#', 0, 'a', (int) (byte) 0, (-1), (int) '#', true, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder17.setStandardOffset((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.setStandardOffset((int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder10.addRecurringSavings("", (-1), (-1), (int) (byte) 0, ' ', (int) '4', (int) (short) 0, (-1), true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder10.addRecurringSavings("", (int) '4', (int) (short) 0, (int) (short) 1, ' ', (int) '#', (int) (byte) 0, (int) (short) -1, false, 10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder35.toDateTimeZone("hi!", false);
        java.io.DataOutput dataOutput40 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("", dataOutput40);
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
        org.junit.Assert.assertNotNull(dateTimeZone38);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 1, 0, (int) (short) 10, 'a', (int) (short) 1, 0, (int) '#', false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) 'a', '#', (int) (short) 10, (int) (short) 10, (int) 'a', true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder5.addRecurringSavings("", (int) ' ', 100, (int) 'a', '4', 0, (int) 'a', (int) (short) 0, true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder44.setStandardOffset(0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder14.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset(0);
        java.io.DataOutput dataOutput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder23.writeTo("hi!", dataOutput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.addCutover((int) (short) 10, '4', (int) '4', (int) (short) 10, (int) '#', false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder18.addCutover((int) 'a', '4', (int) '4', (int) (byte) 100, (int) 'a', true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder31.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder31.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder31.addRecurringSavings("", 0, (int) (byte) 0, (int) (byte) 1, 'a', (int) ' ', (-1), (int) (byte) 0, false, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder31.setFixedSavings("", (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder48);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder32.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeZoneBuilder32.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeZoneBuilder32.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder32.setStandardOffset((int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 10);
        java.io.DataOutput dataOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", dataOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder6.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder6.setFixedSavings("", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder31.addRecurringSavings("hi!", (int) (short) 10, 1, (int) (byte) 1, ' ', (int) (byte) 10, (int) (short) 10, (int) '4', true, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 1, (int) '4', (int) '#', '4', 10, (int) (byte) 10, 10, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("", 0, (-1), (int) (byte) 10, 'a', (int) (short) 10, (int) '#', (int) (short) 1, true, 0);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder25.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder25.addCutover((int) (short) 1, '#', (int) (byte) 1, (int) (short) 0, 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder47.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder47.setStandardOffset((int) '4');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) 'a', (int) (short) 1, (int) 'a', '4', (int) ' ', (int) (short) 100, (int) ' ', true, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder22.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder38.addRecurringSavings("", (int) (short) 1, (int) (short) 100, (int) (short) -1, ' ', 10, (int) 'a', (int) (byte) 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder38.setStandardOffset((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder59 = dateTimeZoneBuilder51.addCutover((int) (short) -1, '4', (int) (short) 10, (int) ' ', (int) (short) 10, false, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (short) -1, true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder28.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder31.addRecurringSavings("", (int) (byte) 100, (int) (short) 10, 1, '#', (int) (short) -1, (int) (byte) -1, (-1), true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder31.setStandardOffset((int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder24.addCutover((int) (short) 1, 'a', (int) (short) 0, (int) (short) 1, (int) (byte) 10, false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder22.setFixedSavings("", (-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder7.setStandardOffset((int) '4');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (byte) 100, (int) (short) -1, 10, '4', 100, 100, 0, false, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone58 = dateTimeZoneBuilder55.toDateTimeZone("", false);
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
        org.junit.Assert.assertNotNull(dateTimeZone58);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder5.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder13.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.setFixedSavings("hi!", 0);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder35.setStandardOffset((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeZoneBuilder35.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder35.addRecurringSavings("hi!", (int) (short) 0, (int) (byte) 10, (int) (byte) 100, '#', (int) ' ', (int) ' ', 10, true, 100);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZone43);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setFixedSavings("", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder10.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) 100);
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("", outputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder26.addRecurringSavings("", (int) (byte) -1, (-1), (int) (short) -1, '#', (int) (byte) 10, (int) 'a', (int) '4', true, (int) (short) 10);
        java.io.OutputStream outputStream39 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder37.writeTo("", outputStream39);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder9.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder15.setFixedSavings("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder28.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder31.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setFixedSavings("", (int) '4');
        java.io.OutputStream outputStream38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder36.writeTo("hi!", outputStream38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder3.setFixedSavings("", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder3.addCutover((int) (short) 100, '#', (int) ' ', (int) ' ', 100, false, (int) '4');
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
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.addRecurringSavings("", 0, 0, 0, '4', (int) '4', 0, (int) (short) 100, false, 0);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder3.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder11.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addCutover((int) (byte) 0, ' ', 1, 10, (int) '#', true, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder14.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) -1, (int) (byte) 10, 1, 'a', (int) (byte) -1, (int) (byte) -1, (int) (byte) 1, true, 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (short) 10, (int) (byte) 0, (int) (short) 10, '#', (int) (short) 100, (int) (short) 0, (int) (short) 1, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder36.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder39.addRecurringSavings("", (int) (byte) 100, (int) (short) 10, 10, 'a', 10, 100, 1, true, 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset((int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("", (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder42.addRecurringSavings("", (int) ' ', (int) (byte) 10, (int) (byte) 10, ' ', (int) (byte) 100, 100, (int) (byte) 0, false, (int) (byte) 100);
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
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (short) 0, (int) ' ', (int) (short) 1, ' ', (int) ' ', (int) ' ', (int) (short) 100, false, 1);
        java.io.OutputStream outputStream57 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("hi!", outputStream57);
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
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder28.toDateTimeZone("", false);
        java.io.DataOutput dataOutput33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder28.writeTo("", dataOutput33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) '4');
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder16.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder16.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder30.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 100, 0, (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (byte) 10, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (byte) 0, (int) (short) 100, 0, ' ', (int) (byte) 100, 0, (int) '4', false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 1, 0, (int) (short) 10, 'a', (int) (short) 1, 0, (int) '#', false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) 'a', '#', (int) (short) 10, (int) (short) 10, (int) 'a', true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder5.addRecurringSavings("", (int) ' ', 100, (int) 'a', '4', 0, (int) 'a', (int) (short) 0, true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeZoneBuilder5.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder5.addCutover((int) '4', ' ', (int) '#', (int) (byte) 1, 1, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder7.addRecurringSavings("", 10, (int) (byte) 10, (-1), ' ', (int) 'a', (int) 'a', (int) ' ', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder25.toDateTimeZone("", true);
        java.io.DataOutput dataOutput30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder25.writeTo("hi!", dataOutput30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder7.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass11 = dateTimeZoneBuilder7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeZoneBuilder9.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", 100);
        java.io.DataOutput dataOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("", dataOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder36.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder36.setStandardOffset((int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder36.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder36.addRecurringSavings("", 0, (int) (short) 100, 1, '#', 0, (int) (byte) 0, (int) (short) 100, false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder49.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder51.setStandardOffset((int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder53);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("hi!", 0, (int) '4', 10, '#', (int) (short) -1, (int) (byte) 100, (int) '4', false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder66 = dateTimeZoneBuilder44.addRecurringSavings("hi!", 0, 1, (int) (short) 0, ' ', 10, (int) (short) 10, (int) '4', true, 0);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder66);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addRecurringSavings("hi!", 100, 100, (int) 'a', ' ', (int) (byte) 0, (int) (byte) 100, (int) (byte) -1, false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset(100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.addRecurringSavings("", 0, 1, (int) (byte) 100, ' ', (int) (byte) -1, 0, (int) (short) 10, false, 0);
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder21.writeTo("", outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass28 = dateTimeZone27.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 0, (int) '#', (int) (byte) 0, '4', (int) (byte) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder5.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 0);
        java.io.DataOutput dataOutput38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder36.writeTo("hi!", dataOutput38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder6.addRecurringSavings("", (int) (byte) 100, 100, (int) (short) 1, 'a', (int) (short) 0, 0, 1, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder6.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeZoneBuilder32.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass36 = dateTimeZone35.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder10.addRecurringSavings("", (-1), (-1), (int) (byte) 0, ' ', (int) '4', (int) (short) 0, (-1), true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder10.addRecurringSavings("", (int) '4', (int) (short) 0, (int) (short) 1, ' ', (int) '#', (int) (byte) 0, (int) (short) -1, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder35.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder37.addRecurringSavings("", 0, (int) (byte) 10, (int) (short) 1, ' ', (-1), (int) (byte) -1, (int) (byte) 0, false, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder59 = dateTimeZoneBuilder37.addRecurringSavings("hi!", (int) (byte) 10, (int) (byte) 10, 100, 'a', (int) ' ', (int) '4', (int) (byte) 1, false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder48);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder21.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder21.setFixedSavings("", (int) (byte) 100);
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder27.writeTo("", outputStream29);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder11.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder11.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset((int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        org.joda.time.DateTimeZone dateTimeZone42 = dateTimeZoneBuilder9.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", (int) '4', (-1), 0, '#', 1, 1, 100, false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder19.addCutover((int) (short) 0, 'a', (int) ' ', (-1), (int) (byte) -1, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder28.setFixedSavings("hi!", (int) 'a');
        java.lang.Class<?> wildcardClass32 = dateTimeZoneBuilder28.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) ' ', (-1), (int) (short) -1, '4', (int) (byte) 10, (-1), (int) (byte) 10, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder17.addRecurringSavings("hi!", 1, (int) (short) 10, (int) (short) 0, '4', (int) (short) 10, (int) (byte) -1, (int) (short) 100, true, (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder23.addRecurringSavings("", (int) (byte) 0, (int) (byte) -1, (int) ' ', ' ', (int) (short) 100, (int) 'a', (int) (short) 0, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder23.addRecurringSavings("", (int) (byte) -1, 100, (int) (byte) 0, '#', (int) '4', 0, (-1), false, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder56 = dateTimeZoneBuilder45.addRecurringSavings("hi!", (int) (short) 0, (int) (byte) -1, (int) (short) 100, '4', (-1), (int) ' ', (int) (byte) 0, false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder30.addRecurringSavings("", (int) (short) -1, (int) (short) 100, (int) (byte) 100, 'a', (-1), (int) '4', (int) (short) 0, false, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeZoneBuilder30.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder36.setStandardOffset((int) (short) 100);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '#', (int) 'a', (int) (short) 1, 'a', (int) (short) -1, (int) (short) -1, (int) ' ', false, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.addRecurringSavings("", 0, (int) (byte) -1, (int) '4', 'a', (int) (byte) 10, (int) '4', (-1), false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder32.addRecurringSavings("", (int) 'a', (int) (short) 1, (-1), '#', (int) (byte) 1, 1, (int) (byte) 0, false, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeZoneBuilder43.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(dateTimeZone46);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder7.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeZoneBuilder7.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) (short) 100, (int) '#', 0, ' ', (int) (short) 0, 10, (int) '4', true, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder23.addRecurringSavings("hi!", (-1), (int) (byte) 100, (int) (short) 0, '#', (int) (short) -1, (int) (byte) 0, (int) (short) 1, false, 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder12.setFixedSavings("hi!", 10);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder12.writeTo("hi!", outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder65 = dateTimeZoneBuilder57.addCutover((int) (short) 10, '4', (int) (short) 10, (int) (short) 100, (int) (short) 0, false, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
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
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder6.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder6.setFixedSavings("", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder31.addCutover((int) (short) -1, '4', (-1), 10, 100, true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder12.addRecurringSavings("hi!", (int) (byte) 100, (int) (short) 0, (int) (short) 1, '4', 100, 10, (int) ' ', true, 100);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder28.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder28.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder34.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder34.addRecurringSavings("", 10, (int) 'a', (int) 'a', '4', (int) (short) 1, (int) (short) 100, (int) (byte) 1, true, (int) (byte) 0);
        java.lang.Class<?> wildcardClass48 = dateTimeZoneBuilder34.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.addRecurringSavings("", (int) 'a', (int) (short) 10, (int) (short) -1, '4', (-1), (int) (short) 0, (int) (short) 1, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder27.addCutover((int) (byte) 1, '4', 0, (int) (short) 100, (int) (byte) -1, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", (int) '4', (-1), 0, '#', 1, 1, 100, false, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder22.setFixedSavings("", (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder28.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.setFixedSavings("", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.addCutover(100, ' ', (int) 'a', 0, (int) (short) 0, true, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
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
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder14.addCutover(10, 'a', (int) '4', 100, (int) (byte) 1, true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
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
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (byte) 10, (int) (short) -1, 0, '4', (int) (byte) 100, (-1), (int) (byte) 0, false, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder19.addRecurringSavings("", (-1), (int) ' ', 10, ' ', (int) (byte) 10, 100, 0, true, (-1));
        java.io.OutputStream outputStream48 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder46.writeTo("", outputStream48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder30.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder30.setFixedSavings("", 1);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", (int) (byte) 1, (int) '#', 0, 'a', (int) (byte) 0, (-1), (int) '#', true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addCutover((-1), 'a', 0, (int) (byte) 100, (int) '4', false, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
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
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addRecurringSavings("hi!", 100, 100, (int) 'a', ' ', (int) (byte) 0, (int) (byte) 100, (int) (byte) -1, false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder11.addRecurringSavings("", (int) (byte) -1, (int) (short) 0, (int) (byte) 1, '#', (int) (byte) 1, (int) '4', (int) 'a', true, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addCutover(100, 'a', (int) (byte) 100, (int) '4', (int) (byte) -1, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder31.addRecurringSavings("", (int) (byte) 0, (int) '4', (int) (short) -1, '#', (int) ' ', 100, (int) (short) 0, false, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder22.addCutover(0, ' ', (-1), (int) (byte) 100, (int) (byte) -1, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder3.addRecurringSavings("", 100, (-1), (int) '#', '#', (int) (short) 1, (int) (short) -1, (int) '4', true, 100);
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", outputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) (byte) 0, '4', (int) (short) 10, (int) '#', (int) (short) 100, false, (-1));
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 10, 'a', (int) '4', (int) (byte) 10, (int) (byte) 0, true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("", (int) (short) 10, (int) (short) 100, (int) (short) 10, 'a', 1, (int) 'a', (int) (byte) -1, false, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeZoneBuilder44.toDateTimeZone("hi!", true);
        java.io.DataOutput dataOutput49 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("", dataOutput49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder17.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", 10, (int) (byte) -1, (int) 'a', ' ', (int) (byte) 10, (int) '#', (int) (short) -1, false, (int) '4');
        java.io.OutputStream outputStream49 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder47.writeTo("", outputStream49);
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
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder17.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", 0, (int) (short) 0, (int) 'a', 'a', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder47.setFixedSavings("hi!", 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder9.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder28.setFixedSavings("", (int) (byte) 100);
        java.io.DataOutput dataOutput35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder28.writeTo("hi!", dataOutput35);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder7.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeZoneBuilder12.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeZoneBuilder12.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '#', (int) 'a', (int) (short) 1, 'a', (int) (short) -1, (int) (short) -1, (int) ' ', false, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.addRecurringSavings("", 0, (int) (byte) -1, (int) '4', 'a', (int) (byte) 10, (int) '4', (-1), false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("hi!", (int) '#', (int) 'a', 10, '4', (int) (byte) 10, (int) (short) 1, (-1), false, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder44.addCutover((int) (short) 1, ' ', (int) (short) 1, 1, (-1), false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        java.lang.Class<?> wildcardClass21 = dateTimeZoneBuilder17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addRecurringSavings("hi!", 100, 100, (int) 'a', ' ', (int) (byte) 0, (int) (byte) 100, (int) (byte) -1, false, (int) ' ');
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("hi!", outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder38.addCutover((int) (byte) 100, ' ', (int) (short) 1, (int) (short) 10, (int) '4', false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) '#');
        java.lang.Class<?> wildcardClass36 = dateTimeZoneBuilder35.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder20.addRecurringSavings("", (int) (short) 1, (int) '4', 1, 'a', 0, (int) '4', (int) (short) 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder31.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder76 = dateTimeZoneBuilder71.setStandardOffset((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder76);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 1, 10, (-1), 'a', 0, (int) (short) 100, (int) (byte) 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder5.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder5.addCutover((int) (short) -1, 'a', 0, (int) (byte) 0, (int) '4', true, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', 0, (int) (byte) -1, ' ', 0, (int) (byte) 100, (int) (short) 10, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder0.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder34.addCutover((int) (byte) 100, '4', (int) (byte) 1, 100, (int) ' ', false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", 100, (int) (byte) 10, (int) (byte) -1, ' ', (int) (byte) 100, (int) (short) 100, (-1), false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) (short) 10, (int) '4', (int) (short) 10, '4', (int) (byte) 1, 0, 10, false, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (byte) 10, (int) 'a', (int) (byte) 1, '4', 0, (int) '#', (-1), false, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTimeZoneBuilder44.toDateTimeZone("hi!", false);
        java.io.DataOutput dataOutput60 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("", dataOutput60);
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
        org.junit.Assert.assertNotNull(dateTimeZone58);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 1, (int) 'a', (int) (short) 10, 'a', (int) (byte) 1, (int) (byte) 1, (int) '#', false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", (int) '4');
        java.lang.Class<?> wildcardClass24 = dateTimeZoneBuilder23.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder9.setFixedSavings("hi!", 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder17.toDateTimeZone("", true);
        java.io.DataOutput dataOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("hi!", dataOutput22);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (byte) 1, (int) (byte) -1, 0, '4', (int) ' ', (int) ' ', (int) (byte) 100, false, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder22.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder28.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder31.setFixedSavings("hi!", (int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder33.setFixedSavings("", (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (byte) -1, (int) (byte) 100, (int) (byte) 0, 'a', 10, 0, (int) 'a', false, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder9.toDateTimeZone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 0, 0, (int) '4', '#', (int) (short) -1, (int) (byte) 100, (int) '4', false, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder16.addRecurringSavings("hi!", (int) '4', (int) (byte) 10, (int) (short) 1, ' ', (int) (byte) 1, (int) ' ', (int) ' ', true, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder16.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder30.setStandardOffset((int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder3.setFixedSavings("", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder20.addCutover((int) (short) -1, '4', 10, (-1), (int) (short) -1, true, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder27.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder29.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder29.addRecurringSavings("", 0, 10, (int) '#', '#', (int) (short) -1, 0, 100, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder43.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder45.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder45.setFixedSavings("hi!", (int) (short) -1);
        java.io.OutputStream outputStream53 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder45.writeTo("", outputStream53);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder48);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (short) -1, (int) (byte) 1, (-1), 'a', (int) (byte) 1, (int) (short) 0, 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (byte) 100, (int) (short) 10, (int) (short) -1, '4', (int) 'a', 0, (-1), false, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder19.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder59 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder54);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder59);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) (byte) 0, '4', (int) (short) 10, (int) '#', (int) (short) 100, false, (-1));
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 10, 'a', (int) '4', (int) (byte) 10, (int) (byte) 0, true, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder33.addCutover((int) (short) 0, '4', (int) ' ', (int) (short) 1, (int) '4', false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 100, 0, (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (byte) 10, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) (short) 100, 'a', (int) (short) -1, (int) 'a', 10, false, (int) (short) 10);
        java.io.DataOutput dataOutput57 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("", dataOutput57);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeZoneBuilder6.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass10 = dateTimeZoneBuilder6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', 10, '4', 100, (int) (byte) 0, (int) (byte) 100, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder18.setFixedSavings("", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder21.addCutover((int) (byte) 0, 'a', (int) (short) 10, (int) (short) 10, (int) (byte) 0, false, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) '4');
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder16.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder16.setStandardOffset((int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder8.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("", (int) (byte) 1);
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("hi!", dataOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder51.setFixedSavings("", (int) 'a');
        java.io.DataOutput dataOutput56 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder54.writeTo("", dataOutput56);
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
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder6.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder21.addCutover((int) '#', '#', (int) (short) 1, (int) (short) 10, 100, false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (byte) 100, (int) '4', (int) (short) -1, 'a', (int) (short) 0, 0, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 10);
        java.io.DataOutput dataOutput49 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("", dataOutput49);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder11.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder11.addRecurringSavings("", (int) '4', (-1), (int) (byte) 1, '#', (int) (byte) 100, (-1), (int) ' ', false, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("hi!", (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, '#', (int) (byte) 100, (-1), (int) 'a', true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder25.setStandardOffset((int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder19.addRecurringSavings("", (-1), (int) ' ', 10, ' ', (int) (byte) 10, 100, 0, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder19.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone51 = dateTimeZoneBuilder48.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder48.setStandardOffset((int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder48);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder53);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 1, 10, (-1), 'a', 0, (int) (short) 100, (int) (byte) 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder5.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder5.addRecurringSavings("hi!", (int) '#', (-1), (int) (byte) 0, '4', (-1), 1, (-1), false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", (-1));
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("hi!", outputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 100, 0, (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (byte) 10, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) (short) 100, 'a', (int) (short) -1, (int) 'a', 10, false, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTimeZoneBuilder44.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder44.setStandardOffset(1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder23.setFixedSavings("hi!", (-1));
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeZoneBuilder26.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream31 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder26.writeTo("hi!", outputStream31);
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
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (short) 100, (int) (byte) -1, 0, '#', (int) (short) 0, 0, (int) 'a', false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder3.setFixedSavings("", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder3.addCutover(100, 'a', (int) (short) 100, (int) (byte) 0, (-1), true, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder46.addRecurringSavings("hi!", (int) (byte) 1, (int) (byte) 100, (int) (byte) 10, '#', (int) (short) 1, (int) '#', (int) (short) 10, false, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder68 = dateTimeZoneBuilder57.addRecurringSavings("", (int) ' ', 10, (int) (short) 10, ' ', (int) (byte) -1, (int) '#', (int) ' ', true, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder79 = dateTimeZoneBuilder68.addRecurringSavings("", (int) ' ', (int) (byte) 1, 10, 'a', 0, (int) ' ', (int) (byte) -1, false, (int) (short) 10);
        java.io.DataOutput dataOutput81 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder79.writeTo("", dataOutput81);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder68);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder79);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) 100);
        java.io.DataOutput dataOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("hi!", dataOutput13);
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
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder20.addRecurringSavings("", (-1), (int) (short) 100, (int) (short) 1, '4', 10, (-1), (int) (byte) 100, false, (int) (short) 1);
        java.io.OutputStream outputStream36 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("", outputStream36);
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
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) -1, (int) (byte) -1, (int) ' ', '#', 1, (int) (short) 1, (int) (byte) 0, false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder0.setFixedSavings("", (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("hi!", 100);
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder11.writeTo("", dataOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) 'a', (int) (short) -1, (int) (byte) -1, ' ', (int) '#', (int) (byte) 100, 0, true, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder15.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder15.setFixedSavings("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("", (-1), (int) 'a', (int) (short) 10, 'a', (int) ' ', (int) (short) 0, (int) (byte) 10, true, (int) (short) -1);
        java.io.OutputStream outputStream46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("", outputStream46);
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
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder59 = dateTimeZoneBuilder3.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder61 = dateTimeZoneBuilder59.setStandardOffset((int) (short) 1);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder61);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder11.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder11.addRecurringSavings("", (int) (byte) 1, (int) (byte) -1, (int) (byte) 1, '4', (int) (byte) 10, (int) (byte) 10, 0, false, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder11.addCutover(1, 'a', 10, (int) '4', (int) ' ', true, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (short) -1, true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.setStandardOffset((int) (byte) 0);
        java.io.DataOutput dataOutput32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder30.writeTo("hi!", dataOutput32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) -1, 1, (-1), '#', (int) (byte) 100, (int) '#', (int) '4', true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder30.addCutover(100, ' ', 100, (int) '#', (int) 'a', true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder8.addRecurringSavings("hi!", 0, (int) 'a', (int) ' ', '#', (int) (short) 100, (int) 'a', (int) (short) 1, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder8.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder8.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder8.addCutover((int) ' ', 'a', 0, (int) (byte) 0, (int) (byte) 1, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder18.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder18.addRecurringSavings("", 100, (int) (byte) 0, 10, '4', 10, (int) '#', (int) (byte) -1, true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder18.setStandardOffset(0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder58.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder63 = dateTimeZoneBuilder60.setFixedSavings("", 0);
        java.lang.Class<?> wildcardClass64 = dateTimeZoneBuilder60.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder9.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder28.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder28.setFixedSavings("", (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
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
        java.lang.Class<?> wildcardClass43 = dateTimeZoneBuilder42.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) 1, (int) (short) 1, (int) (short) 1, 'a', 10, 1, (int) (short) 1, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder35.addRecurringSavings("hi!", (int) '4', (int) (short) 100, (int) '4', '#', (int) (short) 1, (int) 'a', 100, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder35.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder35.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder50.setFixedSavings("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder48);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder53);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = dateTimeZoneBuilder11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (short) 100, (int) '#', (int) (short) 1, 'a', 100, 1, (int) (byte) 0, false, (int) (byte) 100);
        java.io.OutputStream outputStream35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("hi!", outputStream35);
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
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset(0);
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        org.joda.time.DateTimeZone dateTimeZone55 = dateTimeZoneBuilder52.toDateTimeZone("", true);
        java.io.DataOutput dataOutput57 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder52.writeTo("", dataOutput57);
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
        org.junit.Assert.assertNotNull(dateTimeZone55);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) 'a', (int) (short) 1, (int) 'a', '4', (int) ' ', (int) (short) 100, (int) ' ', true, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("", 10, (int) (short) 10, 100, ' ', (int) (short) 0, (-1), (int) ' ', false, (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 100, (int) '4', (int) (short) 0, '#', (int) ' ', (int) (byte) 0, 100, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder0.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) 'a', (int) (short) 1, (int) 'a', '4', (int) ' ', (int) (short) 100, (int) ' ', true, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", 10, (int) (byte) 10, 0, ' ', (int) (short) 1, (int) (byte) 10, (int) (byte) 100, false, (int) (byte) 10);
        java.lang.Class<?> wildcardClass48 = dateTimeZoneBuilder47.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) '4', (int) (short) 100, 10, 'a', (int) (byte) 100, (int) (byte) 10, (int) '#', true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder30.addCutover((int) (short) 100, ' ', (int) (byte) 1, 0, 10, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder5.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder10.addRecurringSavings("", (int) (byte) 10, (int) 'a', (int) (byte) 10, ' ', (int) (short) 10, (int) (byte) 1, (int) (short) 100, true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder21.addCutover(100, 'a', (int) (byte) 10, (int) (byte) 100, (int) ' ', true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.addRecurringSavings("hi!", 0, (int) ' ', 1, 'a', (int) (byte) 1, (int) (byte) 100, (int) (byte) 100, false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (short) 10, (int) '#', (-1), '4', (int) ' ', (int) 'a', (int) (byte) 0, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 10);
        java.io.DataOutput dataOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder12.writeTo("hi!", dataOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder61 = dateTimeZoneBuilder36.addRecurringSavings("", 0, (int) (byte) -1, (int) (short) 1, 'a', (int) (short) 100, (int) (byte) 1, (int) (byte) 0, false, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder69 = dateTimeZoneBuilder36.addCutover((int) (byte) 0, '4', (int) (byte) 10, (int) (byte) 0, (int) (short) -1, true, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder61);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder49.addRecurringSavings("", (int) (short) 100, (int) (short) 100, (int) (short) 10, ' ', 1, (int) (byte) 100, (int) (byte) 10, true, (int) (byte) 100);
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
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.addRecurringSavings("", (int) (byte) 100, (int) (byte) 1, (int) (byte) 100, '4', 100, (int) (byte) 100, (int) (byte) 10, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) 'a', 0, (int) (byte) -1, '#', (int) ' ', 1, (int) ' ', true, (int) (short) 10);
        java.io.OutputStream outputStream38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder36.writeTo("", outputStream38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 100, 0, (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (byte) 10, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder19.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder46.setFixedSavings("", 100);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeZoneBuilder49.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZone52);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        org.joda.time.DateTimeZone dateTimeZone65 = dateTimeZoneBuilder60.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass66 = dateTimeZoneBuilder60.getClass();
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
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 1, 10, (-1), 'a', 0, (int) (short) 100, (int) (byte) 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder27.addRecurringSavings("hi!", (int) (byte) 100, (int) '4', 0, '#', 0, (-1), (int) (short) 0, false, (int) ' ');
        java.lang.Class<?> wildcardClass39 = dateTimeZoneBuilder38.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder7.addRecurringSavings("hi!", 100, 0, (int) '4', '4', (int) (byte) 0, 0, (int) (byte) 0, false, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) '4');
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder16.setFixedSavings("", (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = dateTimeZoneBuilder27.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder8.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder8.toDateTimeZone("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder8.addCutover((int) (byte) 1, '#', (int) (short) 10, (int) (short) 0, (int) (short) -1, false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("hi!", dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", 10, (int) '4', 10, ' ', 0, 1, (int) (short) 0, false, (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder6.setFixedSavings("", (int) ' ');
        java.io.DataOutput dataOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder6.writeTo("", dataOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 1, 10, (-1), 'a', 0, (int) (short) 100, (int) (byte) 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder27.setStandardOffset((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder29.addCutover((int) '4', 'a', (int) (byte) -1, (int) (short) 100, 0, true, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (byte) 10, (-1), (int) (short) -1, '#', 0, (int) (byte) 100, (int) (short) 0, true, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder35.addRecurringSavings("", (-1), (int) '#', (int) (byte) 0, 'a', (-1), (int) '4', (int) '#', true, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder35.addRecurringSavings("hi!", (int) (byte) 100, 0, (int) (short) 1, ' ', (int) (short) 100, (int) (short) 10, (int) (short) 1, true, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (byte) 10, (int) 'a', 'a', (int) (short) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder30.addRecurringSavings("hi!", (int) '4', (int) (byte) 100, (int) '4', '4', (-1), (int) (short) 1, (int) (short) 1, false, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder30.addCutover((int) (short) 100, 'a', (int) (short) 100, (int) (short) 100, (int) (byte) 100, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder14.setStandardOffset(100);
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
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
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
        java.lang.Class<?> wildcardClass58 = dateTimeZoneBuilder57.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeZoneBuilder9.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeZoneBuilder15.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addRecurringSavings("hi!", 100, 100, (int) 'a', ' ', (int) (byte) 0, (int) (byte) 100, (int) (byte) -1, false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder11.addRecurringSavings("", (int) (byte) -1, (int) (short) 0, (int) (byte) 1, '#', (int) (byte) 1, (int) '4', (int) 'a', true, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder33.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream41 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("hi!", outputStream41);
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
        org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 0, (int) '#', (int) (byte) 0, '4', (int) (byte) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("hi!", 0);
        java.io.DataOutput dataOutput35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("", dataOutput35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder16.setFixedSavings("hi!", (-1));
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder21.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder21.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder27.addRecurringSavings("", (int) '4', 100, (int) (byte) 0, ' ', (-1), (int) '#', (int) (short) -1, false, 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 1, (int) '4', (int) '#', '4', 10, (int) (byte) 10, 10, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("", 0, (-1), (int) (byte) 10, 'a', (int) (short) 10, (int) '#', (int) (short) 1, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder25.addRecurringSavings("", (int) (byte) -1, (int) '4', (int) (byte) 1, '#', (int) (short) -1, (int) (short) 10, 0, true, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder25.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder25.setFixedSavings("", (int) (short) 1);
        java.io.OutputStream outputStream55 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder53.writeTo("", outputStream55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder53);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder21.setFixedSavings("", (-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder25.toDateTimeZone("", true);
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
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder3.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder49.setStandardOffset((int) (byte) 0);
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
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass25 = dateTimeZoneBuilder5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) -1, (int) '#', (int) (byte) -1, ' ', (int) (byte) -1, (int) (short) 100, 0, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder35.setStandardOffset(10);
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
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder28.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder28.writeTo("", outputStream33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder10.addRecurringSavings("", (-1), (-1), (int) (byte) 0, ' ', (int) '4', (int) (short) 0, (-1), true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder10.addRecurringSavings("", (int) '4', (int) (short) 0, (int) (short) 1, ' ', (int) '#', (int) (byte) 0, (int) (short) -1, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder35.setStandardOffset((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder37.addCutover((int) (short) 1, '#', (int) (byte) 100, (int) (byte) 100, (int) (byte) 10, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder8.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder13.addRecurringSavings("", (int) ' ', (int) (byte) -1, (int) (byte) 1, ' ', (int) (short) -1, (int) (byte) -1, (int) (short) 10, true, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder13.addRecurringSavings("hi!", (int) (byte) -1, (int) (byte) 100, 10, 'a', (-1), (int) (short) 100, (int) ' ', true, (-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass11 = dateTimeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        java.io.DataOutput dataOutput40 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder32.writeTo("", dataOutput40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder15.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder20.addCutover((int) '4', ' ', 100, (int) (byte) 100, (-1), true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder6.setFixedSavings("hi!", (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder6.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder6.setStandardOffset((int) '4');
        java.io.OutputStream outputStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder30.writeTo("", outputStream32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) '4');
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder16.toDateTimeZone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder16.addCutover((int) (short) 0, '#', (int) (byte) 0, (int) (short) 1, (int) (byte) -1, true, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (short) -1, (int) (byte) 1, (-1), 'a', (int) (byte) 1, (int) (short) 0, 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder19.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) (byte) 10, '4', 1, (int) (byte) 0, (int) ' ', true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder59 = dateTimeZoneBuilder57.setStandardOffset(1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder59);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder20.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        java.io.DataOutput dataOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", dataOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder17.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("", 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder4.addRecurringSavings("", (int) (short) 10, (int) (short) 0, (int) (short) -1, '4', (int) (byte) 100, (int) 'a', 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder4.addRecurringSavings("hi!", (-1), 100, (int) 'a', 'a', 0, (int) (short) 10, (int) (short) 0, true, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder4.addRecurringSavings("hi!", (int) (short) 0, 1, 0, 'a', (int) (short) 0, (int) 'a', (int) (byte) -1, false, (int) (short) 1);
        java.io.OutputStream outputStream42 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder40.writeTo("", outputStream42);
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
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 0);
        java.io.DataOutput dataOutput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder16.writeTo("", dataOutput18);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.addCutover((int) (byte) 100, ' ', (int) (short) 10, 0, (int) (byte) 0, false, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder11.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder11.addRecurringSavings("", (int) '4', (-1), (int) (byte) 1, '#', (int) (byte) 100, (-1), (int) ' ', false, (int) '4');
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder11.writeTo("hi!", outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder3.setFixedSavings("", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder23.addRecurringSavings("", (int) (byte) 1, (int) '4', (int) (short) -1, '#', (int) 'a', (int) (byte) 100, (int) (byte) -1, false, (int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder5.addCutover((int) (byte) 100, 'a', 0, (int) (short) -1, (int) 'a', false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) 10, (int) ' ', (int) (byte) 0, ' ', (int) (byte) 1, (-1), (int) (short) 1, true, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder31.addCutover(100, ' ', (int) '4', (int) '#', (int) (short) -1, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (short) 100, (int) (byte) -1, 0, '#', (int) (short) 0, 0, (int) 'a', false, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder35.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) (byte) 1, '4', 1, (int) (short) 1, (int) (short) 0, true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) (short) 10);
        java.io.DataOutput dataOutput37 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("hi!", dataOutput37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addCutover(10, 'a', 100, 0, 10, true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
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
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeZoneBuilder17.toDateTimeZone("", false);
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
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder8.addRecurringSavings("", (int) (short) 1, 1, (-1), '4', (int) (short) 100, (int) '#', (int) (byte) 10, true, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder21.addCutover(10, ' ', (int) (short) -1, (int) ' ', (int) (short) 1, false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder31.setFixedSavings("", (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeZoneBuilder34.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeZoneBuilder34.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeZoneBuilder34.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeZone43);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (short) 100, 0, (int) (byte) 10, '4', (int) ' ', (int) ' ', (int) (short) 1, false, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass42 = dateTimeZoneBuilder22.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("", 0, (int) (byte) 1, (int) (byte) 100, '#', (int) ' ', (int) (short) 10, (int) (short) 10, false, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder20.setFixedSavings("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder7.addRecurringSavings("", (int) ' ', (int) (short) 1, (int) (short) 100, '#', (int) (byte) -1, 0, 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder21.addRecurringSavings("", (int) (short) 1, (int) ' ', (int) (short) 10, 'a', (int) ' ', 1, (int) ' ', true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder21.addRecurringSavings("", (int) (short) 0, 0, (int) (short) 10, 'a', (int) (short) 10, (int) (short) 100, (int) '4', false, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder4.addRecurringSavings("", (int) (short) 10, (int) (short) 0, (int) (short) -1, '4', (int) (byte) 100, (int) 'a', 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder4.addRecurringSavings("hi!", (-1), 100, (int) 'a', 'a', 0, (int) (short) 10, (int) (short) 0, true, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder4.addRecurringSavings("hi!", (int) (short) 0, 1, 0, 'a', (int) (short) 0, (int) 'a', (int) (byte) -1, false, (int) (short) 1);
        java.lang.Class<?> wildcardClass41 = dateTimeZoneBuilder4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder6.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset((int) '#');
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
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
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder49.addRecurringSavings("hi!", (int) (byte) 0, (int) (byte) 10, 10, 'a', (int) '#', (int) ' ', (int) 'a', false, (int) '#');
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
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("", 10);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder21.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder21.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset((int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (byte) 100, (int) '4', (int) (short) -1, 'a', (int) (short) 0, 0, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder44.setFixedSavings("hi!", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder47.setFixedSavings("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder49.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder51.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder56 = dateTimeZoneBuilder51.setFixedSavings("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder64 = dateTimeZoneBuilder51.addCutover((int) (short) 1, ' ', (int) (short) 10, (int) (short) 10, 0, true, (int) '4');
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder53);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder56);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder9.addRecurringSavings("", 100, (int) ' ', (int) '4', '4', (int) (short) 100, (int) (byte) -1, 100, true, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder23.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("", 100, (int) (byte) -1, (int) ' ', '4', (int) (byte) -1, (int) (byte) -1, (int) (short) 10, false, (int) (byte) 100);
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder25.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder36.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeZoneBuilder6.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeZoneBuilder6.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder11.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder11.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder10.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder10.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder10.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder10.setStandardOffset(10);
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("hi!", outputStream25);
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
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder23.setStandardOffset((int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder19.setFixedSavings("", (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", 10);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.addCutover(0, ' ', 100, (-1), (int) (byte) 1, false, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder13.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder13.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder13.writeTo("", outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder12.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) ' ', (-1), (int) (short) -1, '4', (int) (byte) 10, (-1), (int) (byte) 10, false, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) -1, (-1), 1, '4', (int) (short) 1, 0, (int) (short) 1, true, (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder30.setFixedSavings("hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder38.addRecurringSavings("hi!", 1, 0, (int) '#', 'a', (int) (byte) 0, (int) (byte) -1, (int) (short) 100, false, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '#', (int) 'a', (int) (short) 1, 'a', (int) (short) -1, (int) (short) -1, (int) ' ', false, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.addRecurringSavings("", 0, (int) (byte) -1, (int) '4', 'a', (int) (byte) 10, (int) '4', (-1), false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder30.setStandardOffset(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder32.addRecurringSavings("hi!", (int) (short) 0, (int) (short) 1, 100, '#', (int) (byte) -1, (int) (byte) 100, (int) (byte) 0, false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder18.setStandardOffset((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder18.addRecurringSavings("hi!", (int) ' ', 1, 1, ' ', (int) '#', (int) (byte) 10, (int) (short) 0, false, 10);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset(100);
        java.io.DataOutput dataOutput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder23.writeTo("hi!", dataOutput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder19.setFixedSavings("", (-1));
        java.lang.Class<?> wildcardClass42 = dateTimeZoneBuilder19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) -1);
        java.io.DataOutput dataOutput27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder25.writeTo("", dataOutput27);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder16.addRecurringSavings("hi!", (int) (byte) -1, (int) ' ', 0, ' ', (int) (short) 0, (int) (byte) 0, (int) (byte) -1, false, 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder8.setFixedSavings("", (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 1, 10, (-1), 'a', 0, (int) (short) 100, (int) (byte) 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder27.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder29.setStandardOffset((int) (short) 100);
        java.io.OutputStream outputStream33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder29.writeTo("hi!", outputStream33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder50.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone55 = dateTimeZoneBuilder50.toDateTimeZone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder63 = dateTimeZoneBuilder50.addCutover((int) 'a', '#', (int) (byte) -1, 1, 10, true, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZone55);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder16.addRecurringSavings("hi!", (int) '4', (int) (byte) 10, (int) (short) 1, ' ', (int) (byte) 1, (int) ' ', (int) ' ', true, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder27.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder10.addRecurringSavings("", (int) '#', 100, (int) (byte) 0, 'a', 1, 100, 10, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder10.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder23.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder25.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass26 = dateTimeZone25.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = dateTimeZoneBuilder7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.setStandardOffset(1);
        java.lang.Class<?> wildcardClass15 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) '4');
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder16.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder24.addRecurringSavings("", (int) (short) 10, (int) (byte) 100, 0, '4', (int) '4', (int) (byte) 1, (-1), false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder35.setStandardOffset(100);
        java.io.OutputStream outputStream39 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder37.writeTo("", outputStream39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder17.addCutover((int) (short) 0, ' ', (int) '#', 0, (int) '4', true, 0);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder37.addRecurringSavings("", 100, (int) (byte) 100, (int) (short) 1, 'a', (int) (byte) 0, (int) 'a', (int) (byte) 100, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder54 = dateTimeZoneBuilder51.setFixedSavings("", (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder54);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeZoneBuilder9.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", 100);
        java.lang.Class<?> wildcardClass18 = dateTimeZoneBuilder14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", (int) (byte) 1, (int) '#', 0, 'a', (int) (byte) 0, (-1), (int) '#', true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder19.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.setFixedSavings("", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder19.addCutover(10, 'a', 100, (int) (short) 1, 100, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder9.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (short) 1, (int) '4', 10, 'a', (int) '#', (int) (short) 100, (int) (byte) -1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder23.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass27 = dateTimeZone26.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
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
        java.io.DataOutput dataOutput60 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder58.writeTo("hi!", dataOutput60);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 100, (int) (short) 100, (int) (byte) -1, 'a', (int) (short) -1, 100, (int) (byte) 1, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder22.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder27.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder27.writeTo("hi!", outputStream32);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder35.setStandardOffset((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeZoneBuilder35.toDateTimeZone("", true);
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
        org.junit.Assert.assertNotNull(dateTimeZone43);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
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
        org.joda.time.DateTimeZone dateTimeZone58 = dateTimeZoneBuilder49.toDateTimeZone("hi!", false);
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
        org.junit.Assert.assertNotNull(dateTimeZone58);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder20.addRecurringSavings("", (int) (short) 1, (int) '4', 1, 'a', 0, (int) '4', (int) (short) 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder31.setStandardOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder31.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder31.addRecurringSavings("", (int) '#', (int) (byte) 10, (int) 'a', '#', (int) (short) -1, (int) '#', (int) (byte) 0, false, (int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder68 = dateTimeZoneBuilder49.addRecurringSavings("hi!", (-1), (int) (short) 10, (int) (short) 1, ' ', 100, (int) (byte) 10, 1, true, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder70 = dateTimeZoneBuilder68.setStandardOffset(1);
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
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = dateTimeZoneBuilder24.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
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
        org.joda.time.DateTimeZone dateTimeZone55 = dateTimeZoneBuilder52.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder66 = dateTimeZoneBuilder52.addRecurringSavings("hi!", (int) (short) -1, (int) (byte) 0, (int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (byte) 100, true, (int) 'a');
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZone55);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder10.addRecurringSavings("", (int) '#', 100, (int) (byte) 0, 'a', 1, 100, 10, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder10.addRecurringSavings("", (int) '#', (-1), (int) (short) 1, '4', (int) ' ', (int) (short) 10, (int) (short) 10, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder35.addCutover(10, ' ', 100, (int) '4', (int) (byte) 10, false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.addRecurringSavings("", 0, 0, 0, '4', (int) '4', 0, (int) (short) 100, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder3.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder31.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder31.addRecurringSavings("hi!", (int) (short) -1, (int) (short) 0, (int) (byte) -1, 'a', (int) (short) -1, (int) (short) -1, 0, true, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder16.addCutover((int) (short) 1, '4', (int) (short) 1, 0, (int) (byte) 0, true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder5.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder5.addRecurringSavings("", 10, (int) (byte) -1, (int) 'a', '#', 10, (int) '#', 10, false, 0);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 100, (int) (short) 100, (int) (short) 100, '4', (int) ' ', (int) (byte) 0, 100, true, (int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder14.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder14.addRecurringSavings("", (int) ' ', (int) (short) 10, (int) (byte) -1, 'a', 0, (int) (byte) 100, (-1), true, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        java.lang.Class<?> wildcardClass20 = dateTimeZoneBuilder11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset((int) '4');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder48 = dateTimeZoneBuilder46.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder46.setStandardOffset((int) (short) 0);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) (byte) 0, '4', (int) (short) 10, (int) '#', (int) (short) 100, false, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder19.addCutover((int) (byte) 100, '#', (int) 'a', (-1), (-1), true, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 1, 10, (-1), 'a', 0, (int) (short) 100, (int) (byte) 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder27.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder29.addRecurringSavings("", 1, (int) (byte) 10, (int) (byte) 1, '#', (int) 'a', (int) ' ', (int) (byte) 100, true, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder40.setStandardOffset(1);
        java.io.DataOutput dataOutput44 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder42.writeTo("", dataOutput44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (byte) 10, (int) 'a', 'a', (int) (short) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 0, '#', (-1), (-1), (-1), false, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeZoneBuilder41.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder41.addRecurringSavings("", (int) (byte) 1, 100, (int) (short) 1, 'a', (int) (byte) 100, (int) (byte) 1, (int) (short) 1, false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder41.setFixedSavings("", (int) (byte) 10);
        java.io.DataOutput dataOutput60 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder41.writeTo("", dataOutput60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("", outputStream24);
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
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (byte) 1, (int) (byte) -1, 0, '4', (int) ' ', (int) ' ', (int) (byte) 100, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) '#');
        java.lang.Class<?> wildcardClass32 = dateTimeZoneBuilder31.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder11.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder11.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder22.setStandardOffset((int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        java.io.DataOutput dataOutput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", dataOutput21);
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
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) (short) 100, (int) ' ', (int) (short) 10, 'a', (int) (short) 0, (int) (byte) -1, (int) (short) 10, true, 0);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("", true);
        java.io.DataOutput dataOutput38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("hi!", dataOutput38);
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
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder2.addRecurringSavings("", (int) (short) 0, (int) (short) -1, (int) (byte) -1, 'a', (int) (byte) 1, 1, 10, false, (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (byte) 1, (int) (byte) -1, 0, '4', (int) ' ', (int) ' ', (int) (byte) 100, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder9.setFixedSavings("", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder9.addCutover((int) ' ', '4', (int) '4', (int) '#', (-1), false, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (short) 10, 0, (int) (byte) 1, '4', (int) ' ', (int) (byte) 10, 100, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((int) '4');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder15.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder15.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) (byte) 0, '4', (int) (short) 10, (int) '#', (int) (short) 100, false, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder19.setFixedSavings("", (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder19.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", 1);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder17.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) 1, (int) ' ', (int) (short) 10, '4', (-1), (int) ' ', (int) (short) -1, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder3.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder3.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder29.setFixedSavings("hi!", 0);
        java.io.DataOutput dataOutput34 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder29.writeTo("hi!", dataOutput34);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder10.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder10.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder10.setStandardOffset((int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder21.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder21.setFixedSavings("", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder26.addCutover((int) (byte) -1, '4', 10, (int) '4', 100, false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("hi!", dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass14 = dateTimeZone13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        java.io.DataOutput dataOutput45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("", dataOutput45);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder43);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder27.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeZoneBuilder27.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) '4', (int) (short) 100, 10, 'a', (int) (byte) 100, (int) (byte) 10, (int) '#', true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) (short) -1, (int) '#', (int) ' ', '4', (int) (short) 10, (int) (byte) 0, (int) (byte) 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder34.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder34.setFixedSavings("", (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder39);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) '4');
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("hi!", outputStream19);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder22.addCutover((int) '4', 'a', (int) (byte) 10, (int) (short) -1, (int) ' ', false, (int) 'a');
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder45);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) 'a', (int) (short) 1, (int) 'a', '4', (int) ' ', (int) (short) 100, (int) ' ', true, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", 10, (int) (byte) 10, 0, ' ', (int) (short) 1, (int) (byte) 10, (int) (byte) 100, false, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder47.addRecurringSavings("hi!", (int) (byte) 0, (int) (short) 1, (int) '#', '4', (int) (byte) 100, (int) (short) 10, 0, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 100, 0, (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (byte) 10, false, (int) (byte) -1);
        java.io.OutputStream outputStream46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("hi!", outputStream46);
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
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder24.setStandardOffset((int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 1, (int) '4', (int) '#', '4', 10, (int) (byte) 10, 10, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder25.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder30.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) (byte) 1, '4', 1, (int) (short) 1, (int) (short) 0, true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder33.setStandardOffset((int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder14.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) 1, (int) (short) 100, (int) (short) 0, 'a', 100, (int) (byte) -1, (int) (short) 10, false, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder14.addCutover((int) (short) 10, '4', (int) (byte) 0, (int) (byte) -1, (int) ' ', false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", 10);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) 'a');
        java.io.DataOutput dataOutput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder23.writeTo("hi!", dataOutput25);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addRecurringSavings("", (int) (short) -1, (int) (byte) 100, 0, 'a', (int) ' ', (int) (short) 10, 100, true, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("", 0, (int) (byte) 1, (int) (byte) 100, '#', (int) ' ', (int) (short) 10, (int) (short) 10, false, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("", 1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder9.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder9.setStandardOffset((int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder6.addRecurringSavings("", (int) (byte) 100, 100, (int) (short) 1, 'a', (int) (short) 0, 0, 1, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder6.setStandardOffset((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder32.addCutover((int) 'a', '#', (int) 'a', 0, (-1), false, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (byte) 100, (int) '#', (int) (short) 100, '#', (int) (byte) 1, (int) (byte) 1, (int) ' ', true, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.setFixedSavings("", 10);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 100, 0, (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (byte) 10, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) (short) 100, 'a', (int) (short) -1, (int) 'a', 10, false, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTimeZoneBuilder55.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(dateTimeZone58);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) 0, 0, (-1), ' ', (int) (short) -1, (int) (short) 0, (int) (byte) -1, false, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder3.addCutover((int) 'a', '#', (-1), (int) 'a', (int) (byte) -1, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder18.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", (int) '4');
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder23.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
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
        java.lang.Class<?> wildcardClass51 = dateTimeZoneBuilder47.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("", (int) '4');
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder22.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTimeZoneBuilder22.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder22.setStandardOffset(10);
        java.lang.Class<?> wildcardClass45 = dateTimeZoneBuilder44.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder8.addCutover(10, '#', (int) (byte) 1, (int) (short) 1, 0, true, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 100, (int) '4', (int) (short) 0, '#', (int) ' ', (int) (byte) 0, 100, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder0.addRecurringSavings("", (-1), (int) (short) -1, (int) (short) 100, '#', (int) 'a', (int) (byte) 1, (int) (short) 100, false, (int) '4');
        java.io.DataOutput dataOutput46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput46);
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
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        java.lang.Class<?> wildcardClass43 = dateTimeZoneBuilder22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.addRecurringSavings("", 0, 100, 100, 'a', (int) (short) 1, (-1), (int) (short) 10, false, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder20.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder29.addRecurringSavings("", (int) (short) 10, 0, (int) (short) 10, '#', (int) (short) 10, (int) (short) 1, (int) '#', false, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder51 = dateTimeZoneBuilder40.addRecurringSavings("hi!", (int) (short) 1, 10, (int) (byte) 0, '#', 0, (int) (byte) 100, (int) (short) 10, false, 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder40);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder51);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("", (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = dateTimeZoneBuilder12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.setFixedSavings("", (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = dateTimeZoneBuilder5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", (int) '4', (-1), 0, '#', 1, 1, 100, false, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = dateTimeZoneBuilder16.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder21.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder21.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder28.addCutover((-1), 'a', (int) ' ', (int) (short) 0, (int) '4', true, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (short) 10, 100, 0, 'a', (int) (byte) 10, (int) '4', (int) (byte) 10, true, (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.setFixedSavings("", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder30.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder33.setFixedSavings("", (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder36.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder22.setFixedSavings("", (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeZoneBuilder22.toDateTimeZone("", true);
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
        org.junit.Assert.assertNotNull(dateTimeZone46);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder7.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder7.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("", outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 0, (int) 'a', (int) (short) 0, 'a', (int) (byte) 10, (int) (byte) 1, 0, true, (int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTimeZoneBuilder17.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder56 = dateTimeZoneBuilder17.addRecurringSavings("", 10, (int) (short) 1, (int) (byte) 100, '4', (int) '4', (int) (short) 10, (-1), true, (int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder56);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder50 = dateTimeZoneBuilder36.addCutover(100, '#', (int) (byte) 100, (int) '#', (int) (byte) -1, true, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
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
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 1, 10, (-1), 'a', 0, (int) (short) 100, (int) (byte) 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder27.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder29.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder32.setFixedSavings("hi!", 10);
        java.io.DataOutput dataOutput37 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("hi!", dataOutput37);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder17.setFixedSavings("", (int) '4');
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("", outputStream25);
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
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder23.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("hi!", (int) 'a', (int) '#', (int) ' ', ' ', (int) (short) 0, 0, (int) (byte) 1, true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder25.setStandardOffset((int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder38.setFixedSavings("", (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
        org.joda.time.DateTimeZone dateTimeZone65 = dateTimeZoneBuilder47.toDateTimeZone("hi!", false);
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
        org.junit.Assert.assertNotNull(dateTimeZone65);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder11.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 100, (int) ' ', (int) (byte) 0, '#', 100, (int) (byte) 100, 0, false, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeZoneBuilder17.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder17.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream36 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("", outputStream36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.addRecurringSavings("", 0, 100, 100, 'a', (int) (short) 1, (-1), (int) (short) 10, false, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder26.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder26.setStandardOffset((int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder26);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder61 = dateTimeZoneBuilder50.addRecurringSavings("hi!", (int) ' ', (int) (short) 10, (int) (short) 0, '4', 100, (int) (short) 0, 100, false, 100);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTimeZoneBuilder61.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder50);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder61);
        org.junit.Assert.assertNotNull(dateTimeZone64);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 0, (int) '#', (int) (byte) 0, '4', (int) (byte) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder30.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder30.setFixedSavings("hi!", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", (int) '4', 1, (int) (short) 100, 'a', (int) (byte) 0, (int) 'a', (int) (byte) 1, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTimeZoneBuilder36.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeZoneBuilder10.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder10.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder10.addRecurringSavings("", (int) (short) 0, (int) (short) 1, (int) 'a', 'a', (int) '#', (int) (short) 1, (int) (short) 100, true, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder10.setStandardOffset(1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) -1);
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder11.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder11.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder11.addCutover((int) '#', '#', 1, 0, (int) '#', true, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("", 0, (int) (byte) 1, (int) (byte) 100, '#', (int) ' ', (int) (short) 10, (int) (short) 10, false, (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 10, (int) '4', 1, '4', 100, (int) (short) 0, (-1), true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder33.addRecurringSavings("", (int) (short) 100, (int) (short) 0, (int) '#', '#', 100, (int) (short) 100, (int) (short) 10, true, (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder3.addRecurringSavings("", 0, (int) (byte) 1, (int) (short) 0, ' ', (int) (short) -1, (int) ' ', (int) (byte) 100, true, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder3.addRecurringSavings("hi!", 0, (int) (byte) -1, (int) (short) 1, '4', (int) (short) 100, (int) '4', 10, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder6.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("", (int) (short) 0, 1, 0, 'a', (int) '4', (-1), 0, false, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder25.addCutover((int) (short) 100, 'a', (int) (byte) -1, 10, 0, true, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
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
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) -1, (int) (byte) -1, (int) (byte) 10, 'a', 0, (int) '#', (int) '#', true, (int) ' ');
        java.lang.Class<?> wildcardClass32 = dateTimeZoneBuilder31.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 0, (int) '#', (int) (byte) 0, '4', (int) (byte) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder5.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", (int) (byte) 100, 10, (int) (short) 100, '#', (int) (byte) 0, (int) (short) -1, (-1), false, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder47.addRecurringSavings("hi!", 10, (int) (short) 1, 0, '#', (int) '4', (int) (short) 0, (int) (short) 1, false, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 1);
        java.io.DataOutput dataOutput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("", dataOutput18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder3.setFixedSavings("", (int) (short) -1);
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder24.writeTo("", outputStream26);
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
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((-1));
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder5.addCutover((int) (byte) 10, '#', (int) (short) -1, 1, (int) (short) 10, false, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 1, 10, (-1), 'a', 0, (int) (short) 100, (int) (byte) 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder27.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder29.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder32.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder35.addRecurringSavings("", 1, 0, (int) (short) 1, 'a', (int) (byte) 10, (int) '4', (int) '4', false, (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder46);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder58.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone63 = dateTimeZoneBuilder60.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream65 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder60.writeTo("hi!", outputStream65);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
        org.junit.Assert.assertNotNull(dateTimeZone63);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder64 = dateTimeZoneBuilder51.setStandardOffset((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder64);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder20.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder19.setFixedSavings("", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (short) 0, (int) (byte) 100, (int) (short) 100, 'a', (-1), (int) (byte) 0, (int) (byte) 0, true, (int) (byte) 0);
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder53 = dateTimeZoneBuilder17.addRecurringSavings("", 10, (int) (byte) 10, (int) '4', '#', (int) (byte) 0, (int) 'a', (int) ' ', true, (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder56 = dateTimeZoneBuilder17.setFixedSavings("hi!", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder56.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder61 = dateTimeZoneBuilder58.setFixedSavings("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder53);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder56);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder61);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder4.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder9.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder9.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder9.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder23.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("hi!", (int) 'a', (int) '#', (int) ' ', ' ', (int) (short) 0, 0, (int) (byte) 1, true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder36.addRecurringSavings("", (int) ' ', (int) '#', (int) (short) -1, '4', (int) (byte) 0, (int) (byte) 0, (int) (byte) 100, true, (-1));
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 100, (int) '4', (int) (short) 0, '#', (int) ' ', (int) (byte) 0, 100, false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder0.setFixedSavings("hi!", 10);
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder36.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder16.addRecurringSavings("", (int) ' ', 1, 1, '4', 100, (int) (byte) 10, (int) (short) 0, true, 100);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) (byte) 0);
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("", outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder42.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTimeZoneBuilder42.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTimeZoneBuilder42.toDateTimeZone("", true);
        java.io.OutputStream outputStream55 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder42.writeTo("", outputStream55);
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
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeZone53);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder22.toDateTimeZone("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addCutover((int) (byte) 1, '#', (int) (short) 100, (int) (byte) 100, 10, false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder23.setStandardOffset((int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder25.setFixedSavings("hi!", (int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder6.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) ' ');
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder8.writeTo("hi!", outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) '4', (int) (short) 100, 10, 'a', (int) (byte) 100, (int) (byte) 10, (int) '#', true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) 'a', ' ', (int) (byte) 100, (int) '4', (int) (short) 1, true, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder30.addRecurringSavings("", (int) (short) -1, (int) (short) 100, (int) (byte) 100, 'a', (-1), (int) '4', (int) (short) 0, false, (int) (short) 10);
        java.io.DataOutput dataOutput43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder30.writeTo("hi!", dataOutput43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
        java.io.OutputStream outputStream54 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder49.writeTo("hi!", outputStream54);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 0, (int) '#', (int) (byte) 0, '4', (int) (byte) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder30.addRecurringSavings("hi!", (int) (byte) 10, (int) '4', 0, 'a', 10, 100, (int) (byte) 0, false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder30.addRecurringSavings("", 0, (int) (byte) 100, (int) 'a', '#', (int) (short) 100, (int) ' ', (int) (short) 0, true, (int) (byte) 100);
        java.lang.Class<?> wildcardClass53 = dateTimeZoneBuilder52.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder9.setFixedSavings("hi!", 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder9.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 1, (int) '4', (int) '#', '4', 10, (int) (byte) 10, 10, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("", 0, (-1), (int) (byte) 10, 'a', (int) (short) 10, (int) '#', (int) (short) 1, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder25.addRecurringSavings("", (int) (byte) -1, (int) '4', (int) (byte) 1, '#', (int) (short) -1, (int) (short) 10, 0, true, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder58 = dateTimeZoneBuilder47.addRecurringSavings("", 0, (int) (byte) -1, (int) (short) 10, '4', (int) (byte) 0, (int) (short) 1, (int) (short) -1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder66 = dateTimeZoneBuilder58.addCutover((int) (byte) 0, 'a', (int) (short) 1, (int) (short) 10, (int) (short) 0, true, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder58);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder66);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder0.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder24.addRecurringSavings("", (int) (short) 1, (int) ' ', (int) '#', '4', (int) (short) 100, 0, (int) (short) 100, false, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder35.setStandardOffset((int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) '4');
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder16.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder29.setFixedSavings("", (int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder29);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder32);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        java.io.DataOutput dataOutput36 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder10.addRecurringSavings("", (-1), (-1), (int) (byte) 0, ' ', (int) '4', (int) (short) 0, (-1), true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder10.addRecurringSavings("", (int) '4', (int) (short) 0, (int) (short) 1, ' ', (int) '#', (int) (byte) 0, (int) (short) -1, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder10.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder10.addRecurringSavings("hi!", (int) (byte) 10, (int) (short) 100, (int) (short) -1, ' ', 10, 100, (int) '4', true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder60 = dateTimeZoneBuilder49.addRecurringSavings("", (int) (short) 1, (int) '#', 0, 'a', (int) (short) -1, (-1), (-1), false, (int) '4');
        java.io.OutputStream outputStream62 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder60.writeTo("hi!", outputStream62);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder60);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder67 = dateTimeZoneBuilder57.addCutover((int) 'a', ' ', (int) (short) 10, (int) 'a', (int) (short) 0, false, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder59);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
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
        java.io.DataOutput dataOutput44 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder25.writeTo("", dataOutput44);
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
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 1, 10, (-1), 'a', 0, (int) (short) 100, (int) (byte) 0, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder27.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder29.setFixedSavings("hi!", (int) (short) 10);
        java.io.DataOutput dataOutput34 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder32.writeTo("", dataOutput34);
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
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
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
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder38.setFixedSavings("hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder49 = dateTimeZoneBuilder38.addCutover(0, '4', (int) ' ', (int) 'a', (int) (short) 0, false, (-1));
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder38);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass7 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("", (int) '4');
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder22.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTimeZoneBuilder22.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder22.setStandardOffset(10);
        java.io.OutputStream outputStream46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("hi!", outputStream46);
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
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (byte) 10, (int) 'a', 'a', (int) (short) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder30.addCutover((int) (byte) 100, '4', (int) (short) 10, (int) (byte) -1, (int) (byte) -1, false, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }
}

