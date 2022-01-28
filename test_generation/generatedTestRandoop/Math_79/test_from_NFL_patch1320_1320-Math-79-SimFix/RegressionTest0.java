import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        double[] doubleArray6 = new double[] { 0, (short) -1, (short) 0, 100.0d, (byte) 1, (-1) };
        double[] doubleArray12 = new double[] { 100.0d, (short) 1, 10.0d, (short) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            double double13 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray6, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, -1.0, 0.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, 10.0, 1.0, 10.0]");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, bigInteger1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        boolean boolean3 = false; // flaky: org.apache.commons.math.util.MathUtils.equals((double) 0, (double) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395 + "'", int2 == 3395);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) (short) -1, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-2.0f) + "'", float3 == (-2.0f));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        double double2 = org.apache.commons.math.util.MathUtils.log(10.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) (byte) 0, (double) 1.0f, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (-2.0f), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(1.0d, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int int2 = org.apache.commons.math.util.MathUtils.pow(3395, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1641696559) + "'", int2 == (-1641696559));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int[] intArray3 = new int[] { (short) -1, (-1), (byte) 0 };
        int[] intArray5 = new int[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.math.util.MathUtils.distance1(intArray3, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(10, (-1641696559));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 3395, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3396L + "'", long2 == 3396L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(3395, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3396 + "'", int2 == 3396);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(Double.NaN, (double) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (-1L), 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow((int) (byte) 10, (long) (-1641696559));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 3395);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1084917248 + "'", int1 == 1084917248);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray7 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray11 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray7, doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray11);
        java.lang.Class<?> wildcardClass14 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        float float3 = org.apache.commons.math.util.MathUtils.round((-2.0f), 100, 0);
        org.junit.Assert.assertTrue(Float.isNaN(float3));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 1, 3396, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        double double0 = org.apache.commons.math.util.MathUtils.SAFE_MIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.2250738585072014E-308d + "'", double0 == 2.2250738585072014E-308d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        double double0 = org.apache.commons.math.util.MathUtils.EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.1102230246251565E-16d + "'", double0 == 1.1102230246251565E-16d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        float float2 = org.apache.commons.math.util.MathUtils.round(10.0f, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.83579396E8d + "'", double2 == 1.83579396E8d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        float float2 = org.apache.commons.math.util.MathUtils.round(0.0f, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 3396L, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray7 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray11 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray7, doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray11);
        double[] doubleArray20 = new double[] { (-1894796193), 3396L, 100, 100L, (-1.0d), (-1) };
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray20);
        double[] doubleArray23 = new double[] { 100 };
        double[] doubleArray29 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray33 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equals(doubleArray29, doubleArray33);
        double double35 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray23, doubleArray33);
        // The following exception was thrown during execution in test generation
        try {
            double double36 = org.apache.commons.math.util.MathUtils.distance(doubleArray11, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.894796193E9, 3396.0, 100.0, 100.0, -1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 101.0d + "'", double35 == 101.0d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1L), (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (byte) 10, (long) 3396);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-1641696559));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        int int2 = org.apache.commons.math.util.MathUtils.pow(0, (long) 3396);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int[] intArray6 = new int[] { (short) 1, (-1894796193), (-1641696559), '#', (short) 1, (short) 1 };
        int[] intArray7 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            double double8 = org.apache.commons.math.util.MathUtils.distance(intArray6, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1894796193, -1641696559, 35, 1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) '4', (long) (-1894796193));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1894796245L + "'", long2 == 1894796245L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        double[] doubleArray4 = new double[] { 10.0d, (short) 0, (byte) 0, (short) 100 };
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = org.apache.commons.math.util.MathUtils.distance(doubleArray4, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 0.0, 0.0, 100.0]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(1L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) '#', 1894796245L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1262696365) + "'", int2 == (-1262696365));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-1894796193));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 1894796225, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1894796224L + "'", long2 == 1894796224L);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3628800.0d + "'", double1 == 3628800.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(1.83579396E8d, (double) (-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        int int2 = org.apache.commons.math.util.MathUtils.pow(1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 35L, (double) '#', Double.NaN);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int int2 = org.apache.commons.math.util.MathUtils.pow(100, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (-1262696365));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 3395, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        boolean boolean3 = false; // flaky: org.apache.commons.math.util.MathUtils.equals((double) (short) 0, (double) (byte) 0, 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        double double0 = org.apache.commons.math.util.MathUtils.TWO_PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 6.283185307179586d + "'", double0 == 6.283185307179586d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        double double2 = org.apache.commons.math.util.MathUtils.log(101.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9978439716109563d + "'", double2 == 0.9978439716109563d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        double double2 = org.apache.commons.math.util.MathUtils.round((-1.0d), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, 1894796245L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-1894796193));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 698104850 + "'", int1 == 698104850);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(0, (int) (short) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (short) -1, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1084917248, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(698104850, (-1641696559));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray7 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray11 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray7, doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray11);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1894796193) + "'", int14 == (-1894796193));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1894796193) + "'", int15 == (-1894796193));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-68) + "'", int2 == (-68));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        long long2 = org.apache.commons.math.util.MathUtils.pow(1894796245L, 1894796224L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5123131752721863423L) + "'", long2 == (-5123131752721863423L));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-68), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) (byte) -1, 3395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int int1 = org.apache.commons.math.util.MathUtils.hash((-1.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1074790400) + "'", int1 == (-1074790400));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray0, (double) (-1074790400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 3395);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 100, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 135L + "'", long2 == 135L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1262696365), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1262696364) + "'", int2 == (-1262696364));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4463520074491623d + "'", double1 == 2.4463520074491623d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 10, (double) Float.NaN, (double) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        int[] intArray3 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray10 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int11 = org.apache.commons.math.util.MathUtils.distanceInf(intArray3, intArray10);
        int[] intArray17 = new int[] { '4', (byte) 1, 1084917248, 1, (-1641696559) };
        double double18 = org.apache.commons.math.util.MathUtils.distance(intArray3, intArray17);
        int[] intArray22 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray29 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int30 = org.apache.commons.math.util.MathUtils.distanceInf(intArray22, intArray29);
        int[] intArray36 = new int[] { '4', (byte) 1, 1084917248, 1, (-1641696559) };
        double double37 = org.apache.commons.math.util.MathUtils.distance(intArray22, intArray36);
        int[] intArray41 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray48 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int49 = org.apache.commons.math.util.MathUtils.distanceInf(intArray41, intArray48);
        int[] intArray55 = new int[] { '4', (byte) 1, 1084917248, 1, (-1641696559) };
        double double56 = org.apache.commons.math.util.MathUtils.distance(intArray41, intArray55);
        double double57 = org.apache.commons.math.util.MathUtils.distance(intArray22, intArray41);
        int[] intArray61 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray68 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int69 = org.apache.commons.math.util.MathUtils.distanceInf(intArray61, intArray68);
        int int70 = org.apache.commons.math.util.MathUtils.distanceInf(intArray41, intArray68);
        // The following exception was thrown during execution in test generation
        try {
            int int71 = org.apache.commons.math.util.MathUtils.distance1(intArray17, intArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1894796225 + "'", int11 == 1894796225);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 1, 1084917248, 1, -1641696559]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.183414310119577E9d + "'", double18 == 2.183414310119577E9d);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1894796225 + "'", int30 == 1894796225);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[52, 1, 1084917248, 1, -1641696559]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2.183414310119577E9d + "'", double37 == 2.183414310119577E9d);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1894796225 + "'", int49 == 1894796225);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[52, 1, 1084917248, 1, -1641696559]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 2.183414310119577E9d + "'", double56 == 2.183414310119577E9d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1894796225 + "'", int69 == 1894796225);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1894796225 + "'", int70 == 1894796225);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-1262696365));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        int[] intArray3 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray10 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int11 = org.apache.commons.math.util.MathUtils.distanceInf(intArray3, intArray10);
        int[] intArray15 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray22 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int23 = org.apache.commons.math.util.MathUtils.distanceInf(intArray15, intArray22);
        int[] intArray27 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray34 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int35 = org.apache.commons.math.util.MathUtils.distanceInf(intArray27, intArray34);
        int[] intArray41 = new int[] { '4', (byte) 1, 1084917248, 1, (-1641696559) };
        double double42 = org.apache.commons.math.util.MathUtils.distance(intArray27, intArray41);
        int[] intArray46 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray53 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int54 = org.apache.commons.math.util.MathUtils.distanceInf(intArray46, intArray53);
        int[] intArray60 = new int[] { '4', (byte) 1, 1084917248, 1, (-1641696559) };
        double double61 = org.apache.commons.math.util.MathUtils.distance(intArray46, intArray60);
        double double62 = org.apache.commons.math.util.MathUtils.distance(intArray27, intArray46);
        int[] intArray66 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray73 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int74 = org.apache.commons.math.util.MathUtils.distanceInf(intArray66, intArray73);
        int int75 = org.apache.commons.math.util.MathUtils.distanceInf(intArray46, intArray73);
        int int76 = org.apache.commons.math.util.MathUtils.distance1(intArray15, intArray73);
        int int77 = org.apache.commons.math.util.MathUtils.distance1(intArray3, intArray73);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1894796225 + "'", int11 == 1894796225);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1894796225 + "'", int23 == 1894796225);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1894796225 + "'", int35 == 1894796225);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[52, 1, 1084917248, 1, -1641696559]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 2.183414310119577E9d + "'", double42 == 2.183414310119577E9d);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1894796225 + "'", int54 == 1894796225);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[52, 1, 1084917248, 1, -1641696559]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 2.183414310119577E9d + "'", double61 == 2.183414310119577E9d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1894796225 + "'", int74 == 1894796225);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1894796225 + "'", int75 == 1894796225);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1894796376 + "'", int76 == 1894796376);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1894796376 + "'", int77 == 1894796376);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        boolean boolean3 = false; // flaky: org.apache.commons.math.util.MathUtils.equals(1.5430806348152437d, (double) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 1084917248);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        long long1 = org.apache.commons.math.util.MathUtils.sign(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 1894796376);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) (short) -1, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-2.0f) + "'", float3 == (-2.0f));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 100, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110L + "'", long2 == 110L);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (byte) 1, (long) (-1262696365));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1262696365L) + "'", long2 == (-1262696365L));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) 1894796376, 1894796376, 0);
        org.junit.Assert.assertTrue(Float.isNaN(float3));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 10L, (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-1894796193), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18947961930L) + "'", long2 == (-18947961930L));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (byte) 100, 1894796376);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1894796476 + "'", int2 == 1894796476);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        double[] doubleArray5 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray9 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray9);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray13 = new double[] { 100 };
        double[] doubleArray19 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray23 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray23);
        double double25 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray13, doubleArray23);
        int int26 = org.apache.commons.math.util.MathUtils.hash(doubleArray23);
        double[] doubleArray28 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray23, (double) 10.0f);
        double double29 = org.apache.commons.math.util.MathUtils.distance(doubleArray11, doubleArray28);
        double double30 = org.apache.commons.math.util.MathUtils.distance1(doubleArray9, doubleArray28);
        double[] doubleArray31 = new double[] {};
        double[] doubleArray33 = new double[] { 100 };
        double[] doubleArray39 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray43 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean44 = org.apache.commons.math.util.MathUtils.equals(doubleArray39, doubleArray43);
        double double45 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray33, doubleArray43);
        int int46 = org.apache.commons.math.util.MathUtils.hash(doubleArray43);
        double[] doubleArray48 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray43, (double) 10.0f);
        double double49 = org.apache.commons.math.util.MathUtils.distance(doubleArray31, doubleArray48);
        boolean boolean50 = org.apache.commons.math.util.MathUtils.equals(doubleArray28, doubleArray48);
        int int51 = org.apache.commons.math.util.MathUtils.hash(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 101.0d + "'", double25 == 101.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1894796193) + "'", int26 == (-1894796193));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-0.05102040816326531, 5.1020408163265305, 4.948979591836735]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 187.89795918367346d + "'", double30 == 187.89795918367346d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 101.0d + "'", double45 == 101.0d);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1894796193) + "'", int46 == (-1894796193));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-0.05102040816326531, 5.1020408163265305, 4.948979591836735]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 879281498 + "'", int51 == 879281498);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        boolean boolean3 = false; // flaky: org.apache.commons.math.util.MathUtils.equals((double) (short) 0, (double) (-1074790400), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(3395, 3395);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1894796225);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-1074790400), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-107479040000L) + "'", long2 == (-107479040000L));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        int[] intArray3 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray10 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int11 = org.apache.commons.math.util.MathUtils.distanceInf(intArray3, intArray10);
        int[] intArray15 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray22 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int23 = org.apache.commons.math.util.MathUtils.distanceInf(intArray15, intArray22);
        double double24 = org.apache.commons.math.util.MathUtils.distance(intArray3, intArray22);
        int[] intArray28 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray35 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int36 = org.apache.commons.math.util.MathUtils.distanceInf(intArray28, intArray35);
        int[] intArray40 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray47 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int48 = org.apache.commons.math.util.MathUtils.distanceInf(intArray40, intArray47);
        double double49 = org.apache.commons.math.util.MathUtils.distance(intArray28, intArray47);
        double double50 = org.apache.commons.math.util.MathUtils.distance(intArray3, intArray47);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1894796225 + "'", int11 == 1894796225);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1894796225 + "'", int23 == 1894796225);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.8947962250000033E9d + "'", double24 == 1.8947962250000033E9d);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1894796225 + "'", int36 == 1894796225);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1894796225 + "'", int48 == 1894796225);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.8947962250000033E9d + "'", double49 == 1.8947962250000033E9d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.8947962250000033E9d + "'", double50 == 1.8947962250000033E9d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        double[] doubleArray4 = new double[] { 1894796224L, (short) 100, '4', 100.0d };
        double[] doubleArray6 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray4, 1.83579396E8d);
        double[] doubleArray11 = new double[] { 1894796224L, (short) 100, '4', 100.0d };
        double[] doubleArray13 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray11, 1.83579396E8d);
        double[] doubleArray15 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray11, 0.0d);
        boolean boolean16 = org.apache.commons.math.util.MathUtils.equals(doubleArray4, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.894796224E9, 100.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.8357937158470878E8, 9.688607632812591, 5.038075969062548, 9.688607632812591]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.894796224E9, 100.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.8357937158470878E8, 9.688607632812591, 5.038075969062548, 9.688607632812591]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3500 + "'", int2 == 3500);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 698104850);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (-1262696365), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2626963649999998E9d) + "'", double2 == (-1.2626963649999998E9d));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1894796225, (long) 3395);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6432833183875L + "'", long2 == 6432833183875L);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        double[] doubleArray6 = new double[] { (-1.0f), 35L, 35L, (-5123131752721863423L), 135L, 6.283185307179586d };
        double[] doubleArray8 = new double[] { 100 };
        double[] doubleArray14 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray18 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean19 = org.apache.commons.math.util.MathUtils.equals(doubleArray14, doubleArray18);
        double double20 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray8, doubleArray18);
        double[] doubleArray27 = new double[] { (-1894796193), 3396L, 100, 100L, (-1.0d), (-1) };
        boolean boolean28 = org.apache.commons.math.util.MathUtils.equals(doubleArray18, doubleArray27);
        double double29 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 35.0, 35.0, -5.1231317527218637E18, 135.0, 6.283185307179586]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 101.0d + "'", double20 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.894796193E9, 3396.0, 100.0, 100.0, -1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 5.1231317527218637E18d + "'", double29 == 5.1231317527218637E18d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 10L, (double) 100L, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-1641696559), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.641696559E9d) + "'", double2 == (-1.641696559E9d));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 10L, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow(3500, (long) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        long long2 = org.apache.commons.math.util.MathUtils.pow(0L, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        int int2 = org.apache.commons.math.util.MathUtils.pow(3500, 3396);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 0.0f, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1894796476, 5.1231317527218637E18d, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(3396);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(2.4463520074491623d);
// flaky:         org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.81637924538769d + "'", double1 == 5.81637924538769d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        float float1 = org.apache.commons.math.util.MathUtils.sign(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 1084917248, (double) 3396);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3398.3541145324707d + "'", double2 == 3398.3541145324707d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.104412573075516d + "'", double1 == 15.104412573075516d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 100 };
        double[] doubleArray8 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray12 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equals(doubleArray8, doubleArray12);
        double double14 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray2, doubleArray12);
        int int15 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        double[] doubleArray17 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray12, (double) 10.0f);
        double double18 = org.apache.commons.math.util.MathUtils.distance(doubleArray0, doubleArray17);
        double[] doubleArray20 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray17, (double) 1L);
        java.lang.Class<?> wildcardClass21 = doubleArray17.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 101.0d + "'", double14 == 101.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1894796193) + "'", int15 == (-1894796193));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-0.05102040816326531, 5.1020408163265305, 4.948979591836735]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-0.005102040816326531, 0.5102040816326531, 0.49489795918367346]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1084917248, (-68));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1084917316 + "'", int2 == 1084917316);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81.55795945611504d + "'", double1 == 81.55795945611504d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        long long2 = org.apache.commons.math.util.MathUtils.pow(35L, (long) 3500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-198595683343454991L) + "'", long2 == (-198595683343454991L));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(15.104412573075516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1814399.9999998633d + "'", double1 == 1814399.9999998633d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 1894796225);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        int int2 = org.apache.commons.math.util.MathUtils.pow(10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (-68), (long) (-1074790400));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1074790332L + "'", long2 == 1074790332L);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3628800L + "'", long1 == 3628800L);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        int int1 = org.apache.commons.math.util.MathUtils.sign(3500);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1084917316, (double) 1084917316);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        double[] doubleArray5 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray9 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray9);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray13 = new double[] { 100 };
        double[] doubleArray19 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray23 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray23);
        double double25 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray13, doubleArray23);
        int int26 = org.apache.commons.math.util.MathUtils.hash(doubleArray23);
        double[] doubleArray28 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray23, (double) 10.0f);
        double double29 = org.apache.commons.math.util.MathUtils.distance(doubleArray11, doubleArray28);
        double double30 = org.apache.commons.math.util.MathUtils.distance1(doubleArray9, doubleArray28);
        double[] doubleArray31 = new double[] {};
        double[] doubleArray33 = new double[] { 100 };
        double[] doubleArray39 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray43 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean44 = org.apache.commons.math.util.MathUtils.equals(doubleArray39, doubleArray43);
        double double45 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray33, doubleArray43);
        int int46 = org.apache.commons.math.util.MathUtils.hash(doubleArray43);
        double[] doubleArray48 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray43, (double) 10.0f);
        double double49 = org.apache.commons.math.util.MathUtils.distance(doubleArray31, doubleArray48);
        boolean boolean50 = org.apache.commons.math.util.MathUtils.equals(doubleArray28, doubleArray48);
        double[] doubleArray51 = new double[] {};
        double[] doubleArray53 = new double[] { 100 };
        double[] doubleArray59 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray63 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean64 = org.apache.commons.math.util.MathUtils.equals(doubleArray59, doubleArray63);
        double double65 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray53, doubleArray63);
        int int66 = org.apache.commons.math.util.MathUtils.hash(doubleArray63);
        double[] doubleArray68 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray63, (double) 10.0f);
        double double69 = org.apache.commons.math.util.MathUtils.distance(doubleArray51, doubleArray68);
        double[] doubleArray71 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray68, (double) 1L);
        double double72 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray68);
        double[] doubleArray73 = new double[] {};
        double[] doubleArray75 = new double[] { 100 };
        double[] doubleArray81 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray85 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean86 = org.apache.commons.math.util.MathUtils.equals(doubleArray81, doubleArray85);
        double double87 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray75, doubleArray85);
        int int88 = org.apache.commons.math.util.MathUtils.hash(doubleArray85);
        double[] doubleArray90 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray85, (double) 10.0f);
        double double91 = org.apache.commons.math.util.MathUtils.distance(doubleArray73, doubleArray90);
        boolean boolean92 = org.apache.commons.math.util.MathUtils.equals(doubleArray68, doubleArray90);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 101.0d + "'", double25 == 101.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1894796193) + "'", int26 == (-1894796193));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-0.05102040816326531, 5.1020408163265305, 4.948979591836735]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 187.89795918367346d + "'", double30 == 187.89795918367346d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 101.0d + "'", double45 == 101.0d);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1894796193) + "'", int46 == (-1894796193));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-0.05102040816326531, 5.1020408163265305, 4.948979591836735]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 101.0d + "'", double65 == 101.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1894796193) + "'", int66 == (-1894796193));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-0.05102040816326531, 5.1020408163265305, 4.948979591836735]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-0.005102040816326531, 0.5102040816326531, 0.49489795918367346]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 101.0d + "'", double87 == 101.0d);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1894796193) + "'", int88 == (-1894796193));
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[-0.05102040816326531, 5.1020408163265305, 4.948979591836735]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 0, 3500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3500 + "'", int2 == 3500);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray7 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray11 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray7, doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray11);
        double[] doubleArray20 = new double[] { (-1894796193), 3396L, 100, 100L, (-1.0d), (-1) };
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray20);
        double[] doubleArray23 = new double[] { 100 };
        double[] doubleArray29 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray33 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equals(doubleArray29, doubleArray33);
        double double35 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray23, doubleArray33);
        double[] doubleArray37 = new double[] { 100 };
        double[] doubleArray43 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray47 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean48 = org.apache.commons.math.util.MathUtils.equals(doubleArray43, doubleArray47);
        double double49 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray37, doubleArray47);
        double double50 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray23, doubleArray37);
        // The following exception was thrown during execution in test generation
        try {
            double double51 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray11, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.894796193E9, 3396.0, 100.0, 100.0, -1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 101.0d + "'", double35 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 101.0d + "'", double49 == 101.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        int int2 = org.apache.commons.math.util.MathUtils.pow(0, 1894796476);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        int int1 = org.apache.commons.math.util.MathUtils.hash(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1911350513) + "'", int1 == (-1911350513));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1894796225, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 110L, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        boolean boolean3 = false; // flaky: org.apache.commons.math.util.MathUtils.equals((double) 1894796245L, 1.83579396E8d, (-1641696559));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1, 1084917248, (int) '4');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        int int2 = org.apache.commons.math.util.MathUtils.pow(100, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) 1894796224L, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(3628800.0d, (double) 6432833183875L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.432833183876105E12d + "'", double2 == 6.432833183876105E12d);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 1894796225, 2.2250738585072014E-308d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8947962249999998E9d + "'", double2 == 1.8947962249999998E9d);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        double[] doubleArray5 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray9 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray9);
        double[] doubleArray16 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray20 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray16, doubleArray20);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray24 = new double[] { 100 };
        double[] doubleArray30 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray34 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean35 = org.apache.commons.math.util.MathUtils.equals(doubleArray30, doubleArray34);
        double double36 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray24, doubleArray34);
        int int37 = org.apache.commons.math.util.MathUtils.hash(doubleArray34);
        double[] doubleArray39 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray34, (double) 10.0f);
        double double40 = org.apache.commons.math.util.MathUtils.distance(doubleArray22, doubleArray39);
        double double41 = org.apache.commons.math.util.MathUtils.distance1(doubleArray20, doubleArray39);
        double[] doubleArray42 = new double[] {};
        double[] doubleArray44 = new double[] { 100 };
        double[] doubleArray50 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray54 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean55 = org.apache.commons.math.util.MathUtils.equals(doubleArray50, doubleArray54);
        double double56 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray44, doubleArray54);
        int int57 = org.apache.commons.math.util.MathUtils.hash(doubleArray54);
        double[] doubleArray59 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray54, (double) 10.0f);
        double double60 = org.apache.commons.math.util.MathUtils.distance(doubleArray42, doubleArray59);
        boolean boolean61 = org.apache.commons.math.util.MathUtils.equals(doubleArray39, doubleArray59);
        double[] doubleArray62 = new double[] {};
        double[] doubleArray64 = new double[] { 100 };
        double[] doubleArray70 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray74 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean75 = org.apache.commons.math.util.MathUtils.equals(doubleArray70, doubleArray74);
        double double76 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray64, doubleArray74);
        int int77 = org.apache.commons.math.util.MathUtils.hash(doubleArray74);
        double[] doubleArray79 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray74, (double) 10.0f);
        double double80 = org.apache.commons.math.util.MathUtils.distance(doubleArray62, doubleArray79);
        double[] doubleArray82 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray79, (double) 1L);
        double double83 = org.apache.commons.math.util.MathUtils.distance1(doubleArray39, doubleArray79);
        // The following exception was thrown during execution in test generation
        try {
            double double84 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray5, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 101.0d + "'", double36 == 101.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1894796193) + "'", int37 == (-1894796193));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-0.05102040816326531, 5.1020408163265305, 4.948979591836735]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 187.89795918367346d + "'", double41 == 187.89795918367346d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 101.0d + "'", double56 == 101.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1894796193) + "'", int57 == (-1894796193));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-0.05102040816326531, 5.1020408163265305, 4.948979591836735]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 101.0d + "'", double76 == 101.0d);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1894796193) + "'", int77 == (-1894796193));
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-0.05102040816326531, 5.1020408163265305, 4.948979591836735]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-0.005102040816326531, 0.5102040816326531, 0.49489795918367346]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(1894796476);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 1084917316);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1, 1084917248, 879281498);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 100, 2.2250738585072014E-308d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 3396L, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-68), (int) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-107479040000L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1084917248);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray7 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray11 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray7, doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray11);
        double[] doubleArray18 = new double[] { 1894796224L, (short) 100, '4', 100.0d };
        double[] doubleArray20 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray18, 1.83579396E8d);
        double[] doubleArray22 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray18, 0.0d);
        double double23 = org.apache.commons.math.util.MathUtils.distance1(doubleArray11, doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.894796224E9, 100.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.8357937158470878E8, 9.688607632812591, 5.038075969062548, 9.688607632812591]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 198.0d + "'", double23 == 198.0d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-198595683343454991L), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.98595683343454976E17d) + "'", double2 == (-1.98595683343454976E17d));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(3398.3541145324707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm(1084917248, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(1.8947962250000033E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 0.0f, (-1.0d), (double) 879281498);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        int int2 = org.apache.commons.math.util.MathUtils.pow(698104850, (long) 1894796225);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(32, (-1641696559));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 3628800L, 6.283185307179586d, (double) (-1262696365));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 'a', (long) 1894796376);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 183795248472L + "'", long2 == 183795248472L);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(15.104412573075516d, 1084917316, 879281498);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        long long2 = org.apache.commons.math.util.MathUtils.pow(6432833183875L, (long) 698104850);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-193530669323510711L) + "'", long2 == (-193530669323510711L));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1262696364), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1262696364) + "'", int2 == (-1262696364));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        double[] doubleArray5 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray9 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray9);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray13 = new double[] { 100 };
        double[] doubleArray19 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray23 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray23);
        double double25 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray13, doubleArray23);
        int int26 = org.apache.commons.math.util.MathUtils.hash(doubleArray23);
        double[] doubleArray28 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray23, (double) 10.0f);
        double double29 = org.apache.commons.math.util.MathUtils.distance(doubleArray11, doubleArray28);
        double double30 = org.apache.commons.math.util.MathUtils.distance1(doubleArray9, doubleArray28);
        double[] doubleArray32 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray9, (double) 1894796245L);
        double[] doubleArray37 = new double[] { 1894796224L, (short) 100, '4', 100.0d };
        double[] doubleArray39 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray37, 1.83579396E8d);
        double double40 = org.apache.commons.math.util.MathUtils.distance(doubleArray32, doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 101.0d + "'", double25 == 101.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1894796193) + "'", int26 == (-1894796193));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-0.05102040816326531, 5.1020408163265305, 4.948979591836735]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 187.89795918367346d + "'", double30 == 187.89795918367346d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-9667327.780612245, 9.667327780612245E8, 9.377307947193878E8]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.894796224E9, 100.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.8357937158470878E8, 9.688607632812591, 5.038075969062548, 9.688607632812591]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.360608527893792E9d + "'", double40 == 1.360608527893792E9d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray7 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray11 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray7, doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray11);
        double[] doubleArray20 = new double[] { (-1894796193), 3396L, 100, 100L, (-1.0d), (-1) };
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray20);
        double[] doubleArray23 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray20, 0.0d);
        double[] doubleArray29 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray33 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equals(doubleArray29, doubleArray33);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray37 = new double[] { 100 };
        double[] doubleArray43 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray47 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean48 = org.apache.commons.math.util.MathUtils.equals(doubleArray43, doubleArray47);
        double double49 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray37, doubleArray47);
        int int50 = org.apache.commons.math.util.MathUtils.hash(doubleArray47);
        double[] doubleArray52 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray47, (double) 10.0f);
        double double53 = org.apache.commons.math.util.MathUtils.distance(doubleArray35, doubleArray52);
        double double54 = org.apache.commons.math.util.MathUtils.distance1(doubleArray33, doubleArray52);
        boolean boolean55 = org.apache.commons.math.util.MathUtils.equals(doubleArray23, doubleArray33);
        double[] doubleArray57 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray33, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 101.0d + "'", double13 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.894796193E9, 3396.0, 100.0, 100.0, -1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, -0.0, -0.0, -0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 101.0d + "'", double49 == 101.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1894796193) + "'", int50 == (-1894796193));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-0.05102040816326531, 5.1020408163265305, 4.948979591836735]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 187.89795918367346d + "'", double54 == 187.89795918367346d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-0.0, 0.0, 0.0]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(3398.3541145324707d, (double) 183795248472L, (double) (-68));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        long long2 = org.apache.commons.math.util.MathUtils.pow(1894796245L, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1894796245L + "'", long2 == 1894796245L);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(bigInteger2);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 110L, 1.8947962250000033E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 110.00000000000001d + "'", double2 == 110.00000000000001d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 35L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        double[] doubleArray5 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray9 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray9);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray13 = new double[] { 100 };
        double[] doubleArray19 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray23 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray23);
        double double25 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray13, doubleArray23);
        int int26 = org.apache.commons.math.util.MathUtils.hash(doubleArray23);
        double[] doubleArray28 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray23, (double) 10.0f);
        double double29 = org.apache.commons.math.util.MathUtils.distance(doubleArray11, doubleArray28);
        double double30 = org.apache.commons.math.util.MathUtils.distance1(doubleArray9, doubleArray28);
        double[] doubleArray32 = new double[] { 100 };
        double[] doubleArray38 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray42 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean43 = org.apache.commons.math.util.MathUtils.equals(doubleArray38, doubleArray42);
        double double44 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray32, doubleArray42);
        double[] doubleArray51 = new double[] { (-1894796193), 3396L, 100, 100L, (-1.0d), (-1) };
        boolean boolean52 = org.apache.commons.math.util.MathUtils.equals(doubleArray42, doubleArray51);
        double double53 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray51);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 101.0d + "'", double25 == 101.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1894796193) + "'", int26 == (-1894796193));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-0.05102040816326531, 5.1020408163265305, 4.948979591836735]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 187.89795918367346d + "'", double30 == 187.89795918367346d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 101.0d + "'", double44 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.894796193E9, 3396.0, 100.0, 100.0, -1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.8947996788979592E9d + "'", double53 == 1.8947996788979592E9d);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (-68), (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-68L) + "'", long2 == (-68L));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (short) 10, (-1911350513));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.087291284850963E236d) + "'", double2 == (-5.087291284850963E236d));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1894796225, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1894796225 + "'", int2 == 1894796225);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(1814399.9999998633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1262696364));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm(1894796376, 3395);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1894796476, 1894796376);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: add");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) '#', 1084917316);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-68L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1068433408) + "'", int1 == (-1068433408));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 0, 1084917248);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(5.81637924538769d, (double) 3628800L, 81.55795945611504d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) (short) 10, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Float.isNaN(float3));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 1894796224L, (double) 135L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 133.21269059181213d + "'", double2 == 133.21269059181213d);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) ' ', 0.0d, (double) (-18947961930L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(11013.232874703393d, (double) 879281498);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1084917316, (double) (-1641696559));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow((int) '#', (-107479040000L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        int[] intArray3 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray10 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int11 = org.apache.commons.math.util.MathUtils.distanceInf(intArray3, intArray10);
        int[] intArray17 = new int[] { '4', (byte) 1, 1084917248, 1, (-1641696559) };
        double double18 = org.apache.commons.math.util.MathUtils.distance(intArray3, intArray17);
        int[] intArray22 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray29 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int30 = org.apache.commons.math.util.MathUtils.distanceInf(intArray22, intArray29);
        int[] intArray36 = new int[] { '4', (byte) 1, 1084917248, 1, (-1641696559) };
        double double37 = org.apache.commons.math.util.MathUtils.distance(intArray22, intArray36);
        double double38 = org.apache.commons.math.util.MathUtils.distance(intArray3, intArray22);
        int[] intArray42 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray49 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int50 = org.apache.commons.math.util.MathUtils.distanceInf(intArray42, intArray49);
        int[] intArray56 = new int[] { '4', (byte) 1, 1084917248, 1, (-1641696559) };
        double double57 = org.apache.commons.math.util.MathUtils.distance(intArray42, intArray56);
        double double58 = org.apache.commons.math.util.MathUtils.distance(intArray3, intArray42);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1894796225 + "'", int11 == 1894796225);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 1, 1084917248, 1, -1641696559]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.183414310119577E9d + "'", double18 == 2.183414310119577E9d);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1894796225 + "'", int30 == 1894796225);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[52, 1, 1084917248, 1, -1641696559]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2.183414310119577E9d + "'", double37 == 2.183414310119577E9d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1894796225 + "'", int50 == 1894796225);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[52, 1, 1084917248, 1, -1641696559]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 2.183414310119577E9d + "'", double57 == 2.183414310119577E9d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 3396L, (double) 10L, (double) 110L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 100, 1894796225);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1894796325 + "'", int2 == 1894796325);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079574528 + "'", int1 == 1079574528);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1, 1079574528);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 4);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) (byte) -1, (long) 1894796376);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 100 };
        double[] doubleArray8 = new double[] { '4', (-1L), (byte) 1, 100.0d, 'a' };
        double[] doubleArray12 = new double[] { (-1.0f), 100.0f, 'a' };
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equals(doubleArray8, doubleArray12);
        double double14 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray2, doubleArray12);
        double[] doubleArray21 = new double[] { (-1894796193), 3396L, 100, 100L, (-1.0d), (-1) };
        boolean boolean22 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray21);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray0, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[52.0, -1.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 101.0d + "'", double14 == 101.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.894796193E9, 3396.0, 100.0, 100.0, -1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1074790400), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 100L, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.9772948850955006d) + "'", double2 == (-7.9772948850955006d));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(101.0d, (double) (-1894796193), 3395);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 10, (double) (-1262696364));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        double double1 = org.apache.commons.math.util.MathUtils.sign(15.104412573075516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        int[] intArray3 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray10 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int11 = org.apache.commons.math.util.MathUtils.distanceInf(intArray3, intArray10);
        int[] intArray15 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray22 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int23 = org.apache.commons.math.util.MathUtils.distanceInf(intArray15, intArray22);
        double double24 = org.apache.commons.math.util.MathUtils.distance(intArray3, intArray22);
        int[] intArray28 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray35 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int36 = org.apache.commons.math.util.MathUtils.distanceInf(intArray28, intArray35);
        int[] intArray40 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray47 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int48 = org.apache.commons.math.util.MathUtils.distanceInf(intArray40, intArray47);
        double double49 = org.apache.commons.math.util.MathUtils.distance(intArray28, intArray47);
        int[] intArray53 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray60 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int61 = org.apache.commons.math.util.MathUtils.distanceInf(intArray53, intArray60);
        int[] intArray65 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray72 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int73 = org.apache.commons.math.util.MathUtils.distanceInf(intArray65, intArray72);
        double double74 = org.apache.commons.math.util.MathUtils.distance(intArray53, intArray72);
        int int75 = org.apache.commons.math.util.MathUtils.distanceInf(intArray28, intArray53);
        int int76 = org.apache.commons.math.util.MathUtils.distance1(intArray3, intArray53);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1894796225 + "'", int11 == 1894796225);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1894796225 + "'", int23 == 1894796225);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.8947962250000033E9d + "'", double24 == 1.8947962250000033E9d);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1894796225 + "'", int36 == 1894796225);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1894796225 + "'", int48 == 1894796225);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.8947962250000033E9d + "'", double49 == 1.8947962250000033E9d);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1894796225 + "'", int61 == 1894796225);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1894796225 + "'", int73 == 1894796225);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.8947962250000033E9d + "'", double74 == 1.8947962250000033E9d);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        int[] intArray3 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray10 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int11 = org.apache.commons.math.util.MathUtils.distanceInf(intArray3, intArray10);
        int[] intArray17 = new int[] { '4', (byte) 1, 1084917248, 1, (-1641696559) };
        double double18 = org.apache.commons.math.util.MathUtils.distance(intArray3, intArray17);
        int[] intArray22 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray29 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int30 = org.apache.commons.math.util.MathUtils.distanceInf(intArray22, intArray29);
        int[] intArray36 = new int[] { '4', (byte) 1, 1084917248, 1, (-1641696559) };
        double double37 = org.apache.commons.math.util.MathUtils.distance(intArray22, intArray36);
        double double38 = org.apache.commons.math.util.MathUtils.distance(intArray3, intArray22);
        int[] intArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.math.util.MathUtils.distance1(intArray22, intArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1894796225 + "'", int11 == 1894796225);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 1, 1084917248, 1, -1641696559]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.183414310119577E9d + "'", double18 == 2.183414310119577E9d);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1894796225 + "'", int30 == 1894796225);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[52, 1, 1084917248, 1, -1641696559]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2.183414310119577E9d + "'", double37 == 2.183414310119577E9d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 4);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1076101120 + "'", int1 == 1076101120);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 10.0f, (-1894796193));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.203606415850622E-279d) + "'", double2 == (-2.203606415850622E-279d));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 183579396L + "'", long2 == 183579396L);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (byte) -1, 698104850);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 698104849 + "'", int2 == 698104849);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        double double1 = org.apache.commons.math.util.MathUtils.sign(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        int[] intArray3 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray10 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int11 = org.apache.commons.math.util.MathUtils.distanceInf(intArray3, intArray10);
        int[] intArray17 = new int[] { '4', (byte) 1, 1084917248, 1, (-1641696559) };
        double double18 = org.apache.commons.math.util.MathUtils.distance(intArray3, intArray17);
        int[] intArray22 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray29 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int30 = org.apache.commons.math.util.MathUtils.distanceInf(intArray22, intArray29);
        int[] intArray34 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray41 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int42 = org.apache.commons.math.util.MathUtils.distanceInf(intArray34, intArray41);
        int[] intArray48 = new int[] { '4', (byte) 1, 1084917248, 1, (-1641696559) };
        double double49 = org.apache.commons.math.util.MathUtils.distance(intArray34, intArray48);
        int[] intArray53 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray60 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int61 = org.apache.commons.math.util.MathUtils.distanceInf(intArray53, intArray60);
        int[] intArray67 = new int[] { '4', (byte) 1, 1084917248, 1, (-1641696559) };
        double double68 = org.apache.commons.math.util.MathUtils.distance(intArray53, intArray67);
        double double69 = org.apache.commons.math.util.MathUtils.distance(intArray34, intArray53);
        int[] intArray73 = new int[] { (short) 100, (-1894796193), (byte) 1 };
        int[] intArray80 = new int[] { (byte) 0, ' ', '4', '#', (byte) 10, (byte) -1 };
        int int81 = org.apache.commons.math.util.MathUtils.distanceInf(intArray73, intArray80);
        int int82 = org.apache.commons.math.util.MathUtils.distanceInf(intArray53, intArray80);
        int int83 = org.apache.commons.math.util.MathUtils.distance1(intArray22, intArray80);
        int int84 = org.apache.commons.math.util.MathUtils.distance1(intArray17, intArray80);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1894796225 + "'", int11 == 1894796225);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 1, 1084917248, 1, -1641696559]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.183414310119577E9d + "'", double18 == 2.183414310119577E9d);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1894796225 + "'", int30 == 1894796225);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1894796225 + "'", int42 == 1894796225);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[52, 1, 1084917248, 1, -1641696559]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2.183414310119577E9d + "'", double49 == 2.183414310119577E9d);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1894796225 + "'", int61 == 1894796225);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[52, 1, 1084917248, 1, -1641696559]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 2.183414310119577E9d + "'", double68 == 2.183414310119577E9d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[100, -1894796193, 1]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[0, 32, 52, 35, 10, -1]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1894796225 + "'", int81 == 1894796225);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1894796225 + "'", int82 == 1894796225);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1894796376 + "'", int83 == 1894796376);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1568353414) + "'", int84 == (-1568353414));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 0, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1076101120, (-1894796193));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }
}
