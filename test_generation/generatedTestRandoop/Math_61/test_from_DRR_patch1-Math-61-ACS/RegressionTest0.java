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
            double double6 = poissonDistributionImpl3.cumulativeProbability((double) 1L, (-1.0d));
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
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 'a', (int) (byte) 10);
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
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0.0f, 4.5399929762484845E-4d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) -1, (double) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(10000000, 0);
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        java.lang.Class<?> wildcardClass9 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(10, 1);
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = poissonDistributionImpl2.inverseCumulativeProbability((double) ' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[5, 15, 13, 15, 17, 5, 11, 8, 9, 14]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[19, 11, 12, 10, 6, 8, 5, 6, 6, 7]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.probability(6);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability((int) '#', 4);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.166772188917836E-35d + "'", double5 == 5.166772188917836E-35d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        int[] intArray5 = poissonDistributionImpl3.sample(15);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[4, 11, 12, 14, 12, 6, 13, 13, 9, 13, 9, 12, 10, 8, 11]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double6 = poissonDistributionImpl2.cumulativeProbability(0.0d, 4.5399929762484845E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.539992976248491E-5d + "'", double6 == 4.539992976248491E-5d);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double8 = poissonDistributionImpl2.cumulativeProbability((double) (short) -1, (double) 11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6967761463031481d + "'", double8 == 0.6967761463031481d);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(7);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = poissonDistributionImpl2.inverseCumulativeProbability((double) 10000000);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.22022064660169965d + "'", double11 == 0.22022064660169965d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) (byte) 100);
        int int3 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) 15);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10, 13);
        java.lang.Class<?> wildcardClass13 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 11, 13, 5, 11, 15, 9, 11, 5, 13]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.40653470814742954d + "'", double12 == 0.40653470814742954d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) '#');
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 5, 11, 9, 9, 9, 13, 6, 5, 12]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, (double) 100.0f, 10000000);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.5727036995171034d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl2.cumulativeProbability(8, (int) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10, 13);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100, 6);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[4, 13, 5, 12, 9, 12, 9, 8, 12, 20]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.40653470814742954d + "'", double12 == 0.40653470814742954d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample(1);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability((double) '#', (double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[13, 8, 5, 11, 5, 14, 10, 9, 10, 5]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[13]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double9 = poissonDistributionImpl2.cumulativeProbability(4.539992976248491E-5d);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = poissonDistributionImpl2.cumulativeProbability((double) 14, (double) (byte) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(7);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.22022064660169965d + "'", double11 == 0.22022064660169965d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(0.5727036995171034d, 4.49456394057024E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-1.0d), 0.9329140369542976d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 0, 13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.normalApproximateProbability(16);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9800836903776293d + "'", double7 == 0.9800836903776293d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        double double4 = poissonDistributionImpl2.cumulativeProbability(9);
        double double6 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999998885745217d + "'", double4 == 0.9999998885745217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double7 = poissonDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, (double) 1, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl3.cumulativeProbability(0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 10,000,000");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.13553557721400844d, 0.0d, 5);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability(10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (5) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double6 = poissonDistributionImpl3.getMean();
        double double8 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.13768510870919E-30d + "'", double8 == 1.13768510870919E-30d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 5, 4.993992273873336E-4d, 10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (double) 100L, 15);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample(1);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 10, 7, 6, 6, 9, 13, 15, 12, 4]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[6]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (double) '4', 10000000);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability((double) (byte) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.404873445868597E-8d + "'", double5 == 9.404873445868597E-8d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 16, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(0.0013315596295692678d, (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, (double) 1, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability((double) 10L);
        double double7 = poissonDistributionImpl3.probability(5);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl3.cumulativeProbability((double) 1.0f, 0.22022064660169965d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        double double9 = poissonDistributionImpl2.probability((double) (byte) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(2147483647);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability(4, 16);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) -1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9626223395392753d + "'", double14 == 0.9626223395392753d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double15 = poissonDistributionImpl2.cumulativeProbability((double) (-1.0f), (double) 100.0f);
        double double16 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 68, (double) 16, 7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) ' ');
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double6 = poissonDistributionImpl2.probability((int) 'a');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.8243984514608465E-153d + "'", double6 == 3.8243984514608465E-153d);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.probability((double) 1L);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(1.0d);
        double double10 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5399929762484845E-4d + "'", double7 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.404873445868597E-8d, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability((double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (10,000,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        int int7 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        poissonDistributionImpl1.reseedRandomGenerator((long) 2147483647);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 9);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 9998694);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[92]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        int int5 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = poissonDistributionImpl2.inverseCumulativeProbability((double) (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 8, 10, 13, 9, 8, 12, 13, 6, 15]");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(1.7253747334040217E-8d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9);
        double double3 = poissonDistributionImpl1.normalApproximateProbability((int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double14 = poissonDistributionImpl2.normalApproximateProbability(4);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.04099516050019131d + "'", double14 == 0.04099516050019131d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        int[] intArray5 = poissonDistributionImpl3.sample(13);
        int[] intArray7 = poissonDistributionImpl3.sample((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 0.04099516050019131d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = poissonDistributionImpl3.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        int int12 = poissonDistributionImpl2.sample();
        int int13 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        int[] intArray5 = poissonDistributionImpl2.sample((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = intArray5.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9);
        double double3 = poissonDistributionImpl1.probability(0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a');
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.166772188917836E-35d, (double) 9998694);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability((double) (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        double double6 = poissonDistributionImpl3.cumulativeProbability(0, (int) ' ');
        double double8 = poissonDistributionImpl3.probability(100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.probability((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9964116947845713d + "'", double4 == 0.9964116947845713d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double10 = poissonDistributionImpl2.probability(9998694);
        double double12 = poissonDistributionImpl2.cumulativeProbability(100);
        double double14 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        int[] intArray16 = poissonDistributionImpl2.sample(10);
        double double18 = poissonDistributionImpl2.probability(0.07290794622443657d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 11, 9, 7, 13, 9, 9, 9, 8, 12]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[11, 11, 14, 14, 10, 12, 10, 11, 8, 9]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 1);
        int int14 = poissonDistributionImpl2.sample();
        double double15 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) (byte) 100);
        double double3 = poissonDistributionImpl2.getMean();
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', 0.7854023497798255d, 6);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(0.7854023497798255d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((int) 'a');
        double double11 = poissonDistributionImpl2.cumulativeProbability((int) (short) 0, 6);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 12, 17, 15, 14, 9, 5, 8, 9, 15]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.719682636442159E-60d + "'", double8 == 4.719682636442159E-60d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.130141420882483d + "'", double11 == 0.130141420882483d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 1);
        int int14 = poissonDistributionImpl2.sample();
        int int16 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass17 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(13);
        double double6 = poissonDistributionImpl2.probability((int) (short) 1);
        int int7 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 1, 0, 0, 0, 2, 2, 2, 2, 0, 1]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.36787944117144233d + "'", double6 == 0.36787944117144233d);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 14, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 5);
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
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9800836903776293d, 0.6967761463031481d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability(4, 16);
        double double15 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9626223395392753d + "'", double14 == 0.9626223395392753d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 1);
        int int15 = poissonDistributionImpl2.inverseCumulativeProbability(0.9964116947845713d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(4.5399929762484854E-5d);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 11, 11, 10, 11, 10, 12, 9, 9, 7]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(7);
        double double13 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl2.cumulativeProbability(9.404873445868597E-8d, 0.01891663740103536d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.22022064660169965d + "'", double11 == 0.22022064660169965d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.562816469418554d + "'", double13 == 0.562816469418554d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample((int) 'a');
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 12, 12, 6, 10, 23, 5, 11, 6, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[12, 12, 16, 10, 7, 4, 12, 15, 11, 16, 10, 10, 9, 10, 6, 13, 7, 10, 12, 11, 7, 10, 16, 15, 10, 8, 13, 10, 9, 8, 15, 9, 8, 15, 10, 2, 8, 11, 10, 14, 9, 11, 11, 11, 15, 14, 12, 4, 7, 11, 5, 12, 8, 8, 7, 7, 12, 12, 6, 9, 8, 13, 9, 8, 10, 10, 12, 12, 8, 8, 11, 15, 4, 7, 12, 8, 7, 13, 7, 12, 13, 10, 8, 11, 14, 18, 8, 7, 15, 11, 11, 8, 12, 8, 15, 9, 7]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (int) (short) 10);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(7);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.21459765022017452d + "'", double4 == 0.21459765022017452d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.40653470814742954d, (double) 1);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1), 0.7854023497798255d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.13553557721400844d, 0.0d, 5);
        double double5 = poissonDistributionImpl3.probability(10000000);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl3.cumulativeProbability(4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (5) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability(1.0E-12d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.7200759760208177E-44d + "'", double5 == 3.7200759760208177E-44d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(100.0d, 4.5399929762484854E-5d);
        int[] intArray4 = poissonDistributionImpl2.sample((int) '4');
        double double6 = poissonDistributionImpl2.normalApproximateProbability(5);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[94, 83, 107, 97, 110, 91, 100, 84, 116, 102, 101, 100, 99, 102, 85, 96, 107, 97, 93, 113, 95, 92, 96, 80, 102, 118, 87, 111, 117, 123, 109, 120, 92, 93, 87, 92, 104, 97, 104, 117, 105, 84, 102, 98, 88, 86, 90, 99, 95, 92, 96, 81]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-1.0d), 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 6, (double) '#');
        double double16 = poissonDistributionImpl2.cumulativeProbability((double) (short) 1);
        int int17 = poissonDistributionImpl2.sample();
        java.lang.Class<?> wildcardClass18 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9329140369542976d + "'", double14 == 0.9329140369542976d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.993992273873336E-4d + "'", double16 == 4.993992273873336E-4d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.13553557721400844d, 0.0d, 5);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability(0.8748899642788661d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (5) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability((double) 0.0f);
        int int8 = poissonDistributionImpl2.sample();
        int int10 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        int int11 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5399929762484854E-5d + "'", double7 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1, 0.562816469418554d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(100.0d, 4.5399929762484854E-5d);
        double double4 = poissonDistributionImpl2.probability(15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.844803008344096E-26d + "'", double4 == 2.844803008344096E-26d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, 0.9999998885745217d, 13);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1, 0.21459765022017452d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.01891663740103536d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) ' ');
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(13);
        double double6 = poissonDistributionImpl2.probability((int) (short) 1);
        double double9 = poissonDistributionImpl2.cumulativeProbability(8, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 1, 0, 1, 3, 2, 0, 0, 0, 1, 4, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.36787944117144233d + "'", double6 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.123994076709607E-6d + "'", double9 == 9.123994076709607E-6d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, (double) 'a', 1);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.40653470814742954d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999546021313444d + "'", double5 == 0.9999546021313444d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.probability((int) (byte) 0);
        double double8 = poissonDistributionImpl3.cumulativeProbability(0.40653470814742954d, (double) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2340980408667956E-4d + "'", double5 == 1.2340980408667956E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9998765901959134d + "'", double8 == 0.9998765901959134d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.cumulativeProbability((int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993992273873336E-4d + "'", double3 == 4.993992273873336E-4d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0);
        double double8 = poissonDistributionImpl2.probability((int) (byte) 0);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        poissonDistributionImpl2.reseedRandomGenerator((long) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484854E-5d + "'", double8 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1.0f), 4.864649182067619E-63d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0.0f, 1.0E-12d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double7 = poissonDistributionImpl2.cumulativeProbability(14, (int) '#');
        int[] intArray9 = poissonDistributionImpl2.sample((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 13, 11, 6, 8, 5, 19, 9, 10, 8]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.13553557721400844d + "'", double7 == 0.13553557721400844d);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[9, 8, 10, 12, 11, 10, 6, 13, 12, 9, 9, 12, 13, 13, 8, 7, 14, 9, 11, 11, 9, 12, 9, 4, 13, 4, 11, 15, 9, 7, 3, 7, 8, 8, 10, 12, 9, 12, 14, 6, 13, 8, 10, 11, 9, 12, 10, 10, 11, 7, 16, 11, 8, 13, 8, 9, 9, 8, 5, 14, 12, 3, 5, 16, 11, 8, 15, 13, 6, 6, 10, 8, 18, 8, 9, 11, 13, 12, 13, 7, 10, 12, 14, 8, 15, 8, 8, 6, 7, 11, 10, 9, 7, 7, 6, 11, 10, 9, 9, 8]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double7 = poissonDistributionImpl2.getMean();
        int int8 = poissonDistributionImpl2.sample();
        java.lang.Class<?> wildcardClass9 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 13, (int) (byte) 100);
        double double4 = poissonDistributionImpl2.probability((double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.938428229075368E-5d + "'", double4 == 2.938428229075368E-5d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        double double6 = poissonDistributionImpl2.cumulativeProbability(68);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(0.07290794622443657d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(100.0d, 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) -1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(0.11858007600857041d, 0.22022064660169965d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 13, 9.404873445868597E-8d, 11);
        poissonDistributionImpl3.reseedRandomGenerator((long) 5);
        int int6 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 17 + "'", int6 == 17);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 15, 10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl2.cumulativeProbability((double) 10, 0.11858007600857041d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 7, 10, 4, 9, 5, 6, 10, 8, 7]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double15 = poissonDistributionImpl2.cumulativeProbability(4, (int) (short) 10);
        double double17 = poissonDistributionImpl2.normalApproximateProbability(2147483647);
        double double19 = poissonDistributionImpl2.cumulativeProbability(0.6047660235173288d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5727036995171034d + "'", double15 == 0.5727036995171034d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.539992976248491E-5d + "'", double19 == 4.539992976248491E-5d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
        double double12 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0, (double) '#');
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 11, 14, 12, 6, 12, 10, 5, 13, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999998333297d + "'", double12 == 0.9999999998333297d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        double double11 = poissonDistributionImpl2.cumulativeProbability(4.539992976248491E-5d);
        double double12 = poissonDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass13 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double13 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d, (double) 1.0f);
        int int3 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9998765901959134d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, 0.9999998885745217d, 13);
        double double6 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 10000000);
        double double8 = poissonDistributionImpl3.normalApproximateProbability(1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.002089278784083215d + "'", double8 == 0.002089278784083215d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double10 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl2.cumulativeProbability(0.13553557721400844d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[14, 13, 13, 15, 13, 8, 7, 9, 9, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double14 = poissonDistributionImpl2.normalApproximateProbability(12);
        int int15 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7854023497798255d + "'", double14 == 0.7854023497798255d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.cumulativeProbability(100.0d);
        double double5 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(10);
        double double10 = poissonDistributionImpl2.cumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.562816469418554d + "'", double8 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.993992273873336E-4d + "'", double10 == 4.993992273873336E-4d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) 13);
        int int6 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9261578838188795d + "'", double5 == 0.9261578838188795d);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1.0f), 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.normalApproximateProbability((int) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9999999999999996d + "'", double9 == 0.9999999999999996d);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10, 13);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl2.cumulativeProbability(9, 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 9, 13, 6, 7, 13, 9, 9, 7, 12]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.40653470814742954d + "'", double12 == 0.40653470814742954d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 1);
        double double16 = poissonDistributionImpl2.cumulativeProbability((double) (-1), (double) (short) 0);
        double double18 = poissonDistributionImpl2.cumulativeProbability(18);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.539992976248491E-5d + "'", double16 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9928134953961462d + "'", double18 == 0.9928134953961462d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10, 13);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 100);
        double double16 = poissonDistributionImpl2.probability((double) 7);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 13, 6, 7, 14, 10, 9, 11, 13, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.40653470814742954d + "'", double12 == 0.40653470814742954d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.09007922571921603d + "'", double16 == 0.09007922571921603d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', 0.8748899642788661d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double9 = poissonDistributionImpl2.cumulativeProbability(4.539992976248491E-5d);
        double double11 = poissonDistributionImpl2.cumulativeProbability(13);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8644644226193212d + "'", double11 == 0.8644644226193212d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, (double) 10.0f);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double15 = poissonDistributionImpl2.cumulativeProbability(4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = poissonDistributionImpl2.inverseCumulativeProbability((double) 11);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5727036995171034d + "'", double15 == 0.5727036995171034d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double9 = poissonDistributionImpl2.probability(4);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.01891663740103536d + "'", double9 == 0.01891663740103536d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (-1));
        int[] intArray4 = poissonDistributionImpl2.sample((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(10);
        java.lang.Class<?> wildcardClass9 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.562816469418554d + "'", double8 == 0.562816469418554d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double6 = poissonDistributionImpl3.getMean();
        double double8 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double9 = poissonDistributionImpl3.getMean();
        int int11 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = poissonDistributionImpl3.sample((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.13768510870919E-30d + "'", double8 == 1.13768510870919E-30d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = poissonDistributionImpl2.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.22022064660169965d, (double) 0.0f);
        int[] intArray4 = poissonDistributionImpl2.sample((int) '#');
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0]");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8748899642788661d, (int) (byte) 10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.404873445868597E-8d, 0.5830397501930291d, (int) (short) -1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(13);
        double double6 = poissonDistributionImpl2.cumulativeProbability(4.952703733862044E-27d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 1, 0, 1, 2, 1, 2, 0, 3, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6321205588285574d + "'", double6 == 0.6321205588285574d);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) (byte) 100);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double10 = poissonDistributionImpl2.probability(9998694);
        double double12 = poissonDistributionImpl2.cumulativeProbability(100);
        double double14 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        int[] intArray16 = poissonDistributionImpl2.sample(10);
        double double19 = poissonDistributionImpl2.cumulativeProbability((int) (byte) -1, 10);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 9, 9, 11, 12, 10, 15, 7, 5, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[9, 16, 11, 11, 15, 13, 16, 13, 12, 11]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5830397501930291d + "'", double19 == 0.5830397501930291d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double7 = poissonDistributionImpl3.probability((double) 0);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl3.cumulativeProbability(68, (int) (short) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.720075976020836E-44d + "'", double7 == 3.720075976020836E-44d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl2.cumulativeProbability((double) (byte) 100, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, (double) 2147483647);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        double double13 = poissonDistributionImpl2.probability((int) ' ');
        double double15 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        double double17 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        double double19 = poissonDistributionImpl2.normalApproximateProbability(16);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7253747334040217E-8d + "'", double13 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.562816469418554d + "'", double15 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9800836903776293d + "'", double19 == 0.9800836903776293d);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.993992273873336E-4d, (double) (short) 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.normalApproximateProbability(0);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[14, 14, 5, 8, 10, 13, 9, 10, 5, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0013315596295692678d + "'", double11 == 0.0013315596295692678d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        double double6 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 10, 100);
        double double8 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9964116947915089d + "'", double8 == 0.9964116947915089d);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0);
        double double8 = poissonDistributionImpl2.probability((int) (byte) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability((double) (-1), 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484854E-5d + "'", double8 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double7 = poissonDistributionImpl3.probability((double) 0);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(0.932914037120968d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.720075976020836E-44d + "'", double7 == 3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999998333297d, 0.1251100357211333d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        int int12 = poissonDistributionImpl2.sample();
        int int14 = poissonDistributionImpl2.inverseCumulativeProbability(4.719682636442159E-60d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.22022064660169965d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 10000000);
        double double17 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, 0.9999998885745217d, 13);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(0.0013864542336563224d, (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        int int4 = poissonDistributionImpl2.sample();
        int int5 = poissonDistributionImpl2.sample();
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 6, (double) '#');
        double double16 = poissonDistributionImpl2.cumulativeProbability((double) (short) 1);
        int int17 = poissonDistributionImpl2.sample();
        int[] intArray19 = poissonDistributionImpl2.sample((int) (byte) 10);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9329140369542976d + "'", double14 == 0.9329140369542976d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.993992273873336E-4d + "'", double16 == 4.993992273873336E-4d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[8, 14, 7, 5, 11, 8, 6, 16, 15, 9]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) (byte) 100);
        double double3 = poissonDistributionImpl2.getMean();
        int int4 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 96 + "'", int4 == 96);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.404873445868597E-8d, (double) (short) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(3.720075976020836E-44d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (10,000,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, 0.9999998885745217d, 13);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((double) 7, (double) 0L);
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
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) -1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double7 = poissonDistributionImpl2.getMean();
        int int8 = poissonDistributionImpl2.sample();
        double double10 = poissonDistributionImpl2.cumulativeProbability(12);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7915564763949167d + "'", double10 == 0.7915564763949167d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9964116947845713d, 0.562816469418554d, (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((double) (byte) -1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.probability((int) (byte) -1);
        double double11 = poissonDistributionImpl2.probability((int) (short) 0);
        double double13 = poissonDistributionImpl2.cumulativeProbability(0.0d);
        double double15 = poissonDistributionImpl2.cumulativeProbability(9998694);
        java.lang.Class<?> wildcardClass16 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.5399929762484854E-5d + "'", double11 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.539992976248491E-5d + "'", double13 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.40653470814742954d, 0.6047660235173288d, 12);
        double double6 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.346489669236007E-11d + "'", double6 == 2.346489669236007E-11d);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator((-1L));
        int int10 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double10 = poissonDistributionImpl2.probability(9998694);
        double double12 = poissonDistributionImpl2.cumulativeProbability(100);
        double double14 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        int[] intArray16 = poissonDistributionImpl2.sample(10);
        double double17 = poissonDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass18 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 6, 7, 15, 4, 8, 7, 11, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[9, 11, 10, 8, 13, 9, 16, 15, 13, 9]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 13, 9.404873445868597E-8d, 11);
        poissonDistributionImpl3.reseedRandomGenerator((long) 5);
        double double7 = poissonDistributionImpl3.cumulativeProbability(68);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 9);
        double double4 = poissonDistributionImpl2.cumulativeProbability(15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.3400763612444206E-26d + "'", double4 == 3.3400763612444206E-26d);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 9);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 8);
        poissonDistributionImpl1.reseedRandomGenerator((long) (short) 100);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.probability((double) 1L);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(1.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5399929762484845E-4d + "'", double7 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) ' ');
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double5 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, (double) 1, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability(4.5399929762484854E-5d);
        double double6 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability(4.993992273873336E-4d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 10,000,000");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E7d + "'", double6 == 1.0E7d);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = poissonDistributionImpl1.inverseCumulativeProbability((double) ' ');
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
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.normalApproximateProbability(2147483647);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(0.9928134953961462d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 18 + "'", int11 == 18);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        double double4 = poissonDistributionImpl2.cumulativeProbability(9);
        double double6 = poissonDistributionImpl2.probability(0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999998885745217d + "'", double4 == 0.9999998885745217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 6, (double) '#');
        double double16 = poissonDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double18 = poissonDistributionImpl2.probability((int) (short) 10);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9329140369542976d + "'", double14 == 0.9329140369542976d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.993992273873336E-4d + "'", double16 == 4.993992273873336E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.1251100357211333d + "'", double18 == 0.1251100357211333d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(13);
        double double6 = poissonDistributionImpl2.probability((int) (short) 1);
        double double8 = poissonDistributionImpl2.probability(1);
        int int9 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 2, 2, 0, 1, 0, 1, 0, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.36787944117144233d + "'", double6 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.36787944117144233d + "'", double8 == 0.36787944117144233d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double9 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl2.cumulativeProbability(8, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.130141420882483d, 0.01891663740103536d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability(4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9261578838188795d);
        int int2 = poissonDistributionImpl1.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(13);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8658091863536196d + "'", double3 == 0.8658091863536196d);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl1.cumulativeProbability(2147483647, 7);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability(13);
        int[] intArray9 = poissonDistributionImpl2.sample(96);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.07290794622443657d + "'", double7 == 0.07290794622443657d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10]");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double10 = poissonDistributionImpl2.probability(9998694);
        double double12 = poissonDistributionImpl2.cumulativeProbability(100);
        double double14 = poissonDistributionImpl2.probability((double) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 6, 13, 11, 9, 10, 6, 10, 7, 16]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.864649182067619E-63d + "'", double14 == 4.864649182067619E-63d);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(4.5399929762484854E-5d);
        double double13 = poissonDistributionImpl2.probability(0);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 10, 7, 8, 6, 10, 13, 15, 9, 13]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.5399929762484854E-5d + "'", double13 == 4.5399929762484854E-5d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((int) '#', 18);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        double double9 = poissonDistributionImpl2.probability((double) (byte) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability((double) (byte) 0);
        int[] intArray13 = poissonDistributionImpl2.sample(96);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[6, 8, 10, 0, 16, 5, 4, 15, 15, 10, 5, 11, 9, 13, 12, 15, 11, 11, 7, 18, 7, 10, 14, 8, 10, 6, 6, 7, 9, 9, 12, 11, 12, 9, 12, 13, 15, 6, 9, 8, 11, 15, 6, 6, 11, 14, 7, 9, 7, 15, 13, 11, 9, 4, 13, 9, 16, 10, 5, 2, 16, 7, 7, 9, 14, 9, 11, 17, 5, 7, 13, 14, 12, 13, 8, 8, 8, 11, 9, 8, 6, 11, 12, 7, 4, 15, 6, 11, 9, 8, 10, 10, 12, 10, 7, 4]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double9 = poissonDistributionImpl2.cumulativeProbability(4.539992976248491E-5d);
        double double10 = poissonDistributionImpl2.getMean();
        double double11 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.404873445868597E-8d, 6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999998885745217d, 11);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999998885745217d, 9998694);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double10 = poissonDistributionImpl2.probability(9998694);
        int[] intArray12 = poissonDistributionImpl2.sample((int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 14, 9, 9, 5, 11, 15, 7, 10, 12]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[11, 7, 9, 13, 7, 10, 10, 6, 9, 9, 10, 18, 13, 8, 10, 6, 14, 7, 9, 11, 6, 10, 10, 13, 7, 15, 7, 15, 10, 10, 11, 10]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8658091863536196d, 98);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double4 = poissonDistributionImpl3.getMean();
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9964116947915089d, 9.404873445868597E-8d, 11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 15, 1.483363584418453E-97d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        int int5 = poissonDistributionImpl2.sample();
        double double7 = poissonDistributionImpl2.probability(0.1251100357211333d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 9, 13, 6, 11, 11, 9, 9, 10, 8]");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999998885745217d, 9998694);
        int int3 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.844803008344096E-26d, (int) (short) 100);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double6 = poissonDistributionImpl3.getMean();
        double double8 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.13768510870919E-30d + "'", double8 == 1.13768510870919E-30d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0651960856926313E-15d + "'", double10 == 2.0651960856926313E-15d);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.13768510870919E-30d, (double) (short) 0, 0);
        int int4 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 9);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 1);
        double double6 = poissonDistributionImpl2.cumulativeProbability(4.719682636442159E-60d);
        double double8 = poissonDistributionImpl2.probability(96);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(4, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[111]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.7200759760208177E-44d + "'", double6 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03751294493110752d + "'", double8 == 0.03751294493110752d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability(4, 16);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        double double18 = poissonDistributionImpl2.cumulativeProbability(4.993992273873336E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9626223395392753d + "'", double14 == 0.9626223395392753d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.539992976248491E-5d + "'", double18 == 4.539992976248491E-5d);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.952703733862044E-27d, 0.9999998885745217d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(0.03751294493110752d, 0.0d);
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
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        double double5 = poissonDistributionImpl3.probability(9998694);
        int[] intArray7 = poissonDistributionImpl3.sample(35);
        double double9 = poissonDistributionImpl3.probability((int) (byte) 0);
        int[] intArray11 = poissonDistributionImpl3.sample(9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[11, 14, 11, 8, 11, 5, 7, 9, 9, 11, 15, 10, 14, 13, 7, 9, 14, 10, 10, 14, 7, 6, 7, 12, 11, 6, 6, 16, 4, 9, 13, 14, 5, 7, 10]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertNotNull(intArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[5, 14, 7, 12, 6, 11, 15, 8, 12]");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((int) 'a');
        double double10 = poissonDistributionImpl2.cumulativeProbability(18);
        poissonDistributionImpl2.reseedRandomGenerator((long) 15);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 14, 9, 7, 15, 7, 8, 12, 10, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.719682636442159E-60d + "'", double8 == 4.719682636442159E-60d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9928134953961462d + "'", double10 == 0.9928134953961462d);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        int[] intArray9 = poissonDistributionImpl2.sample((int) 'a');
        double double10 = poissonDistributionImpl2.getMean();
        int[] intArray12 = poissonDistributionImpl2.sample(4);
        double double15 = poissonDistributionImpl2.cumulativeProbability(9.404873445868597E-8d, (double) (short) 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[12, 13, 11, 7, 10, 9, 9, 10, 14, 7, 15, 10, 5, 7, 4, 7, 7, 8, 7, 10, 9, 8, 9, 10, 14, 8, 14, 17, 15, 11, 13, 8, 9, 8, 9, 17, 8, 9, 7, 12, 8, 11, 7, 9, 7, 12, 17, 6, 16, 7, 10, 5, 9, 9, 14, 7, 7, 12, 11, 8, 9, 8, 13, 4, 14, 11, 11, 7, 12, 13, 11, 8, 10, 6, 12, 7, 7, 15, 14, 9, 12, 10, 11, 14, 10, 8, 11, 5, 7, 5, 14, 13, 13, 6, 12, 9, 9]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[13, 16, 4, 12]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5399929762484866E-4d + "'", double15 == 4.5399929762484866E-4d);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double15 = poissonDistributionImpl2.cumulativeProbability(1.0E-12d);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        java.lang.Class<?> wildcardClass18 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.539992976248491E-5d + "'", double15 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.probability(6);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 100);
        int[] intArray9 = poissonDistributionImpl3.sample(11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.166772188917836E-35d + "'", double5 == 5.166772188917836E-35d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[88, 106, 97, 94, 89, 97, 76, 109, 82, 112, 102]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(13);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double8 = poissonDistributionImpl2.probability(13);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double13 = poissonDistributionImpl2.cumulativeProbability((double) 10, (double) 15);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 2, 2, 2, 0, 0, 1, 1, 0, 2, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.907792072437627E-11d + "'", double8 == 5.907792072437627E-11d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 0, 1, 2, 1, 1, 3, 1, 1]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0137769446139089E-7d + "'", double13 == 1.0137769446139089E-7d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (int) (short) 10);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 17, (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability(9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 17");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) 4);
        double double11 = poissonDistributionImpl2.normalApproximateProbability(4);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.029252688076961124d + "'", double9 == 0.029252688076961124d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.04099516050019131d + "'", double11 == 0.04099516050019131d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 68);
        double double5 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 1, (int) 'a');
        int[] intArray7 = poissonDistributionImpl2.sample(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4073778180707197d + "'", double5 == 0.4073778180707197d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.cumulativeProbability((int) (byte) 1);
        double double5 = poissonDistributionImpl1.cumulativeProbability(116);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993992273873336E-4d + "'", double3 == 4.993992273873336E-4d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability((double) 0.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) 13);
        double double11 = poissonDistributionImpl2.cumulativeProbability(4);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5399929762484854E-5d + "'", double7 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.029252688076961124d + "'", double11 == 0.029252688076961124d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample((int) 'a');
        int[] intArray10 = poissonDistributionImpl2.sample((int) 'a');
        double double12 = poissonDistributionImpl2.cumulativeProbability((double) 14);
        double double14 = poissonDistributionImpl2.cumulativeProbability(0.0013864542336563224d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 15, 11, 13, 11, 10, 9, 8, 8, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[5, 13, 18, 10, 11, 16, 12, 10, 7, 11, 11, 5, 5, 7, 20, 11, 9, 11, 10, 10, 7, 8, 12, 9, 15, 10, 14, 15, 13, 7, 12, 6, 17, 9, 12, 7, 11, 11, 10, 12, 13, 12, 16, 8, 5, 7, 8, 14, 18, 11, 9, 8, 7, 7, 15, 4, 12, 16, 11, 7, 7, 9, 7, 8, 16, 6, 9, 7, 16, 10, 7, 11, 13, 7, 12, 20, 8, 20, 6, 14, 11, 11, 9, 7, 11, 9, 12, 11, 3, 6, 12, 14, 15, 7, 11, 9, 6]");
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[13, 13, 18, 9, 13, 16, 12, 9, 10, 10, 12, 13, 5, 12, 8, 7, 8, 12, 14, 13, 9, 13, 9, 7, 14, 15, 14, 4, 13, 13, 12, 12, 15, 18, 8, 6, 11, 7, 11, 13, 9, 18, 9, 6, 8, 10, 13, 6, 10, 9, 5, 9, 10, 10, 5, 12, 8, 11, 9, 9, 10, 10, 8, 3, 10, 12, 9, 15, 6, 9, 9, 8, 7, 10, 9, 10, 15, 8, 6, 11, 11, 11, 11, 10, 13, 11, 14, 8, 5, 11, 7, 6, 13, 6, 6, 13, 5]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9165415270653469d + "'", double12 == 0.9165415270653469d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.539992976248491E-5d + "'", double14 == 4.539992976248491E-5d);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, (double) 96);
        double double4 = poissonDistributionImpl2.probability((-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 12, (double) 9);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) '#');
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
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double11 = poissonDistributionImpl2.probability(0.9962224374422399d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 9, 10, 9, 6, 7, 11, 11, 10, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability((double) 0.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) 13);
        double double11 = poissonDistributionImpl2.cumulativeProbability(4);
        double double13 = poissonDistributionImpl2.cumulativeProbability(13);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5399929762484854E-5d + "'", double7 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.029252688076961124d + "'", double11 == 0.029252688076961124d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8644644226193212d + "'", double13 == 0.8644644226193212d);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int10 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.getMean();
        double double13 = poissonDistributionImpl2.probability((int) (short) -1);
        double double15 = poissonDistributionImpl2.cumulativeProbability(15);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9512595966960308d + "'", double15 == 0.9512595966960308d);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        double double13 = poissonDistributionImpl2.probability((int) ' ');
        double double15 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        double double17 = poissonDistributionImpl2.probability(17);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = poissonDistributionImpl2.cumulativeProbability(18, 15);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7253747334040217E-8d + "'", double13 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.562816469418554d + "'", double15 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.012763996187751522d + "'", double17 == 0.012763996187751522d);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, (double) 1, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability((double) 10L);
        double double7 = poissonDistributionImpl3.probability(5);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability(4.719682636442159E-60d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 10,000,000");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double10 = poissonDistributionImpl2.probability(9998694);
        double double12 = poissonDistributionImpl2.cumulativeProbability(100);
        java.lang.Class<?> wildcardClass13 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[14, 10, 9, 9, 11, 9, 11, 5, 9, 6]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability(13);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        double double10 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.07290794622443657d + "'", double7 == 0.07290794622443657d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.probability(3.8243984514608465E-153d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(11);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.797671619036357d + "'", double5 == 0.797671619036357d);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', 4.5399929762484854E-5d, 9);
        int int4 = poissonDistributionImpl3.sample();
        int int6 = poissonDistributionImpl3.inverseCumulativeProbability(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability(6, 5);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484854E-5d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(17, 2);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 8, 13, 8, 8, 11, 12, 11, 6, 14]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) (byte) 100);
        double double3 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(7, (int) (byte) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.22022064660169965d, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((double) 12, 0.003594758625082517d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, 4.49456394057024E-4d, 8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        double double6 = poissonDistributionImpl2.cumulativeProbability(68);
        double double8 = poissonDistributionImpl2.cumulativeProbability(0.22022064660169965d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.36787944117146065d + "'", double8 == 0.36787944117146065d);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', 0.7854023497798255d, 6);
        double double5 = poissonDistributionImpl3.probability(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.5184117826962625E-29d + "'", double5 == 1.5184117826962625E-29d);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double7 = poissonDistributionImpl3.probability((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl3.cumulativeProbability(9.404873445868597E-8d, 1.5184117826962625E-29d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.720075976020836E-44d + "'", double7 == 3.720075976020836E-44d);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double14 = poissonDistributionImpl2.probability((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl2.cumulativeProbability(9998694, (int) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7253747334040217E-8d + "'", double14 == 1.7253747334040217E-8d);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 12, (double) 9);
        poissonDistributionImpl2.reseedRandomGenerator((long) 2147483647);
        double double6 = poissonDistributionImpl2.probability((double) (short) 1);
        int int7 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.373054823993846E-5d + "'", double6 == 7.373054823993846E-5d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 17 + "'", int7 == 17);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double8 = poissonDistributionImpl2.cumulativeProbability(11);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6967761463031481d + "'", double8 == 0.6967761463031481d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 12, (double) 100.0f, 10000000);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.015191410988288745d + "'", double5 == 0.015191410988288745d);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(4.5399929762484854E-5d);
        double double14 = poissonDistributionImpl2.cumulativeProbability(0.0d, 9.123994076709607E-6d);
        java.lang.Class<?> wildcardClass15 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[13, 9, 10, 11, 8, 11, 7, 8, 14, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.539992976248491E-5d + "'", double14 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.13768510870919E-30d, 0.01891663740103536d);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double8 = poissonDistributionImpl2.probability((-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(0.015191410988288745d, 0.0013315596295692678d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 12);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(100.0d, 4.5399929762484854E-5d);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability(36);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0000383630865278E-13d + "'", double5 == 1.0000383630865278E-13d);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        int int8 = poissonDistributionImpl2.sample();
        int[] intArray10 = poissonDistributionImpl2.sample((int) '4');
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10]");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 14, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double6 = poissonDistributionImpl3.getMean();
        double double8 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double9 = poissonDistributionImpl3.getMean();
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.13768510870919E-30d + "'", double8 == 1.13768510870919E-30d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) 8);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.40653470814742954d);
        double double13 = poissonDistributionImpl2.normalApproximateProbability(8);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0013315596295692678d + "'", double7 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.3328196787507197d + "'", double9 == 0.3328196787507197d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.31762814799862416d + "'", double13 == 0.31762814799862416d);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, (double) 'a', 1);
        double double5 = poissonDistributionImpl3.probability(4.993992273873336E-4d);
        int int7 = poissonDistributionImpl3.inverseCumulativeProbability(7.373054823993846E-5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999998885745217d, 11);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability(9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (11) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double9 = poissonDistributionImpl2.probability((int) (short) 0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0013315596295692678d + "'", double7 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10, 13);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 100);
        double double17 = poissonDistributionImpl2.cumulativeProbability((double) 10L, (double) 'a');
        double double18 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = poissonDistributionImpl2.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 15, 9, 11, 7, 12, 9, 6, 10, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.40653470814742954d + "'", double12 == 0.40653470814742954d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5420702855281083d + "'", double17 == 0.5420702855281083d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(13);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) 14);
        double double10 = poissonDistributionImpl2.cumulativeProbability(1);
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 0, 1, 2, 2, 0, 3, 2, 0, 1, 2, 0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        int[] intArray9 = poissonDistributionImpl2.sample((int) 'a');
        double double10 = poissonDistributionImpl2.getMean();
        int[] intArray12 = poissonDistributionImpl2.sample(4);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = poissonDistributionImpl2.cumulativeProbability(0.5420702855281083d, 3.7200759760208177E-44d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[7, 9, 15, 9, 16, 10, 13, 9, 7, 9, 21, 11, 5, 8, 8, 13, 12, 9, 17, 8, 11, 18, 9, 12, 9, 5, 8, 8, 9, 10, 16, 8, 12, 8, 7, 10, 6, 10, 16, 14, 12, 9, 8, 12, 16, 12, 9, 7, 9, 14, 4, 8, 7, 11, 16, 7, 6, 9, 7, 15, 12, 12, 12, 10, 11, 13, 6, 8, 6, 10, 9, 15, 5, 15, 11, 2, 8, 16, 12, 13, 13, 14, 12, 10, 12, 4, 8, 8, 10, 10, 6, 15, 6, 14, 11, 13, 7]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[9, 5, 8, 13]");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10, 13);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 100);
        double double17 = poissonDistributionImpl2.cumulativeProbability((double) 10L, (double) 'a');
        double double19 = poissonDistributionImpl2.cumulativeProbability((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 5, 7, 13, 11, 4, 14, 7, 4, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.40653470814742954d + "'", double12 == 0.40653470814742954d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5420702855281083d + "'", double17 == 0.5420702855281083d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.539992976248491E-5d + "'", double19 == 4.539992976248491E-5d);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        double double5 = poissonDistributionImpl3.probability((double) 1);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.5399929762484845E-4d + "'", double5 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.04099516050019131d + "'", double7 == 0.04099516050019131d);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-1.0d), 0.21459765022017452d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 0.1251100357211333d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.probability((double) 1L);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(1.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        int[] intArray13 = poissonDistributionImpl2.sample(4);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5399929762484845E-4d + "'", double7 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[16, 9, 12, 6]");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double6 = poissonDistributionImpl2.getMean();
        double double8 = poissonDistributionImpl2.cumulativeProbability((double) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.539992976248491E-5d + "'", double8 == 4.539992976248491E-5d);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double14 = poissonDistributionImpl2.probability((int) ' ');
        int int16 = poissonDistributionImpl2.inverseCumulativeProbability(2.938428229075368E-5d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7253747334040217E-8d + "'", double14 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) 4);
        double double11 = poissonDistributionImpl2.normalApproximateProbability(4);
        poissonDistributionImpl2.reseedRandomGenerator((long) 35);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.029252688076961124d + "'", double9 == 0.029252688076961124d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.04099516050019131d + "'", double11 == 0.04099516050019131d);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.probability(0.01891663740103536d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(7);
        double double14 = poissonDistributionImpl2.cumulativeProbability(0.01891663740103536d, (double) (byte) 10);
        int[] intArray16 = poissonDistributionImpl2.sample((int) 'a');
        java.lang.Class<?> wildcardClass17 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.22022064660169965d + "'", double11 == 0.22022064660169965d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5829943502632666d + "'", double14 == 0.5829943502632666d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int10 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.getMean();
        double double13 = poissonDistributionImpl2.probability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = poissonDistributionImpl2.cumulativeProbability(0.6321205588285574d, 1.2340980408667956E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) (-1), 7);
        double double4 = poissonDistributionImpl3.getMean();
        int int5 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.404873445868597E-8d, 0.06680720126885803d);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999998333297d, 0.40653470814742954d, (-1));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 6, (double) '#');
        double double17 = poissonDistributionImpl2.cumulativeProbability(10, 10);
        int int18 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9329140369542976d + "'", double14 == 0.9329140369542976d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.12511003572113744d + "'", double17 == 0.12511003572113744d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) '#');
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 35, (double) 11, 10000000);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, (double) 1, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability((double) 10L);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(68);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (short) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, 0.9999999998333297d);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, 0.5829943502632666d, 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability((double) 0.0f);
        int int8 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(100, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5399929762484854E-5d + "'", double7 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (double) 100.0f, 100);
        int int4 = poissonDistributionImpl3.sample();
        double double6 = poissonDistributionImpl3.probability((double) 116);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39 + "'", int4 == 39);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.4769857099748101E-30d + "'", double6 == 1.4769857099748101E-30d);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, (double) (-1L), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.09007922571921603d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (32) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        double double5 = poissonDistributionImpl3.probability((double) 1);
        int int7 = poissonDistributionImpl3.inverseCumulativeProbability(0.31762814799862416d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.5399929762484845E-4d + "'", double5 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, (double) 35, (int) (short) -1);
        double double4 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double10 = poissonDistributionImpl2.probability(9998694);
        double double12 = poissonDistributionImpl2.cumulativeProbability(100);
        double double14 = poissonDistributionImpl2.cumulativeProbability(35);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[15, 12, 12, 14, 6, 8, 6, 14, 13, 7]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9999999998333297d + "'", double14 == 0.9999999998333297d);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0);
        double double8 = poissonDistributionImpl2.probability((int) (byte) 0);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        double double11 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl2.cumulativeProbability(5, (int) (short) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484854E-5d + "'", double8 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) (-1.0f), 11);
        double double4 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) 9);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability(4.539992976248491E-5d, 0.9964116947845713d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(10);
        int[] intArray10 = poissonDistributionImpl2.sample(35);
        poissonDistributionImpl2.reseedRandomGenerator((long) 33);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.562816469418554d + "'", double8 == 0.562816469418554d);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[16, 14, 6, 5, 10, 12, 9, 13, 10, 10, 10, 11, 11, 12, 13, 11, 12, 10, 8, 9, 12, 15, 15, 7, 18, 13, 12, 13, 9, 11, 7, 14, 14, 9, 9]");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 13, 9.404873445868597E-8d, 11);
        double double5 = poissonDistributionImpl3.probability((double) 14);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability(1.4769857099748101E-30d, 5.907792072437627E-11d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.10208697037352438d + "'", double5 == 0.10208697037352438d);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.probability((double) 1L);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(1.0d);
        int[] intArray11 = poissonDistributionImpl2.sample((int) (short) 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5399929762484845E-4d + "'", double7 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(intArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[8]");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9261578838188795d);
        double double3 = poissonDistributionImpl1.probability(100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9782167886654126E-162d + "'", double3 == 1.9782167886654126E-162d);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.932914037120968d, 12);
        int int3 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.probability((double) 1L);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(1.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double13 = poissonDistributionImpl2.probability(0.932914037120968d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5399929762484845E-4d + "'", double7 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(13);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = poissonDistributionImpl2.inverseCumulativeProbability((double) 18);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[2, 0, 2, 3, 2, 1, 2, 2, 1, 3, 1, 0, 2]");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.40653470814742954d, 0.6047660235173288d, 12);
        double double5 = poissonDistributionImpl3.probability(5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 6.162417552208618E-5d + "'", double5 == 6.162417552208618E-5d);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(13);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) 14);
        double double10 = poissonDistributionImpl2.cumulativeProbability(1);
        double double13 = poissonDistributionImpl2.cumulativeProbability(0.0d, 1.0d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[2, 0, 3, 0, 0, 2, 1, 2, 0, 2, 0, 1, 1]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8160602794142788d + "'", double10 == 0.8160602794142788d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8160602794142788d + "'", double13 == 0.8160602794142788d);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double10 = poissonDistributionImpl2.cumulativeProbability(16, (int) ' ');
        double double12 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double14 = poissonDistributionImpl2.probability(13);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.04874039593176138d + "'", double10 == 0.04874039593176138d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0013315596295692678d + "'", double12 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.07290794622443657d + "'", double14 == 0.07290794622443657d);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (-1));
        double double4 = poissonDistributionImpl2.probability((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = poissonDistributionImpl2.inverseCumulativeProbability(0.6967761463031481d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability((double) 0.0f);
        poissonDistributionImpl2.reseedRandomGenerator((long) 13);
        double double11 = poissonDistributionImpl2.cumulativeProbability(4);
        double double13 = poissonDistributionImpl2.normalApproximateProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5399929762484854E-5d + "'", double7 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.029252688076961124d + "'", double11 == 0.029252688076961124d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(100.0d, 4.5399929762484854E-5d);
        int[] intArray4 = poissonDistributionImpl2.sample((int) '4');
        int[] intArray6 = poissonDistributionImpl2.sample(4);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[106, 115, 90, 92, 109, 112, 103, 99, 92, 98, 114, 98, 101, 86, 97, 109, 90, 104, 89, 108, 105, 105, 83, 95, 97, 84, 89, 104, 99, 95, 106, 100, 85, 116, 93, 103, 92, 114, 114, 91, 85, 121, 107, 85, 95, 88, 111, 99, 88, 100, 93, 121]");
        org.junit.Assert.assertNotNull(intArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[115, 103, 87, 111]");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029252688076961124d, 0.5830397501930291d, (int) (byte) 1);
        double double4 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.029252688076961124d + "'", double4 == 0.029252688076961124d);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 13, 5);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.012763996187751522d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.2603294069810534E-6d + "'", double4 == 2.2603294069810534E-6d);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int10 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.getMean();
        double double13 = poissonDistributionImpl2.probability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = poissonDistributionImpl2.inverseCumulativeProbability((double) 9998694);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.49456394057024E-4d);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, 98);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100L, 10.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double9 = poissonDistributionImpl2.getMean();
        int[] intArray11 = poissonDistributionImpl2.sample(68);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[6, 10, 10, 10, 8, 6, 9, 17, 5, 13, 17, 11, 12, 8, 8, 7, 7, 11, 12, 4, 7, 9, 8, 16, 9, 9, 9, 6, 6, 12, 10, 11, 12, 10, 9, 8, 9, 9, 11, 10, 13, 9, 8, 9, 9, 12, 7, 8, 10, 13, 15, 9, 10, 12, 13, 15, 10, 8, 12, 11, 7, 14, 8, 9, 6, 6, 11, 15]");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.4769857099748101E-30d, 0.9261578838188795d, 96);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double15 = poissonDistributionImpl2.cumulativeProbability(4, (int) (short) 10);
        int int16 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl2.cumulativeProbability(1.2340980408667956E-4d, 0.5829943502632666d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5727036995171034d + "'", double15 == 0.5727036995171034d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 5, (double) (short) 0);
        double double4 = poissonDistributionImpl2.probability((double) 96);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.575853562330408E-86d + "'", double4 == 8.575853562330408E-86d);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 33);
        int[] intArray3 = poissonDistributionImpl1.sample((int) '4');
        org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[49, 28, 40, 29, 32, 35, 30, 32, 31, 31, 36, 34, 36, 40, 40, 31, 35, 32, 36, 37, 46, 30, 30, 37, 33, 31, 37, 36, 30, 30, 38, 35, 40, 28, 35, 39, 31, 30, 21, 35, 31, 34, 27, 37, 32, 31, 41, 27, 31, 39, 38, 37]");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.13553557721400844d, 0.0d, 5);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(11, 17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (5) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.562816469418554d, (double) 15);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        double double13 = poissonDistributionImpl2.probability((int) ' ');
        double double15 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        double double19 = poissonDistributionImpl2.probability(9);
        double double21 = poissonDistributionImpl2.cumulativeProbability(1.13768510870919E-30d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7253747334040217E-8d + "'", double13 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.562816469418554d + "'", double15 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.1251100357211333d + "'", double19 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.539992976248491E-5d + "'", double21 == 4.539992976248491E-5d);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(100.0d, 4.5399929762484854E-5d);
        double double3 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(0.9329140369542976d, 0.8160602794142788d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double7 = poissonDistributionImpl2.getMean();
        int int8 = poissonDistributionImpl2.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability((double) 'a', 4.49456394057024E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        double double9 = poissonDistributionImpl2.probability((double) (byte) 0);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = poissonDistributionImpl2.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9165415270653469d, 11);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 16);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999998885745217d, 9998694);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.9165415270653469d);
        double double6 = poissonDistributionImpl2.probability(2);
        double double8 = poissonDistributionImpl2.probability(1.0000383630865278E-13d);
        double double10 = poissonDistributionImpl2.probability(96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.18393970009014876d + "'", double6 == 0.18393970009014876d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.7096272297433567E-151d + "'", double10 == 3.7096272297433567E-151d);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.952703733862044E-27d, 17);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.probability((double) (byte) 10);
        double double7 = poissonDistributionImpl3.cumulativeProbability(14);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.11858007600857041d + "'", double5 == 0.11858007600857041d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9585423276538875d + "'", double7 == 0.9585423276538875d);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (double) 100.0f, 100);
        int int4 = poissonDistributionImpl3.sample();
        double double6 = poissonDistributionImpl3.cumulativeProbability((double) 9998694);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 116);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double15 = poissonDistributionImpl2.cumulativeProbability(4, (int) (short) 10);
        double double17 = poissonDistributionImpl2.probability(9.404873445868597E-8d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5727036995171034d + "'", double15 == 0.5727036995171034d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 26, 1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 9);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability(2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.8600379880104138E-40d + "'", double5 == 1.8600379880104138E-40d);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 14, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability(96);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 26, 0.03471806963068409d);
        int[] intArray4 = poissonDistributionImpl2.sample(5);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[23, 28, 16, 24, 29]");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 13, 9.404873445868597E-8d, 11);
        poissonDistributionImpl3.reseedRandomGenerator((long) 5);
        double double7 = poissonDistributionImpl3.cumulativeProbability(68);
        double double9 = poissonDistributionImpl3.probability(13);
        double double11 = poissonDistributionImpl3.normalApproximateProbability(14);
        double double13 = poissonDistributionImpl3.cumulativeProbability(0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.10993981424841087d + "'", double9 == 0.10993981424841087d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6613041990368613d + "'", double11 == 0.6613041990368613d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.2603294069810534E-6d + "'", double13 == 2.2603294069810534E-6d);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) '4');
        poissonDistributionImpl3.reseedRandomGenerator((long) ' ');
        double double9 = poissonDistributionImpl3.probability((double) (-1));
        poissonDistributionImpl3.reseedRandomGenerator((long) 2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.404873445868597E-8d + "'", double5 == 9.404873445868597E-8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 9);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 1);
        double double6 = poissonDistributionImpl2.cumulativeProbability(4.719682636442159E-60d);
        double double8 = poissonDistributionImpl2.probability(96);
        java.lang.Class<?> wildcardClass9 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[96]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.7200759760208177E-44d + "'", double6 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03751294493110752d + "'", double8 == 0.03751294493110752d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double10 = poissonDistributionImpl2.getMean();
        double double13 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10, 2147483647);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 8, 7, 10, 8, 13, 13, 12, 10, 14]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5420702855281083d + "'", double13 == 0.5420702855281083d);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        int int8 = poissonDistributionImpl2.sample();
        int[] intArray10 = poissonDistributionImpl2.sample((int) 'a');
        int[] intArray12 = poissonDistributionImpl2.sample(39);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[7, 12, 11, 9, 7, 10, 21, 17, 5, 13, 9, 12, 12, 12, 14, 13, 7, 10, 14, 12, 11, 6, 12, 11, 12, 11, 12, 7, 12, 9, 11, 4, 11, 10, 8, 14, 15, 8, 9, 4, 9, 10, 11, 11, 17, 9, 4, 5, 15, 8, 12, 16, 11, 7, 13, 12, 14, 6, 7, 7, 9, 12, 9, 8, 5, 9, 6, 11, 10, 9, 17, 9, 8, 9, 5, 5, 12, 9, 17, 17, 14, 10, 12, 8, 12, 9, 15, 7, 9, 8, 8, 8, 10, 15, 13, 8, 9]");
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[5, 7, 6, 13, 9, 6, 8, 10, 7, 5, 10, 14, 14, 13, 15, 8, 7, 8, 9, 15, 6, 8, 10, 4, 12, 9, 10, 11, 14, 6, 9, 12, 13, 12, 9, 6, 13, 9, 9]");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) 35);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 5, 9, 6, 11, 6, 20, 8, 13, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        double double13 = poissonDistributionImpl2.probability((int) ' ');
        double double15 = poissonDistributionImpl2.normalApproximateProbability(0);
        int int16 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7253747334040217E-8d + "'", double13 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0013315596295692678d + "'", double15 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.normalApproximateProbability(0);
        int int8 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0013315596295692678d + "'", double7 == 0.0013315596295692678d);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl2.cumulativeProbability(33, 12);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 68, (double) 11);
        double double4 = poissonDistributionImpl2.cumulativeProbability(16);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.815366131842834E-14d + "'", double4 == 3.815366131842834E-14d);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 1.4769857099748101E-30d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999998885745217d, 11);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.93319282398637d + "'", double4 == 0.93319282398637d);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        double double4 = poissonDistributionImpl2.cumulativeProbability(9);
        double double6 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999998885745217d + "'", double4 == 0.9999998885745217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.36787944117146065d + "'", double6 == 0.36787944117146065d);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2147483647);
        double double4 = poissonDistributionImpl1.cumulativeProbability((double) 12, (double) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, 98);
        double double4 = poissonDistributionImpl2.probability(10);
        int int5 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        int int4 = poissonDistributionImpl2.sample();
        int int5 = poissonDistributionImpl2.sample();
        double double7 = poissonDistributionImpl2.normalApproximateProbability((-1));
        double double10 = poissonDistributionImpl2.cumulativeProbability(0, 36);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 13 + "'", int5 == 13);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.49456394057024E-4d + "'", double7 == 4.49456394057024E-4d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999999999553747d + "'", double10 == 0.9999999999553747d);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.probability((int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (-1));
        int[] intArray4 = poissonDistributionImpl2.sample(9);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 10, 12, 9, 8, 10, 7, 7, 14]");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.7200759760208177E-44d, 5.907792072437627E-11d);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 15, 2.0651960856926313E-15d, (int) (byte) 100);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484845E-4d, 0.771175349528829d, (-1));
        double double5 = poissonDistributionImpl3.probability(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484854E-5d);
        double double9 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 14, 9, 8, 7, 10, 6, 4, 11, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(100.0d);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        int int9 = poissonDistributionImpl2.sample();
        double double12 = poissonDistributionImpl2.cumulativeProbability(96, 2147483647);
        int[] intArray14 = poissonDistributionImpl2.sample((int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 11, 11, 10, 7, 11, 7, 13, 6, 15]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(intArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[12]");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(4.5399929762484854E-5d);
        double double13 = poissonDistributionImpl2.probability(9);
        double double14 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 10002602);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 11, 14, 13, 8, 4, 10, 15, 10, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.1251100357211333d + "'", double13 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.993992273873336E-4d, 1.8600379880104138E-40d);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((int) 'a');
        double double11 = poissonDistributionImpl2.cumulativeProbability((int) (short) 0, 6);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(4.864649182067619E-63d);
        int[] intArray15 = poissonDistributionImpl2.sample(13);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 10, 8, 11, 9, 13, 9, 13, 9, 6]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.719682636442159E-60d + "'", double8 == 4.719682636442159E-60d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.130141420882483d + "'", double11 == 0.130141420882483d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[8, 14, 2, 12, 9, 10, 9, 15, 5, 13, 7, 9, 10]");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.5727036995171034d);
        double double13 = poissonDistributionImpl2.cumulativeProbability((int) (short) 1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.993992273873336E-4d + "'", double13 == 4.993992273873336E-4d);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.8600379880104138E-40d);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(13);
        double double6 = poissonDistributionImpl2.probability((int) (short) 1);
        double double8 = poissonDistributionImpl2.probability(1);
        double double10 = poissonDistributionImpl2.probability((double) 39);
        double double13 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 0, 0, 2, 1, 3, 2, 2, 1, 0, 2, 1]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.36787944117144233d + "'", double6 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.36787944117144233d + "'", double8 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.8035178343861286E-47d + "'", double10 == 1.8035178343861286E-47d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.4769857099748101E-30d, 0.021698793519177532d, (int) (short) 10);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 16, 96);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.10993981424841087d, 1.2664165549094158E-14d, 7);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.10208697037352438d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (7) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-1.0d), 116);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, (double) 96);
        double double4 = poissonDistributionImpl2.probability(6);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.06305545800345122d + "'", double4 == 0.06305545800345122d);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.01891663740103536d);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.932914037120968d, 12);
        double double4 = poissonDistributionImpl2.cumulativeProbability(10);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(2.2603294069810534E-6d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (12) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999950242434d + "'", double4 == 0.9999999950242434d);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6967761463031481d, (double) (byte) 1);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1, 93);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 1.8600379880104138E-40d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, 13);
        double double4 = poissonDistributionImpl2.cumulativeProbability(19);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.7648935760015084E-23d + "'", double4 == 3.7648935760015084E-23d);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        int[] intArray5 = poissonDistributionImpl3.sample(13);
        poissonDistributionImpl3.reseedRandomGenerator((long) 7);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999998885745217d);
        double double3 = poissonDistributionImpl1.probability((-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        int int15 = poissonDistributionImpl2.inverseCumulativeProbability(0.5420702855281083d);
        double double17 = poissonDistributionImpl2.cumulativeProbability(14);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9165415270653469d + "'", double17 == 0.9165415270653469d);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double11 = poissonDistributionImpl2.probability((double) ' ');
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[15, 10, 13, 9, 11, 11, 9, 11, 11, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7253747334040217E-8d + "'", double11 == 1.7253747334040217E-8d);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9962224374422399d, 0.3328196787507197d, 93);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(17);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999897508033253d, 93);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.907792072437627E-11d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample(8);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.932914037120968d, 12);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(1.8600379880104138E-40d, 1.0137769446139089E-7d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(100.0d, 4.5399929762484854E-5d);
        double double4 = poissonDistributionImpl2.probability(0.1251100357211333d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(3.3400763612444206E-26d, 6.162417552208618E-5d);
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
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, 0.9999998885745217d, 13);
        double double6 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100, 10000000);
        double double9 = poissonDistributionImpl3.cumulativeProbability(0.029252688076961124d, (double) (byte) 10);
        int int10 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.771175349528829d + "'", double9 == 0.771175349528829d);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(13);
        double double6 = poissonDistributionImpl2.probability((int) (short) 1);
        double double8 = poissonDistributionImpl2.probability(1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = poissonDistributionImpl2.inverseCumulativeProbability((double) 35);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 2, 1, 1, 0, 0, 2, 3, 1, 3, 1, 1]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.36787944117144233d + "'", double6 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.36787944117144233d + "'", double8 == 0.36787944117144233d);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) (byte) 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 14);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.7915564763949167d, (double) 0.0f, (int) 'a');
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 33);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029252688076961124d, 0.5830397501930291d, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability(100.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.166772188917836E-35d, 0.0d, 5);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double9 = poissonDistributionImpl2.probability(0.13553557721400844d);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 93, 100);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.probability(0.22022064660169965d);
        double double8 = poissonDistributionImpl2.probability((double) 7);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(10000000, 4);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.09007922571921603d + "'", double8 == 0.09007922571921603d);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        double double13 = poissonDistributionImpl2.probability(33);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5.2284082830424716E-9d + "'", double13 == 5.2284082830424716E-9d);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability(4, 16);
        double double16 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9626223395392753d + "'", double14 == 0.9626223395392753d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        double double4 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.003594758625082517d + "'", double4 == 0.003594758625082517d);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 6, (double) '#');
        double double16 = poissonDistributionImpl2.cumulativeProbability((double) (short) 1);
        double double18 = poissonDistributionImpl2.cumulativeProbability(0.3678794407923373d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9329140369542976d + "'", double14 == 0.9329140369542976d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.993992273873336E-4d + "'", double16 == 4.993992273873336E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.539992976248491E-5d + "'", double18 == 4.539992976248491E-5d);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double4 = poissonDistributionImpl3.getMean();
        double double6 = poissonDistributionImpl3.probability(0.1251100357211333d);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = poissonDistributionImpl3.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double10 = poissonDistributionImpl2.cumulativeProbability(16, (int) ' ');
        double double12 = poissonDistributionImpl2.cumulativeProbability(1.2340980408667956E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.04874039593176138d + "'", double10 == 0.04874039593176138d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.539992976248491E-5d + "'", double12 == 4.539992976248491E-5d);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6321205588285574d, 4.5399929762484845E-4d);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability((double) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 6, (double) '#');
        double double16 = poissonDistributionImpl2.probability(10);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9329140369542976d + "'", double14 == 0.9329140369542976d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1251100357211333d + "'", double16 == 0.1251100357211333d);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 4, (double) 1.0f, 8);
        int[] intArray5 = poissonDistributionImpl3.sample(11);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[6, 5, 4, 3, 9, 2, 4, 4, 7, 3, 3]");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) (-1), 7);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(7, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (7) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        double double4 = poissonDistributionImpl2.cumulativeProbability(9);
        double double6 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100);
        double double8 = poissonDistributionImpl2.probability(13);
        double double10 = poissonDistributionImpl2.probability((double) 68);
        double double11 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999998885745217d + "'", double4 == 0.9999998885745217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.907792072437627E-11d + "'", double8 == 5.907792072437627E-11d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.483363584418453E-97d + "'", double10 == 1.483363584418453E-97d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        double double11 = poissonDistributionImpl2.cumulativeProbability(4.539992976248491E-5d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl2.cumulativeProbability(3.941866060050443E-159d, 1.0137769446139089E-7d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9964116947915089d, 0.0013864542336563224d, (int) (short) 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double14 = poissonDistributionImpl2.probability((int) ' ');
        double double15 = poissonDistributionImpl2.getMean();
        double double17 = poissonDistributionImpl2.cumulativeProbability(100);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.7253747334040217E-8d + "'", double14 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        double double6 = poissonDistributionImpl3.cumulativeProbability(0, (int) ' ');
        int int8 = poissonDistributionImpl3.inverseCumulativeProbability(0.07290794622443657d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double8 = poissonDistributionImpl2.cumulativeProbability(11);
        double double10 = poissonDistributionImpl2.cumulativeProbability(6);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6967761463031481d + "'", double8 == 0.6967761463031481d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.130141420882483d + "'", double10 == 0.130141420882483d);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9964116947845713d, 96);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, (double) 1, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability(4.5399929762484854E-5d);
        double double6 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability(0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 10,000,000");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E7d + "'", double6 == 1.0E7d);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        double double6 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 10, 100);
        double double7 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.003594758625082517d + "'", double7 == 0.003594758625082517d);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.346489669236007E-11d, 10);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.probability((double) (byte) 10);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.11858007600857041d + "'", double5 == 0.11858007600857041d);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        double double11 = poissonDistributionImpl2.cumulativeProbability(4.539992976248491E-5d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl2.cumulativeProbability(12, (int) (short) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.2340980408667956E-4d, 0.9769178379571382d, 68);
        double double5 = poissonDistributionImpl3.probability((double) 11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.5330104258464705E-51d + "'", double5 == 2.5330104258464705E-51d);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        double double13 = poissonDistributionImpl2.probability((int) ' ');
        double double15 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        double double17 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = poissonDistributionImpl2.cumulativeProbability(33, (int) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7253747334040217E-8d + "'", double13 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.562816469418554d + "'", double15 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double9 = poissonDistributionImpl2.getMean();
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.10993981424841087d);
        double double13 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.932914037120968d, 12);
        double double4 = poissonDistributionImpl2.cumulativeProbability(10);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999950242434d + "'", double4 == 0.9999999950242434d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.13768510870919E-30d, 0.01891663740103536d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 1);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double14 = poissonDistributionImpl2.normalApproximateProbability(12);
        int int16 = poissonDistributionImpl2.inverseCumulativeProbability(1.7253747334040217E-8d);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = poissonDistributionImpl2.inverseCumulativeProbability((double) 96);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7854023497798255d + "'", double14 == 0.7854023497798255d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.40653470814742954d, (double) 100, (int) (short) -1);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, 0.9999998885745217d, 13);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(1.5184117826962625E-29d);
        double double7 = poissonDistributionImpl3.cumulativeProbability(12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.8346526409387471d + "'", double7 == 0.8346526409387471d);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(2147483647, 5);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[16, 3, 15, 15, 9, 9, 14, 8, 8, 7]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.719682636442159E-60d + "'", double8 == 4.719682636442159E-60d);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.941866060050443E-159d, 0.9512595966960308d, (int) 'a');
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        double double6 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 10, 100);
        double double8 = poissonDistributionImpl3.cumulativeProbability(16);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double15 = poissonDistributionImpl2.cumulativeProbability(1.0E-12d);
        int int16 = poissonDistributionImpl2.sample();
        int[] intArray18 = poissonDistributionImpl2.sample(35);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.539992976248491E-5d + "'", double15 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9]");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double10 = poissonDistributionImpl2.probability(9998694);
        double double12 = poissonDistributionImpl2.cumulativeProbability(100);
        double double14 = poissonDistributionImpl2.cumulativeProbability(35);
        double double17 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0, (double) 10000000);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 12, 8, 6, 12, 13, 6, 9, 11, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9999999998333297d + "'", double14 == 0.9999999998333297d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double14 = poissonDistributionImpl2.normalApproximateProbability(12);
        int int16 = poissonDistributionImpl2.inverseCumulativeProbability(1.7253747334040217E-8d);
        double double18 = poissonDistributionImpl2.probability(0.9928134953961462d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7854023497798255d + "'", double14 == 0.7854023497798255d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(7);
        double double14 = poissonDistributionImpl2.cumulativeProbability(0.01891663740103536d, (double) (byte) 10);
        double double16 = poissonDistributionImpl2.probability((double) 0.0f);
        double double18 = poissonDistributionImpl2.probability(2147483647);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.22022064660169965d + "'", double11 == 0.22022064660169965d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5829943502632666d + "'", double14 == 0.5829943502632666d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.5399929762484854E-5d + "'", double16 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.93319282398637d);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.probability(0.22022064660169965d);
        double double8 = poissonDistributionImpl2.probability((double) 7);
        double double9 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.09007922571921603d + "'", double8 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability(0.7854023497798255d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) '4');
        poissonDistributionImpl3.reseedRandomGenerator((long) ' ');
        poissonDistributionImpl3.reseedRandomGenerator((long) 17);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl3.cumulativeProbability(0.02704160978479897d, 0.13553557721400844d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.404873445868597E-8d + "'", double5 == 9.404873445868597E-8d);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, 1.8306160934240197E-33d, (int) '#');
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 8, (-1));
        double double4 = poissonDistributionImpl2.probability(0.797671619036357d);
        int[] intArray6 = poissonDistributionImpl2.sample(96);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(intArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[6, 12, 6, 12, 12, 6, 8, 7, 6, 4, 8, 10, 10, 7, 7, 9, 8, 10, 9, 10, 5, 11, 12, 5, 8, 10, 7, 10, 7, 4, 6, 11, 8, 7, 8, 9, 8, 8, 12, 12, 7, 10, 7, 6, 7, 8, 8, 11, 9, 9, 6, 7, 13, 7, 6, 6, 9, 6, 8, 9, 7, 8, 8, 8, 6, 12, 8, 5, 10, 9, 6, 10, 5, 11, 6, 6, 11, 7, 11, 4, 9, 5, 8, 7, 7, 10, 8, 8, 8, 13, 12, 6, 6, 4, 9, 7]");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d, 1.7253747334040217E-8d, (int) (byte) 1);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        int[] intArray5 = poissonDistributionImpl3.sample(13);
        double double7 = poissonDistributionImpl3.probability(10000000);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9800836903776293d, 39);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.130141420882483d, (double) 14, 7);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(26, 9);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        int int4 = poissonDistributionImpl2.sample();
        double double6 = poissonDistributionImpl2.probability((int) (byte) 10);
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.0013864542336563224d);
        int[] intArray10 = poissonDistributionImpl2.sample(18);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 13 + "'", int4 == 13);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1251100357211333d + "'", double6 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[13, 14, 6, 11, 13, 12, 12, 10, 14, 12, 12, 12, 13, 7, 14, 9, 3, 6]");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (-1));
        double double3 = poissonDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 1);
        int int14 = poissonDistributionImpl2.sample();
        int int16 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double19 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double10 = poissonDistributionImpl2.getMean();
        int[] intArray12 = poissonDistributionImpl2.sample((int) '#');
        java.lang.Class<?> wildcardClass13 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 15, 12, 12, 3, 9, 6, 10, 11, 16]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[18, 8, 7, 4, 11, 12, 8, 14, 13, 23, 12, 7, 6, 11, 10, 10, 5, 11, 5, 7, 14, 10, 9, 15, 9, 14, 17, 8, 7, 13, 5, 9, 10, 14, 15]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 17, 0.6967761463031481d, 11);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.142618885604298E-5d + "'", double5 == 3.142618885604298E-5d);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl2.cumulativeProbability(16, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 10);
        int int12 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[14, 9, 9, 4, 9, 12, 7, 11, 15, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 4, (double) 1.0f, 8);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8644644226193212d, (double) 'a', (-1));
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, (int) (byte) 10);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999998333297d);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability(2.938428229075368E-5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.36787944117146065d + "'", double4 == 0.36787944117146065d);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) '4');
        poissonDistributionImpl3.reseedRandomGenerator((long) ' ');
        double double9 = poissonDistributionImpl3.probability(1.483363584418453E-97d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl3.cumulativeProbability(0.5420702855281083d, 0.9999999950242434d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.404873445868597E-8d + "'", double5 == 9.404873445868597E-8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.8243984514608465E-153d, 1.9782167886654126E-162d, 11);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        double double6 = poissonDistributionImpl2.cumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample((int) 'a');
        double double11 = poissonDistributionImpl2.cumulativeProbability(17, 10000000);
        double double13 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        double double15 = poissonDistributionImpl2.cumulativeProbability(16);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 11, 4, 13, 8, 8, 10, 12, 12, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[8, 13, 9, 11, 7, 7, 3, 6, 8, 5, 18, 15, 7, 12, 13, 3, 13, 9, 6, 13, 12, 9, 10, 9, 10, 12, 11, 7, 13, 4, 9, 11, 15, 11, 9, 10, 14, 8, 14, 12, 10, 9, 12, 11, 9, 14, 12, 9, 8, 13, 14, 9, 15, 12, 11, 13, 11, 17, 16, 11, 16, 6, 11, 6, 12, 14, 12, 8, 9, 9, 14, 13, 9, 10, 12, 9, 12, 7, 8, 15, 17, 8, 7, 12, 12, 6, 7, 12, 14, 14, 12, 8, 13, 12, 14, 9, 5]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02704160978479897d + "'", double11 == 0.02704160978479897d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.972958390215201d + "'", double15 == 0.972958390215201d);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double9 = poissonDistributionImpl2.getMean();
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.10993981424841087d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl2.cumulativeProbability(26, 12);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) (-1.0f), 11);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (11) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.probability(6);
        int[] intArray7 = poissonDistributionImpl3.sample(98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.166772188917836E-35d + "'", double5 == 5.166772188917836E-35d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[105, 92, 98, 96, 93, 111, 99, 101, 84, 97, 110, 93, 97, 91, 96, 101, 98, 97, 107, 117, 103, 107, 97, 96, 105, 120, 103, 106, 104, 98, 93, 93, 96, 81, 100, 99, 106, 101, 114, 107, 94, 92, 95, 78, 113, 95, 96, 103, 102, 90, 97, 96, 97, 105, 98, 99, 102, 105, 111, 96, 108, 101, 83, 87, 105, 96, 127, 112, 121, 88, 98, 103, 104, 99, 93, 100, 100, 95, 76, 92, 110, 119, 103, 120, 100, 104, 107, 87, 92, 100, 83, 94, 107, 87, 105, 92, 85, 95]");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        int int4 = poissonDistributionImpl2.sample();
        int int5 = poissonDistributionImpl2.sample();
        double double7 = poissonDistributionImpl2.normalApproximateProbability((-1));
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.49456394057024E-4d + "'", double7 == 4.49456394057024E-4d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        double double5 = poissonDistributionImpl3.probability(9998694);
        int[] intArray7 = poissonDistributionImpl3.sample(35);
        double double9 = poissonDistributionImpl3.normalApproximateProbability((-1));
        double double12 = poissonDistributionImpl3.cumulativeProbability(4, 16);
        double double14 = poissonDistributionImpl3.probability(1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[15, 11, 10, 14, 13, 7, 16, 11, 7, 8, 10, 11, 10, 6, 8, 10, 6, 11, 5, 9, 11, 7, 6, 5, 8, 11, 10, 5, 4, 11, 14, 12, 13, 8, 7]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.49456394057024E-4d + "'", double9 == 4.49456394057024E-4d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9769178379571382d + "'", double12 == 0.9769178379571382d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.5399929762484845E-4d + "'", double14 == 4.5399929762484845E-4d);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.21459765022017452d, 1.7253747334040217E-8d);
        int int3 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double7 = poissonDistributionImpl2.cumulativeProbability(14, (int) '#');
        double double8 = poissonDistributionImpl2.getMean();
        int int10 = poissonDistributionImpl2.inverseCumulativeProbability(0.9964116947915089d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 10, 11, 11, 14, 11, 12, 11, 6, 11]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.13553557721400844d + "'", double7 == 0.13553557721400844d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 18 + "'", int10 == 18);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2, 0.6321205588285574d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.038549935871770746d + "'", double4 == 0.038549935871770746d);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        int int9 = poissonDistributionImpl2.sample();
        double double12 = poissonDistributionImpl2.cumulativeProbability(96, 2147483647);
        double double15 = poissonDistributionImpl2.cumulativeProbability(12, 10002602);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 10, 11, 10, 7, 12, 13, 8, 9, 5]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 18 + "'", int9 == 18);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.3032238536968519d + "'", double15 == 0.3032238536968519d);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5830397501930291d, (double) (byte) 10, 7);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(13);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[13, 11, 13, 9, 14, 11, 11, 7, 17, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.8658091863536196d + "'", double8 == 0.8658091863536196d);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        int[] intArray5 = poissonDistributionImpl3.sample((int) '#');
        double double7 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[13, 9, 11, 14, 9, 14, 8, 9, 16, 11, 11, 9, 6, 6, 5, 8, 9, 7, 14, 8, 12, 15, 10, 6, 14, 10, 10, 8, 7, 6, 11, 7, 10, 13, 12]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0013315596295692678d + "'", double7 == 0.0013315596295692678d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.93319282398637d, 1.0000383630865278E-13d, 0);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 35, 0.021698793519177532d);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 98, (int) '#');
        double double4 = poissonDistributionImpl2.normalApproximateProbability(26);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.5501822875639846E-13d + "'", double4 == 2.5501822875639846E-13d);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.13768510870919E-30d, 0.01891663740103536d);
        int[] intArray4 = poissonDistributionImpl2.sample(33);
        double double6 = poissonDistributionImpl2.probability(116);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1);
        double double3 = poissonDistributionImpl1.probability(100.0d);
        double double5 = poissonDistributionImpl1.normalApproximateProbability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.941866060050443E-159d + "'", double3 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }
}
