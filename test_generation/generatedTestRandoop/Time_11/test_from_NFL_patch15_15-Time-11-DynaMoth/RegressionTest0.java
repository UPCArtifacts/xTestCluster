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
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(inputStream0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(inputStream0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 0, (int) (short) 10, 100, ' ', (int) '4', (int) (byte) -1, (int) (short) 0, false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.addCutover((int) '4', '#', 0, 1, 1, true, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        java.lang.Class<?> wildcardClass1 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        java.io.DataOutput dataOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("hi!", dataOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        java.io.DataOutput dataOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", dataOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("", dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.addCutover((int) (byte) 0, '#', (int) (byte) 100, (int) (short) 100, 1, false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("hi!", dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.addCutover((int) (short) 100, 'a', (int) '#', (int) (short) 0, 10, false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(dataInput0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.addCutover((int) (short) 0, ' ', (-1), 10, 10, true, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(dataInput0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        java.lang.Class<?> wildcardClass3 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        java.io.DataOutput dataOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass11 = dateTimeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder2.addRecurringSavings("hi!", (int) 'a', 0, (int) (short) 1, '#', (int) (byte) 0, (int) '#', (int) (short) 0, true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder2.addRecurringSavings("hi!", 10, 10, (int) (short) 10, '4', (int) (short) 100, (int) (byte) -1, (int) (short) 100, false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass6 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
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
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder5.addCutover((int) (byte) -1, '4', (int) (byte) -1, (int) (short) 10, (int) (byte) 10, true, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("hi!", dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("", outputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = dateTimeZoneBuilder17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        java.io.DataOutput dataOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", dataOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("hi!", outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
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
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder19.addCutover((int) (byte) 1, '4', (int) (byte) 10, (int) (byte) -1, (int) '4', false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder5.addCutover((int) 'a', ' ', (int) (byte) 100, (int) (byte) 10, (int) '#', true, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 100, 1, (int) (byte) 1, ' ', (int) '4', (int) '4', (int) (byte) 10, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("hi!", (int) (short) 1, (int) (short) 0, (int) (byte) 1, 'a', (int) 'a', (int) (byte) 10, (int) ' ', true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        java.io.DataOutput dataOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", dataOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass14 = dateTimeZone13.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder17.addCutover((int) (byte) 10, '#', (int) (short) 10, (int) '#', (int) (short) 10, true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        java.io.DataOutput dataOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = dateTimeZoneBuilder7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = dateTimeZoneBuilder5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        java.io.DataOutput dataOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("", dataOutput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass7 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder21.addCutover((int) (byte) -1, 'a', (int) (short) 0, 0, (int) '4', false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.addCutover((int) (short) 1, '#', (int) (short) -1, (-1), (int) ' ', true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("", outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("hi!", dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder23.addCutover((int) (short) 1, '#', (int) (short) -1, (int) (byte) 1, (int) (byte) 0, false, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("", dataOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addCutover(1, 'a', (int) ' ', (int) (short) -1, (-1), true, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass14 = dateTimeZoneBuilder2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = dateTimeZoneBuilder2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.addCutover((-1), ' ', (int) (byte) 1, (int) (short) 1, 1, true, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 0, (-1), (int) (byte) 10, '4', (int) '#', (-1), (int) (short) 100, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass6 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("", outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder17.addCutover((int) (byte) 0, '4', (int) (byte) 100, 0, (int) (short) 10, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = dateTimeZoneBuilder14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        java.io.DataOutput dataOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("", dataOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '#', (int) 'a', (int) (short) 1, 'a', (int) (short) -1, (int) (short) -1, (int) ' ', false, (int) (short) 1);
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        java.io.DataOutput dataOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("hi!", dataOutput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder2.addRecurringSavings("hi!", (int) (byte) 1, (int) (byte) 1, (int) (short) 100, 'a', 10, (int) (short) 10, (int) (short) 1, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder20.addCutover((int) (byte) 100, 'a', (int) (byte) 0, 100, (int) (short) -1, true, (int) (byte) -1);
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
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("", outputStream21);
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder21.addCutover((int) ' ', 'a', 100, (int) (byte) 10, (int) (short) 10, true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = dateTimeZoneBuilder7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addCutover(0, '#', (int) (byte) 100, 0, (-1), true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder19.addCutover(0, '#', (int) 'a', (int) '#', (int) ' ', false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        java.lang.Class<?> wildcardClass20 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset(0);
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", outputStream21);
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
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        java.io.DataOutput dataOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("hi!", dataOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder5.addCutover(100, 'a', (int) (short) 1, 100, 0, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder19.addCutover((int) (short) 100, ' ', (int) ' ', 1, 100, true, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addCutover(10, '#', 1, (int) (short) 10, (int) (short) 10, true, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        java.lang.Class<?> wildcardClass4 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder2.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass6 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder7.addCutover(100, ' ', (int) (byte) 0, (int) (byte) 10, 1, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("hi!", dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.addCutover((int) (byte) 0, 'a', (int) (byte) 0, (int) (short) 0, (int) (byte) -1, false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("hi!", outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder19.addCutover((int) (short) -1, '4', (int) (byte) 100, (int) (byte) 1, (-1), true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        java.io.DataOutput dataOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", dataOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass12 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (byte) 1, (int) (byte) -1, 0, '4', (int) ' ', (int) ' ', (int) (byte) 100, false, (int) (byte) 100);
        java.io.DataOutput dataOutput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", dataOutput24);
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
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addCutover((int) (byte) 1, 'a', 100, 1, (int) (byte) 0, false, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        java.io.DataOutput dataOutput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", dataOutput24);
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder11.writeTo("hi!", outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        java.io.DataOutput dataOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder11.writeTo("hi!", dataOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder5.addCutover((int) '#', 'a', (int) (short) -1, (int) ' ', 0, true, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass27 = dateTimeZone26.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("", (int) '#');
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", outputStream13);
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
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.addCutover((int) (byte) 0, 'a', (int) (byte) 0, (int) (byte) 1, (int) (short) 0, true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder3.addCutover((int) ' ', ' ', (int) (short) 1, 0, 0, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder17.addCutover((int) (short) 0, '#', (int) '4', (int) 'a', 0, true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder20.addCutover((int) (short) 1, 'a', (int) '#', (int) (byte) 1, (int) (short) 10, true, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        java.io.DataOutput dataOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("", dataOutput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("", outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = dateTimeZoneBuilder9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = dateTimeZoneBuilder9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 10, 10, (int) (short) 10, 'a', (int) (short) 0, (int) (short) -1, (int) (byte) 0, false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder19.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass27 = dateTimeZoneBuilder19.getClass();
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
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder2.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("", outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder5.addCutover(0, 'a', (-1), (int) (byte) 1, (-1), false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder7.addCutover((int) 'a', 'a', (-1), (int) (byte) 10, (int) (byte) 0, false, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setStandardOffset((int) '#');
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("hi!", dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) -1);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder7.addCutover((int) (short) 100, ' ', 0, 1, (int) (byte) 0, false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) (byte) 0);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("", outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (-1), (int) (byte) 0, (int) (short) 1, 'a', (int) (short) 1, 10, (int) (byte) 1, false, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addCutover((int) (short) 1, ' ', (int) '4', 0, (int) (byte) 10, true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        java.lang.Class<?> wildcardClass7 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder20.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass27 = dateTimeZoneBuilder20.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("", outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder17.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass21 = dateTimeZoneBuilder17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder14.addCutover(1, ' ', (int) (byte) 0, 10, (int) (byte) 1, false, (-1));
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
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = dateTimeZoneBuilder14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder22.addCutover((int) (byte) 0, '#', (int) '#', (int) ' ', (int) (short) 10, true, (int) '#');
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
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder2.addCutover((int) (short) 10, 'a', 10, (int) '#', (int) (short) 100, true, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder6.addCutover((int) (byte) 10, 'a', (int) (byte) 100, (int) (byte) 1, (int) (short) -1, true, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.addCutover(10, ' ', (int) (byte) 100, (int) (short) 10, (int) '4', true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) 'a', (int) (short) 1, (int) (byte) 100, '4', (int) 'a', (int) (byte) -1, (int) (short) -1, false, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder6.addCutover((int) '4', 'a', 0, (int) 'a', (int) (short) 100, true, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '#', (int) 'a', (int) (short) 1, 'a', (int) (short) -1, (int) (short) -1, (int) ' ', false, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) (short) 0);
        java.io.DataOutput dataOutput28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder26.writeTo("", dataOutput28);
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset((int) (byte) 100);
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder36.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addCutover((int) '#', '#', 100, (int) (byte) -1, 100, false, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
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
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((-1));
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder19.addCutover((int) (byte) 1, 'a', (int) (byte) -1, (int) (short) 10, (-1), false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder6.writeTo("hi!", outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 0, (int) '#', (int) (byte) 0, '4', (int) (byte) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder30.addCutover((int) (byte) 0, '4', (int) (short) -1, (int) (byte) 10, (int) (byte) 0, false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("hi!", dataOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder11.addRecurringSavings("hi!", (int) 'a', (int) (byte) 0, (int) (byte) 100, '4', (int) (byte) 100, (int) (byte) 10, (int) (byte) 100, true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("", outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", 1);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder3.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass23 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.addCutover((int) (byte) 0, 'a', (int) 'a', 0, 100, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder21.addCutover((int) ' ', '4', (int) (byte) 0, (int) (short) 10, 10, true, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        java.io.DataOutput dataOutput35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("hi!", dataOutput35);
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder8.addCutover((int) 'a', '#', (int) (byte) 100, (int) (byte) 0, 1, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder17.addCutover((int) (byte) 1, '4', (int) (short) 0, (int) '4', 0, true, (int) (short) 0);
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
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        java.io.DataOutput dataOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder6.writeTo("", dataOutput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder8.addCutover((int) '4', '4', (int) (short) -1, (int) (short) 0, (int) 'a', true, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        java.io.DataOutput dataOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("", dataOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) '#', (int) '#', (int) (short) 0, '4', (int) (short) -1, 100, (int) ' ', false, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder19.addCutover((int) (short) 100, '4', (int) '4', 100, (int) (byte) 100, true, (int) (byte) -1);
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
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(1);
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
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder10.addCutover((int) (byte) 0, ' ', (int) (short) -1, (int) (short) 1, (int) (short) -1, false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset(0);
        java.lang.Class<?> wildcardClass8 = dateTimeZoneBuilder7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        java.io.DataOutput dataOutput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("hi!", dataOutput25);
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (byte) 0, 10, (int) (short) 10, 'a', (int) (short) -1, 10, (int) ' ', false, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder2.toDateTimeZone("hi!", true);
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("", dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder2.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder2.addRecurringSavings("hi!", (int) '4', (int) (short) 0, 1, 'a', (int) (byte) 100, 1, (int) (byte) 0, true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = dateTimeZoneBuilder6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) (byte) 0, '4', (int) (short) 10, (int) '#', (int) (short) 100, false, (-1));
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("", outputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder3.addCutover((int) '4', ' ', 0, (int) '4', 1, true, (int) (short) 100);
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder19.addCutover((int) (short) 1, 'a', (int) (byte) 100, 10, (int) (byte) 100, true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) (byte) -1, '4', (int) '4', (int) (short) 100, 0, true, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass15 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        java.io.DataOutput dataOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", dataOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset(1);
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder12.addRecurringSavings("hi!", 10, (int) (byte) 10, 10, ' ', (int) 'a', (int) (short) 100, (int) '4', true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", outputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder9.addCutover((int) ' ', ' ', (int) (short) 10, (int) (short) 0, 1, true, 0);
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder2.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (short) -1);
        java.io.DataOutput dataOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder8.writeTo("", dataOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder5.addCutover((int) (short) 1, '#', (int) (byte) 10, (int) (short) -1, (-1), false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        java.lang.Class<?> wildcardClass29 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        java.lang.Class<?> wildcardClass22 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder7.addCutover((int) (byte) 1, 'a', (-1), (int) '#', 1, false, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        java.io.DataOutput dataOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", dataOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder28.setFixedSavings("", (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("", dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("hi!", dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", (int) (byte) 1, (int) '#', 0, 'a', (int) (byte) 0, (-1), (int) '#', true, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = dateTimeZoneBuilder17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 1, 0, (int) (short) 10, 'a', (int) (short) 1, 0, (int) '#', false, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) (short) 100, (int) (byte) -1, (int) ' ', ' ', 100, (-1), 0, false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 1, (int) (short) 10, (int) 'a', ' ', (int) (short) -1, (-1), (int) 'a', false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        java.io.DataOutput dataOutput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", dataOutput24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset(0);
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
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 100, 0, (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (byte) 10, false, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder19.addCutover((int) (byte) 0, ' ', (int) (byte) -1, (int) '4', (int) (byte) 0, true, 100);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (byte) 1, (int) (byte) -1, 0, '4', (int) ' ', (int) ' ', (int) (byte) 100, false, (int) (byte) 100);
        java.io.DataOutput dataOutput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("", dataOutput24);
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
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("hi!", dataOutput12);
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder9.addCutover(0, ' ', (int) ' ', (int) (byte) 10, 1, false, 10);
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
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) '#');
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder31.addCutover((int) (byte) 1, ' ', (int) (byte) 10, 1, (-1), false, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.addCutover((int) (byte) 100, 'a', (int) (short) 100, (int) 'a', (int) (short) 0, true, (int) (byte) 100);
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
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 100, (int) (short) 100, (int) (byte) -1, 'a', (int) (short) -1, 100, (int) (byte) 1, false, (int) (short) 10);
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder18.writeTo("", outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset((int) (byte) 0);
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("hi!", outputStream16);
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
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder5.addCutover(1, '4', 0, (int) 'a', 0, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.addCutover(0, 'a', 0, (int) (short) -1, (int) '#', false, (int) 'a');
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
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("", outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '#', (int) 'a', (int) (short) 1, 'a', (int) (short) -1, (int) (short) -1, (int) ' ', false, (int) (short) 1);
        java.io.DataOutput dataOutput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", dataOutput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder0.addCutover(1, ' ', 0, (int) (byte) -1, 1, true, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        java.io.DataOutput dataOutput27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("hi!", dataOutput27);
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("hi!", outputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("hi!", 100, (-1), 0, 'a', (int) (short) 0, (-1), (int) (byte) 100, true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = dateTimeZoneBuilder5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset((int) (byte) 100);
        java.io.OutputStream outputStream38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder36.writeTo("", outputStream38);
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
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder2.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder8.addRecurringSavings("hi!", 0, 10, (int) '#', 'a', (int) (short) 0, (int) (byte) -1, 10, false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (short) 0, (int) ' ', (int) (short) 1, ' ', (int) ' ', (int) ' ', (int) (short) 100, false, 1);
        java.io.DataOutput dataOutput57 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("hi!", dataOutput57);
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass11 = dateTimeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder19.addCutover((int) '4', '4', (int) ' ', (int) 'a', (int) (byte) -1, false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder20.addCutover((int) (byte) 0, ' ', (int) (short) 1, (int) '#', 100, true, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
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
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder9.addCutover((int) '4', 'a', (int) (short) 100, 1, (int) (short) 10, false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 10, (int) (short) 0, (int) (byte) 100, ' ', (int) (short) 0, 10, (int) ' ', true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        java.io.DataOutput dataOutput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("", dataOutput24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset(0);
        java.io.DataOutput dataOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", dataOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder14.addCutover((int) '4', '4', (int) 'a', (int) (byte) 100, (int) (short) -1, true, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (byte) 100);
        java.io.DataOutput dataOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("", dataOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder7.addCutover((int) (byte) 10, '#', 10, (int) '#', 1, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
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
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (short) -1, (int) (byte) 1, (-1), 'a', (int) (byte) 1, (int) (short) 0, 100, true, (int) (byte) 0);
        java.io.OutputStream outputStream43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder41.writeTo("", outputStream43);
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        java.io.DataOutput dataOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", dataOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (short) 0, (int) ' ', (int) (short) 1, ' ', (int) ' ', (int) ' ', (int) (short) 100, false, 1);
        java.lang.Class<?> wildcardClass56 = dateTimeZoneBuilder44.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        java.io.OutputStream outputStream28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("", outputStream28);
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
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = dateTimeZoneBuilder17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        java.lang.Class<?> wildcardClass5 = dateTimeZoneBuilder4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder4.addRecurringSavings("hi!", (int) (byte) 0, (int) (short) 1, (int) (short) 1, '4', (int) (short) 1, (int) ' ', (int) '4', true, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = dateTimeZoneBuilder7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        java.lang.Class<?> wildcardClass6 = dateTimeZoneBuilder5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = dateTimeZoneBuilder5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        java.io.DataOutput dataOutput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("", dataOutput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addCutover(0, '4', 0, (int) (short) 1, (-1), false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        java.lang.Class<?> wildcardClass6 = dateTimeZoneBuilder2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("", outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        java.io.OutputStream outputStream35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("", outputStream35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) '#', 0, (int) (short) -1, '#', (int) (short) 100, (int) (byte) 10, 100, true, 0);
        java.io.OutputStream outputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("", outputStream30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addCutover((int) (byte) 1, '#', (int) (byte) -1, (int) (byte) 100, (int) (byte) 10, true, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
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
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder3.addCutover((int) (short) -1, '4', 10, (int) (short) 0, (int) (byte) 1, false, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass23 = dateTimeZone22.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder11.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass23 = dateTimeZoneBuilder11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder19.addCutover((int) (short) 10, 'a', (int) (byte) -1, (int) (short) 100, (int) '4', false, (int) '#');
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder17.addCutover((int) (short) 100, '#', (int) ' ', (int) 'a', (-1), false, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder12.addRecurringSavings("hi!", (int) (short) 10, (int) ' ', 100, '#', 100, (int) (short) 100, 0, true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = dateTimeZoneBuilder11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(0);
        java.lang.Class<?> wildcardClass22 = dateTimeZoneBuilder21.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder11.toDateTimeZone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder11.addCutover((int) ' ', 'a', (int) ' ', 10, (int) (short) 0, true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) 'a');
        java.io.DataOutput dataOutput37 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("hi!", dataOutput37);
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
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder5.setStandardOffset((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder10.addCutover(10, 'a', 100, 0, 10, false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("", outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder23.addRecurringSavings("hi!", (int) (byte) 100, 1, (int) (short) 10, 'a', (int) (byte) 10, (int) (short) 10, (int) (byte) 1, false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder5.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder5.addRecurringSavings("hi!", (int) ' ', (int) (byte) 100, 10, 'a', (int) 'a', (int) '4', (int) (short) -1, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder38 = dateTimeZoneBuilder24.addRecurringSavings("hi!", (int) (short) 100, (int) (short) -1, (int) ' ', '4', (int) 'a', 0, 0, false, (int) ' ');
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
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(0);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("", outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 1, (int) '4', (int) '#', '4', 10, (int) (byte) 10, 10, false, 10);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder0.toDateTimeZone("hi!", false);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        java.io.DataOutput dataOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", dataOutput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset((-1));
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("hi!", outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setStandardOffset((int) '#');
        java.io.DataOutput dataOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", dataOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder22.addCutover((int) (byte) -1, '4', 0, (int) (short) -1, (int) (byte) -1, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
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
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", (int) (byte) 1, (int) '#', 0, 'a', (int) (byte) 0, (-1), (int) '#', true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) 'a');
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder6.writeTo("", outputStream21);
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
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 1, (int) 'a', (int) (short) 10, 'a', (int) (byte) 1, (int) (byte) 1, (int) '#', false, (int) (short) 10);
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover(10, '4', 10, (-1), (int) (byte) 100, false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder20.setFixedSavings("", (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder23.toDateTimeZone("hi!", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) '#', (int) '#', (int) (short) 0, '4', (int) (short) -1, 100, (int) ' ', false, (int) 'a');
        java.io.OutputStream outputStream46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("", outputStream46);
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder6.addCutover((int) ' ', 'a', (int) (byte) 1, (int) (short) 10, (int) (short) 100, true, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 0);
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder14.setStandardOffset(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (short) -1, 0, 0, '#', (int) '#', (int) (short) 10, (int) (short) 100, true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) -1);
        java.io.DataOutput dataOutput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) 10, (int) ' ', (int) (byte) 0, ' ', (int) (byte) 1, (-1), (int) (short) 1, true, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.setStandardOffset(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder14.addCutover(1, '#', (int) ' ', (int) '#', (int) '4', false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder11.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass23 = dateTimeZone22.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.setFixedSavings("", (int) '4');
        java.lang.Class<?> wildcardClass37 = dateTimeZoneBuilder36.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) '4', (int) (short) 100, 10, 'a', (int) (byte) 100, (int) (byte) 10, (int) '#', true, (int) (byte) -1);
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder23.writeTo("hi!", outputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder0.setStandardOffset((int) '#');
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass14 = dateTimeZoneBuilder5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder12.setStandardOffset(0);
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) (byte) -1, '#', 100, (int) (byte) 10, (int) ' ', false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) 'a', (int) (short) 1, (int) 'a', '4', (int) ' ', (int) (short) 100, (int) ' ', true, (int) '#');
        java.io.DataOutput dataOutput35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("", dataOutput35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        java.io.DataOutput dataOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder11.writeTo("hi!", dataOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) -1, 0, (int) (short) 1, 'a', (int) (short) 0, (int) (short) 10, 100, true, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder22.addCutover((int) '#', '#', 0, (int) ' ', (int) 'a', false, (int) '#');
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
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("hi!", 100);
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 1, (int) '4', (int) '#', '4', 10, (int) (byte) 10, 10, false, 10);
        java.io.DataOutput dataOutput27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", dataOutput27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.addRecurringSavings("", 0, 100, 100, 'a', (int) (short) 1, (-1), (int) (short) 10, false, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder5.addRecurringSavings("hi!", (int) ' ', 0, 0, '#', (int) (byte) 100, (int) (short) 0, (int) (byte) -1, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("hi!", outputStream24);
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("", outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder2.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (short) -1);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder8.writeTo("", outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        java.io.DataOutput dataOutput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder21.writeTo("hi!", dataOutput23);
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) '4');
        java.io.DataOutput dataOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.addRecurringSavings("", (int) 'a', (int) (short) 10, (int) (short) -1, '4', (-1), (int) (short) 0, (int) (short) 1, true, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder24.addCutover((int) (short) 1, ' ', 0, (int) (byte) 100, (-1), false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addCutover((int) '#', '4', (int) (short) 1, (int) (byte) 0, (int) (byte) 1, true, 0);
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeZoneBuilder6.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass10 = dateTimeZoneBuilder6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addCutover(100, '#', 1, 100, (int) ' ', true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setStandardOffset((int) '4');
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass29 = dateTimeZoneBuilder14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder3.addRecurringSavings("hi!", 100, (int) (byte) -1, (int) (short) 10, '#', 0, (int) (short) 100, 1, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder9.addCutover((int) (byte) 100, 'a', (-1), 100, (int) (byte) -1, false, (int) (byte) -1);
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
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        java.io.DataOutput dataOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder11.writeTo("hi!", dataOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder2.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder2.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addCutover((int) (short) 1, ' ', 0, 0, (int) '#', true, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) (short) -1);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder4.writeTo("", outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (byte) 100, (int) '4', (int) (short) -1, 'a', (int) (short) 0, 0, (int) '#', true, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder17.addCutover(100, ' ', 100, (int) (short) 100, (int) (short) 10, true, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((-1));
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder13.writeTo("hi!", dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        java.io.DataOutput dataOutput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder16.writeTo("hi!", dataOutput18);
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
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 1, (int) 'a', (int) (short) 10, 'a', (int) (byte) 1, (int) (byte) 1, (int) '#', false, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.addCutover(0, 'a', (int) 'a', (int) (short) 10, 0, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (short) 10, 0, (int) (byte) 1, '4', (int) ' ', (int) (byte) 10, 100, true, 0);
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("", outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", 100, (int) (byte) 10, (int) (byte) -1, ' ', (int) (byte) 100, (int) (short) 100, (-1), false, 0);
        java.lang.Class<?> wildcardClass34 = dateTimeZoneBuilder22.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("", outputStream24);
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
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder20.setFixedSavings("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder26.addCutover((int) (short) 10, 'a', (int) '4', (int) (byte) 10, (int) (short) 10, true, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder4.addCutover(0, 'a', (int) (short) 0, (int) '4', 1, false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder21.writeTo("hi!", outputStream23);
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) '#', (int) '#', (int) (short) 0, '4', (int) (short) -1, 100, (int) ' ', false, (int) 'a');
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 1, 0, (int) (short) 10, 'a', (int) (short) 1, 0, (int) '#', false, (int) ' ');
        java.lang.Class<?> wildcardClass23 = dateTimeZoneBuilder5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 1, (int) 'a', (int) (short) 10, 'a', (int) (byte) 1, (int) (byte) 1, (int) '#', false, (int) (short) 10);
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("", outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        java.lang.Class<?> wildcardClass50 = dateTimeZoneBuilder49.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder42);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder47);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder2.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder2.setFixedSavings("hi!", (int) (short) -1);
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
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 100, 0, (int) (short) 100, ' ', (int) (short) 1, (int) (short) -1, (int) (byte) 10, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder44.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) (short) 100, 'a', (int) (short) -1, (int) 'a', 10, false, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder63 = dateTimeZoneBuilder55.addCutover((int) (short) 1, ' ', (int) (byte) -1, (int) '#', (-1), true, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder0.setStandardOffset((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.addCutover((int) (short) -1, 'a', (int) (byte) 0, 10, (int) '#', true, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        java.io.DataOutput dataOutput59 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder57.writeTo("hi!", dataOutput59);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("hi!", 0, (int) (short) 10, (int) 'a', ' ', 0, (int) '#', 10, false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        java.io.DataOutput dataOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder19.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder19.addCutover((int) (byte) 0, '#', (int) '#', (int) (short) 10, 10, false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", 10);
        java.io.DataOutput dataOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("hi!", dataOutput19);
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder20.addCutover((int) (short) 0, ' ', 1, (int) (short) 1, (int) (byte) 1, true, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder24.addCutover(10, '#', (int) (byte) 100, (int) (short) 10, 0, true, (int) (short) 1);
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder13.addRecurringSavings("hi!", (int) (byte) 10, (int) 'a', (int) 'a', ' ', 0, (int) (short) 0, (int) '4', false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeZoneBuilder31.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder31.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeZoneBuilder36.toDateTimeZone("", false);
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder42.setStandardOffset(100);
        java.io.DataOutput dataOutput46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder42.writeTo("", dataOutput46);
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
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 1);
        java.io.DataOutput dataOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder7.writeTo("hi!", dataOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        java.io.DataOutput dataOutput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder6.writeTo("hi!", dataOutput21);
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("hi!", outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        java.io.DataOutput dataOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder12.writeTo("hi!", dataOutput14);
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) '#');
        java.io.DataOutput dataOutput27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", dataOutput27);
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        java.lang.Class<?> wildcardClass20 = dateTimeZoneBuilder19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 1, 0, (int) (short) 10, 'a', (int) (short) 1, 0, (int) '#', false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) 'a', '#', (int) (short) 10, (int) (short) 10, (int) 'a', true, 0);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass37 = dateTimeZone36.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        java.io.DataOutput dataOutput59 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder49.writeTo("", dataOutput59);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 1);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder22.writeTo("hi!", outputStream24);
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        java.io.DataOutput dataOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", dataOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder0.setFixedSavings("", 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder6.addCutover((int) (byte) -1, 'a', (int) (byte) 0, (int) '#', (int) '4', true, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder33.setStandardOffset((int) (short) 0);
        java.io.DataOutput dataOutput39 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder37.writeTo("", dataOutput39);
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
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder19.addCutover(1, 'a', (int) '4', (int) '4', (int) (byte) 1, true, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder8.setFixedSavings("hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) (byte) 10, '#', (int) (short) 10, (-1), 100, true, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder7.addCutover(0, '4', (int) (short) -1, (int) (short) 10, 0, true, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 0);
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
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder12.addCutover(0, '4', 1, (int) (byte) 10, (int) (byte) 100, true, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        java.io.DataOutput dataOutput37 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder35.writeTo("hi!", dataOutput37);
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
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder10.addRecurringSavings("", (-1), (-1), (int) (byte) 0, ' ', (int) '4', (int) (short) 0, (-1), true, (int) (short) 10);
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder24.writeTo("", outputStream26);
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
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder32 = dateTimeZoneBuilder17.addCutover((int) (byte) 1, '#', (int) 'a', 1, 1, true, (int) (short) 10);
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
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder2.addCutover((int) (short) 0, '4', (-1), (int) '#', 0, false, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder6.writeTo("hi!", outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder0.addRecurringSavings("", (int) 'a', (int) (short) 10, (int) (short) -1, '4', (-1), (int) (short) 0, (int) (short) 1, true, 0);
        java.lang.Class<?> wildcardClass25 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder63 = dateTimeZoneBuilder55.addCutover((int) '4', '#', (int) '4', (int) (byte) 10, (int) (short) 10, true, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder52);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder55);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        java.io.OutputStream outputStream70 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder68.writeTo("", outputStream70);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder68);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder33.addRecurringSavings("hi!", (int) ' ', (int) (byte) 0, (int) (short) 1, 'a', (int) (byte) -1, 10, 10, true, (int) (short) 10);
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
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder5.addRecurringSavings("hi!", 1, 10, (-1), 'a', 0, (int) (short) 100, (int) (byte) 0, false, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder27.addCutover((int) (short) 1, 'a', (int) '#', (int) '4', 0, false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) 10, (int) ' ', (int) (byte) 0, ' ', (int) (byte) 1, (-1), (int) (short) 1, true, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.setStandardOffset(1);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeZoneBuilder33.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("hi!", outputStream38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 1, (int) 'a', (int) (short) 10, 'a', (int) (byte) 1, (int) (byte) 1, (int) '#', false, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeZoneBuilder14.toDateTimeZone("", true);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("", outputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (short) 0, 10, (int) ' ', ' ', 0, (int) (byte) -1, (int) (byte) -1, false, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder47 = dateTimeZoneBuilder22.addRecurringSavings("hi!", (int) (byte) 10, (int) (short) -1, (int) '4', '4', (int) '4', 1, (int) (byte) 10, true, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder5.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder26 = dateTimeZoneBuilder5.setFixedSavings("hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder5.addCutover((int) (byte) 10, ' ', (int) (short) 100, (int) 'a', (int) '#', false, (int) ' ');
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
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder5.setFixedSavings("", 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder10.addRecurringSavings("hi!", (int) (short) -1, (-1), (int) ' ', '4', (int) (short) 100, (int) (byte) 10, (int) (byte) 10, true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) 1, (int) (short) 1, (int) (short) 1, 'a', 10, 1, (int) (short) 1, false, (int) (short) 100);
        java.io.OutputStream outputStream37 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", outputStream37);
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
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) -1, 1, (-1), '#', (int) (byte) 100, (int) '#', (int) '4', true, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder3.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass34 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 0, (int) '#', (int) (byte) 0, '4', (int) (byte) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder5.toDateTimeZone("", true);
        java.io.DataOutput dataOutput35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", dataOutput35);
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
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 0, (int) '#', (int) (byte) 0, '4', (int) (byte) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder5.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder5.addRecurringSavings("", 100, 10, (int) (short) 0, ' ', (int) (short) 1, 10, 10, false, (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
            dateTimeZoneBuilder22.writeTo("", outputStream27);
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder11.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder11.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder11.addCutover((int) (byte) 1, '4', (int) '#', (-1), (int) (short) -1, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 0);
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", outputStream18);
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
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeZoneBuilder14.toDateTimeZone("hi!", false);
        java.io.OutputStream outputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("hi!", outputStream30);
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
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        java.io.OutputStream outputStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder30.writeTo("", outputStream32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder17.toDateTimeZone("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("hi!", (int) (short) 100, (int) (byte) 0, (int) ' ', 'a', (int) (byte) -1, (int) '4', (int) (short) 10, false, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder41 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (short) -1, (int) (byte) 1, (-1), 'a', (int) (byte) 1, (int) (short) 0, 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeZoneBuilder19.toDateTimeZone("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder55 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) (short) 1, (-1), (int) (byte) 0, '4', (int) 'a', (int) '4', (int) (byte) 1, false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) 10, (int) ' ', (int) (byte) 0, ' ', (int) (byte) 1, (-1), (int) (short) 1, true, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.setStandardOffset(1);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder42 = dateTimeZoneBuilder17.addRecurringSavings("", 100, (int) (short) 100, (int) 'a', ' ', (-1), 10, 1, true, (int) (short) 10);
        java.io.DataOutput dataOutput44 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("", dataOutput44);
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
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder33.addCutover(0, ' ', (int) (short) 10, 100, 0, true, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder31.setFixedSavings("", (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeZoneBuilder34.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeZoneBuilder34.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass41 = dateTimeZone40.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder57 = dateTimeZoneBuilder47.addCutover((int) 'a', 'a', 100, (int) ' ', (int) (byte) 0, false, 0);
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
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (short) 100);
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("", (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder25.setStandardOffset((int) 'a');
        java.lang.Class<?> wildcardClass28 = dateTimeZoneBuilder27.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.addRecurringSavings("", 1, 0, (int) (short) 10, 'a', (int) (short) 1, 0, (int) '#', false, (int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, (int) 'a', '#', (int) (short) 10, (int) (short) 10, (int) 'a', true, 0);
        java.io.DataOutput dataOutput35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", dataOutput35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.addRecurringSavings("", 0, 100, 100, 'a', (int) (short) 1, (-1), (int) (short) 10, false, (int) (byte) 1);
        java.io.DataOutput dataOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("", dataOutput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.setFixedSavings("hi!", 100);
        java.io.DataOutput dataOutput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder5.writeTo("hi!", dataOutput18);
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
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (short) 1, (int) (byte) 100, (int) '#', '#', (int) (short) 0, (int) (byte) -1, (int) '#', true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder28.setFixedSavings("", (int) (byte) 10);
        java.io.DataOutput dataOutput33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder31.writeTo("hi!", dataOutput33);
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) '4');
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder16.toDateTimeZone("", true);
        java.lang.Class<?> wildcardClass25 = dateTimeZone24.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        java.lang.Class<?> wildcardClass20 = dateTimeZoneBuilder19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder8.addRecurringSavings("", (int) (short) 1, 1, (-1), '4', (int) (short) 100, (int) '#', (int) (byte) 10, true, (int) (byte) -1);
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder8.writeTo("hi!", outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder8.setStandardOffset((int) ' ');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder8.addRecurringSavings("", (int) (short) 1, 1, (-1), '4', (int) (short) 100, (int) '#', (int) (byte) 10, true, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = dateTimeZoneBuilder8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder14.writeTo("", outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder13.setFixedSavings("", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder16.setStandardOffset((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder18.addRecurringSavings("hi!", (int) (short) -1, (int) (byte) 1, (int) (short) 10, '4', (int) (short) 1, (int) '#', (int) '#', false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 1, (int) 'a', (int) (short) 10, 'a', (int) (byte) 1, (int) (byte) 1, (int) '#', false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 0);
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder16.writeTo("", outputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder7.setStandardOffset(0);
        java.io.DataOutput dataOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder12.writeTo("", dataOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder5.setFixedSavings("", (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) '4');
        java.lang.Class<?> wildcardClass12 = dateTimeZoneBuilder5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.io.OutputStream outputStream59 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder49.writeTo("hi!", outputStream59);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) '#', 0, (int) (short) -1, '#', (int) (short) 100, (int) (byte) 10, 100, true, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder39 = dateTimeZoneBuilder3.addRecurringSavings("hi!", 100, (int) (byte) -1, (int) '#', 'a', (int) (byte) -1, (-1), (int) (byte) 0, true, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        java.io.DataOutput dataOutput59 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("", dataOutput59);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder57);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder7.addRecurringSavings("hi!", (int) (byte) 0, 0, (int) '#', ' ', (int) (byte) 0, (int) (short) 1, (int) (short) 10, false, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder20.setStandardOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder20.addRecurringSavings("hi!", (int) 'a', (-1), (int) '#', '#', (int) (short) -1, (int) (short) 0, (int) (byte) -1, false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("", outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder7.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder13.setStandardOffset((int) (short) 10);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder13.writeTo("", outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder6.setStandardOffset((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder6.addCutover(0, 'a', (int) (short) 100, (int) (short) 0, (-1), true, (int) ' ');
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
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        java.io.OutputStream outputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder6.writeTo("hi!", outputStream24);
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addCutover((int) (byte) 0, ' ', (int) '#', 0, (int) (short) 10, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("hi!", (int) (short) 0);
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder3.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        java.io.DataOutput dataOutput27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("hi!", dataOutput27);
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder4.setStandardOffset((int) ' ');
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("hi!", outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) -1, 1, (-1), '#', (int) (byte) 100, (int) '#', (int) '4', true, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder3.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass34 = dateTimeZone33.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.setStandardOffset(100);
        java.io.DataOutput dataOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("hi!", dataOutput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 0, (int) '#', (int) (byte) 0, '4', (int) (byte) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder30.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (byte) 10);
        java.lang.Class<?> wildcardClass36 = dateTimeZoneBuilder30.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", (int) (byte) 1, (int) '#', 0, 'a', (int) (byte) 0, (-1), (int) '#', true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder19.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setStandardOffset(1);
        java.lang.Class<?> wildcardClass25 = dateTimeZoneBuilder19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        java.lang.Class<?> wildcardClass18 = dateTimeZoneBuilder17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeZoneBuilder18.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass22 = dateTimeZoneBuilder18.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 10, (int) '#', (int) (byte) 0, 'a', (int) (short) 0, 100, (int) (byte) 0, false, 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder19.addRecurringSavings("", (int) (byte) 1, 1, (int) (short) 10, '#', (int) (byte) 0, (int) '4', (int) ' ', false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder33.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = dateTimeZoneBuilder33.setStandardOffset((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder45 = dateTimeZoneBuilder37.addCutover((int) (byte) 1, ' ', (int) 'a', (int) (short) 10, 0, false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder37);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder6.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder6.setStandardOffset(0);
        java.io.DataOutput dataOutput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder6.writeTo("", dataOutput23);
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeZoneBuilder6.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addCutover((int) '4', ' ', (int) '4', 0, (int) ' ', true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder0.addRecurringSavings("hi!", 100, (int) (short) 0, (int) (byte) 100, 'a', 1, (int) (byte) 10, 1, true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder4.addRecurringSavings("", (int) (short) 10, (int) (short) 0, (int) (short) -1, '4', (int) (byte) 100, (int) 'a', 0, false, (int) (byte) 0);
        java.io.DataOutput dataOutput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder4.writeTo("hi!", dataOutput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        java.io.DataOutput dataOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder12.writeTo("hi!", dataOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder12);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover((int) '4', '#', (-1), (int) '#', 10, true, 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder22.addCutover((int) (short) 10, 'a', (-1), (int) (byte) -1, (int) ' ', true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) '4', (int) (short) -1, (int) (short) 100, 'a', 100, (int) (byte) 1, (int) (byte) 100, false, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", (int) '#');
        java.lang.Class<?> wildcardClass24 = dateTimeZoneBuilder23.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder3.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder3.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder3.setFixedSavings("hi!", (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (byte) 1, (int) ' ', (int) (short) 10, '4', (-1), (int) ' ', (int) (short) -1, false, (int) (short) 100);
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder23.writeTo("hi!", outputStream25);
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
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder18 = dateTimeZoneBuilder4.addRecurringSavings("", (int) (short) 10, (int) (short) 0, (int) (short) -1, '4', (int) (byte) 100, (int) 'a', 0, false, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder4.addRecurringSavings("hi!", (int) (short) 10, (int) (short) -1, (int) '4', '#', 0, (int) ' ', (int) (short) 1, false, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder18);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) -1);
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        java.io.DataOutput dataOutput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder19.writeTo("", dataOutput21);
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
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder19.setStandardOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder23.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass27 = dateTimeZoneBuilder23.getClass();
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder20.toDateTimeZone("hi!", false);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeZoneBuilder20.toDateTimeZone("", false);
        java.io.DataOutput dataOutput28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder20.writeTo("hi!", dataOutput28);
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
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (short) 100, (int) (byte) -1, 0, '#', (int) (short) 0, 0, (int) 'a', false, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder35.addCutover(0, '4', 1, (int) (short) -1, (int) (short) 1, false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
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
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = dateTimeZoneBuilder19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder8 = dateTimeZoneBuilder0.addCutover((int) 'a', '#', (int) ' ', (int) (byte) -1, 100, true, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeZoneBuilder0.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder15 = dateTimeZoneBuilder0.setStandardOffset(100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder0.writeTo("hi!", outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeZoneBuilder4.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder4.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder10.setFixedSavings("", (int) (short) 100);
        java.io.DataOutput dataOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder10.writeTo("", dataOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder10);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder13);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("hi!", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.addRecurringSavings("hi!", (int) (byte) 10, (int) ' ', (int) (byte) 0, ' ', (int) (byte) 1, (-1), (int) (short) 1, true, (int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder14.setStandardOffset(1);
        java.io.DataOutput dataOutput35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("", dataOutput35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder33);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addCutover((int) '#', '4', 0, (int) ' ', (int) '4', true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) (short) 1, (int) 'a', (int) (short) 10, 'a', (int) (byte) 1, (int) (byte) 1, (int) '#', false, (int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = dateTimeZoneBuilder16.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder5.setFixedSavings("", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder11.addCutover(1, '#', (int) ' ', (int) (byte) 10, (int) (short) 10, true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder3.toDateTimeZone("", false);
        java.lang.Class<?> wildcardClass21 = dateTimeZoneBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder29 = dateTimeZoneBuilder21.addCutover((int) '#', '4', (int) 'a', (int) '4', 100, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) '#', (int) (short) 10, '#', (int) (short) 1, (int) (short) -1, (int) (byte) 100, true, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder5.setStandardOffset((-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder21.setFixedSavings("", (int) (short) 100);
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder24.writeTo("hi!", outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder21);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder24);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder10 = dateTimeZoneBuilder5.setStandardOffset((int) '#');
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeZoneBuilder5.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder5.addRecurringSavings("hi!", (int) ' ', (int) (byte) 100, 10, 'a', (int) 'a', (int) '4', (int) (short) -1, false, (int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder27 = dateTimeZoneBuilder24.setFixedSavings("", (int) (short) 0);
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder24.writeTo("hi!", outputStream29);
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
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        java.io.OutputStream outputStream33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder31.writeTo("hi!", outputStream33);
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
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder17.setFixedSavings("hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass24 = dateTimeZoneBuilder17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        java.lang.Class<?> wildcardClass6 = dateTimeZoneBuilder5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder14.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder19.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder24 = dateTimeZoneBuilder19.setFixedSavings("hi!", (int) (byte) 100);
        java.io.DataOutput dataOutput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder24.writeTo("", dataOutput26);
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
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        java.lang.Class<?> wildcardClass23 = dateTimeZone22.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder22.setFixedSavings("hi!", (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder36 = dateTimeZoneBuilder25.addRecurringSavings("", (int) (byte) 10, (int) ' ', 0, '4', (int) (short) 1, (int) ' ', 10, true, 0);
        java.io.DataOutput dataOutput38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder25.writeTo("hi!", dataOutput38);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder36);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder2.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (byte) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("", 0, (int) (byte) 1, (int) (byte) 100, '#', (int) ' ', (int) (short) 10, (int) (short) 10, false, (int) 'a');
        java.io.DataOutput dataOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder9.writeTo("", dataOutput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", (int) (byte) 1, (int) '#', 0, 'a', (int) (byte) 0, (-1), (int) '#', true, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder28 = dateTimeZoneBuilder6.addRecurringSavings("", (int) (short) 100, (int) (byte) 1, 100, ' ', (int) (short) 0, (int) (short) 10, (int) '4', false, (int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = dateTimeZoneBuilder28.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeZoneBuilder5.toDateTimeZone("hi!", false);
        java.lang.Class<?> wildcardClass9 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder0.addCutover((int) (short) 100, ' ', 1, (-1), (int) (byte) 10, true, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("", (int) '4', (int) ' ', (int) (short) 10, 'a', (-1), 0, (-1), true, 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder14.setFixedSavings("", (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeZoneBuilder14.toDateTimeZone("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder14.addCutover((int) '4', ' ', 1, (int) (byte) 100, 100, true, (-1));
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder5.addRecurringSavings("", 0, 100, 100, 'a', (int) (short) 1, (-1), (int) (short) 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder5.setStandardOffset(10);
        java.lang.Class<?> wildcardClass23 = dateTimeZoneBuilder22.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder7);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder21 = dateTimeZoneBuilder3.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeZoneBuilder3.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder3.addRecurringSavings("", (int) (short) 100, (int) (byte) -1, 0, '#', (int) (short) 0, 0, (int) 'a', false, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder46 = dateTimeZoneBuilder3.addRecurringSavings("hi!", (int) (short) 0, 0, 10, ' ', (int) ' ', (int) (short) -1, (int) (byte) 1, false, (int) ' ');
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
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 0, '#', (int) '#', (int) '#', (int) (byte) 0, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder0.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = dateTimeZoneBuilder0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder6.addRecurringSavings("", 100, (int) (byte) 10, (int) 'a', '#', (int) (short) 10, 100, 10, false, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeZoneBuilder6.toDateTimeZone("", false);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder23 = dateTimeZoneBuilder6.setFixedSavings("", (int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder25 = dateTimeZoneBuilder6.setStandardOffset((int) '#');
        java.lang.Class<?> wildcardClass26 = dateTimeZoneBuilder6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder23);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.io.OutputStream outputStream51 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder44.writeTo("", outputStream51);
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
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder17.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder31 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (byte) 1, (int) (short) 100, (int) ' ', ' ', (int) 'a', 0, (int) '4', true, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder34 = dateTimeZoneBuilder31.setFixedSavings("", (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeZoneBuilder34.toDateTimeZone("", true);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeZoneBuilder34.toDateTimeZone("hi!", false);
        java.io.DataOutput dataOutput42 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder34.writeTo("", dataOutput42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder20);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder31);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", (int) '4', (int) 'a', 0, '4', (int) (byte) 100, (int) (byte) 10, (int) (short) 1, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder17.setStandardOffset((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeZoneBuilder17.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder17.addRecurringSavings("", (int) (short) 1, (int) (byte) 100, (int) (short) 10, 'a', 0, (int) (short) 10, (int) ' ', false, (int) (short) 0);
        java.io.OutputStream outputStream35 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder33.writeTo("hi!", outputStream35);
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder20 = dateTimeZoneBuilder9.addRecurringSavings("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 10, ' ', (int) (byte) 1, 0, (int) (byte) 0, false, (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 0, 100, (int) (byte) 100, 'a', 1, 100, (int) (short) 0, false, (int) (short) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.setStandardOffset((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder22.addCutover(1, 'a', (int) 'a', (int) (short) 0, (int) '#', false, (int) (short) -1);
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
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset(1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder7.setStandardOffset((int) (short) 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder9.setFixedSavings("hi!", (int) 'a');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder9.setStandardOffset(0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder14.setFixedSavings("hi!", (int) '4');
        java.io.DataOutput dataOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder17.writeTo("", dataOutput19);
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", (int) (byte) -1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder13 = dateTimeZoneBuilder3.addCutover(0, '4', 1, (int) '#', (int) '4', false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeZoneBuilder0.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeZoneBuilder0.toDateTimeZone("", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder12 = dateTimeZoneBuilder0.setStandardOffset((int) (short) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.setStandardOffset((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder0.addCutover((int) (byte) 100, ' ', (int) (short) 10, (-1), (int) (short) 100, false, 0);
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
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("hi!", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder7 = dateTimeZoneBuilder5.setStandardOffset((int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder9 = dateTimeZoneBuilder5.setStandardOffset(100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder9.setStandardOffset((int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder9.addRecurringSavings("", (int) (byte) 1, (int) (byte) -1, 0, '4', (int) ' ', (int) ' ', (int) (byte) 100, false, (int) (byte) 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder22.addRecurringSavings("", (int) (byte) 1, (-1), (int) (byte) 100, ' ', (int) '4', (int) (byte) 10, 100, false, 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder22.setStandardOffset((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder22.addCutover((int) (byte) 1, '4', (int) '#', (int) (short) -1, (int) (short) 0, true, (int) (byte) 10);
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
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset(10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder2.setFixedSavings("", (int) (short) -1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder2.writeTo("hi!", outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder2);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("hi!", (int) (short) 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("hi!", 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder17 = dateTimeZoneBuilder3.addRecurringSavings("", 1, 1, 100, 'a', (-1), 10, 10, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder3.setStandardOffset((int) '#');
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder19.setFixedSavings("", (int) (short) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder33 = dateTimeZoneBuilder19.addRecurringSavings("hi!", (int) '4', 0, (int) (byte) -1, '#', (int) (byte) 1, (int) (byte) 100, 1, true, (-1));
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder44 = dateTimeZoneBuilder19.addRecurringSavings("", (int) '#', (int) '#', (int) (short) 0, '4', (int) (short) -1, 100, (int) ' ', false, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder52 = dateTimeZoneBuilder19.addCutover(0, '#', 0, (int) (short) -1, (int) '#', false, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder44);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("", 0);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder0.setStandardOffset((int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder16 = dateTimeZoneBuilder5.addRecurringSavings("", 0, (int) (short) 100, (int) (short) 1, '#', (int) (byte) 100, (int) (byte) -1, (int) (short) 1, false, (int) (byte) 1);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder19 = dateTimeZoneBuilder5.setFixedSavings("", 10);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder30 = dateTimeZoneBuilder5.addRecurringSavings("", (int) (byte) 0, (int) '#', (int) (byte) 0, '4', (int) (byte) 1, (int) (byte) -1, (int) (short) -1, false, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeZoneBuilder30.toDateTimeZone("hi!", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder35 = dateTimeZoneBuilder30.setStandardOffset((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder30.addCutover((-1), '#', (int) (short) -1, (-1), (int) (short) 10, true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder5);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder16);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder19);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder35);
    }
}

