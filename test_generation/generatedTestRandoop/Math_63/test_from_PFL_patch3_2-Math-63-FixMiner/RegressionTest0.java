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
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        double[] doubleArray2 = new double[] { (short) 1, 10.0d };
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MathUtils.checkOrder(doubleArray2, orderDirection3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 10.0]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079574528 + "'", int1 == 1079574528);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int[] intArray6 = new int[] { (byte) 0, (short) 100, (short) 10, 1, (short) 10, (short) 10 };
        int[] intArray10 = new int[] { '#', (byte) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            double double11 = org.apache.commons.math.util.MathUtils.distance(intArray6, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 10, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, 100, -1]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3628800.0d + "'", double1 == 3628800.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 100.0f, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        int int6 = org.apache.commons.math.util.MathUtils.hash(doubleArray3);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1074790369) + "'", int6 == (-1074790369));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(10.0d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.96459430051421d + "'", double2 == 97.96459430051421d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        double[] doubleArray0 = null;
        int int1 = org.apache.commons.math.util.MathUtils.hash(doubleArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection0 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.junit.Assert.assertTrue("'" + orderDirection0 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection0.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) (byte) 10, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(87, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        long long2 = org.apache.commons.math.util.MathUtils.pow(10L, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1079574528);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) '4', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 35, (double) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        double double1 = org.apache.commons.math.util.MathUtils.sign(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-1), 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, 87);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow(100L, (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1, 1.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1.0f, 51);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3200 + "'", int2 == 3200);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 0.0f, 1079574528);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (byte) 0, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 200.0d + "'", double2 == 200.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 51, (double) (-1074790369));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0747903681780696E9d) + "'", double2 == (-1.0747903681780696E9d));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 51, 97.96459430051421d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 1, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) '4', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 152 + "'", int2 == 152);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (byte) 1, 100);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { (short) -1 };
        double double10 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray7, doubleArray9);
        boolean boolean11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray9);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray9);
        double double13 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray3);
        java.lang.Class<?> wildcardClass14 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 0, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        double double0 = org.apache.commons.math.util.MathUtils.SAFE_MIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.2250738585072014E-308d + "'", double0 == 2.2250738585072014E-308d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        double double3 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray0, doubleArray2);
        double[] doubleArray9 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(doubleArray2, doubleArray9);
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 98.0d + "'", double10 == 98.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 149.04361777681055d + "'", double11 == 149.04361777681055d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int7 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray6);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 87 + "'", int7 == 87);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 0, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(2.2250738585072014E-308d, 98.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.53096491487338d + "'", double2 == 100.53096491487338d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (byte) 1, (double) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 152, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 252L + "'", long2 == 252L);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        long long2 = org.apache.commons.math.util.MathUtils.pow(100L, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.065817517094494E67d + "'", double1 == 8.065817517094494E67d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079574528 + "'", int1 == 1079574528);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 3200, (int) (byte) 100);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(1079574528);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.137539520933611E10d + "'", double1 == 2.137539520933611E10d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (short) 10, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.5663706143591725d) + "'", double2 == (-2.5663706143591725d));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        double double3 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray0, doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray0, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { (short) -1 };
        double double10 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray7, doubleArray9);
        boolean boolean11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray9);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray9);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        double[] doubleArray16 = new double[] { (short) -1 };
        double double17 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray14, doubleArray16);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray13, doubleArray16);
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        double[] doubleArray22 = new double[] { (short) -1 };
        double double23 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray20, doubleArray22);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray19, doubleArray22);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray16, doubleArray22);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray3, doubleArray22);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        double[] doubleArray30 = new double[] { (short) -1 };
        double double31 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray28, doubleArray30);
        boolean boolean32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray27, doubleArray30);
        double[] doubleArray33 = new double[] {};
        double[] doubleArray34 = new double[] {};
        double[] doubleArray36 = new double[] { (short) -1 };
        double double37 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray34, doubleArray36);
        boolean boolean38 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray33, doubleArray36);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray30, doubleArray36);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        double[] doubleArray43 = new double[] { (short) -1 };
        double double44 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray41, doubleArray43);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray40, doubleArray43);
        double[] doubleArray46 = new double[] {};
        double[] doubleArray47 = new double[] {};
        double[] doubleArray49 = new double[] { (short) -1 };
        double double50 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray47, doubleArray49);
        boolean boolean51 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray46, doubleArray49);
        boolean boolean52 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray43, doubleArray49);
        double double53 = org.apache.commons.math.util.MathUtils.distance1(doubleArray30, doubleArray49);
        double double54 = org.apache.commons.math.util.MathUtils.distance1(doubleArray3, doubleArray49);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (short) 100, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1000L + "'", long2 == 1000L);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int7 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray6);
        int[] intArray9 = new int[] { (short) 10 };
        int[] intArray14 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int15 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray14);
        int int16 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray14);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 87 + "'", int7 == 87);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 87 + "'", int16 == 87);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) (byte) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 100L);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger4, (long) 87);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger7, (long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger4, bigInteger7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1079574528, 51);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int int2 = org.apache.commons.math.util.MathUtils.pow((-10), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1410065408 + "'", int2 == 1410065408);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-10));
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
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6313083693369503E35d + "'", double1 == 2.6313083693369503E35d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((-2.5663706143591725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.4708378242902675d) + "'", double1 == (-6.4708378242902675d));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        double double1 = org.apache.commons.math.util.MathUtils.sign(200.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        double double0 = org.apache.commons.math.util.MathUtils.TWO_PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 6.283185307179586d + "'", double0 == 6.283185307179586d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int int1 = org.apache.commons.math.util.MathUtils.sign(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        double double2 = org.apache.commons.math.util.MathUtils.round(10.0d, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { (short) -1 };
        double double10 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray7, doubleArray9);
        boolean boolean11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray9);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray9);
        double double13 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray3);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray16 = new double[] { (short) -1 };
        double double17 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray14, doubleArray16);
        double[] doubleArray23 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double24 = org.apache.commons.math.util.MathUtils.distance(doubleArray16, doubleArray23);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray27 = new double[] { (short) -1 };
        double double28 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray25, doubleArray27);
        double[] doubleArray34 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double35 = org.apache.commons.math.util.MathUtils.distance(doubleArray27, doubleArray34);
        double double36 = org.apache.commons.math.util.MathUtils.distance1(doubleArray23, doubleArray34);
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        double[] doubleArray40 = new double[] { (short) -1 };
        double double41 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray38, doubleArray40);
        boolean boolean42 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray37, doubleArray40);
        boolean boolean43 = org.apache.commons.math.util.MathUtils.equals(doubleArray23, doubleArray37);
        // The following exception was thrown during execution in test generation
        try {
            double double44 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray3, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 98.0d + "'", double24 == 98.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 98.0d + "'", double35 == 98.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(Double.POSITIVE_INFINITY, 0.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-1074790369));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) '4', 87, (-53));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(3628800.0d, 1410065408, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(3200, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        boolean boolean3 = false; // flaky: org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 1410065408, (double) 51, 1410065408);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(87, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1000 + "'", int2 == 1000);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (byte) 100, (long) 87);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 187L + "'", long2 == 187L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 252L, (double) 3200, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) ' ', 1079574528);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1079574560 + "'", int2 == 1079574560);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1410065408, (double) Float.NaN, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(2.137539520933611E10d, (double) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) (byte) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 100L);
        java.math.BigInteger bigInteger5 = null;
        java.math.BigInteger bigInteger7 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, (long) (byte) 0);
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger7, 100L);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger9);
        java.math.BigInteger bigInteger12 = org.apache.commons.math.util.MathUtils.pow(bigInteger10, (int) ' ');
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        double double0 = org.apache.commons.math.util.MathUtils.EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.1102230246251565E-16d + "'", double0 == 1.1102230246251565E-16d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1079574528, (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) '#', (int) (byte) -1, 1410065408);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.53096491487338d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1079574528, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.079574528E9d + "'", double2 == 1.079574528E9d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1079574528, 3628800.0d, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        int[] intArray0 = null;
        int[] intArray2 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int8 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray7);
        int[] intArray10 = new int[] { (short) 10 };
        int[] intArray15 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int16 = org.apache.commons.math.util.MathUtils.distanceInf(intArray10, intArray15);
        int int17 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 87 + "'", int8 == 87);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 87 + "'", int16 == 87);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.1102230246251565E-16d, (double) (-1074790369));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int7 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 87 + "'", int7 == 87);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        double double2 = org.apache.commons.math.util.MathUtils.log(6.283185307179586d, (double) (-53));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 152, 152, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        long long1 = org.apache.commons.math.util.MathUtils.sign(187L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { (short) -1 };
        double double10 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray7, doubleArray9);
        boolean boolean11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray9);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray9);
        java.lang.Class<?> wildcardClass13 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-1), (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 152);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(87);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (-1.0f), (double) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(98.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189854738044024E42d + "'", double1 == 1.8189854738044024E42d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) (byte) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 100L);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger4, (long) 87);
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger4, 1L);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1410065408);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        double double3 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray0, doubleArray2);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray6 = new double[] { (short) -1 };
        double double7 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray4, doubleArray6);
        double[] doubleArray13 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double14 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray13);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray17 = new double[] { (short) -1 };
        double double18 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray15, doubleArray17);
        double[] doubleArray24 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double25 = org.apache.commons.math.util.MathUtils.distance(doubleArray17, doubleArray24);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray13, doubleArray24);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        double[] doubleArray30 = new double[] { (short) -1 };
        double double31 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray28, doubleArray30);
        boolean boolean32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray27, doubleArray30);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray27);
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equals(doubleArray0, doubleArray13);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        double[] doubleArray38 = new double[] { (short) -1 };
        double double39 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray36, doubleArray38);
        boolean boolean40 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray35, doubleArray38);
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        double[] doubleArray44 = new double[] { (short) -1 };
        double double45 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray42, doubleArray44);
        boolean boolean46 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray41, doubleArray44);
        boolean boolean47 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray38, doubleArray44);
        double[] doubleArray48 = new double[] {};
        double[] doubleArray49 = new double[] {};
        double[] doubleArray51 = new double[] { (short) -1 };
        double double52 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray49, doubleArray51);
        boolean boolean53 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray48, doubleArray51);
        double[] doubleArray54 = new double[] {};
        double[] doubleArray55 = new double[] {};
        double[] doubleArray57 = new double[] { (short) -1 };
        double double58 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray55, doubleArray57);
        boolean boolean59 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray54, doubleArray57);
        boolean boolean60 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray51, doubleArray57);
        double double61 = org.apache.commons.math.util.MathUtils.distance1(doubleArray38, doubleArray57);
        // The following exception was thrown during execution in test generation
        try {
            double double62 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray13, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 98.0d + "'", double14 == 98.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 98.0d + "'", double25 == 98.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) 1079574528, (-10), 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0E10f + "'", float3 == 1.0E10f);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int7 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray6);
        int[] intArray9 = new int[] { (short) 10 };
        int[] intArray14 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int15 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray14);
        int int16 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray14);
        int[] intArray21 = new int[] { (byte) 10, 51, '4', '4' };
        double double22 = org.apache.commons.math.util.MathUtils.distance(intArray1, intArray21);
        int[] intArray24 = new int[] { (short) 10 };
        int[] intArray29 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int30 = org.apache.commons.math.util.MathUtils.distanceInf(intArray24, intArray29);
        int[] intArray32 = new int[] { (short) 10 };
        int[] intArray37 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int38 = org.apache.commons.math.util.MathUtils.distanceInf(intArray32, intArray37);
        int int39 = org.apache.commons.math.util.MathUtils.distanceInf(intArray24, intArray37);
        int int40 = org.apache.commons.math.util.MathUtils.distanceInf(intArray21, intArray37);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 87 + "'", int7 == 87);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 87 + "'", int16 == 87);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 51, 52, 52]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 87 + "'", int30 == 87);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[10]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 87 + "'", int38 == 87);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 87 + "'", int39 == 87);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 87 + "'", int40 == 87);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (short) 1, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(152, (-1074790369));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        int int2 = org.apache.commons.math.util.MathUtils.pow(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 100L, (double) 35, (double) Float.NaN);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) '4', (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(90, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-10));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 120.0d + "'", double1 == 120.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (-1074790369), 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1074790269L) + "'", long2 == (-1074790269L));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1079574528, (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 51, (double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (-1), (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        int int1 = org.apache.commons.math.util.MathUtils.sign(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) (-1074790369), 1, 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.074790369E9d) + "'", double3 == (-1.074790369E9d));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (-1), (-3), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1L, 0, (int) '#');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-25) + "'", int2 == (-25));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 252L, 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 252.0f + "'", float2 == 252.0f);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) (byte) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 100L);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger4, (long) 87);
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger4, 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger4, (-25));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (byte) -1, 1079574560);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(0.0d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1079574528, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1079574528 + "'", int2 == 1079574528);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 156.3608363030788d + "'", double1 == 156.3608363030788d);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-25));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(97.96459430051421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7557097905326478E42d + "'", double1 == 1.7557097905326478E42d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(90, (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int7 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray6);
        int[] intArray9 = new int[] { (short) 10 };
        int[] intArray14 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int15 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray14);
        int int16 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray9);
        int[] intArray18 = new int[] { (short) 10 };
        int[] intArray23 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int24 = org.apache.commons.math.util.MathUtils.distanceInf(intArray18, intArray23);
        int[] intArray26 = new int[] { (short) 10 };
        int[] intArray31 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int32 = org.apache.commons.math.util.MathUtils.distanceInf(intArray26, intArray31);
        int int33 = org.apache.commons.math.util.MathUtils.distanceInf(intArray18, intArray31);
        int[] intArray38 = new int[] { (byte) 10, 51, '4', '4' };
        double double39 = org.apache.commons.math.util.MathUtils.distance(intArray18, intArray38);
        double double40 = org.apache.commons.math.util.MathUtils.distance(intArray1, intArray38);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 87 + "'", int7 == 87);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 87 + "'", int24 == 87);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 87 + "'", int32 == 87);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 87 + "'", int33 == 87);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10, 51, 52, 52]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((-53L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (short) -1, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-25));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-53));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(Double.POSITIVE_INFINITY, (double) 97);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { (short) -1 };
        double double10 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray7, doubleArray9);
        boolean boolean11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray9);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray9);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        double[] doubleArray16 = new double[] { (short) -1 };
        double double17 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray14, doubleArray16);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray13, doubleArray16);
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        double[] doubleArray22 = new double[] { (short) -1 };
        double double23 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray20, doubleArray22);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray19, doubleArray22);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray16, doubleArray22);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray3, doubleArray22);
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1074790369) + "'", int27 == (-1074790369));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) (byte) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 100L);
        java.math.BigInteger bigInteger5 = null;
        java.math.BigInteger bigInteger7 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, (long) (byte) 0);
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger7, 100L);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger9);
        java.math.BigInteger bigInteger12 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (int) (short) 100);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.017874927409903d) + "'", double1 == (-10.017874927409903d));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-1074790269L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(0.0d, 87, 1410065408);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-53), (-1074790369));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1000, 1079574528, 152);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) (byte) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 100L);
        java.math.BigInteger bigInteger5 = null;
        java.math.BigInteger bigInteger7 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, (long) (byte) 0);
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger7, 100L);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger9);
        java.math.BigInteger bigInteger11 = null;
        java.math.BigInteger bigInteger13 = org.apache.commons.math.util.MathUtils.pow(bigInteger11, (long) (byte) 0);
        java.math.BigInteger bigInteger15 = org.apache.commons.math.util.MathUtils.pow(bigInteger13, 100L);
        java.math.BigInteger bigInteger17 = org.apache.commons.math.util.MathUtils.pow(bigInteger13, 100);
        java.math.BigInteger bigInteger18 = org.apache.commons.math.util.MathUtils.pow(bigInteger10, bigInteger17);
        java.math.BigInteger bigInteger20 = org.apache.commons.math.util.MathUtils.pow(bigInteger17, (long) 90);
        java.math.BigInteger bigInteger22 = org.apache.commons.math.util.MathUtils.pow(bigInteger17, (long) 90);
        java.math.BigInteger bigInteger24 = org.apache.commons.math.util.MathUtils.pow(bigInteger17, 3200);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger24);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        int[] intArray0 = null;
        int[] intArray2 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int8 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray7);
        int[] intArray10 = new int[] { (short) 10 };
        int[] intArray15 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int16 = org.apache.commons.math.util.MathUtils.distanceInf(intArray10, intArray15);
        int int17 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray15);
        int[] intArray22 = new int[] { (byte) 10, 51, '4', '4' };
        double double23 = org.apache.commons.math.util.MathUtils.distance(intArray2, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 87 + "'", int8 == 87);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 87 + "'", int16 == 87);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 87 + "'", int17 == 87);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 51, 52, 52]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) Float.NaN);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2146959360 + "'", int1 == 2146959360);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        double double3 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray0, doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray0, (double) ' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        boolean boolean3 = false; // flaky: org.apache.commons.math.util.MathUtils.equals(3628800.0d, (double) 1410065408, 2146959360);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(0.0d, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-1074790369), 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7030733204779627E38d) + "'", double2 == (-1.7030733204779627E38d));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(2.2250738585072014E-308d, (-10.017874927409903d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-3));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) (byte) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 100L);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 100);
        java.math.BigInteger bigInteger7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        long long2 = org.apache.commons.math.util.MathUtils.pow((-1074790269L), 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1074790269L) + "'", long2 == (-1074790269L));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1, (int) 'a', 51);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1079574528, 1079574560);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        double double2 = org.apache.commons.math.util.MathUtils.round(Double.POSITIVE_INFINITY, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        long long1 = org.apache.commons.math.util.MathUtils.sign(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1074790369), (int) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        long long2 = org.apache.commons.math.util.MathUtils.lcm((long) 5, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1.0E10f, (double) (short) -1, (double) 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(2.137539520933611E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(87, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) (byte) -1, (double) (short) 1, (double) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int7 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray6);
        int[] intArray9 = new int[] { (short) 10 };
        int[] intArray14 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int15 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray14);
        int int16 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray14);
        int[] intArray20 = new int[] { (short) 100, 1079574560, (byte) -1 };
        int int21 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray20);
        int[] intArray23 = new int[] { (short) 10 };
        int[] intArray28 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int29 = org.apache.commons.math.util.MathUtils.distanceInf(intArray23, intArray28);
        double double30 = org.apache.commons.math.util.MathUtils.distance(intArray20, intArray28);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 87 + "'", int7 == 87);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 87 + "'", int16 == 87);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 1079574560, -1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 90 + "'", int21 == 90);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 87 + "'", int29 == 87);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0795745250000048E9d + "'", double30 == 1.0795745250000048E9d);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        long long2 = org.apache.commons.math.util.MathUtils.lcm(10L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        long long2 = org.apache.commons.math.util.MathUtils.pow(252L, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        long long2 = org.apache.commons.math.util.MathUtils.gcd((long) (-1074790369), (long) 2146959360);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-1), (double) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 100, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        long long1 = org.apache.commons.math.util.MathUtils.sign(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow((long) 100, (long) (-25));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        long long2 = org.apache.commons.math.util.MathUtils.gcd((long) (-10), (long) 1079574560);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        double double3 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray0, doubleArray2);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray6 = new double[] { (short) -1 };
        double double7 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray4, doubleArray6);
        double[] doubleArray13 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double14 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray13);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray17 = new double[] { (short) -1 };
        double double18 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray15, doubleArray17);
        double[] doubleArray24 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double25 = org.apache.commons.math.util.MathUtils.distance(doubleArray17, doubleArray24);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray13, doubleArray24);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        double[] doubleArray30 = new double[] { (short) -1 };
        double double31 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray28, doubleArray30);
        boolean boolean32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray27, doubleArray30);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray27);
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equals(doubleArray0, doubleArray13);
        double[] doubleArray36 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray13, (double) 1079574560);
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        double[] doubleArray40 = new double[] { (short) -1 };
        double double41 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray38, doubleArray40);
        boolean boolean42 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray37, doubleArray40);
        double[] doubleArray43 = new double[] {};
        double[] doubleArray44 = new double[] {};
        double[] doubleArray46 = new double[] { (short) -1 };
        double double47 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray44, doubleArray46);
        boolean boolean48 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray43, doubleArray46);
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray40, doubleArray46);
        double[] doubleArray50 = new double[] {};
        double[] doubleArray51 = new double[] {};
        double[] doubleArray53 = new double[] { (short) -1 };
        double double54 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray51, doubleArray53);
        boolean boolean55 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray50, doubleArray53);
        double[] doubleArray56 = new double[] {};
        double[] doubleArray57 = new double[] {};
        double[] doubleArray59 = new double[] { (short) -1 };
        double double60 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray57, doubleArray59);
        boolean boolean61 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray56, doubleArray59);
        boolean boolean62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray53, doubleArray59);
        double double63 = org.apache.commons.math.util.MathUtils.distance1(doubleArray40, doubleArray59);
        boolean boolean64 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray36, doubleArray40);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 98.0d + "'", double14 == 98.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 98.0d + "'", double25 == 98.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[4.0588655937984496E8, 4.184397519379845E7, 2.1758867100775194E8, -4184397.519379845, 4.1843975193798447E8]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) '4', (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-52L) + "'", long2 == (-52L));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 1079574560);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        long long2 = org.apache.commons.math.util.MathUtils.gcd((long) 9700, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { (short) -1 };
        double double10 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray7, doubleArray9);
        boolean boolean11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray9);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray9);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray15 = new double[] { (short) -1 };
        double double16 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray13, doubleArray15);
        double[] doubleArray22 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double23 = org.apache.commons.math.util.MathUtils.distance(doubleArray15, doubleArray22);
        double double24 = org.apache.commons.math.util.MathUtils.distance1(doubleArray3, doubleArray22);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray27 = new double[] { (short) -1 };
        double double28 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray25, doubleArray27);
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 98.0d + "'", double23 == 98.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 98.0d + "'", double24 == 98.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        double double1 = org.apache.commons.math.util.MathUtils.sign((-10.017874927409903d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 363.7393755555636d + "'", double1 == 363.7393755555636d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(5, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-53), (-3));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(3200, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 166400 + "'", int2 == 166400);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { (short) -1 };
        double double10 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray7, doubleArray9);
        boolean boolean11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray9);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray9);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        double[] doubleArray16 = new double[] { (short) -1 };
        double double17 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray14, doubleArray16);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray13, doubleArray16);
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        double[] doubleArray22 = new double[] { (short) -1 };
        double double23 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray20, doubleArray22);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray19, doubleArray22);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray16, doubleArray22);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray3, doubleArray22);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray29 = new double[] { (short) -1 };
        double double30 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray27, doubleArray29);
        double double31 = org.apache.commons.math.util.MathUtils.distance1(doubleArray3, doubleArray29);
        java.lang.Class<?> wildcardClass32 = doubleArray29.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
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
            float float3 = org.apache.commons.math.util.MathUtils.round((float) '4', (-3), (int) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1410065408);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (byte) 10, 2.137539520933611E10d, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((-1.074790369E9d), 97.96459430051421d, 1.0795745250000048E9d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(87, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        double double3 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray0, doubleArray2);
        double[] doubleArray9 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(doubleArray2, doubleArray9);
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 98.0d + "'", double10 == 98.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-847505249) + "'", int11 == (-847505249));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 1410065408, 1.1102230246251565E-16d, 120.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        float float1 = org.apache.commons.math.util.MathUtils.sign(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 97.96459430051421d, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        double double2 = org.apache.commons.math.util.MathUtils.round(6.283185307179586d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.2831853072d + "'", double2 == 6.2831853072d);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1410065408, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        int[] intArray0 = null;
        int[] intArray2 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int8 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray7);
        int[] intArray10 = new int[] { (short) 10 };
        int[] intArray15 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int16 = org.apache.commons.math.util.MathUtils.distanceInf(intArray10, intArray15);
        int int17 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray15);
        int[] intArray22 = new int[] { (byte) 10, 51, '4', '4' };
        double double23 = org.apache.commons.math.util.MathUtils.distance(intArray2, intArray22);
        int[] intArray25 = new int[] { (short) 10 };
        int[] intArray30 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int31 = org.apache.commons.math.util.MathUtils.distanceInf(intArray25, intArray30);
        int[] intArray33 = new int[] { (short) 10 };
        int[] intArray38 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int39 = org.apache.commons.math.util.MathUtils.distanceInf(intArray33, intArray38);
        int int40 = org.apache.commons.math.util.MathUtils.distanceInf(intArray25, intArray33);
        int[] intArray42 = new int[] { (short) 10 };
        int[] intArray47 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int48 = org.apache.commons.math.util.MathUtils.distanceInf(intArray42, intArray47);
        int[] intArray50 = new int[] { (short) 10 };
        int[] intArray55 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int56 = org.apache.commons.math.util.MathUtils.distanceInf(intArray50, intArray55);
        int int57 = org.apache.commons.math.util.MathUtils.distanceInf(intArray42, intArray55);
        int[] intArray62 = new int[] { (byte) 10, 51, '4', '4' };
        double double63 = org.apache.commons.math.util.MathUtils.distance(intArray42, intArray62);
        int int64 = org.apache.commons.math.util.MathUtils.distanceInf(intArray33, intArray42);
        int int65 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray42);
        // The following exception was thrown during execution in test generation
        try {
            int int66 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 87 + "'", int8 == 87);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 87 + "'", int16 == 87);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 87 + "'", int17 == 87);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 51, 52, 52]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 87 + "'", int31 == 87);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 87 + "'", int39 == 87);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[10]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 87 + "'", int48 == 87);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[10]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 87 + "'", int56 == 87);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 87 + "'", int57 == 87);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[10, 51, 52, 52]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        long long2 = org.apache.commons.math.util.MathUtils.pow(1L, (int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        boolean boolean3 = false; // flaky: org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 97L, 97.96459430051421d, (-25));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(152);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3113358856836756E267d + "'", double1 == 1.3113358856836756E267d);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 90, (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) 100, 9700);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-1074790269L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 10, (long) 90);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        int int2 = org.apache.commons.math.util.MathUtils.pow(1000, 1000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) (byte) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 100L);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger4, (long) 87);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger7, (long) (byte) 0);
        java.math.BigInteger bigInteger11 = org.apache.commons.math.util.MathUtils.pow(bigInteger9, 100L);
        java.math.BigInteger bigInteger12 = null;
        java.math.BigInteger bigInteger14 = org.apache.commons.math.util.MathUtils.pow(bigInteger12, (long) (byte) 0);
        java.math.BigInteger bigInteger16 = org.apache.commons.math.util.MathUtils.pow(bigInteger14, 100L);
        java.math.BigInteger bigInteger17 = org.apache.commons.math.util.MathUtils.pow(bigInteger9, bigInteger16);
        java.math.BigInteger bigInteger18 = null;
        java.math.BigInteger bigInteger20 = org.apache.commons.math.util.MathUtils.pow(bigInteger18, (long) (byte) 0);
        java.math.BigInteger bigInteger22 = org.apache.commons.math.util.MathUtils.pow(bigInteger20, 100L);
        java.math.BigInteger bigInteger24 = org.apache.commons.math.util.MathUtils.pow(bigInteger20, 100);
        java.math.BigInteger bigInteger25 = org.apache.commons.math.util.MathUtils.pow(bigInteger17, bigInteger24);
        java.math.BigInteger bigInteger27 = org.apache.commons.math.util.MathUtils.pow(bigInteger24, (long) 90);
        java.math.BigInteger bigInteger29 = org.apache.commons.math.util.MathUtils.pow(bigInteger24, (long) 90);
        java.math.BigInteger bigInteger30 = org.apache.commons.math.util.MathUtils.pow(bigInteger4, bigInteger29);
        java.math.BigInteger bigInteger31 = null;
        java.math.BigInteger bigInteger33 = org.apache.commons.math.util.MathUtils.pow(bigInteger31, (long) (byte) 0);
        java.math.BigInteger bigInteger35 = org.apache.commons.math.util.MathUtils.pow(bigInteger33, 100L);
        java.math.BigInteger bigInteger36 = null;
        java.math.BigInteger bigInteger38 = org.apache.commons.math.util.MathUtils.pow(bigInteger36, (long) (byte) 0);
        java.math.BigInteger bigInteger40 = org.apache.commons.math.util.MathUtils.pow(bigInteger38, 100L);
        java.math.BigInteger bigInteger41 = org.apache.commons.math.util.MathUtils.pow(bigInteger33, bigInteger40);
        java.math.BigInteger bigInteger42 = null;
        java.math.BigInteger bigInteger44 = org.apache.commons.math.util.MathUtils.pow(bigInteger42, (long) (byte) 0);
        java.math.BigInteger bigInteger46 = org.apache.commons.math.util.MathUtils.pow(bigInteger44, 100L);
        java.math.BigInteger bigInteger48 = org.apache.commons.math.util.MathUtils.pow(bigInteger44, 100);
        java.math.BigInteger bigInteger49 = org.apache.commons.math.util.MathUtils.pow(bigInteger41, bigInteger48);
        java.math.BigInteger bigInteger51 = org.apache.commons.math.util.MathUtils.pow(bigInteger48, (long) 90);
        java.math.BigInteger bigInteger52 = org.apache.commons.math.util.MathUtils.pow(bigInteger4, bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigInteger52);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        long long1 = org.apache.commons.math.util.MathUtils.sign((-1074790269L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        long long2 = org.apache.commons.math.util.MathUtils.lcm((long) ' ', (long) 1000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4000L + "'", long2 == 4000L);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        boolean boolean3 = false; // flaky: org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (byte) 0, 1.5430806348152437d, (-847505249));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(166400, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        double double3 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray0, doubleArray2);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray6 = new double[] { (short) -1 };
        double double7 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray4, doubleArray6);
        double[] doubleArray13 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double14 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray13);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray17 = new double[] { (short) -1 };
        double double18 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray15, doubleArray17);
        double[] doubleArray24 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double25 = org.apache.commons.math.util.MathUtils.distance(doubleArray17, doubleArray24);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray13, doubleArray24);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        double[] doubleArray30 = new double[] { (short) -1 };
        double double31 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray28, doubleArray30);
        boolean boolean32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray27, doubleArray30);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray27);
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equals(doubleArray0, doubleArray13);
        double[] doubleArray36 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray13, (double) 1079574560);
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        double[] doubleArray40 = new double[] { (short) -1 };
        double double41 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray38, doubleArray40);
        boolean boolean42 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray37, doubleArray40);
        double[] doubleArray43 = new double[] {};
        double[] doubleArray44 = new double[] {};
        double[] doubleArray46 = new double[] { (short) -1 };
        double double47 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray44, doubleArray46);
        boolean boolean48 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray43, doubleArray46);
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray40, doubleArray46);
        double double50 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray40);
        // The following exception was thrown during execution in test generation
        try {
            double double51 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray36, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 98.0d + "'", double14 == 98.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 98.0d + "'", double25 == 98.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[4.0588655937984496E8, 4.184397519379845E7, 2.1758867100775194E8, -4184397.519379845, 4.1843975193798447E8]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(1.7557097905326478E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(252L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13104L + "'", long2 == 13104L);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(8.065817517094494E67d, 97.96459430051421d, (double) (-10));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 87, (double) 4000L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.857192181240111d + "'", double2 == 1.857192181240111d);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray8 = new double[] { (short) -1 };
        double double9 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray6, doubleArray8);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray8, (double) 9700);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[9700.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        boolean boolean3 = false; // flaky: org.apache.commons.math.util.MathUtils.equals(1.1102230246251565E-16d, (double) ' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1410065408, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 51);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (short) -1, 8.065817517094494E67d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-53), (-1074790369));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 1L, 5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.283185307179586d + "'", double2 == 7.283185307179586d);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        int int2 = org.apache.commons.math.util.MathUtils.pow(0, 1000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(0.0d, 8.065817517094494E67d, 1000);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        int int2 = org.apache.commons.math.util.MathUtils.pow(0, 1079574560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) (byte) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 100L);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger4, (int) ' ');
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int7 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray6);
        int[] intArray9 = new int[] { (short) 10 };
        int[] intArray14 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int15 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray14);
        int int16 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray14);
        int[] intArray21 = new int[] { (byte) 10, 51, '4', '4' };
        double double22 = org.apache.commons.math.util.MathUtils.distance(intArray1, intArray21);
        int[] intArray24 = new int[] { (short) 10 };
        int[] intArray29 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int30 = org.apache.commons.math.util.MathUtils.distanceInf(intArray24, intArray29);
        int int31 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray29);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 87 + "'", int7 == 87);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 87 + "'", int16 == 87);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 51, 52, 52]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 87 + "'", int30 == 87);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 87 + "'", int31 == 87);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1074790369), (-25));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1074790344) + "'", int2 == (-1074790344));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.857192181240111d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 102.38815709611349d + "'", double2 == 102.38815709611349d);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        double double3 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray0, doubleArray2);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray2, (double) 9700);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray8 = new double[] { (short) -1 };
        double double9 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray6, doubleArray8);
        double[] doubleArray15 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double16 = org.apache.commons.math.util.MathUtils.distance(doubleArray8, doubleArray15);
        boolean boolean17 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[9700.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 98.0d + "'", double16 == 98.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { (short) -1 };
        double double10 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray7, doubleArray9);
        boolean boolean11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray9);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray9);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        double[] doubleArray16 = new double[] { (short) -1 };
        double double17 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray14, doubleArray16);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray13, doubleArray16);
        boolean boolean19 = org.apache.commons.math.util.MathUtils.equals(doubleArray9, doubleArray16);
        java.lang.Class<?> wildcardClass20 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        double double3 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray0, doubleArray2);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray2, (double) 9700);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[9700.0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1074790344), 5);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { (short) -1 };
        double double10 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray7, doubleArray9);
        boolean boolean11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray9);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray9);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray15 = new double[] { (short) -1 };
        double double16 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray13, doubleArray15);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray19 = new double[] { (short) -1 };
        double double20 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray17, doubleArray19);
        double[] doubleArray26 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double27 = org.apache.commons.math.util.MathUtils.distance(doubleArray19, doubleArray26);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray30 = new double[] { (short) -1 };
        double double31 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray28, doubleArray30);
        double[] doubleArray37 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double38 = org.apache.commons.math.util.MathUtils.distance(doubleArray30, doubleArray37);
        double double39 = org.apache.commons.math.util.MathUtils.distance1(doubleArray26, doubleArray37);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        double[] doubleArray43 = new double[] { (short) -1 };
        double double44 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray41, doubleArray43);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray40, doubleArray43);
        boolean boolean46 = org.apache.commons.math.util.MathUtils.equals(doubleArray26, doubleArray40);
        boolean boolean47 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray26);
        double[] doubleArray48 = new double[] {};
        double[] doubleArray50 = new double[] { (short) -1 };
        double double51 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray48, doubleArray50);
        double[] doubleArray57 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double58 = org.apache.commons.math.util.MathUtils.distance(doubleArray50, doubleArray57);
        double[] doubleArray59 = new double[] {};
        double[] doubleArray61 = new double[] { (short) -1 };
        double double62 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray59, doubleArray61);
        double[] doubleArray68 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double69 = org.apache.commons.math.util.MathUtils.distance(doubleArray61, doubleArray68);
        double double70 = org.apache.commons.math.util.MathUtils.distance1(doubleArray57, doubleArray68);
        boolean boolean71 = org.apache.commons.math.util.MathUtils.equals(doubleArray26, doubleArray57);
        boolean boolean72 = org.apache.commons.math.util.MathUtils.equals(doubleArray3, doubleArray57);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 98.0d + "'", double27 == 98.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 98.0d + "'", double38 == 98.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 98.0d + "'", double58 == 98.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 98.0d + "'", double69 == 98.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        double double3 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray0, doubleArray2);
        double[] doubleArray9 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(doubleArray2, doubleArray9);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray13 = new double[] { (short) -1 };
        double double14 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray11, doubleArray13);
        double[] doubleArray20 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double21 = org.apache.commons.math.util.MathUtils.distance(doubleArray13, doubleArray20);
        double double22 = org.apache.commons.math.util.MathUtils.distance1(doubleArray9, doubleArray20);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        double[] doubleArray26 = new double[] { (short) -1 };
        double double27 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray24, doubleArray26);
        boolean boolean28 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray23, doubleArray26);
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equals(doubleArray9, doubleArray23);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection30 = org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MathUtils.checkOrder(doubleArray9, orderDirection30, false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException; message: points 0 and 1 are not increasing (97 > 10)");
        } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 98.0d + "'", double10 == 98.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 98.0d + "'", double21 == 98.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + orderDirection30 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING + "'", orderDirection30.equals(org.apache.commons.math.util.MathUtils.OrderDirection.INCREASING));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        int int6 = org.apache.commons.math.util.MathUtils.hash(doubleArray3);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray3);
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] { (short) -1 };
        double double11 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray8, doubleArray10);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray3, doubleArray8);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray15 = new double[] { (short) -1 };
        double double16 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray13, doubleArray15);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray19 = new double[] { (short) -1 };
        double double20 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray17, doubleArray19);
        double[] doubleArray26 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double27 = org.apache.commons.math.util.MathUtils.distance(doubleArray19, doubleArray26);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray30 = new double[] { (short) -1 };
        double double31 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray28, doubleArray30);
        double[] doubleArray37 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double38 = org.apache.commons.math.util.MathUtils.distance(doubleArray30, doubleArray37);
        double double39 = org.apache.commons.math.util.MathUtils.distance1(doubleArray26, doubleArray37);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        double[] doubleArray43 = new double[] { (short) -1 };
        double double44 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray41, doubleArray43);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray40, doubleArray43);
        boolean boolean46 = org.apache.commons.math.util.MathUtils.equals(doubleArray26, doubleArray40);
        boolean boolean47 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray26);
        double[] doubleArray49 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray26, (double) 1079574560);
        boolean boolean50 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray26);
        double double51 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1074790369) + "'", int6 == (-1074790369));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 98.0d + "'", double27 == 98.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 98.0d + "'", double38 == 98.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[4.0588655937984496E8, 4.184397519379845E7, 2.1758867100775194E8, -4184397.519379845, 4.1843975193798447E8]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { (short) -1 };
        double double10 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray7, doubleArray9);
        boolean boolean11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray9);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray9);
        double double13 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray3);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        double[] doubleArray17 = new double[] { (short) -1 };
        double double18 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray15, doubleArray17);
        boolean boolean19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray14, doubleArray17);
        int int20 = org.apache.commons.math.util.MathUtils.hash(doubleArray17);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray17);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray24 = new double[] { (short) -1 };
        double double25 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray22, doubleArray24);
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equals(doubleArray17, doubleArray22);
        boolean boolean27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1074790369) + "'", int20 == (-1074790369));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.104412573075516d + "'", double1 == 15.104412573075516d);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-87) + "'", int2 == (-87));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(2.2250738585072014E-308d, (double) 1000L, (double) 90);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int7 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray6);
        int[] intArray9 = new int[] { (short) 10 };
        int[] intArray14 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int15 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray14);
        int int16 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray14);
        java.lang.Class<?> wildcardClass17 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 87 + "'", int7 == 87);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 87 + "'", int16 == 87);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1L, (double) '4', 5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        long long2 = org.apache.commons.math.util.MathUtils.pow(1000L, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 90, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-87), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-87.0d) + "'", double2 == (-87.0d));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(1.0795745250000048E9d, 1410065408);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.0053326347196E-300d) + "'", double2 == (-6.0053326347196E-300d));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 1410065408, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10929870470578718d + "'", double2 == 0.10929870470578718d);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int7 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray6);
        int[] intArray9 = new int[] { (short) 10 };
        int[] intArray14 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int15 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray14);
        int int16 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray14);
        int[] intArray20 = new int[] { (short) 100, 1079574560, (byte) -1 };
        int int21 = org.apache.commons.math.util.MathUtils.distanceInf(intArray1, intArray20);
        int[] intArray23 = new int[] { (short) 10 };
        int[] intArray28 = new int[] { 'a', '#', (short) 100, (short) 1 };
        int int29 = org.apache.commons.math.util.MathUtils.distanceInf(intArray23, intArray28);
        int int30 = org.apache.commons.math.util.MathUtils.distance1(intArray20, intArray28);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 87 + "'", int7 == 87);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 87 + "'", int16 == 87);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 1079574560, -1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 90 + "'", int21 == 90);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[97, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 87 + "'", int29 == 87);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1079574629 + "'", int30 == 1079574629);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { (short) -1 };
        double double10 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray7, doubleArray9);
        boolean boolean11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray9);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray9);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 1079574560);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        boolean boolean5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray0, doubleArray3);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { (short) -1 };
        double double10 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray7, doubleArray9);
        boolean boolean11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray6, doubleArray9);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray9);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        double[] doubleArray16 = new double[] { (short) -1 };
        double double17 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray14, doubleArray16);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray13, doubleArray16);
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        double[] doubleArray22 = new double[] { (short) -1 };
        double double23 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray20, doubleArray22);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray19, doubleArray22);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray16, doubleArray22);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        double[] doubleArray29 = new double[] { (short) -1 };
        double double30 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray27, doubleArray29);
        boolean boolean31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray26, doubleArray29);
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        double[] doubleArray35 = new double[] { (short) -1 };
        double double36 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray33, doubleArray35);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray32, doubleArray35);
        boolean boolean38 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray29, doubleArray35);
        double double39 = org.apache.commons.math.util.MathUtils.distance1(doubleArray16, doubleArray35);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray42 = new double[] { (short) -1 };
        double double43 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray40, doubleArray42);
        double double44 = org.apache.commons.math.util.MathUtils.distance1(doubleArray16, doubleArray42);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray3, doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(97.96459430051421d, (-1.0747903681780696E9d), 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(2146959360, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2146959392 + "'", int2 == 2146959392);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        double[] doubleArray0 = null;
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1 };
        double double4 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray3);
        double[] doubleArray10 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double11 = org.apache.commons.math.util.MathUtils.distance(doubleArray3, doubleArray10);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray14 = new double[] { (short) -1 };
        double double15 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray12, doubleArray14);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray18 = new double[] { (short) -1 };
        double double19 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray16, doubleArray18);
        double[] doubleArray25 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double26 = org.apache.commons.math.util.MathUtils.distance(doubleArray18, doubleArray25);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray29 = new double[] { (short) -1 };
        double double30 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray27, doubleArray29);
        double[] doubleArray36 = new double[] { 'a', 10L, '4', (byte) -1, (byte) 100 };
        double double37 = org.apache.commons.math.util.MathUtils.distance(doubleArray29, doubleArray36);
        double double38 = org.apache.commons.math.util.MathUtils.distance1(doubleArray25, doubleArray36);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        double[] doubleArray42 = new double[] { (short) -1 };
        double double43 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray40, doubleArray42);
        boolean boolean44 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray39, doubleArray42);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray39);
        boolean boolean46 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray25);
        double double47 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray3, doubleArray25);
        double[] doubleArray48 = new double[] {};
        double[] doubleArray49 = new double[] {};
        double[] doubleArray51 = new double[] { (short) -1 };
        double double52 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray49, doubleArray51);
        boolean boolean53 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray48, doubleArray51);
        double[] doubleArray54 = new double[] {};
        double[] doubleArray55 = new double[] {};
        double[] doubleArray57 = new double[] { (short) -1 };
        double double58 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray55, doubleArray57);
        boolean boolean59 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray54, doubleArray57);
        boolean boolean60 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray51, doubleArray57);
        double[] doubleArray61 = new double[] {};
        double[] doubleArray62 = new double[] {};
        double[] doubleArray64 = new double[] { (short) -1 };
        double double65 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray62, doubleArray64);
        boolean boolean66 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray61, doubleArray64);
        double[] doubleArray67 = new double[] {};
        double[] doubleArray68 = new double[] {};
        double[] doubleArray70 = new double[] { (short) -1 };
        double double71 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray68, doubleArray70);
        boolean boolean72 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray67, doubleArray70);
        boolean boolean73 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray64, doubleArray70);
        double double74 = org.apache.commons.math.util.MathUtils.distance1(doubleArray51, doubleArray70);
        double[] doubleArray75 = new double[] {};
        double[] doubleArray77 = new double[] { (short) -1 };
        double double78 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray75, doubleArray77);
        double double79 = org.apache.commons.math.util.MathUtils.distance1(doubleArray51, doubleArray77);
        boolean boolean80 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray25, doubleArray51);
        // The following exception was thrown during execution in test generation
        try {
            double double81 = org.apache.commons.math.util.MathUtils.distance1(doubleArray0, doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 98.0d + "'", double11 == 98.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 98.0d + "'", double26 == 98.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[97.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 98.0d + "'", double37 == 98.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 98.0d + "'", double47 == 98.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 0, 1079574629);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1079574629 + "'", int2 == 1079574629);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 100, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 9700, (long) 1079574528);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1079584228L + "'", long2 == 1079584228L);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        double double3 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray0, doubleArray2);
        double[] doubleArray4 = null;
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        double[] doubleArray8 = new double[] { (short) -1 };
        double double9 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray5, doubleArray8);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        double[] doubleArray14 = new double[] { (short) -1 };
        double double15 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray12, doubleArray14);
        boolean boolean16 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray11, doubleArray14);
        boolean boolean17 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray8, doubleArray14);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        double[] doubleArray21 = new double[] { (short) -1 };
        double double22 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray19, doubleArray21);
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray18, doubleArray21);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        double[] doubleArray27 = new double[] { (short) -1 };
        double double28 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray25, doubleArray27);
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray24, doubleArray27);
        boolean boolean30 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray21, doubleArray27);
        double double31 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray27);
        boolean boolean32 = org.apache.commons.math.util.MathUtils.equals(doubleArray4, doubleArray27);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray0, doubleArray27);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        double[] doubleArray37 = new double[] { (short) -1 };
        double double38 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray35, doubleArray37);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray34, doubleArray37);
        boolean boolean40 = org.apache.commons.math.util.MathUtils.equals(doubleArray0, doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 90L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.102016471589204E38d + "'", double1 == 6.102016471589204E38d);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(166400, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1079574560, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1716.2439073140397d + "'", double2 == 1716.2439073140397d);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        float float1 = org.apache.commons.math.util.MathUtils.sign(252.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1079574629);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }
}
