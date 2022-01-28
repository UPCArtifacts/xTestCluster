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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) -1, (double) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = org.apache.commons.math.distribution.PoissonDistributionImpl.DEFAULT_MAX_ITERATIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10000000 + "'", int0 == 10000000);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(1, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        double double0 = org.apache.commons.math.distribution.PoissonDistributionImpl.DEFAULT_EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0E-12d + "'", double0 == 1.0E-12d);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((double) 10.0f, (double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) (-1L), (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0.0f, (double) 10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = poissonDistributionImpl2.sample((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0L, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl2.inverseCumulativeProbability((double) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        int int5 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1L, (double) (byte) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (10) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = poissonDistributionImpl2.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 12, 11, 10, 13, 12, 14, 11, 6, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 8, (int) (short) 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability((double) 9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1L), (double) (byte) 1, 7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (byte) -1);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(10, 3);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 6, 8, 12, 8, 5, 3, 10, 15]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl2.cumulativeProbability(17, 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = poissonDistributionImpl2.sample((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 7, 16, 9, 9, 10, 9, 8, 12, 17]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl2.cumulativeProbability((double) '#', (double) 10.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        double double8 = poissonDistributionImpl2.cumulativeProbability(17);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability((double) 10, (double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9857223864029524d + "'", double8 == 0.9857223864029524d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        int int8 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability((double) (short) 10, 0.7357588823428858d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[15, 9, 7, 5, 10, 10, 9, 7, 10, 14]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability(1);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7357588823428858d + "'", double4 == 0.7357588823428858d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 12, 9, 11, 9, 7, 6, 8, 11, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1), 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 11, 17, 11, 13, 12, 8, 13, 10, 12]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = poissonDistributionImpl2.inverseCumulativeProbability((double) 100L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[14, 13, 8, 8, 9, 6, 7, 4, 10, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) (short) 0, 0);
        int[] intArray10 = poissonDistributionImpl2.sample(0);
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.539992976248491E-5d + "'", double8 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability((int) ' ', 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, (double) (-1L), (int) ' ');
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability((double) 17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d);
        java.lang.Class<?> wildcardClass2 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability(0.5830397501930291d);
        double double7 = poissonDistributionImpl2.normalApproximateProbability(10);
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.539992976248491E-5d + "'", double5 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.562816469418554d + "'", double7 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) (short) 0, 0);
        int[] intArray10 = poissonDistributionImpl2.sample(0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = poissonDistributionImpl2.sample((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.539992976248491E-5d + "'", double8 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = poissonDistributionImpl2.inverseCumulativeProbability(4.539992976248491E-5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (short) 10, 10000000);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 11, 4, 14, 12, 8, 14, 11, 8, 15]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5420702855281083d + "'", double12 == 0.5420702855281083d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        double double5 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability((double) ' ', (double) 0.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.probability((int) (short) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 1);
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1251100357211333d + "'", double6 == 0.1251100357211333d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.normalApproximateProbability(0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0013315596295692678d + "'", double7 == 0.0013315596295692678d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) 1);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(0.9999999926277922d, 0.0013315596295692678d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[3, 0, 1, 0, 1, 0, 2, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 2, 1, 1, 1, 2, 2, 0, 1, 0, 0, 0, 0, 0, 1, 3, 0, 2, 0, 0, 0, 0, 0, 1, 1, 2, 2, 2, 1, 1, 1, 1, 4, 0, 1, 0, 0, 1, 1, 1, 2, 3, 3, 2, 2, 4, 2, 2, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 3, 3, 1, 3, 1, 3, 4, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, 100.0d, 100);
        int[] intArray5 = poissonDistributionImpl3.sample(11);
        double double7 = poissonDistributionImpl3.probability((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl3.cumulativeProbability((int) ' ', 3);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999827462528d + "'", double7 == 0.9999999827462528d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.probability((int) (short) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = poissonDistributionImpl2.inverseCumulativeProbability((double) 9);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1251100357211333d + "'", double6 == 0.1251100357211333d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0d, (int) (byte) 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        java.lang.Class<?> wildcardClass9 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 13, 6, 11, 11, 7, 10, 6, 12, 5]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) (short) 0, 0);
        java.lang.Class<?> wildcardClass9 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.539992976248491E-5d + "'", double8 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        double double5 = poissonDistributionImpl2.cumulativeProbability(7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability((double) (byte) 100, (double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0, (double) 8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.probability((int) (short) 10);
        double double8 = poissonDistributionImpl2.cumulativeProbability((double) 17);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1251100357211333d + "'", double6 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9857223864029524d + "'", double8 == 0.9857223864029524d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 7);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 17);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, 100.0d, 100);
        int[] intArray5 = poissonDistributionImpl3.sample(11);
        java.lang.Class<?> wildcardClass6 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0.9857223864029524d, 0);
        poissonDistributionImpl3.reseedRandomGenerator((long) ' ');
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability((double) 17, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 12);
        poissonDistributionImpl2.reseedRandomGenerator((long) 'a');
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        double double8 = poissonDistributionImpl2.cumulativeProbability(17);
        double double10 = poissonDistributionImpl2.cumulativeProbability(12);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9857223864029524d + "'", double8 == 0.9857223864029524d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7915564763949167d + "'", double10 == 0.7915564763949167d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        double double5 = poissonDistributionImpl2.cumulativeProbability(7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100, 7);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl1.cumulativeProbability(0.9857223864029524d, 0.5830397501930291d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability((double) 10L, (double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 0, 4.5399929762484854E-5d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1L, (double) (byte) -1, (int) (short) 10);
        double double5 = poissonDistributionImpl3.probability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0137771196302933E-7d + "'", double5 == 1.0137771196302933E-7d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, 4.539992976248491E-5d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability((int) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999999998333319d + "'", double5 == 0.9999999998333319d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0L, 8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((double) 1);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.normalApproximateProbability(11);
        double double12 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 7, 7, 7, 9, 9, 8, 15, 10, 14]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484845E-4d + "'", double8 == 4.5399929762484845E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6823718520013758d + "'", double11 == 0.6823718520013758d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, (double) (byte) -1, 10000000);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        double double5 = poissonDistributionImpl2.getMean();
        double double6 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.11259903214901994d, (int) (short) -1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl2.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        int int5 = poissonDistributionImpl3.sample();
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, 0.7915564763949167d);
        double double4 = poissonDistributionImpl2.probability((double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.720075976020796E-42d + "'", double4 == 3.720075976020796E-42d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.probability((int) (short) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(0.9226355382573108d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1251100357211333d + "'", double6 == 0.1251100357211333d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484845E-4d, 1.0E-12d, 10000000);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(12);
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.probability((int) (short) 10);
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.5830397501930291d);
        java.lang.Class<?> wildcardClass9 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1251100357211333d + "'", double6 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.07290794622443657d, (double) '#');
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability(4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.6139301142603509E-37d + "'", double5 == 1.6139301142603509E-37d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability(1);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0, (int) (byte) 100);
        int[] intArray9 = poissonDistributionImpl2.sample(11);
        double double11 = poissonDistributionImpl2.normalApproximateProbability(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7357588823428858d + "'", double4 == 0.7357588823428858d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2, 1, 4, 1, 1, 2, 0, 2, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.308537538725987d + "'", double11 == 0.308537538725987d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        double double13 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484845E-4d, 1.0E-12d, 10000000);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(12);
        double double7 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) 17);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability(0.5830397501930291d);
        double double7 = poissonDistributionImpl2.normalApproximateProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl2.cumulativeProbability((double) 100, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.539992976248491E-5d + "'", double5 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.562816469418554d + "'", double7 == 0.562816469418554d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5829943502632666d, 3.7200759760208177E-44d, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.628682978044818E-21d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.09007922571921603d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl1.cumulativeProbability(17, (int) (short) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.probability((double) ' ');
        double double10 = poissonDistributionImpl2.cumulativeProbability((int) (short) 1);
        double double12 = poissonDistributionImpl2.probability(14);
        java.lang.Class<?> wildcardClass13 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 7, 12, 7, 4, 11, 7, 17, 7, 5]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7253747334040217E-8d + "'", double8 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.993992273873336E-4d + "'", double10 == 4.993992273873336E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.052077104446026264d + "'", double12 == 0.052077104446026264d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(4.49456394057024E-4d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 7, 10, 14, 7, 10, 6, 5, 7, 12]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484845E-4d, 1.0E-12d, 10000000);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(12);
        double double7 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (byte) -1);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 8, 0.21459765022017452d, (int) ' ');
        int int4 = poissonDistributionImpl3.sample();
        double double6 = poissonDistributionImpl3.cumulativeProbability(5);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.19214426577955643d + "'", double6 == 0.19214426577955643d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 100);
        int[] intArray14 = poissonDistributionImpl2.sample((int) (byte) 100);
        double double16 = poissonDistributionImpl2.normalApproximateProbability(0);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[13, 8, 8, 10, 7, 11, 12, 9, 10, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(intArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[11, 9, 11, 8, 8, 18, 13, 9, 11, 7, 10, 9, 16, 10, 9, 9, 8, 13, 9, 14, 14, 11, 16, 11, 12, 7, 8, 12, 10, 10, 13, 6, 10, 9, 8, 6, 7, 9, 5, 14, 8, 8, 14, 5, 15, 8, 14, 10, 9, 4, 14, 8, 11, 15, 10, 12, 14, 15, 9, 10, 11, 4, 9, 6, 13, 8, 7, 16, 13, 6, 15, 11, 9, 9, 8, 9, 12, 8, 8, 11, 8, 11, 10, 13, 12, 12, 13, 10, 14, 12, 9, 13, 15, 16, 9, 11, 10, 13, 20, 10]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0013315596295692678d + "'", double16 == 0.0013315596295692678d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(12);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 10, 7, 15, 7, 8, 15, 14, 9, 14]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.09478033009176766d + "'", double8 == 0.09478033009176766d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = poissonDistributionImpl2.inverseCumulativeProbability((double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 14, 16, 10, 6, 7, 11, 4, 13, 13]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 6, 4.5399929762484845E-4d, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability(4.5399929762484854E-5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 6");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 0.09007922571921603d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0.9857223864029524d, 0);
        double double4 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = poissonDistributionImpl3.inverseCumulativeProbability((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((double) 1);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.normalApproximateProbability(11);
        int int12 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 10000000);
        double double16 = poissonDistributionImpl2.cumulativeProbability(0.43718353058144593d);
        java.lang.Class<?> wildcardClass17 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 12, 4, 11, 10, 9, 8, 10, 10, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484845E-4d + "'", double8 == 4.5399929762484845E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6823718520013758d + "'", double11 == 0.6823718520013758d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.539992976248491E-5d + "'", double16 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484845E-4d, 1.0E-12d, 10000000);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(0.1251100357211333d, 4.5399929762484845E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.probability((int) (short) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(0.21459765022017452d, 1.0251066712595435E-50d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1251100357211333d + "'", double6 == 0.1251100357211333d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability((double) 13, (double) 3);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((double) 1);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.normalApproximateProbability(11);
        int int12 = poissonDistributionImpl2.sample();
        double double15 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 1, (int) 'a');
        double double17 = poissonDistributionImpl2.normalApproximateProbability(11);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 12, 14, 6, 13, 8, 9, 10, 9, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484845E-4d + "'", double8 == 4.5399929762484845E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6823718520013758d + "'", double11 == 0.6823718520013758d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999546000702375d + "'", double15 == 0.9999546000702375d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.6823718520013758d + "'", double17 == 0.6823718520013758d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0.9857223864029524d, 0);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(0);
        int[] intArray7 = poissonDistributionImpl3.sample(16);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0013315596295692678d + "'", double5 == 0.0013315596295692678d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 7, 8, 11, 4, 14, 15, 8, 7, 11, 10, 4, 6, 10, 13, 3]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 12);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(9, 17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 16);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability((double) 12, 4.5399929762484854E-5d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, 0.0013315596295692678d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability((double) 8);
        double double9 = poissonDistributionImpl2.probability(2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3328196787507197d + "'", double7 == 0.3328196787507197d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0022699964881242427d + "'", double9 == 0.0022699964881242427d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 12);
        double double6 = poissonDistributionImpl2.probability((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 16);
        poissonDistributionImpl2.reseedRandomGenerator((long) 0);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        int[] intArray12 = poissonDistributionImpl2.sample(13);
        int int13 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 13, 10, 9, 8, 10, 13, 6, 10, 14]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[6, 7, 12, 7, 14, 15, 6, 12, 10, 9, 10, 10, 3]");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(1.7253747208734183E-8d);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 12);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.003594758625082517d);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(0.003594758625082517d);
        double double7 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 3.7200759760208177E-44d);
        double double4 = poissonDistributionImpl2.probability((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(0.6823718520013758d, 0.932914037120968d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 16);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = poissonDistributionImpl2.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(7);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = poissonDistributionImpl2.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.21459765022017452d + "'", double6 == 0.21459765022017452d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        double double5 = poissonDistributionImpl2.cumulativeProbability(0.07290794622443657d, (double) 9);
        double double7 = poissonDistributionImpl2.normalApproximateProbability(7);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl2.cumulativeProbability(15, (int) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7253747208734183E-8d + "'", double5 == 1.7253747208734183E-8d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double12 = poissonDistributionImpl2.getMean();
        int[] intArray14 = poissonDistributionImpl2.sample((int) (byte) 0);
        int int16 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0L);
        double double18 = poissonDistributionImpl2.cumulativeProbability(0.9999999998333319d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.539992976248491E-5d + "'", double18 == 4.539992976248491E-5d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, 0.9999999827462528d, (int) (short) 100);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) 0);
        double double7 = poissonDistributionImpl3.probability(6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.04109455799120611d + "'", double7 == 0.04109455799120611d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        double double13 = poissonDistributionImpl2.cumulativeProbability((double) (-1.0f), (double) 1.0f);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 8, 6, 12, 12, 10, 11, 11, 12, 16]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.993992273873336E-4d + "'", double13 == 4.993992273873336E-4d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        int[] intArray12 = poissonDistributionImpl2.sample(13);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 14, 8, 10, 10, 14, 12, 9, 13, 18]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[11, 9, 11, 9, 7, 13, 8, 7, 10, 9, 11, 9, 13]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(12);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(0.003594758625082517d, 0.308537538725987d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[13, 14, 9, 11, 6, 16, 9, 8, 8, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.09478033009176766d + "'", double8 == 0.09478033009176766d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.7200759760208177E-44d + "'", double5 == 3.7200759760208177E-44d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability((double) 8);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = poissonDistributionImpl2.sample((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3328196787507197d + "'", double7 == 0.3328196787507197d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        poissonDistributionImpl2.reseedRandomGenerator(10L);
        double double7 = poissonDistributionImpl2.cumulativeProbability(0.1251100357211333d, (double) 8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7253747208734183E-8d + "'", double7 == 1.7253747208734183E-8d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        int int6 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.7200759760208177E-44d + "'", double5 == 3.7200759760208177E-44d);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 104 + "'", int6 == 104);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0.9857223864029524d, 0);
        double double4 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability(0.5830397501930291d);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 10);
        double double9 = poissonDistributionImpl2.cumulativeProbability(12);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.539992976248491E-5d + "'", double5 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7915564763949167d + "'", double9 == 0.7915564763949167d);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 15);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double12 = poissonDistributionImpl2.getMean();
        int[] intArray14 = poissonDistributionImpl2.sample((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl2.cumulativeProbability(0.9999546000702375d, 0.5829943502632666d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 8, 0.21459765022017452d, (int) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) '4');
        double double6 = poissonDistributionImpl3.getMean();
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5397868640106864E-5d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, 3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.993992273873336E-4d, 1.0251066712595435E-50d, 2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 5, 0.0d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.09478033009176766d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.006737946999085472d + "'", double4 == 0.006737946999085472d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.probability(0.09007922571921603d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[18, 11, 14, 15, 8, 10, 8, 9, 12, 12]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(0.003594758625082517d, 0.0d);
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
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.normalApproximateProbability(14);
        double double9 = poissonDistributionImpl2.probability(1.0342773236060213E-15d);
        double double11 = poissonDistributionImpl2.cumulativeProbability((double) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9226355382573108d + "'", double7 == 0.9226355382573108d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0105598679321445E-93d);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        double double8 = poissonDistributionImpl2.cumulativeProbability(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.539992976248491E-5d + "'", double8 == 4.539992976248491E-5d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1.0f), 4.799682873368738E-10d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d);
        double double2 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5399929762484854E-5d + "'", double2 == 4.5399929762484854E-5d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        double double6 = poissonDistributionImpl3.probability((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability(0.0d, 4.5399929762484845E-4d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.068466217984994E-249d + "'", double6 == 5.068466217984994E-249d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability((double) 8);
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1.0f));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3328196787507197d + "'", double7 == 0.3328196787507197d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        java.lang.Class<?> wildcardClass9 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[13, 6, 10, 12, 10, 9, 7, 11, 6, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        int int5 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3328196787507197d, (int) (short) 100);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, 15);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(100, (int) '4');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.probability(100);
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 100);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.864649182067619E-63d + "'", double7 == 4.864649182067619E-63d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double8 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (short) 100);
        double double9 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.7200759760208177E-44d + "'", double5 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9605336665255937d + "'", double8 == 0.9605336665255937d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0, (double) (byte) 100);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1), 2.6524402995507083E-19d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.04099516050019131d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (35) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (int) (byte) 10);
        double double4 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        double double6 = poissonDistributionImpl2.probability(0.5420702855281083d);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        poissonDistributionImpl2.reseedRandomGenerator((long) 16);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability(1);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0, (int) (byte) 100);
        int[] intArray9 = poissonDistributionImpl2.sample(11);
        double double11 = poissonDistributionImpl2.normalApproximateProbability(5);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl2.cumulativeProbability((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7357588823428858d + "'", double4 == 0.7357588823428858d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 2, 2, 1, 0, 2, 0, 1, 0, 1, 2]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999966023268753d + "'", double11 == 0.9999966023268753d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10007188, (double) 9, 10007188);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 11, 15, 15, 12, 13, 12, 11, 13, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double10 = poissonDistributionImpl2.cumulativeProbability(0, (int) (byte) 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.993992273873336E-4d + "'", double10 == 4.993992273873336E-4d);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.probability((double) ' ');
        double double10 = poissonDistributionImpl2.cumulativeProbability((int) (short) 1);
        double double12 = poissonDistributionImpl2.probability(14);
        double double13 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 10, 8, 7, 14, 8, 11, 11, 18, 15]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7253747334040217E-8d + "'", double8 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.993992273873336E-4d + "'", double10 == 4.993992273873336E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.052077104446026264d + "'", double12 == 0.052077104446026264d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2);
        double double4 = poissonDistributionImpl1.cumulativeProbability(16, (int) '4');
        double double5 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.799682873368738E-10d + "'", double4 == 4.799682873368738E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double12 = poissonDistributionImpl2.getMean();
        double double14 = poissonDistributionImpl2.normalApproximateProbability(9);
        double double16 = poissonDistributionImpl2.probability(0.9999999827462528d);
        double double17 = poissonDistributionImpl2.getMean();
        int[] intArray19 = poissonDistributionImpl2.sample(7);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.43718353058144593d + "'", double14 == 0.43718353058144593d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(intArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[7, 4, 11, 9, 10, 11, 9]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        int int5 = poissonDistributionImpl3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability((double) 'a', (double) 11);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.probability((double) ' ');
        double double10 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double12 = poissonDistributionImpl2.cumulativeProbability((double) '#');
        double double15 = poissonDistributionImpl2.cumulativeProbability(1, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 7, 13, 10, 3, 10, 11, 4, 9, 16]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7253747334040217E-8d + "'", double8 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999998333297d + "'", double12 == 0.9999999998333297d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999545926980297d + "'", double15 == 0.9999545926980297d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (int) (byte) 10);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(3);
        double double6 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(17);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.01991630962237073d + "'", double4 == 0.01991630962237073d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9911469670963167d + "'", double8 == 0.9911469670963167d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999545926980297d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0, 18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, (double) (byte) -1, 10000000);
        double double4 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (10,000,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (int) (byte) 10);
        double double4 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 11);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, 0.9857223864029524d, (int) '#');
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 6, 4.5399929762484845E-4d, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability(0.11259903214901994d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl3.cumulativeProbability(3.7200759760208177E-44d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 6");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) '4');
        double double10 = poissonDistributionImpl2.getMean();
        double double12 = poissonDistributionImpl2.probability(0.9226355382573108d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.628682978044818E-21d + "'", double9 == 5.628682978044818E-21d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 7);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(4, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 100");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        int int12 = poissonDistributionImpl2.sample();
        double double14 = poissonDistributionImpl2.probability(1.6139301142603509E-37d);
        double double17 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0, (int) ' ');
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9999999926277922d + "'", double17 == 0.9999999926277922d);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double13 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl2.cumulativeProbability(100.0d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.562816469418554d + "'", double13 == 0.562816469418554d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (short) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(12, 5);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double12 = poissonDistributionImpl2.getMean();
        int[] intArray14 = poissonDistributionImpl2.sample(16);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(intArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[9, 10, 8, 7, 5, 13, 16, 11, 9, 14, 12, 8, 7, 7, 8, 10]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 100);
        int[] intArray14 = poissonDistributionImpl2.sample((int) (byte) 100);
        int[] intArray16 = poissonDistributionImpl2.sample(6);
        double double18 = poissonDistributionImpl2.probability(0.999999982746253d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 11, 15, 9, 12, 15, 12, 9, 11, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(intArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[9, 10, 11, 6, 6, 7, 5, 11, 9, 9, 9, 6, 8, 13, 8, 16, 9, 8, 11, 8, 9, 5, 6, 8, 7, 9, 11, 9, 14, 10, 4, 16, 11, 18, 14, 10, 7, 8, 10, 11, 5, 7, 11, 19, 9, 6, 8, 11, 18, 7, 14, 11, 13, 14, 11, 6, 13, 14, 14, 14, 10, 6, 3, 9, 6, 9, 4, 15, 10, 10, 15, 10, 8, 8, 9, 14, 19, 12, 11, 6, 8, 10, 13, 10, 11, 13, 15, 11, 11, 11, 6, 11, 11, 8, 9, 5, 12, 12, 15, 10]");
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[14, 13, 11, 15, 13, 12]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        int[] intArray12 = poissonDistributionImpl2.sample(13);
        int int13 = poissonDistributionImpl2.sample();
        int int14 = poissonDistributionImpl2.sample();
        double double16 = poissonDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[5, 7, 13, 9, 12, 7, 9, 13, 6, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[9, 9, 8, 7, 18, 6, 16, 6, 13, 11, 9, 14, 8]");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.539992976248491E-5d + "'", double16 == 4.539992976248491E-5d);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5830397501930291d, (double) 0L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.probability((int) (short) 10);
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.5830397501930291d);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.0d, 0.07290794622443657d);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1251100357211333d + "'", double6 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (int) '#');
        int[] intArray4 = poissonDistributionImpl2.sample((int) (short) 10);
        double double6 = poissonDistributionImpl2.probability((int) 'a');
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 114, 91, 92, 104, 101, 85, 103, 103, 105]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.038673139104234554d + "'", double6 == 0.038673139104234554d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4073778180707197d + "'", double8 == 0.4073778180707197d);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.21459765022017452d, (double) 10007188);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        double double6 = poissonDistributionImpl3.probability((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.068466217984994E-249d + "'", double6 == 5.068466217984994E-249d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (int) (byte) 10);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability(1.0251066712595435E-50d);
        double double7 = poissonDistributionImpl2.probability((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl2.cumulativeProbability(1.0105598679321445E-93d, 0.09478033009176766d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.628682978044818E-21d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.09007922571921603d);
        int int4 = poissonDistributionImpl1.sample();
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (double) 10000000, 7);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        int int6 = poissonDistributionImpl3.sample();
        int int7 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999546021313444d + "'", double5 == 0.9999546021313444d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0.9857223864029524d, 0);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(0);
        int[] intArray7 = poissonDistributionImpl3.sample(16);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl3.cumulativeProbability(1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 10");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0013315596295692678d + "'", double5 == 0.0013315596295692678d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[13, 2, 12, 8, 9, 10, 9, 10, 8, 9, 8, 8, 4, 5, 9, 14]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999999994409d + "'", double10 == 0.9999999999994409d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0.9857223864029524d, 0);
        double double4 = poissonDistributionImpl3.getMean();
        double double5 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f, (double) 104);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.999999982746253d, 1.6139301142603509E-37d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.07290794622443657d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999999372293128d + "'", double3 == 0.9999999372293128d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(3);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 9, 10, 17, 11, 8, 10, 14, 8, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.010336050675925733d + "'", double8 == 0.010336050675925733d);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5829943502632666d, 3.7200759760208177E-44d, 0);
        double double5 = poissonDistributionImpl3.probability((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability((double) 6, 4.49456394057024E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5582243423023643d + "'", double5 == 0.5582243423023643d);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5829943502632666d, 3.7200759760208177E-44d, 0);
        double double5 = poissonDistributionImpl3.probability((double) 0.0f);
        double double7 = poissonDistributionImpl3.probability(0.9226355382573108d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5582243423023643d + "'", double5 == 0.5582243423023643d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 1.9841269841250204E-88d, 9);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 7, (double) 8, (int) (byte) 0);
        poissonDistributionImpl3.reseedRandomGenerator((long) 16);
        int int6 = poissonDistributionImpl3.sample();
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.21459765022017452d);
        double double3 = poissonDistributionImpl1.probability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.17315155134233906d + "'", double3 == 0.17315155134233906d);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.21459765022017452d);
        double double3 = poissonDistributionImpl1.probability(13);
        double double5 = poissonDistributionImpl1.normalApproximateProbability(0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.6524402995507083E-19d + "'", double3 == 2.6524402995507083E-19d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7310828621751644d + "'", double5 == 0.7310828621751644d);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability(15, (int) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        int int8 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.probability(100);
        double double10 = poissonDistributionImpl2.cumulativeProbability(0.09478033009176766d, (double) '#');
        double double11 = poissonDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.864649182067619E-63d + "'", double7 == 4.864649182067619E-63d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999545999035672d + "'", double10 == 0.9999545999035672d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1L), (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        double double8 = poissonDistributionImpl2.cumulativeProbability(0.0d);
        double double11 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.539992976248491E-5d + "'", double8 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.12511003572113744d + "'", double11 == 0.12511003572113744d);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double12 = poissonDistributionImpl2.getMean();
        int[] intArray14 = poissonDistributionImpl2.sample((int) (byte) 0);
        int int16 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0L);
        double double19 = poissonDistributionImpl2.cumulativeProbability((int) (short) 1, 12);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.7915110764651542d + "'", double19 == 0.7915110764651542d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, (double) (byte) -1, 10000000);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability(10000000);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (10,000,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 8, 4, 11, 11, 15, 10, 10, 10, 13]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.09007922571921603d, 15);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 15);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        double double7 = poissonDistributionImpl2.probability(13);
        int int8 = poissonDistributionImpl2.sample();
        java.lang.Class<?> wildcardClass9 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.07290794622443657d + "'", double7 == 0.07290794622443657d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (int) '4');
        double double4 = poissonDistributionImpl2.probability((double) 10L);
        double double5 = poissonDistributionImpl2.getMean();
        double double6 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double12 = poissonDistributionImpl2.getMean();
        double double14 = poissonDistributionImpl2.normalApproximateProbability(9);
        double double16 = poissonDistributionImpl2.probability(0.9999999827462528d);
        double double17 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = poissonDistributionImpl2.cumulativeProbability(0.5582243423023643d, 4.5399929762484854E-5d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.43718353058144593d + "'", double14 == 0.43718353058144593d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(16);
        int int7 = poissonDistributionImpl3.inverseCumulativeProbability(0.308537538725987d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.551115123125783E-17d + "'", double5 == 5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 93 + "'", int7 == 93);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (int) '#');
        int[] intArray4 = poissonDistributionImpl2.sample((int) (short) 10);
        double double7 = poissonDistributionImpl2.cumulativeProbability((double) 15, (double) 88);
        double double9 = poissonDistributionImpl2.probability(0.21459765022017452d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[98, 89, 118, 108, 100, 102, 95, 114, 87, 89]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12381112453801489d + "'", double7 == 0.12381112453801489d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747208734183E-8d, 0.0d, 16);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (16) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, (double) (byte) -1, 10000000);
        double double5 = poissonDistributionImpl3.probability(5.745985131144603E-17d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 'a');
        double double10 = poissonDistributionImpl3.normalApproximateProbability(88);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        int[] intArray5 = poissonDistributionImpl3.sample(4);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability(104, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 0, 0]");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) 0L, (double) (byte) 1);
        int int11 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = poissonDistributionImpl2.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 10, 13, 16, 13, 8, 8, 3, 3, 13]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.993992273873336E-4d + "'", double10 == 4.993992273873336E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (double) 10000000, 7);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double7 = poissonDistributionImpl3.probability((int) (byte) 100);
        int int8 = poissonDistributionImpl3.sample();
        double double11 = poissonDistributionImpl3.cumulativeProbability(0.1251100357211333d, (double) 2);
        double double13 = poissonDistributionImpl3.probability(0.17315155134233906d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999546021313444d + "'", double5 == 0.9999546021313444d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.5397868640106864E-5d + "'", double11 == 4.5397868640106864E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.probability((-1.0d));
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.3328196787507197d);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl2.cumulativeProbability(14, (int) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double12 = poissonDistributionImpl2.getMean();
        double double14 = poissonDistributionImpl2.normalApproximateProbability(9);
        double double17 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        int[] intArray19 = poissonDistributionImpl2.sample(10);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.43718353058144593d + "'", double14 == 0.43718353058144593d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.932914037120968d + "'", double17 == 0.932914037120968d);
        org.junit.Assert.assertNotNull(intArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[13, 12, 7, 7, 7, 9, 6, 10, 12, 4]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.003594758625082517d);
        int[] intArray6 = poissonDistributionImpl2.sample((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability((int) (short) 10, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 12);
        double double6 = poissonDistributionImpl2.probability((int) (byte) -1);
        int int7 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.probability(7);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.9841269841250204E-88d + "'", double9 == 1.9841269841250204E-88d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 0);
        int int15 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[14, 7, 7, 5, 20, 19, 4, 17, 12, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        int[] intArray12 = poissonDistributionImpl2.sample(13);
        double double14 = poissonDistributionImpl2.normalApproximateProbability(0);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[19, 10, 11, 14, 10, 16, 4, 4, 9, 14]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 7, 17, 6, 10, 4, 12, 10, 8, 9, 3, 14, 15]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0013315596295692678d + "'", double14 == 0.0013315596295692678d);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0342773236060213E-15d, 12);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000);
        double double3 = poissonDistributionImpl1.normalApproximateProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        poissonDistributionImpl2.reseedRandomGenerator((long) 10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5397868640106864E-5d, 0.04099516050019131d);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6524402995507083E-19d, (double) 0L);
        double double4 = poissonDistributionImpl2.probability(0.5829943502632666d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2, 1.9841269841250204E-88d);
        int int3 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) (byte) -1);
        int int9 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 6, 4.5399929762484845E-4d, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability(0.003594758625082517d);
        int int6 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) 1);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (short) 100);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[2, 1, 3, 2, 2, 2, 1, 2, 0, 1, 0, 0, 0, 0, 3, 0, 0, 0, 0, 3, 3, 0, 3, 2, 1, 0, 2, 1, 1, 1, 2, 1, 0, 1, 1, 0, 2, 3, 0, 1, 1, 0, 1, 1, 0, 3, 0, 2, 2, 0, 0, 1, 1, 2, 1, 0, 2, 0, 0, 0, 1, 0, 1, 1, 1, 3, 0, 1, 2, 0, 3, 1, 0, 1, 2, 1, 4, 0, 2, 1, 0, 0, 0, 3, 1, 0, 0, 1, 2, 0, 2, 0, 0, 4, 2, 1, 2, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.691462461274013d + "'", double6 == 0.691462461274013d);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0.9857223864029524d, 0);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(0);
        int[] intArray7 = poissonDistributionImpl3.sample(16);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl3.cumulativeProbability(3.720075976020836E-44d, (double) 12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0013315596295692678d + "'", double5 == 0.0013315596295692678d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[6, 10, 12, 8, 13, 8, 7, 11, 6, 10, 10, 12, 9, 4, 11, 11]");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double13 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 10);
        int[] intArray15 = poissonDistributionImpl2.sample(8);
        double double17 = poissonDistributionImpl2.cumulativeProbability(5);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.562816469418554d + "'", double13 == 0.562816469418554d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[12, 5, 13, 10, 6, 9, 11, 14]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.067085962879032d + "'", double17 == 0.067085962879032d);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 13, (int) (short) 1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 3.7200759760208177E-44d);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.01991630962237073d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability((int) (byte) 10);
        double double6 = poissonDistributionImpl2.getMean();
        double double8 = poissonDistributionImpl2.probability((int) '#');
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 0);
        int int11 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1251100357211333d + "'", double5 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.3936204059180545E-10d + "'", double8 == 4.3936204059180545E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0013315596295692678d + "'", double10 == 0.0013315596295692678d);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0.9857223864029524d, 0);
        double double4 = poissonDistributionImpl3.getMean();
        double double5 = poissonDistributionImpl3.getMean();
        int[] intArray7 = poissonDistributionImpl3.sample(5);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[8, 11, 10, 6, 16]");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        int int10 = poissonDistributionImpl2.sample();
        double double12 = poissonDistributionImpl2.cumulativeProbability(4.864649182067619E-63d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 14 + "'", int10 == 14);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.539992976248491E-5d + "'", double12 == 4.539992976248491E-5d);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484845E-4d, 1.0E-12d, 10000000);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(12);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability(7, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1L), 0.9999999998333297d, 88);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, 104);
        double double4 = poissonDistributionImpl2.probability(0.9999546021313444d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', (int) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) '#');
        double double6 = poissonDistributionImpl2.normalApproximateProbability(104);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.19214426577955643d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7768236335766507d + "'", double6 == 0.7768236335766507d);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, 0.7915564763949167d);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl2.cumulativeProbability((double) 9, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.068466217984994E-249d, (double) (-1));
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.628682978044818E-21d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.09007922571921603d);
        int int4 = poissonDistributionImpl1.sample();
        double double6 = poissonDistributionImpl1.cumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (int) (byte) 10);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.probability(10007188);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        double double11 = poissonDistributionImpl2.normalApproximateProbability(14);
        double double13 = poissonDistributionImpl2.probability(0.0d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 7, 12, 16, 9, 8, 7, 8, 10, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9226355382573108d + "'", double11 == 0.9226355382573108d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.5399929762484854E-5d + "'", double13 == 4.5399929762484854E-5d);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.562816469418554d, 100);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d);
        int[] intArray3 = poissonDistributionImpl1.sample(2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0]");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        int[] intArray5 = poissonDistributionImpl3.sample(4);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability(1.7253747208734183E-8d, 0.7768236335766507d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0]");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        double double12 = poissonDistributionImpl2.getMean();
        double double13 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.068466217984994E-249d, (double) (-1));
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.4073778180707197d, 5.745985131144603E-17d, (int) (short) -1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (int) '#');
        double double4 = poissonDistributionImpl2.probability((int) (byte) 100);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(115);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.039860996809147134d + "'", double4 == 0.039860996809147134d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9394292419979411d + "'", double6 == 0.9394292419979411d);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, (int) (byte) 10);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability(0.0d, 0.11373639611012118d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9964116947845713d + "'", double7 == 0.9964116947845713d);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        double double5 = poissonDistributionImpl2.cumulativeProbability(0.07290794622443657d, (double) 9);
        double double7 = poissonDistributionImpl2.normalApproximateProbability(7);
        double double9 = poissonDistributionImpl2.probability((double) 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7253747208734183E-8d + "'", double5 == 1.7253747208734183E-8d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.734116511364753E-76d + "'", double9 == 3.734116511364753E-76d);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0022699964881242427d, (double) '#');
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) 1);
        int[] intArray4 = poissonDistributionImpl2.sample(0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (int) '#');
        int[] intArray4 = poissonDistributionImpl2.sample((int) (short) 10);
        double double7 = poissonDistributionImpl2.cumulativeProbability((double) 15, (double) 88);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(115);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (35) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[96, 98, 87, 97, 91, 105, 112, 119, 88, 114]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12381112453801489d + "'", double7 == 0.12381112453801489d);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0137771196302933E-7d, 0.999999982746253d, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (double) 10000000, 7);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double7 = poissonDistributionImpl3.probability((int) (byte) 100);
        int int8 = poissonDistributionImpl3.sample();
        double double11 = poissonDistributionImpl3.cumulativeProbability(0.1251100357211333d, (double) 2);
        double double13 = poissonDistributionImpl3.probability(10007188);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999546021313444d + "'", double5 == 0.9999546021313444d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.5397868640106864E-5d + "'", double11 == 4.5397868640106864E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4', 1.0137771196302933E-7d, 0);
        int int4 = poissonDistributionImpl3.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.normalApproximateProbability(14);
        double double9 = poissonDistributionImpl2.cumulativeProbability(9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9226355382573108d + "'", double7 == 0.9226355382573108d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.4579297144718917d + "'", double9 == 0.4579297144718917d);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        double double11 = poissonDistributionImpl2.normalApproximateProbability((int) (short) -1);
        double double13 = poissonDistributionImpl2.cumulativeProbability((double) 10007188);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 10, 13, 15, 14, 14, 7, 6, 8, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.49456394057024E-4d + "'", double11 == 4.49456394057024E-4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.probability((double) ' ');
        double double10 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double12 = poissonDistributionImpl2.cumulativeProbability((double) '#');
        double double14 = poissonDistributionImpl2.cumulativeProbability(3);
        double double16 = poissonDistributionImpl2.normalApproximateProbability(17);
        double double17 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 10, 6, 8, 5, 11, 15, 8, 13, 17]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7253747334040217E-8d + "'", double8 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999998333297d + "'", double12 == 0.9999999998333297d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.010336050675925733d + "'", double14 == 0.010336050675925733d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9911469670963167d + "'", double16 == 0.9911469670963167d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = poissonDistributionImpl2.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 10, 12, 16, 8, 13, 9, 9, 9, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability((double) 8);
        double double9 = poissonDistributionImpl2.probability((double) (byte) 0);
        double double11 = poissonDistributionImpl2.probability(4.799682873368738E-10d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3328196787507197d + "'", double7 == 0.3328196787507197d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int5 = poissonDistributionImpl2.sample();
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.21459765022017452d);
        poissonDistributionImpl1.reseedRandomGenerator((long) '4');
        double double5 = poissonDistributionImpl1.cumulativeProbability(93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.7357588823428858d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl1.cumulativeProbability(14, 12);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double13 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 10);
        double double14 = poissonDistributionImpl2.getMean();
        double double16 = poissonDistributionImpl2.cumulativeProbability((double) 10000000);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.562816469418554d + "'", double13 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.probability(100);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(0.09007922571921603d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.864649182067619E-63d + "'", double7 == 4.864649182067619E-63d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double8 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.932914037120968d);
        int[] intArray10 = poissonDistributionImpl3.sample(1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.7200759760208177E-44d + "'", double5 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.7200759760208177E-44d + "'", double8 == 3.7200759760208177E-44d);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[108]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9964116947845713d);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (int) (byte) 10);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.probability(10007188);
        double double6 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.probability((double) ' ');
        double double10 = poissonDistributionImpl2.cumulativeProbability((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = poissonDistributionImpl2.inverseCumulativeProbability((double) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 10, 10, 15, 10, 12, 10, 7, 7, 17]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7253747334040217E-8d + "'", double8 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.993992273873336E-4d + "'", double10 == 4.993992273873336E-4d);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0.9857223864029524d, 0);
        double double5 = poissonDistributionImpl3.probability(4.864649182067619E-63d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, 0.308537538725987d, (int) (byte) 10);
        double double5 = poissonDistributionImpl3.probability(0.9999999372293128d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484845E-4d, 1.0E-12d, 10000000);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(12);
        double double7 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) '4');
        double double12 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) 0L, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl2.cumulativeProbability((double) 9, 0.21459765022017452d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 13, 15, 10, 10, 11, 10, 11, 11, 13]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.993992273873336E-4d + "'", double10 == 4.993992273873336E-4d);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9226355382573108d, 1.0251066712595435E-50d, 8);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        int[] intArray12 = poissonDistributionImpl2.sample(13);
        int int13 = poissonDistributionImpl2.sample();
        int int14 = poissonDistributionImpl2.sample();
        double double16 = poissonDistributionImpl2.probability((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[17, 9, 14, 10, 11, 6, 10, 9, 13, 5]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[6, 10, 13, 20, 10, 9, 13, 12, 6, 10, 6, 7, 9]");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 14 + "'", int14 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.5399929762484845E-4d + "'", double16 == 4.5399929762484845E-4d);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        int[] intArray12 = poissonDistributionImpl2.sample(13);
        int int13 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl2.cumulativeProbability((double) 13, (double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 8, 7, 9, 10, 11, 10, 7, 9, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[13, 6, 9, 9, 10, 7, 12, 10, 11, 7, 13, 6, 9]");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 13 + "'", int13 == 13);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999998333297d);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double7 = poissonDistributionImpl2.cumulativeProbability(2, 52);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9995006007726127d + "'", double7 == 0.9995006007726127d);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        int int7 = poissonDistributionImpl3.sample();
        double double8 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.1251100357211333d + "'", double8 == 0.1251100357211333d);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, 0.9999999827462528d, (int) (short) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) (short) 10);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability(7, (int) 'a');
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7711920512296193d + "'", double5 == 0.7711920512296193d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.0d + "'", double6 == 11.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.92282241547993d + "'", double9 == 0.92282241547993d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double10 = poissonDistributionImpl2.cumulativeProbability(1.7253747334040217E-8d);
        int int11 = poissonDistributionImpl2.sample();
        double double13 = poissonDistributionImpl2.cumulativeProbability(0.5829943502632666d);
        int int14 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.539992976248491E-5d + "'", double13 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        int[] intArray12 = poissonDistributionImpl2.sample(13);
        int int13 = poissonDistributionImpl2.sample();
        int int14 = poissonDistributionImpl2.sample();
        java.lang.Class<?> wildcardClass15 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 11, 18, 9, 9, 9, 10, 11, 9, 15]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[9, 11, 10, 8, 15, 10, 13, 9, 4, 6, 13, 8, 5]");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 10, 8, 13, 14, 12, 10, 17, 11, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.864649182067619E-63d, 0.0022699964881242427d);
        double double4 = poissonDistributionImpl2.probability(16);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, 100.0d, 100);
        int[] intArray5 = poissonDistributionImpl3.sample(11);
        double double7 = poissonDistributionImpl3.cumulativeProbability(0.9999999998333297d);
        int[] intArray9 = poissonDistributionImpl3.sample(104);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.999999982746253d + "'", double7 == 0.999999982746253d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double10 = poissonDistributionImpl2.cumulativeProbability(1.7253747334040217E-8d);
        double double12 = poissonDistributionImpl2.cumulativeProbability(0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.539992976248491E-5d + "'", double12 == 4.539992976248491E-5d);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.720075976020796E-42d, (double) 0.0f);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5829943502632666d, 3.7200759760208177E-44d, 0);
        double double5 = poissonDistributionImpl3.probability((double) 100);
        double double7 = poissonDistributionImpl3.probability(0.7915110764651542d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.2041427794837412E-182d + "'", double5 == 2.2041427794837412E-182d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double5 = poissonDistributionImpl2.getMean();
        double double6 = poissonDistributionImpl2.getMean();
        double double8 = poissonDistributionImpl2.probability(18);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.007091108993195285d + "'", double8 == 0.007091108993195285d);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999998333297d, 0.07290794622443657d);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, 9);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 17, (double) (byte) 1);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.308537538725987d);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = poissonDistributionImpl2.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.139937718785163E-8d + "'", double4 == 4.139937718785163E-8d);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 18, (double) 10L, 8);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.probability(100);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.864649182067619E-63d + "'", double7 == 4.864649182067619E-63d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1L);
        double double3 = poissonDistributionImpl1.cumulativeProbability(5.068466217984994E-249d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.36787944117146065d + "'", double3 == 0.36787944117146065d);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(1.7253747208734183E-8d);
        int int7 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.normalApproximateProbability(6);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1341908136463804d + "'", double9 == 0.1341908136463804d);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability(1);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0, (int) (byte) 100);
        int[] intArray9 = poissonDistributionImpl2.sample(11);
        double double11 = poissonDistributionImpl2.normalApproximateProbability(5);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(1.0251066712595435E-50d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7357588823428858d + "'", double4 == 0.7357588823428858d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 1, 1, 0, 3, 2, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999966023268753d + "'", double11 == 0.9999966023268753d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (int) (byte) 10);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) 6);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.3056700905634025E-8d + "'", double4 == 2.3056700905634025E-8d);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(1.7253747208734183E-8d);
        int int7 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.normalApproximateProbability(9);
        int[] intArray11 = poissonDistributionImpl2.sample(14);
        poissonDistributionImpl2.reseedRandomGenerator((long) 10007188);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.43718353058144593d + "'", double9 == 0.43718353058144593d);
        org.junit.Assert.assertNotNull(intArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 8, 4, 11, 8, 13, 20, 14, 11, 16, 8, 11, 11, 10]");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1L, 3.720075976020796E-42d, 12);
        double double4 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        double double6 = poissonDistributionImpl3.probability((double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1103970707165003d + "'", double6 == 0.1103970707165003d);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9911469670963167d);
        int int2 = poissonDistributionImpl1.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(16);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.551115123125783E-17d + "'", double5 == 5.551115123125783E-17d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double8 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.932914037120968d);
        int[] intArray10 = poissonDistributionImpl3.sample(1);
        double double13 = poissonDistributionImpl3.cumulativeProbability(0.9605336665255937d, 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.7200759760208177E-44d + "'", double5 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.7200759760208177E-44d + "'", double8 == 3.7200759760208177E-44d);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[115]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.720075976020852E-42d + "'", double13 == 3.720075976020852E-42d);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9995006007726127d);
        double double2 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9995006007726127d + "'", double2 == 0.9995006007726127d);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double5 = poissonDistributionImpl2.getMean();
        int int6 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1), 0.7357588823428858d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[4, 8, 11, 15, 13, 11, 10, 11, 12, 8]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 3.7200759760208177E-44d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(4);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(100.0d, 0.19214426577955643d);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        poissonDistributionImpl2.reseedRandomGenerator(10L);
        double double7 = poissonDistributionImpl2.cumulativeProbability(0.7357588823428858d, (double) 10);
        double double8 = poissonDistributionImpl2.getMean();
        int int9 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7253747208734183E-8d + "'", double7 == 1.7253747208734183E-8d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7253747334040217E-8d + "'", double8 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 0.001210542580544489d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        double double12 = poissonDistributionImpl2.probability((double) 0.0f);
        int[] intArray14 = poissonDistributionImpl2.sample(15);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[5, 14, 7, 8, 10, 6, 5, 4, 10, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.5399929762484854E-5d + "'", double12 == 4.5399929762484854E-5d);
        org.junit.Assert.assertNotNull(intArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[12, 12, 12, 9, 11, 15, 12, 14, 7, 7, 13, 14, 8, 8, 11]");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (double) (byte) 1, 13);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.7200759760208177E-44d + "'", double5 == 3.7200759760208177E-44d);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.probability(100);
        double double10 = poissonDistributionImpl2.cumulativeProbability(0.09478033009176766d, (double) '#');
        double double11 = poissonDistributionImpl2.getMean();
        double double13 = poissonDistributionImpl2.probability(0.09007922571921603d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.864649182067619E-63d + "'", double7 == 4.864649182067619E-63d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999545999035672d + "'", double10 == 0.9999545999035672d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (short) -1);
        double double6 = poissonDistributionImpl2.probability(17);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0342773236060213E-15d + "'", double6 == 1.0342773236060213E-15d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0022699964881242427d);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.993992273873336E-4d, 0.9097049102288645d);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5397868640106864E-5d, 0.9999999926277922d, 10);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (double) 10000000, 7);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        int int6 = poissonDistributionImpl3.sample();
        double double8 = poissonDistributionImpl3.cumulativeProbability(16);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999546021313444d + "'", double5 == 0.9999546021313444d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.006737946999085472d, 6);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 8, 0.21459765022017452d, (int) ' ');
        int[] intArray5 = poissonDistributionImpl3.sample((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 7, (double) 8, (int) (byte) 0);
        poissonDistributionImpl3.reseedRandomGenerator((long) 16);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl3.cumulativeProbability(11.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5829943502632666d, 3.7200759760208177E-44d, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) 7);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.139937718785163E-8d, (double) '4', (int) (byte) 100);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.068466217984994E-249d, 4.3936204059180545E-10d, (int) 'a');
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 10, 11, 9, 13, 11, 8, 8, 13, 12]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.11259903214901994d, (double) (byte) 100);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9963401531726563d, 0.09007922571921603d, 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0L, 4.139937718785163E-8d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(1.7253747208734183E-8d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(11, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) 0L, (double) (byte) 1);
        double double12 = poissonDistributionImpl2.probability(0.1251100357211333d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[6, 7, 5, 11, 7, 6, 11, 10, 7, 15]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.993992273873336E-4d + "'", double10 == 4.993992273873336E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999998333319d, (double) 104);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.09478033009176766d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(1.7253747208734183E-8d);
        double double8 = poissonDistributionImpl2.probability(11);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double12 = poissonDistributionImpl2.probability(8);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.11373639611012118d + "'", double8 == 0.11373639611012118d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.003594758625082517d + "'", double10 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11259903214901994d + "'", double12 == 0.11259903214901994d);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 12);
        double double6 = poissonDistributionImpl2.probability(100);
        int int7 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.probability(12);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0876756987846234E-153d + "'", double9 == 2.0876756987846234E-153d);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 12);
        double double6 = poissonDistributionImpl2.probability((int) (byte) -1);
        int int7 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.probability(7);
        double double11 = poissonDistributionImpl2.probability((int) (short) -1);
        double double13 = poissonDistributionImpl2.probability(4.864649182067619E-63d);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = poissonDistributionImpl2.inverseCumulativeProbability(4.539786865564999E-5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.9841269841250204E-88d + "'", double9 == 1.9841269841250204E-88d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability(0.5830397501930291d);
        double double6 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.539992976248491E-5d + "'", double5 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double10 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 1, (int) (byte) 10);
        double double13 = poissonDistributionImpl2.cumulativeProbability(7, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 16, 13, 9, 11, 11, 8, 15, 14, 12]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5829943502632666d + "'", double10 == 0.5829943502632666d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.869858579117517d + "'", double13 == 0.869858579117517d);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(52);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[3, 7, 11, 5, 9, 7, 6, 9, 10, 7]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.09478033009176766d, 0.9999999998333297d, 16);
        double double6 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.7915110764651542d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability((double) 15, 0.7915110764651542d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9097049102288645d + "'", double6 == 0.9097049102288645d);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(4.719682636442159E-60d, 0.9999999372293128d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        int int10 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.getMean();
        int[] intArray13 = poissonDistributionImpl2.sample(14);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 8, 7, 11, 13, 11, 6, 11, 14, 14]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[7, 9, 10, 7, 10, 10, 12, 12, 5, 8, 11, 9, 14, 12]");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double10 = poissonDistributionImpl2.probability((double) 10L);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 6, 11, 13, 12, 9, 16, 14, 10, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1251100357211333d + "'", double10 == 0.1251100357211333d);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484845E-4d, 1.0E-12d, 10000000);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(12);
        double double7 = poissonDistributionImpl3.probability(1);
        double double9 = poissonDistributionImpl3.probability((double) 3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5379322904364025E-4d + "'", double7 == 4.5379322904364025E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.558895929802312E-11d + "'", double9 == 1.558895929802312E-11d);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999546021313444d, 16);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(1.7253747208734183E-8d);
        int int7 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.normalApproximateProbability(9);
        int[] intArray11 = poissonDistributionImpl2.sample(14);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = poissonDistributionImpl2.inverseCumulativeProbability((double) 9);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.43718353058144593d + "'", double9 == 0.43718353058144593d);
        org.junit.Assert.assertNotNull(intArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[12, 12, 12, 8, 14, 7, 11, 15, 9, 9, 13, 11, 10, 8]");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability((int) (byte) 10);
        double double6 = poissonDistributionImpl2.getMean();
        double double8 = poissonDistributionImpl2.cumulativeProbability((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = poissonDistributionImpl2.sample((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1251100357211333d + "'", double5 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.9841269841250204E-88d, (double) (-1L), (int) 'a');
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        int[] intArray12 = poissonDistributionImpl2.sample(13);
        int int13 = poissonDistributionImpl2.sample();
        double double15 = poissonDistributionImpl2.cumulativeProbability(1.0342773236060213E-15d);
        double double17 = poissonDistributionImpl2.probability(10007188);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 14, 10, 9, 7, 10, 12, 7, 7, 15]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 12, 9, 11, 10, 8, 9, 13, 14, 13, 16, 11, 22]");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.539992976248491E-5d + "'", double15 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.562816469418554d, 100.0d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.9226355382573108d);
        double double6 = poissonDistributionImpl2.probability((int) ' ');
        double double9 = poissonDistributionImpl2.cumulativeProbability(0.0d, (double) 18);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6794183126051052d + "'", double4 == 0.6794183126051052d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.224014864972378E-44d + "'", double6 == 2.224014864972378E-44d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 16);
        poissonDistributionImpl2.reseedRandomGenerator((long) 0);
        double double9 = poissonDistributionImpl2.probability(52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.628682978044818E-21d + "'", double9 == 5.628682978044818E-21d);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double13 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 10);
        int[] intArray15 = poissonDistributionImpl2.sample(8);
        int int17 = poissonDistributionImpl2.inverseCumulativeProbability(0.4579297144718917d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.562816469418554d + "'", double13 == 0.562816469418554d);
        org.junit.Assert.assertNotNull(intArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[7, 10, 13, 7, 8, 8, 8, 13]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 16);
        poissonDistributionImpl2.reseedRandomGenerator((long) 0);
        int int8 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484845E-4d, 1.0E-12d, 10000000);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(12);
        double double7 = poissonDistributionImpl3.probability(1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5379322904364025E-4d + "'", double7 == 4.5379322904364025E-4d);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.07290794622443657d, 0.07290794622443657d);
        double double4 = poissonDistributionImpl2.probability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0872316692162458E-18d + "'", double4 == 1.0872316692162458E-18d);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, 100.0d, 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 10);
        double double6 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7253747334040217E-8d + "'", double6 == 1.7253747334040217E-8d);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (double) 10000000, 7);
        poissonDistributionImpl3.reseedRandomGenerator((long) 18);
        double double7 = poissonDistributionImpl3.cumulativeProbability((-1.0d));
        double double8 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484854E-5d + "'", double8 == 4.5399929762484854E-5d);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, 0.9999999827462528d, (int) (short) 100);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(10007188);
        double double7 = poissonDistributionImpl3.cumulativeProbability((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0.9857223864029524d, 0);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(0);
        double double6 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0013315596295692678d + "'", double5 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.07290794622443657d, 0.039860996809147134d, 88);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((double) 1);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.normalApproximateProbability(11);
        int int12 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = poissonDistributionImpl2.cumulativeProbability(1.7253747334040217E-8d, 0.9963401531726563d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 7, 12, 8, 13, 14, 10, 12, 7, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484845E-4d + "'", double8 == 4.5399929762484845E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6823718520013758d + "'", double11 == 0.6823718520013758d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.probability((int) (short) 10);
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.5830397501930291d);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.0d, 0.07290794622443657d);
        int[] intArray13 = poissonDistributionImpl2.sample(93);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1251100357211333d + "'", double6 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[5, 14, 6, 12, 8, 14, 9, 7, 10, 11, 8, 10, 5, 12, 9, 12, 13, 13, 9, 6, 10, 11, 7, 7, 12, 10, 11, 8, 11, 10, 7, 14, 17, 19, 14, 10, 10, 9, 7, 12, 9, 14, 10, 7, 9, 13, 10, 5, 14, 13, 15, 9, 8, 6, 13, 8, 11, 12, 15, 9, 11, 9, 13, 8, 8, 9, 8, 8, 10, 12, 8, 13, 5, 13, 10, 11, 6, 10, 6, 7, 6, 12, 14, 12, 10, 10, 9, 10, 6, 10, 14, 5, 9]");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        int[] intArray11 = poissonDistributionImpl2.sample((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[5, 12, 12, 3, 10, 15, 7, 9, 9, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(intArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 7, 11, 13, 6, 12, 3, 10, 7, 14, 4, 12, 8, 12, 12, 6, 7, 8, 10, 9, 9, 6, 5, 7, 14, 9, 11, 11, 6, 16, 14, 9, 10, 14, 7, 7, 9, 6, 7, 9, 10, 18, 9, 13, 13, 14, 8, 8, 5, 14, 8, 8, 5, 8, 10, 13, 10, 13, 13, 7, 6, 14, 16, 5, 10, 7, 8, 8, 14, 16, 8, 8, 9, 8, 4, 11, 11, 7, 12, 13, 10, 11, 15, 9, 8, 11, 6, 4, 12, 7, 14, 6, 14, 6, 14, 12, 6, 5, 9, 9]");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 4, (double) 1.0f, 5);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double10 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d, (double) 13);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8644190226895587d + "'", double10 == 0.8644190226895587d);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        poissonDistributionImpl2.reseedRandomGenerator(10L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = poissonDistributionImpl2.sample((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 16, 0.9605336665255937d, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.864649182067619E-63d, 4.139937718785163E-8d);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.21459765022017452d);
        double double3 = poissonDistributionImpl1.cumulativeProbability((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.probability((double) ' ');
        double double10 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double12 = poissonDistributionImpl2.cumulativeProbability((double) '#');
        double double15 = poissonDistributionImpl2.cumulativeProbability(3, 5);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 7, 14, 7, 12, 10, 6, 9, 10, 12]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7253747334040217E-8d + "'", double8 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999998333297d + "'", double12 == 0.9999999998333297d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.06431656716352042d + "'", double15 == 0.06431656716352042d);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (int) (byte) 10);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(3);
        double double6 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1);
        double double8 = poissonDistributionImpl2.cumulativeProbability(0.9097049102288645d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.01991630962237073d + "'", double4 == 0.01991630962237073d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.539992976248491E-5d + "'", double8 == 4.539992976248491E-5d);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.11259903214901994d);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl2.cumulativeProbability(3.720075976020836E-44d, 5.551115123125783E-17d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1251100357211333d + "'", double5 == 0.1251100357211333d);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (int) (byte) 10);
        double double4 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(0.0022699964881242427d, (double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 17, 5);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) (short) 100, (int) (short) 10);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.7768236335766507d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double12 = poissonDistributionImpl2.probability(4);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.166666666662508E-50d + "'", double12 == 4.166666666662508E-50d);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double8 = poissonDistributionImpl2.probability(0.5420702855281083d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.12381112453801489d, (int) (byte) 1);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability((int) (byte) 10);
        double double6 = poissonDistributionImpl2.getMean();
        double double8 = poissonDistributionImpl2.probability((int) '#');
        double double10 = poissonDistributionImpl2.cumulativeProbability(8);
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1251100357211333d + "'", double5 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.3936204059180545E-10d + "'", double8 == 4.3936204059180545E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.3328196787507197d + "'", double10 == 0.3328196787507197d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5830397501930291d + "'", double12 == 0.5830397501930291d);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        double double8 = poissonDistributionImpl2.cumulativeProbability((double) 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999966023268753d, 4.5397868640106864E-5d);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        poissonDistributionImpl2.reseedRandomGenerator(10L);
        double double7 = poissonDistributionImpl2.cumulativeProbability(0.7357588823428858d, (double) 10);
        double double9 = poissonDistributionImpl2.probability(11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7253747208734183E-8d + "'", double7 == 1.7253747208734183E-8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0105598679321445E-93d + "'", double9 == 1.0105598679321445E-93d);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.720075976020796E-42d, (double) 12, 17);
        double double5 = poissonDistributionImpl3.cumulativeProbability(93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484845E-4d, 0.001210542580544489d);
        int[] intArray4 = poissonDistributionImpl2.sample(4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0]");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.562816469418554d, 100.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.17315155134233906d, 98);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (int) (byte) 10);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(3);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.01991630962237073d + "'", double4 == 0.01991630962237073d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double12 = poissonDistributionImpl2.getMean();
        double double14 = poissonDistributionImpl2.normalApproximateProbability(9);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl2.cumulativeProbability(10007188, (int) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.43718353058144593d + "'", double14 == 0.43718353058144593d);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample(98);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 8, 7, 5, 9, 14, 12, 8, 13, 5, 13, 12, 8, 14, 7, 11, 14, 11, 9, 6, 9, 11, 10, 4, 8, 8, 12, 7, 8, 10, 11, 10, 6, 15, 20, 13, 12, 7, 12, 12, 6, 7, 3, 8, 8, 6, 15, 11, 14, 6, 12, 8, 6, 5, 7, 9, 11, 11, 7, 5, 7, 12, 11, 13, 6, 12, 17, 11, 6, 10, 6, 14, 7, 9, 13, 10, 17, 3, 8, 6, 12, 11, 8, 10, 17, 8, 6, 5, 11, 7, 13, 10, 8, 9, 6, 16, 10, 9]");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6524402995507083E-19d, (double) 0L);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.9999999999994409d);
        int int5 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.probability((int) (short) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability((int) (short) 10, 2);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1251100357211333d + "'", double6 == 0.1251100357211333d);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        int int3 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (int) '#');
        int int3 = poissonDistributionImpl2.sample();
        int int4 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 16, (double) 100.0f);
        double double5 = poissonDistributionImpl2.cumulativeProbability(2, 17);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.916992570250814d + "'", double5 == 0.916992570250814d);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.628682978044818E-21d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.09007922571921603d);
        int int4 = poissonDistributionImpl1.sample();
        double double6 = poissonDistributionImpl1.cumulativeProbability(100);
        int int8 = poissonDistributionImpl1.inverseCumulativeProbability(1.0E-12d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability(1);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0, (int) (byte) 100);
        int[] intArray9 = poissonDistributionImpl2.sample(11);
        double double11 = poissonDistributionImpl2.normalApproximateProbability(5);
        double double13 = poissonDistributionImpl2.cumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7357588823428858d + "'", double4 == 0.7357588823428858d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 0, 1, 0, 2, 1, 0, 0, 2, 2]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999966023268753d + "'", double11 == 0.9999966023268753d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7357588823428858d + "'", double13 == 0.7357588823428858d);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 0.01991630962237073d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 7);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9226355382573108d, 0.9999999827462528d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000);
        int int2 = poissonDistributionImpl1.sample();
        double double4 = poissonDistributionImpl1.cumulativeProbability(4.3936204059180545E-10d);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9997830 + "'", int2 == 9997830);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl2.cumulativeProbability(1.558895929802312E-11d, 0.7768236335766507d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 8, 13, 14, 11, 6, 15, 9, 12, 4]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability(1);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0, (int) (byte) 100);
        double double9 = poissonDistributionImpl2.normalApproximateProbability(6);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl2.cumulativeProbability(115, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7357588823428858d + "'", double4 == 0.7357588823428858d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9999999810104375d + "'", double9 == 0.9999999810104375d);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.628682978044818E-21d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.09007922571921603d);
        int int4 = poissonDistributionImpl1.sample();
        double double7 = poissonDistributionImpl1.cumulativeProbability(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (short) -1);
        double double6 = poissonDistributionImpl2.probability(17);
        double double8 = poissonDistributionImpl2.cumulativeProbability(4);
        double double10 = poissonDistributionImpl2.cumulativeProbability(0.5829943502632666d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0342773236060213E-15d + "'", double6 == 1.0342773236060213E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9963401531726563d + "'", double8 == 0.9963401531726563d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.36787944117146065d + "'", double10 == 0.36787944117146065d);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.probability(7);
        poissonDistributionImpl2.reseedRandomGenerator((long) '4');
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 9, 8, 8, 9, 15, 12, 6, 7, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 'a');
        poissonDistributionImpl3.reseedRandomGenerator((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = poissonDistributionImpl3.sample((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06431656716352042d, 3.720075976020796E-42d);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.4579297144718917d, 1.6139301142603509E-37d, (int) (short) 1);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double12 = poissonDistributionImpl2.getMean();
        double double14 = poissonDistributionImpl2.normalApproximateProbability(9);
        double double16 = poissonDistributionImpl2.probability(93);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.43718353058144593d + "'", double14 == 0.43718353058144593d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.924706844651847E-56d + "'", double16 == 3.924706844651847E-56d);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        double double7 = poissonDistributionImpl2.probability(13);
        int int8 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.cumulativeProbability((int) (short) 1, 1);
        int[] intArray13 = poissonDistributionImpl2.sample(16);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.07290794622443657d + "'", double7 == 0.07290794622443657d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.5399929762484866E-4d + "'", double11 == 4.5399929762484866E-4d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[8, 13, 13, 9, 13, 13, 10, 10, 11, 10, 11, 14, 8, 7, 9, 7]");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double12 = poissonDistributionImpl2.getMean();
        double double14 = poissonDistributionImpl2.normalApproximateProbability(9);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 104);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.43718353058144593d + "'", double14 == 0.43718353058144593d);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.07290794622443657d, 4.166666666662508E-50d);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (int) (byte) 10);
        int[] intArray4 = poissonDistributionImpl2.sample(15);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[37, 39, 29, 25, 34, 28, 33, 30, 29, 26, 31, 28, 21, 36, 27]");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0.9857223864029524d, 0);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(0);
        int[] intArray7 = poissonDistributionImpl3.sample(16);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        double double12 = poissonDistributionImpl3.probability((double) 1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0013315596295692678d + "'", double5 == 0.0013315596295692678d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[12, 11, 5, 5, 7, 9, 12, 8, 8, 6, 11, 12, 8, 8, 12, 5]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999999994409d + "'", double10 == 0.9999999999994409d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.5399929762484845E-4d + "'", double12 == 4.5399929762484845E-4d);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 0);
        double double13 = poissonDistributionImpl2.normalApproximateProbability(14);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0013315596295692678d + "'", double11 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9226355382573108d + "'", double13 == 0.9226355382573108d);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6524402995507083E-19d, (double) 0L);
        double double5 = poissonDistributionImpl2.cumulativeProbability(4, 15);
        double double6 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.6524402995507083E-19d + "'", double6 == 2.6524402995507083E-19d);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.probability(100);
        int[] intArray9 = poissonDistributionImpl2.sample(7);
        double double11 = poissonDistributionImpl2.cumulativeProbability(10);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.864649182067619E-63d + "'", double7 == 4.864649182067619E-63d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[16, 9, 12, 6, 10, 14, 10]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5830397501930291d + "'", double11 == 0.5830397501930291d);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.067085962879032d);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 52, 0.052077104446026264d, (int) (short) -1);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.007091108993195285d, 4.993992273873336E-4d);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) -1, 8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 'a');
        poissonDistributionImpl3.reseedRandomGenerator((long) 'a');
        int int11 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5397868640106864E-5d, 9997830);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0.0f, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (double) 10000000, 7);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double7 = poissonDistributionImpl3.probability((int) (byte) 100);
        int int8 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator((long) 0);
        double double12 = poissonDistributionImpl3.probability(2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999546021313444d + "'", double5 == 0.9999546021313444d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.030530024166506E-9d + "'", double12 == 1.030530024166506E-9d);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        int int7 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.cumulativeProbability(93);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 18 + "'", int7 == 18);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 98, (double) 2);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.003594758625082517d);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(0.7711920512296193d);
        double double8 = poissonDistributionImpl2.probability(15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03471806963068409d + "'", double8 == 0.03471806963068409d);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 6, 4.5399929762484845E-4d, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability(0.11259903214901994d);
        double double7 = poissonDistributionImpl3.probability(10007188);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 115, 100);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, 100.0d, 100);
        int[] intArray5 = poissonDistributionImpl3.sample(11);
        double double7 = poissonDistributionImpl3.cumulativeProbability(0.9999999998333297d);
        int[] intArray9 = poissonDistributionImpl3.sample((int) (short) 10);
        int int10 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.999999982746253d + "'", double7 == 0.999999982746253d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5420702855281083d, 1.0251066712595435E-50d);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.308537538725987d, 11);
        double double4 = poissonDistributionImpl2.cumulativeProbability(5);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999990795857124d + "'", double4 == 0.9999990795857124d);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.09478033009176766d, 0.9999999998333297d, 16);
        double double6 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.7915110764651542d);
        double double8 = poissonDistributionImpl3.probability(93);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9097049102288645d + "'", double6 == 0.9097049102288645d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.375063975439661E-240d + "'", double8 == 5.375063975439661E-240d);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) (byte) -1);
        double double10 = poissonDistributionImpl2.normalApproximateProbability(104);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.720075976020796E-42d, 52);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double10 = poissonDistributionImpl2.cumulativeProbability(1.7253747334040217E-8d);
        double double11 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.003594758625082517d);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(0.003594758625082517d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(0.9394292419979411d, 4.5399929762484854E-5d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        double double12 = poissonDistributionImpl2.getMean();
        int int13 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5829943502632666d, 3.7200759760208177E-44d, 0);
        double double5 = poissonDistributionImpl3.probability(1.0E-12d);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = poissonDistributionImpl3.inverseCumulativeProbability((double) 88);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double8 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1, (int) (short) 100);
        int int9 = poissonDistributionImpl3.sample();
        double double10 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.7200759760208177E-44d + "'", double5 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9605336665255937d + "'", double8 == 0.9605336665255937d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 108 + "'", int9 == 108);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 14, 100.0d, (int) (short) 0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 1.0137771196302933E-7d, (-1));
        double double5 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.9394292419979411d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 5, 8, 7, 11, 13, 11, 9, 7, 6]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 16);
        poissonDistributionImpl2.reseedRandomGenerator((long) 0);
        double double9 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0013315596295692678d + "'", double9 == 0.0013315596295692678d);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, 0.0d);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.4579297144718917d, 93);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0.9857223864029524d, 0);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(0);
        int[] intArray7 = poissonDistributionImpl3.sample(16);
        double double8 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.normalApproximateProbability((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl3.cumulativeProbability(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0013315596295692678d + "'", double5 == 0.0013315596295692678d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[9, 9, 13, 9, 13, 12, 12, 10, 10, 9, 8, 11, 6, 11, 8, 12]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999999994409d + "'", double10 == 0.9999999999994409d);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double5 = poissonDistributionImpl2.getMean();
        int int6 = poissonDistributionImpl2.sample();
        double double8 = poissonDistributionImpl2.probability(10007188);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 12, 18, 11, 6, 4, 14, 9, 6, 12]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 17, (double) (byte) 1);
        double double4 = poissonDistributionImpl2.probability((double) 12);
        double double6 = poissonDistributionImpl2.cumulativeProbability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.050355150707439886d + "'", double4 == 0.050355150707439886d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.04820460841292379d + "'", double6 == 0.04820460841292379d);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        double double11 = poissonDistributionImpl2.normalApproximateProbability((int) (short) -1);
        int[] intArray13 = poissonDistributionImpl2.sample(4);
        double double15 = poissonDistributionImpl2.probability(2.0876756987846234E-153d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 9, 18, 1, 11, 6, 7, 5, 7, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.49456394057024E-4d + "'", double11 == 4.49456394057024E-4d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[8, 5, 11, 13]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        double double8 = poissonDistributionImpl3.probability((double) (-1L));
        int[] intArray10 = poissonDistributionImpl3.sample((int) (byte) 10);
        double double12 = poissonDistributionImpl3.normalApproximateProbability(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.8554009815953605d + "'", double12 == 0.8554009815953605d);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability(1);
        double double6 = poissonDistributionImpl2.cumulativeProbability(0.04109455799120611d);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7357588823428858d + "'", double4 == 0.7357588823428858d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.36787944117146065d + "'", double6 == 0.36787944117146065d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability((int) (byte) 10);
        double double6 = poissonDistributionImpl2.getMean();
        double double8 = poissonDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) 2);
        int[] intArray12 = poissonDistributionImpl2.sample(10);
        double double13 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1251100357211333d + "'", double5 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0027693957155115767d + "'", double10 == 0.0027693957155115767d);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[6, 10, 11, 11, 13, 10, 8, 8, 11, 8]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d, (double) (byte) 10);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.06305545800345122d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double10 = poissonDistributionImpl2.cumulativeProbability(1.7253747334040217E-8d);
        int int11 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 14);
        int int14 = poissonDistributionImpl2.sample();
        int int15 = poissonDistributionImpl2.sample();
        double double17 = poissonDistributionImpl2.probability((double) 1.0f);
        double double19 = poissonDistributionImpl2.probability(10007188);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.5399929762484845E-4d + "'", double17 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 3.7200759760208177E-44d);
        double double4 = poissonDistributionImpl2.probability((int) (byte) 100);
        double double6 = poissonDistributionImpl2.probability(6);
        int[] intArray8 = poissonDistributionImpl2.sample(35);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.986240122026397E-18d + "'", double6 == 2.986240122026397E-18d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl2.cumulativeProbability(100, (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        double double4 = poissonDistributionImpl2.probability(14);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.3766198212623335E-120d + "'", double4 == 2.3766198212623335E-120d);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06431656716352042d);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1L, (double) (byte) -1, (int) (short) 10);
        double double4 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((double) 1);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.normalApproximateProbability(11);
        int int12 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = poissonDistributionImpl2.cumulativeProbability(4.539992976248491E-5d, 0.562816469418554d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 8, 8, 16, 7, 10, 11, 7, 10, 12]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484845E-4d + "'", double8 == 4.5399929762484845E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6823718520013758d + "'", double11 == 0.6823718520013758d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, 0.12381112453801489d, 2);
    }
}
