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
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) ' ', (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10, (int) (short) 10, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) '#', (long) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35) + "'", int2 == (-35));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 10, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) '#', (int) (byte) -1, (-35));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hi! must be in the range [-1,-35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) ' ', (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) -1, (long) (-32));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) 100, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (short) 10, (int) 'a', (-35));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for hi! must be in the range [97,-35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-52) + "'", int1 == (-52));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 100, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (byte) 0, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [10,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-33L), 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1056L) + "'", long2 == (-1056L));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 1, (-52), (-35));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-35) + "'", int3 == (-35));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 0, 0, 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(10, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-520) + "'", int2 == (-520));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-520), (int) (short) 0, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 100, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) "", (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-520), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-52000L) + "'", long2 == (-52000L));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 1, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (short) 100, (int) (byte) -1, 100);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 32, (int) (byte) -1, 32);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) ' ', (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1664) + "'", int2 == (-1664));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 0.0d, (java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', (-35), (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) (-32));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32L) + "'", long2 == (-32L));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1.0f), (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) 'a', (-1664), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1569) + "'", int3 == (-1569));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) '#', (java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-52), (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-52L) + "'", long2 == (-52L));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 100, (long) (-520));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 620L + "'", long2 == 620L);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (byte) 1, (long) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 52, (-1664), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(100, (-52), 10, (-1569));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-32) + "'", int1 == (-32));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) ' ', (-1664), 32);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(100L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-33L), 620L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 587L + "'", long2 == 587L);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 620L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-620L) + "'", long2 == (-620L));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-520), (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-468L) + "'", long2 == (-468L));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-32), (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-620L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) -1, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(11L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-32L), (long) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-320) + "'", int2 == (-320));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1664), 0, (-32), 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-32) + "'", int4 == (-32));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10, (java.lang.Object) 587L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1), (-32), (-520), 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-33) + "'", int4 == (-33));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (byte) -1, (java.lang.Object) (-52000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-320), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3200) + "'", int2 == (-3200));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-97) + "'", int1 == (-97));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (short) 10, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42L + "'", long2 == 42L);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(52, (int) (short) 1, (-520), 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-476) + "'", int4 == (-476));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) 100, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hi! must be in the range [97,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-476), (-1056L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 502656L + "'", long2 == 502656L);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-52), (-1664), (-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 100, (-35), (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-52000L), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-520000L) + "'", long2 == (-520000L));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 32, (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32L) + "'", long2 == (-32L));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) 'a', (int) (short) 100, (-52));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hi! must be in the range [100,-52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 0L, (java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 10, (-3200), (-3200));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-33), (long) 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-264) + "'", int2 == (-264));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(10L, 620L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6200L + "'", long2 == 6200L);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1), (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for  must be in the range [0,10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-320), (long) (-520));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 166400L + "'", long2 == 166400L);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-520), 32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11L) + "'", long2 == (-11L));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (short) 1, (-32L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-35), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35L) + "'", long2 == (-35L));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-52), 0, (int) (byte) 0, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-35L), 6200L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-217000) + "'", int2 == (-217000));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-52), (-264), (int) (byte) 1);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(42L, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-52000L), (java.lang.Object) (-33));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) 10, 0, 10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-476), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(8, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(42L, (long) (-52));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2184L) + "'", long2 == (-2184L));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-10), (int) (short) -1, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-33), (java.lang.Object) (-520000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(33L, (long) (-3200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105600L) + "'", long2 == (-105600L));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-520), 10, (-1664));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 1, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 100, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3200), (-35));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 112000L + "'", long2 == 112000L);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 10, 0, (-476));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(11L, (-1056L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11616L) + "'", long2 == (-11616L));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 8, (-32), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8 for  must be in the range [-32,-1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1, (-10), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(620L, 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 62000L + "'", long2 == 62000L);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) ' ', 6200L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 198400L + "'", long2 == 198400L);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(11L, (long) (-476));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-465L) + "'", long2 == (-465L));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) 'a', (-33), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2184L), (-32L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69888 + "'", int2 == 69888);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (int) ' ', (-33), (int) ' ');
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-32L), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-320L) + "'", long2 == (-320L));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1664), (-33), (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1, 69888, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 13 + "'", int4 == 13);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1L), (java.lang.Object) (-35L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-35L), (-33L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1155 + "'", int2 == 1155);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 1, (-1664), 69888, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1), (-1664));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1665) + "'", int2 == (-1665));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(166400L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 166400 + "'", int1 == 166400);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-1), (-32));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [-1,-32]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1664), (-11L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1653L) + "'", long2 == (-1653L));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) ' ', (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 132L + "'", long2 == 132L);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) '4', (-35L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1820L) + "'", long2 == (-1820L));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1665), (int) (short) 0, (-320));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 18, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(166400);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-166400) + "'", int1 == (-166400));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(18, (int) ' ', (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (short) 100, 0, (-1665));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for  must be in the range [0,-1665]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10, (-320), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(100L, (long) 166400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-166300L) + "'", long2 == (-166300L));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1665));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1665 + "'", int1 == 1665);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) '#', (java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 10, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) -1, (-264), 52);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 0, 101, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) '#', 1665, (-1664));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hi! must be in the range [1665,-1664]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-35));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-1569));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1569) + "'", int2 == (-1569));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-166400), (-320));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-166720) + "'", int2 == (-166720));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(18L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 630L + "'", long2 == 630L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (byte) 100, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2184L), (long) 101);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-220584L) + "'", long2 == (-220584L));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1.0f, (java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1665), (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1700) + "'", int2 == (-1700));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 13, 0, 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 13 + "'", int4 == 13);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-520));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(587L, 620L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 363940 + "'", int2 == 363940);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-105600L), (long) 13);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1372800L) + "'", long2 == (-1372800L));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-264), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-476));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 1, 69888, 10, (-166400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 1, (-1700), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) '4', 101, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-105600L), (long) (-1665));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-107265L) + "'", long2 == (-107265L));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-476), 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(52, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1716) + "'", int2 == (-1716));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(10L, (-320L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 330L + "'", long2 == 330L);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(8, (-217000), 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 10, (-1), 1665);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-35), (java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-32), (-1664), 0, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-166720), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-166720) + "'", int2 == (-166720));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10, 69888, (-264));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(42L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42L + "'", long2 == 42L);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean3 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 100, 32, 363940);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-476), (int) (byte) 10, (-166720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (short) 100, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 0, (-35), 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (byte) -1, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        boolean boolean5 = org.joda.time.field.FieldUtils.equals(obj1, (java.lang.Object) 69888);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(69888, (int) 'a', (-520));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) '4', 112000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5824000 + "'", int2 == 5824000);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-476), (int) '4', (-166720), (-1700));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-165445) + "'", int4 == (-165445));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 101, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 35, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-320));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 320 + "'", int1 == 320);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 32, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hi! must be in the range [10,10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-166400), (-11L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1830400L + "'", long2 == 1830400L);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-32), (-166720));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-105600L), 330L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34848000) + "'", int2 == (-34848000));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-468L), (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-435L) + "'", long2 == (-435L));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1155, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 112035L + "'", long2 == 112035L);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1830400L, 1665);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3047616000L + "'", long2 == 3047616000L);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-220584L), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-22058400L) + "'", long2 == (-22058400L));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-32), 100, 5824000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5823869 + "'", int3 == 5823869);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 0, (-32L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32L) + "'", long2 == (-32L));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1155, (long) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 115500 + "'", int2 == 115500);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1700), 320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1380) + "'", int2 == (-1380));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-166720));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-166720) + "'", int1 == (-166720));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-520), 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 101, (long) (-166400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 166501L + "'", long2 == 166501L);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 1, (-1569));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1569) + "'", int2 == (-1569));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-1664), 363940);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 35, (-465L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 500L + "'", long2 == 500L);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1665);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1665) + "'", int1 == (-1665));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 1, 97, (-1716));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) 0, (-166720));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-166720) + "'", int2 == (-166720));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 0, 363940, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-33), 18, (-264));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -33 for  must be in the range [18,-264]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 10, (-320L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3200L) + "'", long2 == (-3200L));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-32), (long) 166400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5324800) + "'", int2 == (-5324800));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1700), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1701) + "'", int2 == (-1701));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 52, (-217000), 100);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3047616000L, (-35));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-106666560000L) + "'", long2 == (-106666560000L));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-52), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-166720), (-11616L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1936619520 + "'", int2 == 1936619520);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) '#', (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-35), 1665, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 35, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) 1, (java.lang.Object) (-476));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-32L), (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1056L + "'", long2 == 1056L);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 35, 0, (int) (byte) 100);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-217000), 5824000, (-166400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 'a', (java.lang.Object) (-52L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1665), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1655L) + "'", long2 == (-1655L));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(166501L, (long) (-35));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 166536L + "'", long2 == 166536L);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 97, 101);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9797L + "'", long2 == 9797L);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-32), (-3200), 69888);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-52));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-264), 320, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-17), (int) (short) 10, (-5324800));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) 100, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5200) + "'", int2 == (-5200));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1936619520, (-10), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1936619520 for hi! must be in the range [-10,10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 100, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(5823869, (int) 'a', (int) (byte) 100, 1155);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 126 + "'", int4 == 126);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) 0, 166400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-34848000), (int) '4', (-476));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1701), (int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-32L), (long) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1664) + "'", int2 == (-1664));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 126, (-320), (-520));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) 100, (-34848000), (-320));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1655L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1655L) + "'", long2 == (-1655L));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 10, 10, (int) (short) 100);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-35L), (long) 69888);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69923L) + "'", long2 == (-69923L));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(363940, (-1569));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-571021860) + "'", int2 == (-571021860));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) -1, (-1664));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1664 + "'", int2 == 1664);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10, (int) (short) 10, (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-107265L), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 1155);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1155 + "'", int2 == 1155);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(8, 5824000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46592000 + "'", int2 == 46592000);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1936619520, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1936619520) + "'", int2 == (-1936619520));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 0, 1664, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100) + "'", int1 == (-100));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-320), 126);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-40320L) + "'", long2 == (-40320L));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1), (-17), (-100), (-1569));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 33L, (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-165445), (-1569));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-167014) + "'", int2 == (-167014));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 8, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1665, (long) (-166720));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-277588800L) + "'", long2 == (-277588800L));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1664, (int) (short) 10, (-33), (-5200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 363940);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 363940 + "'", int1 == 363940);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-33), 13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-165445), (-167014), (-165445));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-165445) + "'", int3 == (-165445));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(132L, (-476));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-62832L) + "'", long2 == (-62832L));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1664, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1664L) + "'", long2 == (-1664L));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-52), 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1820L) + "'", long2 == (-1820L));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) -1, 1, (-1716));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-217000), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21700000) + "'", int2 == (-21700000));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-166720), (-11616L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1936619520L + "'", long2 == 1936619520L);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-105600L), 166536L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-272136L) + "'", long2 == (-272136L));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1664, 1936619520, (-476));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(320);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-320) + "'", int1 == (-320));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-3200));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-264), (-5200), 18);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 100.0f, (java.lang.Object) (-35L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1056L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1056) + "'", int1 == (-1056));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (int) (byte) 10, (-21700000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [10,-21700000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) -1, 5823869);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5823869) + "'", int2 == (-5823869));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-165445), (-1664));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [-165445,-1664]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-166300L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-166300) + "'", int1 == (-166300));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-106666560000L), (long) 1665);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-106666561665L) + "'", long2 == (-106666561665L));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-166720));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 166720 + "'", int1 == 166720);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1155, (int) (short) 0, 46592000);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-264), (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-320), (-520000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 519680L + "'", long2 == 519680L);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1716), 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13728) + "'", int2 == (-13728));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1700), 46592000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46590300 + "'", int2 == 46590300);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5823869), (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5823902) + "'", int2 == (-5823902));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-13728), 166400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -13728 * 166400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 0, 363940);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 35, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(166501L, 330L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54945330 + "'", int2 == 54945330);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1653L), (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-57855L) + "'", long2 == (-57855L));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 18, (-1664), (-1380));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1716), (-13728), 3395);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 8, 5823869);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46590952L + "'", long2 == 46590952L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1056), (long) (-97));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1153L) + "'", long2 == (-1153L));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 54945330, (-1), (-5823869));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 18, 101, (-1664));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-33), (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1155 + "'", int2 == 1155);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-33), (-1700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56100L + "'", long2 == 56100L);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(62000L, 112035L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 174035L + "'", long2 == 174035L);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-13728));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13728 + "'", int1 == 13728);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-3200L), (long) 101);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3301L) + "'", long2 == (-3301L));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 35, (int) (byte) 1, (-5823902));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46592000, (-5823869));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-271345704448000L) + "'", long2 == (-271345704448000L));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 46592000, (long) 126);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46591874L + "'", long2 == 46591874L);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(9797L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9697L + "'", long2 == 9697L);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(56100L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1795200L + "'", long2 == 1795200L);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5200), (-166300), (-1936619520));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3200), 69888);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-223641600) + "'", int2 == (-223641600));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 8, 0, (-33));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (short) 1, 1665, 46592000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1 for  must be in the range [1665,46592000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1380), (-1716), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1380) + "'", int3 == (-1380));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-97), (-264), (-5200));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1830400L, (-277588800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-275758400L) + "'", long2 == (-275758400L));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1664, (-465L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-773760) + "'", int2 == (-773760));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (int) (byte) 0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 52, (int) (byte) -1, (-223641600));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for  must be in the range [-1,-223641600]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100) + "'", int1 == (-100));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-277588800L), (long) 1665);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-462185352000L) + "'", long2 == (-462185352000L));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 13, 1830400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1830387L) + "'", long2 == (-1830387L));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1936619520, (long) (-5823869));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -11278618387322880");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 97, (-1664), (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(166720);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-166720) + "'", int1 == (-166720));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1155, 1936619520, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(69888, (-10), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6) + "'", int3 == (-6));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 363940, (-468L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 364408L + "'", long2 == 364408L);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-217000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-217000) + "'", int2 == (-217000));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 13728, 132L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1812096 + "'", int2 == 1812096);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1056L), (-3301L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3485856L + "'", long2 == 3485856L);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1701), (int) (short) -1, (-21700000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 320, 1936619520, (-520));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-57855L), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(620L, (-13728));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8511360L) + "'", long2 == (-8511360L));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-21700000), (-34848000), 0);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(35, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1795200L, (java.lang.Object) (-217000));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (short) 100, (long) 1664);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 166400 + "'", int2 == 166400);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-34848000), (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1219680000L) + "'", long2 == (-1219680000L));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-571021860));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 571021860 + "'", int1 == 571021860);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 363940, 6200L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 357740L + "'", long2 == 357740L);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1056), 5823869);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1056 * 5823869");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-13) + "'", int1 == (-13));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-35L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) '4', (-476), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(52, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1716), (-21700000), (-13));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 52, (-52), (-264));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hi! must be in the range [-52,-264]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-13), (-8511360L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110647680L + "'", long2 == 110647680L);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(5823869, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5823869 + "'", int2 == 5823869);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46592000, (-1701));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-79252992000L) + "'", long2 == (-79252992000L));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-520000L), 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18200000L) + "'", long2 == (-18200000L));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 100, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 10, (-100), (int) (byte) 1, 8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-217000), (-1569));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 340473000 + "'", int2 == 340473000);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 'a', (-1830387L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1830484L + "'", long2 == 1830484L);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1056L, (java.lang.Object) (-320));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-52000L), (-3200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 166400000L + "'", long2 == 166400000L);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-33), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 8, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-620L), 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-21700L) + "'", long2 == (-21700L));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(10L, 6200L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6190L) + "'", long2 == (-6190L));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(101, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 808 + "'", int2 == 808);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5823902), (-1056), (-5200));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-100), (-10), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-11L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1 == (-11));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(132L, (-2184L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2052L) + "'", long2 == (-2052L));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-62832L), (long) (-166300));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 10448961600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-223641600), (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -223641600 for hi! must be in the range [100,10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-35), (-1936619520), (-166300));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1665));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1665) + "'", int1 == (-1665));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(42L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 42 + "'", int1 == 42);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1, (-166720), (-166300));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-105600L), (java.lang.Object) 42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 13, 3047616000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3047616013L + "'", long2 == 3047616013L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 0, (-476), (-1569));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-34848000), (-35), (-166720));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-165445), 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-165446L) + "'", long2 == (-165446L));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-5823902), (-2184L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 12719401968");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 10, 46590300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46590310 + "'", int2 == 46590310);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 5824000, (-10), (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(166536L, (-18200000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3030955200000L) + "'", long2 == (-3030955200000L));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-166300));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-166300) + "'", int1 == (-166300));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(174035L, (-165446L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-28793394610L) + "'", long2 == (-28793394610L));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(42, (-1700), (-166400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-97), (-166300), 46592000);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1372800L), (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1372748L) + "'", long2 == (-1372748L));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-100), (-13), (-166400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1655L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1655) + "'", int1 == (-1655));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-11), (-1936619520));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1936619531) + "'", int2 == (-1936619531));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 571021860, (long) 46590310);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 26604085474176600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5324800), (-1936619531));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1941944331) + "'", int2 == (-1941944331));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-97), 0, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-11), (long) 20);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-31L) + "'", long2 == (-31L));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-10L), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9L) + "'", long2 == (-9L));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(330L, (long) (-1716));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1386L) + "'", long2 == (-1386L));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(5824000, 363940);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 5824000 * 363940");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) 10, (java.lang.Object) 35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 5824000, 46592000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-6), (long) (-1941944331));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 11651665986");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 166720, (-21700000), (-5823869));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(13, 13728);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13741 + "'", int2 == 13741);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(46592000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-46592000) + "'", int1 == (-46592000));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-217000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 217000 + "'", int1 == 217000);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) -1, 46592000, (-167014));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 126, 13, (-1655));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 126 for hi! must be in the range [13,-1655]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-166400), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-166390L) + "'", long2 == (-166390L));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6190L), 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-600430L) + "'", long2 == (-600430L));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-166720), (-11L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-166731L) + "'", long2 == (-166731L));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 20, (-165445), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-6190L), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6189L) + "'", long2 == (-6189L));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1665), 54945330, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1812096, (-1664), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(198400L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 198303L + "'", long2 == 198303L);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 100, 1155);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1255 + "'", int2 == 1255);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-107265L), (java.lang.Object) (-3030955200000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-79252992000L), 3047616013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-82300608013L) + "'", long2 == (-82300608013L));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1653L), (java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-166720), (-100), 1664);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -166720 for hi! must be in the range [-100,1664]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-1655L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(101, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 198 + "'", int2 == 198);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 13728, (-166300), 3395);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13728 for hi! must be in the range [-166300,3395]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-100), (-3200), (-34848000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-167014), 1, 166400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 165786 + "'", int3 == 165786);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-17), 587L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-604L) + "'", long2 == (-604L));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9L, (-1700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15300L) + "'", long2 == (-15300L));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1665, 198, (-1380));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-62832L), (-1056L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 66350592L + "'", long2 == 66350592L);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1664, 330L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 549120 + "'", int2 == 549120);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1155);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1155) + "'", int1 == (-1155));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1665, (-1569));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2612385) + "'", int2 == (-2612385));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-166300), (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-166311) + "'", int2 == (-166311));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 165786, (-1936619520), 165786);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 165786 + "'", int4 == 165786);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-33L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-33) + "'", int1 == (-33));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 46592000, 6, 13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46592000 for  must be in the range [6,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 13, (-21700L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-21687L) + "'", long2 == (-21687L));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-5200), (-5324800), 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(3395, 0, 52, (-1655));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-79252992000L), (-13728));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1087985074176000L + "'", long2 == 1087985074176000L);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5200), (-1380));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7176000 + "'", int2 == 7176000);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 115500, (long) (-1936619531));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1936735031L + "'", long2 == 1936735031L);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1255, (-17), (-13));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1255 for hi! must be in the range [-17,-13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-69923L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-69923) + "'", int1 == (-69923));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1155, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1155 + "'", int2 == 1155);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-5324800), (-165446L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 880966860800L + "'", long2 == 880966860800L);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1386L), 165786);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-229779396L) + "'", long2 == (-229779396L));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 1, (-264), (-3200));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) 1, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-5200));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5200 + "'", int1 == 5200);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1716));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1716 + "'", int1 == 1716);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(13728);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-13728) + "'", int1 == (-13728));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 69888, 1155, 13728);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1372800L), (long) (-69923));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95990294400L + "'", long2 == 95990294400L);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1812096);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1812096 + "'", int1 == 1812096);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 101, 166400, 7176000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-40320L), 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-40322L) + "'", long2 == (-40322L));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-1655), 166720);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(2L, (long) (-69923));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-139846) + "'", int2 == (-139846));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-34848000), 0, (-166720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1569), 42, (-167014));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1056), (-5823902), (-1716), (-166720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1219680000L), 330L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-402494400000L) + "'", long2 == (-402494400000L));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 35, (long) (-34848000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34847965L) + "'", long2 == (-34847965L));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-21700000), (-229779396L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4986212893200000L + "'", long2 == 4986212893200000L);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1386L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1386) + "'", int2 == (-1386));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1716), (-465L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2181L) + "'", long2 == (-2181L));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(3395, 46590300, (-32), (-17));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-17) + "'", int4 == (-17));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 69888, (-1569), 340473000);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-100), (-10), (-1569), (-1569));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(46590310, 69888, 549120, (-13728));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-13728), (long) 198);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2718144L) + "'", long2 == (-2718144L));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5823869), 69888);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -5823869 * 69888");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-320L), (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-420L) + "'", long2 == (-420L));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 502656L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-502656L) + "'", long2 == (-502656L));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-223641600), (int) (byte) 100, (-5200), 198);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4122) + "'", int4 == (-4122));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 165786, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8620872L + "'", long2 == 8620872L);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1936619531), 166400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1936619531 * 166400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(33L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(7176000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7176000) + "'", int1 == (-7176000));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 100, 0, 1665);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1664L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1664, 6, (-1716), (-7176000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(46592000, (-1655));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 46592000 * -1655");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 0, (int) ' ', (-21700000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

