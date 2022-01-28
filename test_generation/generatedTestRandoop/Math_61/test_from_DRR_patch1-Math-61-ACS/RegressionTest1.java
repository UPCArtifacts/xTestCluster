import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 98);
        double double3 = poissonDistributionImpl1.cumulativeProbability(0.13553557721400844d);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.7487850079102307E-43d + "'", double3 == 2.7487850079102307E-43d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        int int8 = poissonDistributionImpl2.sample();
        int[] intArray10 = poissonDistributionImpl2.sample((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl2.cumulativeProbability(96, (int) (byte) 10);
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
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 8, 13, 8, 12, 12, 16, 11, 9, 6, 8, 13, 18, 9, 13, 15, 10, 5, 13, 11, 13, 15, 13, 10, 7, 9, 7, 7, 7, 13, 10, 9, 4, 9, 6, 8, 8, 16, 8, 9, 8, 9, 10, 15, 11, 7, 11, 7, 16, 13, 11, 7, 17, 14, 16, 8, 7, 9, 11, 7, 8, 10, 7, 7, 11, 17, 7, 12, 12, 10, 10, 11, 12, 12, 12, 7, 9, 11, 7, 6, 10, 9, 9, 14, 8, 12, 6, 12, 9, 8, 14, 13, 13, 11, 9, 9, 8]");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (-1));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E7d, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability(1.0000383630865278E-13d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 10,000,000");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.probability((int) (byte) -1);
        double double10 = poissonDistributionImpl2.getMean();
        double double12 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 18, 0.5727036995171034d, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 18");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029252688076961124d, 0.5830397501930291d, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#', 4.5399929762484845E-4d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.614458222900843E-7d + "'", double4 == 6.614458222900843E-7d);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) '4');
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.404873445868597E-8d + "'", double5 == 9.404873445868597E-8d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 100, 0.0013864542336563224d, 11);
        int[] intArray5 = poissonDistributionImpl3.sample(6);
        int int6 = poissonDistributionImpl3.sample();
        poissonDistributionImpl3.reseedRandomGenerator((long) 10);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[114, 107, 106, 101, 96, 87]");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample(1);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.normalApproximateProbability(9);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[14, 9, 8, 8, 12, 13, 16, 6, 14, 15]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[6]");
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.43718353058144593d + "'", double11 == 0.43718353058144593d);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 6, (double) '#');
        java.lang.Class<?> wildcardClass15 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9329140369542976d + "'", double14 == 0.9329140369542976d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(7);
        double double14 = poissonDistributionImpl2.cumulativeProbability(0.01891663740103536d, (double) (byte) 10);
        int[] intArray16 = poissonDistributionImpl2.sample((int) 'a');
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.22022064660169965d + "'", double11 == 0.22022064660169965d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5829943502632666d + "'", double14 == 0.5829943502632666d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', 4.5399929762484854E-5d, 9);
        int int4 = poissonDistributionImpl3.sample();
        double double5 = poissonDistributionImpl3.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (int) (short) 10);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.49456394057024E-4d + "'", double4 == 4.49456394057024E-4d);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 13, 5);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability(5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 13");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        int int5 = poissonDistributionImpl2.inverseCumulativeProbability(0.13553557721400844d);
        double double7 = poissonDistributionImpl2.probability(96);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.578092157348709E-59d + "'", double7 == 4.578092157348709E-59d);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((int) 'a');
        double double10 = poissonDistributionImpl2.probability((double) 2147483647);
        double double11 = poissonDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 16, 9, 18, 10, 12, 9, 11, 15, 13]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.719682636442159E-60d + "'", double8 == 4.719682636442159E-60d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 12, (double) 9);
        poissonDistributionImpl2.reseedRandomGenerator((long) 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(0.021698793519177532d, 1.7253747334040217E-8d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        double double6 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.9800836903776293d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9964116947915089d + "'", double6 == 0.9964116947915089d);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0d, 4.539992976248491E-5d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(116);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 22);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.932914037120968d, 96);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.40653470814742954d, (double) 1);
        int int3 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, (double) 'a', 1);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(35);
        double double7 = poissonDistributionImpl3.cumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 9);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        int[] intArray7 = poissonDistributionImpl2.sample(68);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[112, 103, 109, 102, 93, 101, 104, 111, 80, 96, 101, 101, 77, 105, 95, 86, 119, 116, 102, 87, 124, 92, 106, 102, 104, 106, 115, 108, 87, 94, 103, 89, 80, 115, 107, 109, 123, 101, 108, 113, 105, 120, 106, 99, 111, 103, 91, 107, 99, 100, 95, 93, 99, 92, 116, 102, 89, 91, 99, 107, 110, 118, 107, 101, 88, 114, 101, 103]");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double7 = poissonDistributionImpl3.probability((double) 0);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 10);
        double double11 = poissonDistributionImpl3.normalApproximateProbability(2147483647);
        double double13 = poissonDistributionImpl3.cumulativeProbability(14);
        double double15 = poissonDistributionImpl3.probability(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.720075976020836E-44d + "'", double7 == 3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.952703733862044E-27d + "'", double13 == 4.952703733862044E-27d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.720075976020836E-44d + "'", double15 == 3.720075976020836E-44d);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(0.562816469418554d);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.10208697037352438d);
        int int14 = poissonDistributionImpl2.sample();
        int int15 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 6, 13, 8, 9, 8, 13, 9, 9, 6]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double10 = poissonDistributionImpl2.getMean();
        int[] intArray12 = poissonDistributionImpl2.sample((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double15 = poissonDistributionImpl2.cumulativeProbability(4.864649182067619E-63d, 1.7253747334040217E-8d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 12, 14, 14, 11, 11, 16, 10, 9, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[5, 7, 10, 15, 17, 7, 7, 9, 11, 10, 14, 7, 10, 9, 12, 14, 7, 10, 12, 9, 10, 15, 16, 12, 11, 7, 7, 9, 8, 8, 10, 14, 12, 9, 15]");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) 13);
        int[] intArray7 = poissonDistributionImpl3.sample(18);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9261578838188795d + "'", double5 == 0.9261578838188795d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[8, 7, 11, 11, 7, 7, 10, 10, 7, 11, 10, 8, 11, 9, 13, 10, 9, 9]");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 7);
        double double3 = poissonDistributionImpl1.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.118819655545164E-4d + "'", double3 == 9.118819655545164E-4d);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double10 = poissonDistributionImpl2.probability(9998694);
        double double12 = poissonDistributionImpl2.cumulativeProbability(100);
        double double14 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        int[] intArray16 = poissonDistributionImpl2.sample(9);
        java.lang.Class<?> wildcardClass17 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 9, 16, 10, 5, 9, 4, 12, 8, 12]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[8, 12, 8, 14, 3, 10, 4, 9, 7]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double7 = poissonDistributionImpl2.cumulativeProbability(14, (int) '#');
        double double8 = poissonDistributionImpl2.getMean();
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) 7);
        double double12 = poissonDistributionImpl2.probability(39);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[14, 14, 13, 10, 7, 18, 12, 15, 13, 7]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.13553557721400844d + "'", double7 == 0.13553557721400844d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.22022064660169965d + "'", double10 == 0.22022064660169965d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.2257178260842245E-12d + "'", double12 == 2.2257178260842245E-12d);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(7);
        int int12 = poissonDistributionImpl2.sample();
        double double13 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.22022064660169965d + "'", double11 == 0.22022064660169965d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 9);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 1);
        double double6 = poissonDistributionImpl2.cumulativeProbability(4.719682636442159E-60d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 9998694);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[90]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.7200759760208177E-44d + "'", double6 == 3.7200759760208177E-44d);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, (double) 'a', 1);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(33);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample((int) 'a');
        double double11 = poissonDistributionImpl2.cumulativeProbability(17, 10000000);
        double double13 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = poissonDistributionImpl2.inverseCumulativeProbability((double) 5);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 11, 13, 9, 9, 7, 16, 10, 10, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[12, 10, 7, 9, 9, 15, 10, 9, 8, 11, 3, 7, 8, 9, 11, 9, 7, 14, 9, 8, 9, 5, 5, 7, 6, 7, 8, 9, 9, 10, 14, 8, 9, 10, 15, 9, 14, 8, 9, 7, 10, 11, 9, 11, 12, 9, 12, 9, 8, 8, 11, 11, 13, 11, 8, 9, 8, 8, 8, 11, 12, 7, 8, 4, 7, 8, 9, 10, 10, 9, 6, 13, 11, 12, 11, 10, 15, 13, 10, 12, 10, 16, 7, 7, 11, 5, 7, 13, 9, 12, 13, 19, 12, 9, 10, 10, 8]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02704160978479897d + "'", double11 == 0.02704160978479897d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) '4');
        poissonDistributionImpl3.reseedRandomGenerator((long) ' ');
        double double9 = poissonDistributionImpl3.probability((double) (-1));
        double double11 = poissonDistributionImpl3.normalApproximateProbability(15);
        double double13 = poissonDistributionImpl3.probability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.404873445868597E-8d + "'", double5 == 9.404873445868597E-8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0251532120868618E-30d + "'", double13 == 1.0251532120868618E-30d);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 13, 9.404873445868597E-8d, 11);
        poissonDistributionImpl3.reseedRandomGenerator((long) 5);
        double double7 = poissonDistributionImpl3.cumulativeProbability(68);
        double double9 = poissonDistributionImpl3.probability((double) 19);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.027164443219597104d + "'", double9 == 0.027164443219597104d);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.932914037120968d);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.13553557721400844d);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2, 0.6321205588285574d);
        double double4 = poissonDistributionImpl2.probability(0.9999897508033253d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.6029630373398666E-14d, (-1));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, (double) 1, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability((double) 10L);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(68);
        double double9 = poissonDistributionImpl3.probability(0.8346526409387471d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.815366131842834E-14d, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(10000000, 22);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double7 = poissonDistributionImpl3.probability((double) 0);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 10);
        double double11 = poissonDistributionImpl3.normalApproximateProbability(2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.720075976020836E-44d + "'", double7 == 3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999998885745217d, 9998694);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.30853756814777455d + "'", double4 == 0.30853756814777455d);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(7);
        double double14 = poissonDistributionImpl2.cumulativeProbability(0.01891663740103536d, (double) (byte) 10);
        int[] intArray16 = poissonDistributionImpl2.sample((int) 'a');
        double double18 = poissonDistributionImpl2.probability(26);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.22022064660169965d + "'", double11 == 0.22022064660169965d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5829943502632666d + "'", double14 == 0.5829943502632666d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.1257349618972562E-5d + "'", double18 == 1.1257349618972562E-5d);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, (double) 'a', 1);
        double double5 = poissonDistributionImpl3.probability(4.993992273873336E-4d);
        int int7 = poissonDistributionImpl3.inverseCumulativeProbability(0.0023032661316959024d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double7 = poissonDistributionImpl3.probability((double) 0);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 10);
        double double11 = poissonDistributionImpl3.normalApproximateProbability(2147483647);
        double double13 = poissonDistributionImpl3.normalApproximateProbability((-1));
        int int14 = poissonDistributionImpl3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl3.cumulativeProbability(0.30853756814777455d, 0.9964052413749175d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.720075976020836E-44d + "'", double7 == 3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 93 + "'", int14 == 93);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (double) 100.0f, 100);
        double double6 = poissonDistributionImpl3.cumulativeProbability(0, 16);
        double double8 = poissonDistributionImpl3.cumulativeProbability(4.5399929762484854E-5d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((double) 7);
        poissonDistributionImpl3.reseedRandomGenerator((long) 2);
        int int13 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0013864542336563224d + "'", double6 == 0.0013864542336563224d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.2664165549094158E-14d + "'", double8 == 1.2664165549094158E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0937681145770814E-7d + "'", double10 == 1.0937681145770814E-7d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability(4, 16);
        double double16 = poissonDistributionImpl2.probability((int) (byte) -1);
        int[] intArray18 = poissonDistributionImpl2.sample(15);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9626223395392753d + "'", double14 == 0.9626223395392753d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[12, 8, 14, 7, 5, 11, 8, 6, 16, 15, 9, 17, 10, 8, 12]");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 33, 39);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        double double3 = poissonDistributionImpl1.cumulativeProbability((int) (byte) 1);
        int int4 = poissonDistributionImpl1.sample();
        double double5 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993992273873336E-4d + "'", double3 == 4.993992273873336E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14 + "'", int4 == 14);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability(4, 16);
        int[] intArray16 = poissonDistributionImpl2.sample(11);
        double double18 = poissonDistributionImpl2.probability(15);
        double double19 = poissonDistributionImpl2.getMean();
        java.lang.Class<?> wildcardClass20 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9626223395392753d + "'", double14 == 0.9626223395392753d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[12, 8, 14, 7, 5, 11, 8, 6, 16, 15, 9]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.03471806963068409d + "'", double18 == 0.03471806963068409d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) '4');
        poissonDistributionImpl3.reseedRandomGenerator((long) ' ');
        double double9 = poissonDistributionImpl3.probability((double) (-1));
        double double11 = poissonDistributionImpl3.normalApproximateProbability(15);
        double double13 = poissonDistributionImpl3.cumulativeProbability(0.01891663740103536d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.404873445868597E-8d + "'", double5 == 9.404873445868597E-8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.7200759760208177E-44d + "'", double13 == 3.7200759760208177E-44d);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', 0.7854023497798255d, 6);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.0013315596295692678d);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 68 + "'", int5 == 68);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double10 = poissonDistributionImpl2.getMean();
        double double12 = poissonDistributionImpl2.probability(0.8346526409387471d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 10, 12, 7, 11, 15, 17, 7, 10, 13]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.7200759760208177E-44d);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        int int5 = poissonDistributionImpl2.sample();
        double double7 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double9 = poissonDistributionImpl2.probability(12);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 8, 12, 9, 19, 11, 15, 13, 9, 11]");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 13 + "'", int5 == 13);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.09478033009176766d + "'", double9 == 0.09478033009176766d);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', (double) 100.0f, 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) 10);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double9 = poissonDistributionImpl2.cumulativeProbability(4.539992976248491E-5d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(4.952703733862044E-27d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9964052413749175d, 8);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        double double4 = poissonDistributionImpl2.probability(0.5727036995171034d);
        int int5 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((double) 35, 0.01891663740103536d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 9);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 1);
        double double6 = poissonDistributionImpl2.cumulativeProbability(4.719682636442159E-60d);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((int) '#');
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[119]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.7200759760208177E-44d + "'", double6 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.5925097885989317E-11d + "'", double8 == 5.5925097885989317E-11d);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5829943502632666d, 0.12511003572113744d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9939750422488411d + "'", double4 == 0.9939750422488411d);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 5, (int) (short) -1);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 1);
        double double15 = poissonDistributionImpl2.probability(4.993992273873336E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 13);
        double double10 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 100);
        double double12 = poissonDistributionImpl2.probability((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10, 12, 13, 7, 13, 8, 8, 8, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1251100357211333d + "'", double12 == 0.1251100357211333d);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999999553747d, 1.8600379880104138E-40d, (int) (short) 1);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, 0.0d);
        double double5 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1, 8);
        double double7 = poissonDistributionImpl2.cumulativeProbability(0.9939750422488411d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3328196787507197d + "'", double5 == 0.3328196787507197d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        double double6 = poissonDistributionImpl2.cumulativeProbability(68);
        double double8 = poissonDistributionImpl2.normalApproximateProbability((-1));
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability((double) 1L, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.06680720126885803d + "'", double8 == 0.06680720126885803d);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, 11);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999998885745217d, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability(0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6613041990368613d);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.7200759760208177E-44d, (int) (byte) 10);
        double double4 = poissonDistributionImpl2.probability(18);
        double double7 = poissonDistributionImpl2.cumulativeProbability(0.0d, 0.9964116947915089d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.5727036995171034d);
        double double13 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 100);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, (double) 1, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability(4.5399929762484854E-5d);
        double double6 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability((double) 9, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 10,000,000");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E7d + "'", double6 == 1.0E7d);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, (double) 93);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double15 = poissonDistributionImpl2.cumulativeProbability(4, (int) (short) 10);
        double double17 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) -1);
        double double18 = poissonDistributionImpl2.getMean();
        double double19 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5727036995171034d + "'", double15 == 0.5727036995171034d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.49456394057024E-4d + "'", double17 == 4.49456394057024E-4d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        int int4 = poissonDistributionImpl2.sample();
        double double6 = poissonDistributionImpl2.probability((int) (byte) 10);
        double double7 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1251100357211333d + "'", double6 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.probability(13);
        double double9 = poissonDistributionImpl2.normalApproximateProbability(12);
        poissonDistributionImpl2.reseedRandomGenerator((long) 12);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.07290794622443657d + "'", double7 == 0.07290794622443657d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7854023497798255d + "'", double9 == 0.7854023497798255d);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) 10L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 14, 8, 9, 9, 12, 10, 9, 8, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample(1);
        double double9 = poissonDistributionImpl2.getMean();
        double double11 = poissonDistributionImpl2.normalApproximateProbability(98);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 16, 19, 13, 9, 14, 6, 14, 12, 6]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.404873445868597E-8d, (double) (short) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 2);
        int[] intArray8 = poissonDistributionImpl2.sample(116);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.8160602794142788d, 0.09926153383153563d);
        double double4 = poissonDistributionImpl2.probability(15);
        double double6 = poissonDistributionImpl2.cumulativeProbability(8);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.6029630373398666E-14d + "'", double4 == 1.6029630373398666E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999997884584183d + "'", double6 == 0.9999997884584183d);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, (int) (short) 1);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d);
        int[] intArray3 = poissonDistributionImpl1.sample(6);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.346489669236007E-11d);
        int int2 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 8, 5.2284082830424716E-9d);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 8, (-1));
        double double4 = poissonDistributionImpl2.probability((double) 10L);
        double double5 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09926153383153563d + "'", double4 == 0.09926153383153563d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5184117826962625E-29d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(93);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484866E-4d, 26);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1);
        int int2 = poissonDistributionImpl1.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double8 = poissonDistributionImpl2.cumulativeProbability(11);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(6.614458222900843E-7d, 0.09478033009176766d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6967761463031481d + "'", double8 == 0.6967761463031481d);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0023032661316959024d, 0.5727036995171034d, 91);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        double double4 = poissonDistributionImpl2.cumulativeProbability(9);
        double double6 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100);
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0, 7);
        double double11 = poissonDistributionImpl2.cumulativeProbability(26);
        double double13 = poissonDistributionImpl2.probability(0.13553557721400844d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999998885745217d + "'", double4 == 0.9999998885745217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9999897508033253d + "'", double9 == 0.9999897508033253d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 13);
        double double11 = poissonDistributionImpl2.cumulativeProbability((int) '#', 35);
        int int12 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[4, 10, 10, 8, 9, 5, 3, 6, 8, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.3936199123351116E-10d + "'", double11 == 4.3936199123351116E-10d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9998765901959134d, (double) 16, 22);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(13.0d);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.cumulativeProbability(14);
        double double9 = poissonDistributionImpl2.probability(0.04099516050019131d);
        double double11 = poissonDistributionImpl2.probability((int) (short) 100);
        int int12 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9165415270653469d + "'", double7 == 0.9165415270653469d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.864649182067619E-63d + "'", double11 == 4.864649182067619E-63d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, 5.5925097885989317E-11d, 10002602);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) (short) 10);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7253747334040217E-8d + "'", double3 == 1.7253747334040217E-8d);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.952703733862044E-27d, 36);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double15 = poissonDistributionImpl2.probability(9);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.1251100357211333d + "'", double15 == 0.1251100357211333d);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10002602, 0.6047660235173288d, 35);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.7648935760015084E-23d, 7);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double8 = poissonDistributionImpl2.cumulativeProbability((double) 100L);
        double double10 = poissonDistributionImpl2.normalApproximateProbability(36);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 4, 93);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        int[] intArray5 = poissonDistributionImpl3.sample((int) '#');
        double double6 = poissonDistributionImpl3.getMean();
        double double7 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[8, 15, 11, 11, 4, 4, 14, 10, 13, 7, 4, 8, 11, 17, 9, 10, 10, 10, 9, 14, 7, 14, 9, 14, 15, 8, 13, 9, 9, 14, 8, 8, 8, 9, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability((double) 0.0f);
        int int8 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5399929762484854E-5d + "'", double7 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int10 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.getMean();
        double double13 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) 'a');
        double double17 = poissonDistributionImpl2.normalApproximateProbability(0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5830397501930291d + "'", double13 == 0.5830397501930291d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0013315596295692678d + "'", double17 == 0.0013315596295692678d);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double15 = poissonDistributionImpl2.cumulativeProbability(1.0E-12d);
        int int16 = poissonDistributionImpl2.sample();
        int[] intArray18 = poissonDistributionImpl2.sample(11);
        int[] intArray20 = poissonDistributionImpl2.sample(0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.539992976248491E-5d + "'", double15 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double14 = poissonDistributionImpl2.normalApproximateProbability(12);
        int int16 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.7854023497798255d + "'", double14 == 0.7854023497798255d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        double double13 = poissonDistributionImpl2.probability((int) ' ');
        double double15 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double17 = poissonDistributionImpl2.normalApproximateProbability(10);
        double double19 = poissonDistributionImpl2.cumulativeProbability(7);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7253747334040217E-8d + "'", double13 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0013315596295692678d + "'", double15 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.562816469418554d + "'", double17 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.22022064660169965d + "'", double19 == 0.22022064660169965d);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.probability((int) (byte) 0);
        double double7 = poissonDistributionImpl3.probability(6.614458222900843E-7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2340980408667956E-4d + "'", double5 == 1.2340980408667956E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        double double10 = poissonDistributionImpl2.cumulativeProbability(0.7854023497798255d, 1.0E7d);
        double double12 = poissonDistributionImpl2.cumulativeProbability(1.0937681145770814E-7d);
        int[] intArray14 = poissonDistributionImpl2.sample(34);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999546000702375d + "'", double10 == 0.9999546000702375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.539992976248491E-5d + "'", double12 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[12, 13, 8, 10, 12, 12, 9, 4, 12, 8, 5, 13, 13, 10, 5, 10, 8, 7, 11, 9, 10, 10, 9, 9, 10, 7, 10, 12, 3, 8, 9, 11, 9, 6]");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 6, (double) '#');
        double double17 = poissonDistributionImpl2.cumulativeProbability(10, 10);
        double double19 = poissonDistributionImpl2.probability(0.932914037120968d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9329140369542976d + "'", double14 == 0.9329140369542976d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.12511003572113744d + "'", double17 == 0.12511003572113744d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double11 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        double double13 = poissonDistributionImpl2.normalApproximateProbability(9);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 11, 10, 9, 15, 6, 3, 6, 9, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.43718353058144593d + "'", double13 == 0.43718353058144593d);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        double double6 = poissonDistributionImpl2.cumulativeProbability(68);
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.038549935871770746d, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl2.cumulativeProbability(0.9928134953961462d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(13);
        double double6 = poissonDistributionImpl2.probability((int) (short) 1);
        double double8 = poissonDistributionImpl2.probability(1);
        double double9 = poissonDistributionImpl2.getMean();
        double double10 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 2, 1, 2, 1, 1, 1, 2, 0, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.36787944117144233d + "'", double6 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.36787944117144233d + "'", double8 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9512595966960308d, 0.9800836903776293d, (int) (byte) 100);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.993992273873336E-4d, 0.9857223864029524d, 98);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9261578838188795d, (int) 'a');
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(7);
        double double13 = poissonDistributionImpl2.probability(4.5399929762484854E-5d);
        double double15 = poissonDistributionImpl2.probability(9);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.22022064660169965d + "'", double11 == 0.22022064660169965d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.1251100357211333d + "'", double15 == 0.1251100357211333d);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9962224374422399d, (double) 39);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample(1);
        double double9 = poissonDistributionImpl2.getMean();
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        int int12 = poissonDistributionImpl2.sample();
        int int13 = poissonDistributionImpl2.sample();
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 9, 10, 12, 12, 11, 5, 14, 16, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[9]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 116);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3032238536968519d, 6.614458222900843E-7d);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, (double) 1, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability((double) 10L);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(68);
        double double8 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = poissonDistributionImpl3.cumulativeProbability(0.09007922571921603d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 10,000,000");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E7d + "'", double8 == 1.0E7d);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 6, 4.993992273873336E-4d, (int) (short) 10);
        int[] intArray5 = poissonDistributionImpl3.sample((int) ' ');
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2, 7, 4, 6, 5, 7, 5, 4, 7, 3, 4, 7, 11, 7, 5, 8, 10, 2, 6, 9, 4, 8, 5, 5, 6, 5, 8, 9, 5, 5, 2, 8]");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double6 = poissonDistributionImpl3.getMean();
        double double8 = poissonDistributionImpl3.cumulativeProbability((int) (short) 10);
        double double9 = poissonDistributionImpl3.getMean();
        double double12 = poissonDistributionImpl3.cumulativeProbability((int) (short) 0, 0);
        double double14 = poissonDistributionImpl3.cumulativeProbability(13);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.13768510870919E-30d + "'", double8 == 1.13768510870919E-30d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.7200759760208177E-44d + "'", double12 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.855256346821869E-28d + "'", double14 == 6.855256346821869E-28d);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, (double) 'a', 1);
        int int4 = poissonDistributionImpl3.sample();
        int int5 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.probability(35);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.3936204059180545E-10d + "'", double10 == 4.3936204059180545E-10d);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 13);
        double double10 = poissonDistributionImpl2.cumulativeProbability(0.04099516050019131d);
        double double12 = poissonDistributionImpl2.probability(68);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = poissonDistributionImpl2.cumulativeProbability(15, 12);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[4, 21, 10, 9, 7, 9, 11, 9, 6, 13]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.8306160934240197E-33d + "'", double12 == 1.8306160934240197E-33d);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability(4, 16);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        double double18 = poissonDistributionImpl2.normalApproximateProbability(10);
        java.lang.Class<?> wildcardClass19 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9626223395392753d + "'", double14 == 0.9626223395392753d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.562816469418554d + "'", double18 == 0.562816469418554d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.5501822875639846E-13d, 0.9329140369542976d, 36);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.probability((double) 1L);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(1.0d);
        poissonDistributionImpl2.reseedRandomGenerator(10L);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5399929762484845E-4d + "'", double7 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.166772188917836E-35d, (double) 10L);
        poissonDistributionImpl2.reseedRandomGenerator((long) 12);
        double double6 = poissonDistributionImpl2.cumulativeProbability(22);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 0, 0.01891663740103536d, 68);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029252688076961124d, (double) 7);
        int[] intArray4 = poissonDistributionImpl2.sample(4);
        int[] intArray6 = poissonDistributionImpl2.sample(11);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(32.0d, 3.8243984514608465E-153d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0]");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(6.162417552208618E-5d, 0.9512595966960308d);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.6029630373398666E-14d);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 1);
        double double16 = poissonDistributionImpl2.cumulativeProbability((double) (-1), (double) (short) 0);
        double double18 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 100);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.539992976248491E-5d + "'", double16 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample(1);
        double double9 = poissonDistributionImpl2.getMean();
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        int int12 = poissonDistributionImpl2.sample();
        java.lang.Class<?> wildcardClass13 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 10, 13, 10, 8, 9, 10, 12, 11, 17]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.13768510870919E-30d, (double) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability(1.2664165549094158E-14d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int10 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.getMean();
        double double13 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double18 = poissonDistributionImpl2.cumulativeProbability(2.938428229075368E-5d, 4.49456394057024E-4d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5830397501930291d + "'", double13 == 0.5830397501930291d);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 18, 0.5727036995171034d, (int) (byte) 1);
        int[] intArray5 = poissonDistributionImpl3.sample(5);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[15, 25, 14, 15, 25]");
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(0.562816469418554d);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 11, 11, 12, 12, 8, 13, 6, 8, 7]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 33);
        int int2 = poissonDistributionImpl1.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9928134953961462d);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(11);
        double double7 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 100);
        double double9 = poissonDistributionImpl3.cumulativeProbability(22);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.797671619036357d + "'", double5 == 0.797671619036357d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9999331799041903d + "'", double9 == 0.9999331799041903d);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1.0f, 0.40653470814742954d);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double7 = poissonDistributionImpl2.cumulativeProbability(14, (int) '#');
        double double8 = poissonDistributionImpl2.getMean();
        double double10 = poissonDistributionImpl2.probability((double) (short) 100);
        double double12 = poissonDistributionImpl2.cumulativeProbability(0);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 12, 19, 8, 9, 8, 11, 4, 9, 11]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.13553557721400844d + "'", double7 == 0.13553557721400844d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.864649182067619E-63d + "'", double10 == 4.864649182067619E-63d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.539992976248491E-5d + "'", double12 == 4.539992976248491E-5d);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0.13553557721400844d, 35);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.8306160934240197E-33d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(36);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        double double4 = poissonDistributionImpl2.cumulativeProbability(9);
        double double6 = poissonDistributionImpl2.cumulativeProbability((int) (short) 100);
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0, 7);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(1.0E-12d);
        double double13 = poissonDistributionImpl2.probability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999998885745217d + "'", double4 == 0.9999998885745217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9999897508033253d + "'", double9 == 0.9999897508033253d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.36787944117144233d + "'", double13 == 0.36787944117144233d);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) (-1.0f), 11);
        double double4 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) 9);
        double double7 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) 10000000);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1, 10000000);
        double double4 = poissonDistributionImpl2.cumulativeProbability(9);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(35);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999998885745217d + "'", double4 == 0.9999998885745217d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 13, 9.404873445868597E-8d, 11);
        double double4 = poissonDistributionImpl3.getMean();
        double double6 = poissonDistributionImpl3.cumulativeProbability(0);
        int int7 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 13.0d + "'", double4 == 13.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.2603294069810534E-6d + "'", double6 == 2.2603294069810534E-6d);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((int) 'a');
        double double10 = poissonDistributionImpl2.probability((double) 2147483647);
        double double11 = poissonDistributionImpl2.getMean();
        double double13 = poissonDistributionImpl2.probability(2.2257178260842245E-12d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[5, 3, 10, 13, 9, 7, 5, 9, 11, 13]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.719682636442159E-60d + "'", double8 == 4.719682636442159E-60d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(0.562816469418554d);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.10208697037352438d);
        double double15 = poissonDistributionImpl2.cumulativeProbability(9998694);
        double double18 = poissonDistributionImpl2.cumulativeProbability(0, 98);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 10, 5, 4, 8, 3, 8, 12, 12, 5]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample((int) 'a');
        double double11 = poissonDistributionImpl2.cumulativeProbability(17, 10000000);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.3678794407923373d);
        double double15 = poissonDistributionImpl2.probability(3);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 12, 8, 8, 11, 7, 6, 10, 13, 7]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[13, 9, 12, 4, 8, 13, 12, 12, 6, 10, 9, 15, 11, 8, 10, 7, 7, 20, 10, 9, 5, 12, 17, 8, 10, 11, 15, 11, 5, 9, 12, 11, 11, 13, 9, 6, 4, 7, 8, 13, 6, 8, 11, 8, 15, 10, 12, 10, 8, 9, 13, 9, 9, 8, 11, 5, 5, 13, 13, 14, 12, 10, 9, 9, 11, 7, 20, 9, 12, 10, 6, 6, 7, 8, 9, 9, 12, 10, 6, 7, 12, 11, 6, 10, 9, 9, 10, 13, 12, 9, 9, 9, 17, 9, 7, 14, 17]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02704160978479897d + "'", double11 == 0.02704160978479897d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.007566654960414148d + "'", double15 == 0.007566654960414148d);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9626223395392753d);
        int int3 = poissonDistributionImpl1.inverseCumulativeProbability(0.5420702855281083d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        double double5 = poissonDistributionImpl3.probability(9998694);
        double double8 = poissonDistributionImpl3.cumulativeProbability(9, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = poissonDistributionImpl3.sample((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6047660235173288d + "'", double8 == 0.6047660235173288d);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.03751294493110752d, (-1));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9964116947845713d, 68);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0013864542336563224d, 0.0d, 15);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(7, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (15) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        double double4 = poissonDistributionImpl2.cumulativeProbability(1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.8160602794142788d + "'", double4 == 0.8160602794142788d);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double10 = poissonDistributionImpl2.probability(9998694);
        double double12 = poissonDistributionImpl2.cumulativeProbability(100);
        double double14 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        int[] intArray16 = poissonDistributionImpl2.sample(10);
        double double18 = poissonDistributionImpl2.probability((int) (byte) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) 36);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 17, 22, 14, 8, 10, 25, 13, 6, 18]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[8, 17, 11, 7, 12, 10, 10, 8, 13, 13]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.1251100357211333d + "'", double18 == 0.1251100357211333d);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double15 = poissonDistributionImpl2.cumulativeProbability(4, (int) (short) 10);
        double double17 = poissonDistributionImpl2.normalApproximateProbability(2147483647);
        double double19 = poissonDistributionImpl2.cumulativeProbability((double) 29);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5727036995171034d + "'", double15 == 0.5727036995171034d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999997490048799d + "'", double19 == 0.9999997490048799d);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        int int7 = poissonDistributionImpl2.sample();
        double double8 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 10, 12, 9, 16, 6, 10, 19, 14, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.13768510870919E-30d, 0.01891663740103536d);
        int[] intArray4 = poissonDistributionImpl2.sample(33);
        double double6 = poissonDistributionImpl2.cumulativeProbability(17);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = poissonDistributionImpl2.inverseCumulativeProbability((double) 9);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double6 = poissonDistributionImpl2.getMean();
        int[] intArray8 = poissonDistributionImpl2.sample(16);
        int[] intArray10 = poissonDistributionImpl2.sample(2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[8, 6]");
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 33, (double) 3);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(11);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.797671619036357d + "'", double5 == 0.797671619036357d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10, 13);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 100);
        double double17 = poissonDistributionImpl2.cumulativeProbability((double) 10L, (double) 'a');
        double double18 = poissonDistributionImpl2.getMean();
        int int20 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0L);
        double double22 = poissonDistributionImpl2.normalApproximateProbability(9);
        poissonDistributionImpl2.reseedRandomGenerator((long) 0);
        double double25 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[4, 15, 14, 10, 8, 7, 11, 9, 13, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.40653470814742954d + "'", double12 == 0.40653470814742954d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5420702855281083d + "'", double17 == 0.5420702855281083d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.43718353058144593d + "'", double22 == 0.43718353058144593d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.probability(0);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.5399929762484854E-5d + "'", double5 == 4.5399929762484854E-5d);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999999999996d, 36);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999999999999996d + "'", double3 == 0.9999999999999996d);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1);
        double double11 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double13 = poissonDistributionImpl2.cumulativeProbability((double) 116);
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0013315596295692678d + "'", double11 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, (double) 'a', 1);
        double double5 = poissonDistributionImpl3.probability(4.993992273873336E-4d);
        int int7 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1L);
        poissonDistributionImpl3.reseedRandomGenerator((long) 6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample(68);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(9.123994076709607E-6d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[15, 9, 20, 12, 14, 7, 5, 7, 7, 11, 10, 7, 8, 6, 9, 11, 14, 16, 11, 13, 10, 5, 11, 6, 10, 16, 5, 12, 10, 9, 13, 12, 8, 12, 8, 6, 8, 11, 7, 9, 10, 11, 11, 9, 13, 8, 7, 11, 8, 8, 7, 17, 16, 6, 13, 14, 15, 5, 13, 6, 19, 11, 10, 9, 8, 9, 10, 6]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double15 = poissonDistributionImpl2.cumulativeProbability(4, (int) (short) 10);
        double double17 = poissonDistributionImpl2.normalApproximateProbability(2147483647);
        int int19 = poissonDistributionImpl2.inverseCumulativeProbability(0.9329140369542976d);
        double double20 = poissonDistributionImpl2.getMean();
        int[] intArray22 = poissonDistributionImpl2.sample(6);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5727036995171034d + "'", double15 == 0.5727036995171034d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 14 + "'", int19 == 14);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10, 5, 6, 10, 9]");
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 116, (int) (byte) 10);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 100, 0.0013864542336563224d, 11);
        int[] intArray5 = poissonDistributionImpl3.sample(35);
        double double7 = poissonDistributionImpl3.cumulativeProbability(20);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 109, 101, 106, 101, 77, 89, 112, 87, 97, 100, 104, 92, 91, 109, 96, 112, 109, 105, 108, 110, 92, 112, 88, 97, 111, 126, 117, 104, 93, 101, 106, 95, 100, 104]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.9055589744784363E-22d + "'", double7 == 1.9055589744784363E-22d);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) (-1.0f), 11);
        double double4 = poissonDistributionImpl3.getMean();
        double double5 = poissonDistributionImpl3.getMean();
        double double6 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability(13);
        double double9 = poissonDistributionImpl2.cumulativeProbability(83);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.07290794622443657d + "'", double7 == 0.07290794622443657d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', 0.7854023497798255d, 6);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.0013315596295692678d);
        double double6 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 68 + "'", int5 == 68);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 15, (double) 100L);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double6 = poissonDistributionImpl2.cumulativeProbability(94);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 96);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(13);
        double double6 = poissonDistributionImpl2.probability((int) (short) 1);
        double double7 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[2, 0, 0, 4, 2, 1, 1, 2, 1, 0, 0, 1, 2]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.36787944117144233d + "'", double6 == 0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.797671619036357d, 4.5399929762484854E-5d, 10002602);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        int[] intArray14 = poissonDistributionImpl2.sample((int) (byte) 0);
        int int15 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0d, (int) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(20);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 1, 0, 0, 2, 0, 1, 0, 1, 2, 3, 2, 1, 0, 0, 2, 1, 3, 0]");
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int10 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.getMean();
        double double13 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        double double16 = poissonDistributionImpl2.cumulativeProbability((double) (-1), 0.932914037120968d);
        double double18 = poissonDistributionImpl2.probability(19);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5830397501930291d + "'", double13 == 0.5830397501930291d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.539992976248491E-5d + "'", double16 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.003732162627997525d + "'", double18 == 0.003732162627997525d);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        double double5 = poissonDistributionImpl3.probability(9998694);
        double double7 = poissonDistributionImpl3.probability((int) (short) 10);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(0.130141420882483d);
        int int10 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1251100357211333d + "'", double7 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0013864542336563224d, 9998694);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double9 = poissonDistributionImpl2.getMean();
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.10993981424841087d);
        int[] intArray13 = poissonDistributionImpl2.sample(19);
        double double15 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[6, 10, 10, 10, 8, 6, 9, 17, 5, 13, 17, 11, 12, 8, 8, 7, 7, 11, 12]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.003594758625082517d + "'", double15 == 0.003594758625082517d);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 2.5501822875639846E-13d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double15 = poissonDistributionImpl2.cumulativeProbability(4, (int) (short) 10);
        double double17 = poissonDistributionImpl2.normalApproximateProbability(2147483647);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = poissonDistributionImpl2.cumulativeProbability(2147483647, 17);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5727036995171034d + "'", double15 == 0.5727036995171034d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 26, (double) 93);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1);
        double double3 = poissonDistributionImpl1.probability(100.0d);
        int int4 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.941866060050443E-159d + "'", double3 == 3.941866060050443E-159d);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        int[] intArray5 = poissonDistributionImpl3.sample((int) '#');
        double double7 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double10 = poissonDistributionImpl3.cumulativeProbability(9.123994076709607E-6d, (double) 18);
        double double12 = poissonDistributionImpl3.probability(93);
        int int14 = poissonDistributionImpl3.inverseCumulativeProbability(0.9999331799041903d);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[18, 10, 12, 7, 10, 11, 8, 9, 5, 11, 13, 8, 5, 6, 14, 8, 11, 10, 7, 7, 8, 12, 7, 10, 11, 13, 10, 12, 13, 14, 12, 10, 15, 16, 10]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9962224374422399d + "'", double10 == 0.9962224374422399d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.924706844651847E-56d + "'", double12 == 3.924706844651847E-56d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 23 + "'", int14 == 23);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double10 = poissonDistributionImpl2.probability(9998694);
        double double12 = poissonDistributionImpl2.cumulativeProbability(100);
        double double14 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        int[] intArray16 = poissonDistributionImpl2.sample(10);
        double double17 = poissonDistributionImpl2.getMean();
        double double19 = poissonDistributionImpl2.normalApproximateProbability(18);
        double double20 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 5, 15, 11, 10, 10, 13, 10, 6, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[3, 9, 21, 10, 8, 5, 13, 14, 5, 16]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9964052413749175d + "'", double19 == 0.9964052413749175d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0013315596295692678d, 0);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        int int7 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, (double) 1, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability(4.5399929762484854E-5d);
        int int6 = poissonDistributionImpl3.sample();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.09926153383153563d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 10,000,000");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9997892 + "'", int6 == 9997892);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2, 0.6321205588285574d);
        double double4 = poissonDistributionImpl2.probability((double) 91);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.478354682547047E-114d + "'", double4 == 2.478354682547047E-114d);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, (double) 35, (int) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) '4');
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        int[] intArray5 = poissonDistributionImpl3.sample((int) '#');
        double double7 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1);
        double double11 = poissonDistributionImpl3.probability(11);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[12, 11, 5, 11, 7, 7, 6, 11, 7, 10, 7, 13, 12, 7, 10, 9, 11, 11, 8, 5, 13, 5, 5, 11, 13, 11, 7, 15, 6, 14, 9, 9, 10, 7, 10]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.11373639611012118d + "'", double11 == 0.11373639611012118d);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        int[] intArray14 = poissonDistributionImpl2.sample((int) (byte) 0);
        int int16 = poissonDistributionImpl2.inverseCumulativeProbability(4.719682636442159E-60d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999998885745217d, 0);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999998885745217d + "'", double3 == 0.9999998885745217d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.30853756814777455d + "'", double5 == 0.30853756814777455d);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.130141420882483d, (double) 14, 7);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8857395729026654d + "'", double5 == 0.8857395729026654d);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d, (double) 12);
        double double4 = poissonDistributionImpl2.probability((int) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample(1);
        double double9 = poissonDistributionImpl2.getMean();
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double14 = poissonDistributionImpl2.cumulativeProbability(0.36787944117146065d, (double) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 9, 10, 13, 15, 14, 13, 8, 11, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[8]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5829943502632666d + "'", double14 == 0.5829943502632666d);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double6 = poissonDistributionImpl2.getMean();
        int[] intArray8 = poissonDistributionImpl2.sample(16);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double13 = poissonDistributionImpl2.cumulativeProbability((double) 0.0f, 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[8, 6, 9, 12, 9, 9, 9, 13, 11, 8]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5830397501930291d + "'", double13 == 0.5830397501930291d);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) (byte) 100);
        double double5 = poissonDistributionImpl2.cumulativeProbability(8, 19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.764893575922204E-23d + "'", double5 == 3.764893575922204E-23d);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, (double) 10, 14);
        double double5 = poissonDistributionImpl3.cumulativeProbability(4.864649182067619E-63d);
        double double7 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.2340980408667962E-4d + "'", double5 == 1.2340980408667962E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.709847844699635E-4d + "'", double7 == 7.709847844699635E-4d);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.probability((int) (byte) -1);
        double double11 = poissonDistributionImpl2.probability((int) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability(0, 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.5399929762484854E-5d + "'", double11 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5830397501930291d + "'", double14 == 0.5830397501930291d);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '#');
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        double double9 = poissonDistributionImpl2.probability((double) (byte) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability((double) (byte) 0);
        double double13 = poissonDistributionImpl2.cumulativeProbability(10002602);
        double double15 = poissonDistributionImpl2.probability(96);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.578092157348709E-59d + "'", double15 == 4.578092157348709E-59d);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability((double) 0.0f);
        int int8 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.0d, 0.8160602794142788d);
        double double13 = poissonDistributionImpl2.probability((double) (-1.0f));
        int[] intArray15 = poissonDistributionImpl2.sample(100);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = poissonDistributionImpl2.cumulativeProbability((double) 10L, 0.9939750422488411d);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12, 12]");
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.7648935760015084E-23d, (int) (short) 1);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) ' ', 4.5399929762484854E-5d, 9);
        double double4 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (9) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999999553747d, (double) ' ', (-1));
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (double) (-1), 7);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(18);
        double double7 = poissonDistributionImpl3.cumulativeProbability((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9964052413749175d + "'", double5 == 0.9964052413749175d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(0.7854023497798255d, 0.04874039593176138d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[19, 10, 9, 5, 8, 16, 6, 12, 15, 7]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.719682636442159E-60d + "'", double8 == 4.719682636442159E-60d);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) (-1.0f), 11);
        double double4 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(0.6321205588285574d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 100");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, 98);
        double double4 = poissonDistributionImpl2.probability(10);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(0.9964116947845713d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double6 = poissonDistributionImpl2.getMean();
        int[] intArray8 = poissonDistributionImpl2.sample(16);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (byte) 10);
        int int11 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[8, 6, 9, 12, 9, 9, 9, 13, 11, 8]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1);
        double double3 = poissonDistributionImpl1.probability((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.36787944117144233d + "'", double3 == 0.36787944117144233d);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.21459765022017452d);
        double double3 = poissonDistributionImpl1.probability(1.0E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999897508033253d, 8.575853562330408E-86d, 91);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(11);
        double double7 = poissonDistributionImpl3.cumulativeProbability(6.614458222900843E-7d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.797671619036357d + "'", double5 == 0.797671619036357d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.2340980408667962E-4d + "'", double7 == 1.2340980408667962E-4d);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        double double10 = poissonDistributionImpl2.cumulativeProbability(0.7854023497798255d, 1.0E7d);
        double double12 = poissonDistributionImpl2.cumulativeProbability(1.0937681145770814E-7d);
        int int14 = poissonDistributionImpl2.inverseCumulativeProbability(0.11373639611012118d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9999546000702375d + "'", double10 == 0.9999546000702375d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.539992976248491E-5d + "'", double12 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999999553747d, 100);
        double double4 = poissonDistributionImpl2.probability(6);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.109436681796644E-4d + "'", double4 == 5.109436681796644E-4d);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability(0.7854023497798255d);
        int[] intArray11 = poissonDistributionImpl2.sample((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10, 13);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 100);
        double double17 = poissonDistributionImpl2.cumulativeProbability((double) 10L, (double) 'a');
        double double18 = poissonDistributionImpl2.getMean();
        int int20 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0L);
        double double22 = poissonDistributionImpl2.normalApproximateProbability(9);
        int[] intArray24 = poissonDistributionImpl2.sample(29);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 10, 12, 14, 5, 9, 9, 4, 10, 14]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.40653470814742954d + "'", double12 == 0.40653470814742954d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5420702855281083d + "'", double17 == 0.5420702855281083d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.43718353058144593d + "'", double22 == 0.43718353058144593d);
        org.junit.Assert.assertNotNull(intArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[11, 11, 14, 7, 11, 11, 7, 11, 7, 13, 11, 7, 7, 11, 8, 6, 11, 16, 12, 10, 10, 6, 15, 4, 8, 8, 13, 16, 11]");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, 0.8658091863536196d);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 3, 0.04099516050019131d, 10002602);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) 13);
        int[] intArray7 = poissonDistributionImpl3.sample(11);
        double double8 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9261578838188795d + "'", double5 == 0.9261578838188795d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[11, 5, 10, 6, 10, 7, 9, 6, 8, 6, 9]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.0d + "'", double8 == 9.0d);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0.0f, (double) 100.0f, 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0);
        double double8 = poissonDistributionImpl2.probability((int) (byte) 0);
        double double10 = poissonDistributionImpl2.normalApproximateProbability(7);
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484854E-5d + "'", double8 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.21459765022017452d + "'", double10 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) 18);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 8, (-1));
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) ' ');
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0);
        double double8 = poissonDistributionImpl2.probability((int) (byte) 0);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        double double11 = poissonDistributionImpl2.getMean();
        double double13 = poissonDistributionImpl2.probability(0.7915564763949167d);
        double double15 = poissonDistributionImpl2.probability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484854E-5d + "'", double8 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.5399929762484854E-5d + "'", double15 == 4.5399929762484854E-5d);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, (int) (byte) 100);
        double double4 = poissonDistributionImpl2.cumulativeProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.75727673578106E-42d + "'", double4 == 3.75727673578106E-42d);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double15 = poissonDistributionImpl2.cumulativeProbability(1.0E-12d);
        double double16 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.539992976248491E-5d + "'", double15 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        int[] intArray5 = poissonDistributionImpl3.sample((int) '#');
        int[] intArray7 = poissonDistributionImpl3.sample(16);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[7, 7, 13, 8, 10, 9, 15, 13, 7, 8, 16, 4, 7, 14, 11, 3, 17, 19, 4, 15, 6, 14, 10, 11, 8, 9, 5, 7, 6, 8, 5, 16, 9, 9, 19]");
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[9, 4, 11, 12, 13, 9, 7, 14, 13, 8, 12, 6, 11, 5, 14, 9]");
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        int int4 = poissonDistributionImpl3.sample();
        int int5 = poissonDistributionImpl3.sample();
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl3.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 89 + "'", int4 == 89);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 77 + "'", int5 == 77);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, (double) 10, 14);
        double double5 = poissonDistributionImpl3.probability(0.13553557721400844d);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(116);
        double double8 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.0d + "'", double8 == 9.0d);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double9 = poissonDistributionImpl2.getMean();
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.10993981424841087d);
        int[] intArray13 = poissonDistributionImpl2.sample(19);
        double double15 = poissonDistributionImpl2.cumulativeProbability((double) (-1L));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[6, 10, 10, 10, 8, 6, 9, 17, 5, 13, 17, 11, 12, 8, 8, 7, 7, 11, 12]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 4, (double) 1.0f, 8);
        double double5 = poissonDistributionImpl3.cumulativeProbability(9998694);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.952703733862044E-27d);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, (double) 'a', 1);
        double double5 = poissonDistributionImpl3.probability(4.993992273873336E-4d);
        double double7 = poissonDistributionImpl3.cumulativeProbability(0.029252688076961124d);
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999546021313444d + "'", double7 == 0.9999546021313444d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        int[] intArray9 = poissonDistributionImpl2.sample((int) 'a');
        double double11 = poissonDistributionImpl2.cumulativeProbability(17);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[12, 11, 13, 8, 16, 10, 12, 7, 7, 7, 14, 12, 8, 12, 14, 14, 12, 10, 8, 3, 9, 10, 8, 11, 7, 14, 4, 6, 7, 9, 13, 12, 9, 16, 11, 6, 14, 18, 10, 7, 15, 15, 10, 10, 5, 10, 11, 7, 9, 13, 12, 13, 12, 17, 6, 14, 16, 8, 11, 10, 8, 6, 6, 4, 14, 14, 10, 12, 13, 12, 13, 8, 9, 8, 10, 12, 17, 20, 13, 10, 10, 8, 9, 6, 11, 6, 11, 13, 10, 19, 5, 9, 13, 9, 6, 24, 10]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9857223864029524d + "'", double11 == 0.9857223864029524d);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        double double5 = poissonDistributionImpl3.probability(9998694);
        int[] intArray7 = poissonDistributionImpl3.sample(35);
        double double9 = poissonDistributionImpl3.normalApproximateProbability((int) '#');
        double double11 = poissonDistributionImpl3.cumulativeProbability(20);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[12, 5, 6, 16, 12, 11, 9, 13, 11, 10, 9, 10, 9, 9, 12, 7, 16, 5, 13, 9, 3, 14, 9, 9, 6, 8, 8, 12, 16, 7, 4, 7, 4, 5, 7]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9999999999999996d + "'", double9 == 0.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9991113898504768d + "'", double11 == 0.9991113898504768d);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f);
        poissonDistributionImpl1.reseedRandomGenerator((long) 8);
        poissonDistributionImpl1.reseedRandomGenerator((long) (short) 1);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.normalApproximateProbability(2147483647);
        double double11 = poissonDistributionImpl2.normalApproximateProbability(33);
        double double13 = poissonDistributionImpl2.probability(98);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999999463d + "'", double11 == 0.9999999999999463d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.8160026902468524E-61d + "'", double13 == 4.8160026902468524E-61d);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        int int12 = poissonDistributionImpl2.sample();
        double double14 = poissonDistributionImpl2.probability(0.002089278784083215d);
        double double16 = poissonDistributionImpl2.cumulativeProbability(2147483647);
        int[] intArray18 = poissonDistributionImpl2.sample((int) '#');
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9]");
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029252688076961124d, 0.5830397501930291d);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.6967761463031481d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5829943502632666d, 0.12511003572113744d);
        double double4 = poissonDistributionImpl2.probability((double) 35);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.394909762018266E-49d + "'", double4 == 3.394909762018266E-49d);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability(4, 16);
        int[] intArray16 = poissonDistributionImpl2.sample(11);
        double double18 = poissonDistributionImpl2.probability(15);
        double double21 = poissonDistributionImpl2.cumulativeProbability(8, 33);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = poissonDistributionImpl2.cumulativeProbability(96, 2);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9626223395392753d + "'", double14 == 0.9626223395392753d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[12, 8, 14, 7, 5, 11, 8, 6, 16, 15, 9]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.03471806963068409d + "'", double18 == 0.03471806963068409d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.7797793512545008d + "'", double21 == 0.7797793512545008d);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(97.0d, 15);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.8306160934240197E-33d);
        double double4 = poissonDistributionImpl1.cumulativeProbability((double) (short) 0, (double) 77);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003732162627997525d, 36);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, (double) (short) 100);
        int[] intArray4 = poissonDistributionImpl2.sample(13);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 10);
        double double8 = poissonDistributionImpl2.probability(13);
        double double10 = poissonDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[2, 0, 0, 0, 2, 1, 0, 0, 0, 1, 1, 2, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.907792072437627E-11d + "'", double8 == 5.907792072437627E-11d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6321205588285574d + "'", double10 == 0.6321205588285574d);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double15 = poissonDistributionImpl2.cumulativeProbability(4, (int) (short) 10);
        double double17 = poissonDistributionImpl2.cumulativeProbability(17);
        double double19 = poissonDistributionImpl2.cumulativeProbability(0.12511003572113744d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5727036995171034d + "'", double15 == 0.5727036995171034d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9857223864029524d + "'", double17 == 0.9857223864029524d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.539992976248491E-5d + "'", double19 == 4.539992976248491E-5d);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.30853756814777455d, (double) 11, 10002602);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.02704160978479897d, 13);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        double double13 = poissonDistributionImpl2.probability((int) ' ');
        double double15 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        double double16 = poissonDistributionImpl2.getMean();
        int[] intArray18 = poissonDistributionImpl2.sample(17);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7253747334040217E-8d + "'", double13 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.562816469418554d + "'", double15 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8]");
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        int[] intArray5 = poissonDistributionImpl3.sample(13);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(98);
        double double10 = poissonDistributionImpl3.cumulativeProbability(26, 93);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        double double13 = poissonDistributionImpl2.probability((int) ' ');
        double double15 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        poissonDistributionImpl2.reseedRandomGenerator((long) 1);
        int int18 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7253747334040217E-8d + "'", double13 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.562816469418554d + "'", double15 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.07290794622443657d, 0.0d, (int) '#');
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 8, (-1));
        double double4 = poissonDistributionImpl2.probability((double) 10L);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.09926153383153563d + "'", double4 == 0.09926153383153563d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        int int5 = poissonDistributionImpl2.inverseCumulativeProbability(0.13553557721400844d);
        double double7 = poissonDistributionImpl2.probability(4);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.01891663740103536d + "'", double7 == 0.01891663740103536d);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) '4');
        poissonDistributionImpl3.reseedRandomGenerator((long) ' ');
        double double9 = poissonDistributionImpl3.probability(1.483363584418453E-97d);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.404873445868597E-8d + "'", double5 == 9.404873445868597E-8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 68);
        double double4 = poissonDistributionImpl2.probability(0.0013864542336563224d);
        double double6 = poissonDistributionImpl2.probability(0.002089278784083215d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) ' ');
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double7 = poissonDistributionImpl2.cumulativeProbability(1, 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.6321205588285393d + "'", double7 == 0.6321205588285393d);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        poissonDistributionImpl3.reseedRandomGenerator((long) (-1));
        double double7 = poissonDistributionImpl3.normalApproximateProbability((int) '4');
        double double9 = poissonDistributionImpl3.cumulativeProbability((double) (short) 1);
        int int10 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0170832425715481E-6d + "'", double7 == 1.0170832425715481E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.75727673578106E-42d + "'", double9 == 3.75727673578106E-42d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 96 + "'", int10 == 96);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        double double6 = poissonDistributionImpl3.cumulativeProbability(0, (int) ' ');
        int int7 = poissonDistributionImpl3.sample();
        int[] intArray9 = poissonDistributionImpl3.sample((int) (short) 0);
        double double11 = poissonDistributionImpl3.probability(9998694);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999546021313444d, 33);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability(9998694);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999546021313444d + "'", double3 == 0.9999546021313444d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.118819655545164E-4d);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0013864542336563224d, 8.575853562330408E-86d);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.012763996187751522d, 100);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.029252688076961124d, 0.5830397501930291d);
        double double4 = poissonDistributionImpl2.probability(4.5399929762484866E-4d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) -1, 2.2603294069810534E-6d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5727036995171034d, 0.03751294493110752d, 10000000);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(6.162417552208618E-5d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        double double11 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        int[] intArray13 = poissonDistributionImpl2.sample(13);
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[14, 14, 13, 10, 10, 12, 8, 9, 11, 6]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[4, 12, 6, 9, 10, 9, 11, 7, 6, 13, 10, 13, 16]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample((int) 'a');
        int int10 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 10, 14, 10, 10, 10, 16, 16, 8, 5]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[8, 10, 11, 7, 8, 6, 8, 8, 14, 16, 5, 12, 9, 6, 11, 9, 6, 11, 11, 13, 10, 7, 7, 9, 10, 10, 12, 9, 15, 9, 9, 18, 11, 13, 5, 10, 7, 11, 9, 7, 11, 5, 10, 6, 14, 10, 16, 9, 16, 8, 13, 10, 10, 7, 10, 8, 16, 18, 12, 13, 12, 6, 16, 10, 9, 11, 10, 9, 9, 10, 13, 6, 9, 6, 15, 11, 11, 7, 12, 7, 13, 9, 11, 14, 10, 12, 14, 6, 9, 12, 10, 4, 10, 11, 10, 7, 6]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 15, 1.0E7d, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability((double) 1, 0.9512595966960308d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.015191410988288745d, 0);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.09007922571921603d, 13);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        double double5 = poissonDistributionImpl3.probability(9998694);
        int[] intArray7 = poissonDistributionImpl3.sample(35);
        double double9 = poissonDistributionImpl3.probability((int) (byte) 0);
        double double11 = poissonDistributionImpl3.probability(16);
        double double12 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[13, 13, 8, 9, 15, 9, 3, 12, 9, 10, 4, 8, 11, 11, 11, 13, 9, 6, 6, 9, 10, 13, 5, 10, 14, 9, 6, 8, 11, 8, 14, 12, 3, 15, 15]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.021698793519177532d + "'", double11 == 0.021698793519177532d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, 98);
        double double4 = poissonDistributionImpl2.probability(10);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability((int) 'a', 19);
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
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.109436681796644E-4d);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability((double) '4');
        double double7 = poissonDistributionImpl3.cumulativeProbability(13.0d);
        double double9 = poissonDistributionImpl3.normalApproximateProbability(7);
        double double11 = poissonDistributionImpl3.probability((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.404873445868597E-8d + "'", double5 == 9.404873445868597E-8d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.855256346821869E-28d + "'", double7 == 6.855256346821869E-28d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        double double4 = poissonDistributionImpl2.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999827462528d + "'", double4 == 0.9999999827462528d);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.probability(16);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 10, 15, 5, 8, 7, 13, 13, 14, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.021698793519177532d + "'", double8 == 0.021698793519177532d);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 1, 0.4073778180707197d, 96);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999999553747d, 0.5830397501930291d, 15);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1);
        double double11 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double13 = poissonDistributionImpl2.cumulativeProbability((double) 116);
        int int15 = poissonDistributionImpl2.inverseCumulativeProbability(1.8306160934240197E-33d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0013315596295692678d + "'", double11 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double15 = poissonDistributionImpl2.cumulativeProbability(1.0E-12d);
        int int16 = poissonDistributionImpl2.sample();
        double double18 = poissonDistributionImpl2.probability(2.7487850079102307E-43d);
        int int19 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.539992976248491E-5d + "'", double15 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double9 = poissonDistributionImpl2.cumulativeProbability(0.9999997490048799d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999999553747d, 4);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(6.855256346821869E-28d, 0.8644644226193212d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 91, 0.9999999827462528d, 93);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample((int) 'a');
        int[] intArray10 = poissonDistributionImpl2.sample((int) 'a');
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[6, 14, 11, 9, 9, 11, 16, 9, 12, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[8, 10, 12, 11, 7, 10, 11, 11, 12, 16, 3, 10, 6, 13, 16, 5, 16, 9, 11, 4, 10, 10, 10, 12, 10, 7, 13, 10, 11, 12, 8, 7, 16, 8, 12, 6, 7, 12, 13, 10, 10, 7, 12, 12, 8, 15, 5, 7, 7, 8, 9, 10, 14, 11, 9, 8, 12, 5, 7, 11, 11, 13, 13, 7, 6, 11, 5, 10, 19, 10, 16, 5, 13, 7, 8, 9, 7, 7, 7, 7, 13, 12, 10, 7, 6, 11, 12, 7, 11, 11, 8, 12, 2, 8, 5, 12, 8]");
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9, 7, 13, 11, 11, 11, 10, 9, 11, 12, 11, 8, 16, 15, 15, 7, 10, 9, 6, 11, 7, 9, 6, 15, 10, 8, 9, 7, 14, 13, 18, 6, 9, 11, 14, 6, 9, 6, 10, 9, 12, 9, 9, 11, 8, 14, 11, 6, 7, 14, 10, 11, 3, 3, 12, 14, 12, 17, 9, 16, 13, 8, 10, 13, 7, 7, 13, 12, 6, 9, 11, 8, 13, 7, 16, 9, 7, 8, 13, 12, 7, 7, 11, 11, 8, 6, 11, 12, 10, 11, 11, 12, 20, 14, 16, 15, 16]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5829943502632666d, 6.614458222900843E-7d, (int) (short) 10);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        double double4 = poissonDistributionImpl2.probability((double) 20);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.246694661631448E-174d + "'", double4 == 2.246694661631448E-174d);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.normalApproximateProbability(2147483647);
        double double11 = poissonDistributionImpl2.normalApproximateProbability(33);
        int int12 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999999999999463d + "'", double11 == 0.9999999999999463d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E7d, (int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 89);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.probability((double) 7);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.22022064660169965d);
        double double15 = poissonDistributionImpl2.normalApproximateProbability(116);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1);
        double double11 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double13 = poissonDistributionImpl2.normalApproximateProbability(8);
        poissonDistributionImpl2.reseedRandomGenerator((long) 19);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0013315596295692678d + "'", double11 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.31762814799862416d + "'", double13 == 0.31762814799862416d);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double6 = poissonDistributionImpl2.getMean();
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.993992273873336E-4d + "'", double8 == 4.993992273873336E-4d);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        int[] intArray5 = poissonDistributionImpl3.sample(13);
        java.lang.Class<?> wildcardClass6 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 17, (int) '4');
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 4.993992273873336E-4d, 11);
        double double6 = poissonDistributionImpl3.cumulativeProbability(0, (int) ' ');
        double double8 = poissonDistributionImpl3.probability(0.9626223395392753d);
        double double10 = poissonDistributionImpl3.cumulativeProbability(96);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        int[] intArray5 = poissonDistributionImpl3.sample((int) '#');
        double double6 = poissonDistributionImpl3.getMean();
        int int8 = poissonDistributionImpl3.inverseCumulativeProbability(2.2603294069810534E-6d);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) '4');
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[13, 7, 13, 8, 8, 10, 9, 10, 9, 10, 11, 11, 11, 7, 10, 6, 8, 11, 6, 7, 10, 13, 9, 11, 7, 9, 10, 6, 8, 6, 11, 9, 17, 9, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.483363584418453E-97d);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0013864542336563224d, 19);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        double double5 = poissonDistributionImpl3.probability(9998694);
        double double8 = poissonDistributionImpl3.cumulativeProbability(9, (int) (short) 10);
        double double9 = poissonDistributionImpl3.getMean();
        double double10 = poissonDistributionImpl3.getMean();
        double double12 = poissonDistributionImpl3.probability(10);
        double double14 = poissonDistributionImpl3.cumulativeProbability((double) 8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6047660235173288d + "'", double8 == 0.6047660235173288d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1251100357211333d + "'", double12 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.28149758037255057d + "'", double14 == 0.28149758037255057d);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.844803008344096E-26d, (double) 15, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = poissonDistributionImpl3.inverseCumulativeProbability(97.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double10 = poissonDistributionImpl2.probability(9998694);
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 5, 4, 12, 6, 9, 4, 7, 11, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9512595966960308d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.probability(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.38625419240889314d + "'", double4 == 0.38625419240889314d);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.probability((int) (byte) -1);
        double double11 = poissonDistributionImpl2.probability((int) (short) 0);
        double double13 = poissonDistributionImpl2.cumulativeProbability(0.0d);
        double double14 = poissonDistributionImpl2.getMean();
        double double16 = poissonDistributionImpl2.normalApproximateProbability(15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.5399929762484854E-5d + "'", double11 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.539992976248491E-5d + "'", double13 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9590048394998087d + "'", double16 == 0.9590048394998087d);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.probability((int) (byte) -1);
        double double10 = poissonDistributionImpl2.getMean();
        double double12 = poissonDistributionImpl2.cumulativeProbability(4.49456394057024E-4d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 4);
        double double16 = poissonDistributionImpl2.normalApproximateProbability(33);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.539992976248491E-5d + "'", double12 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9999999999999463d + "'", double16 == 0.9999999999999463d);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999998333297d, 116);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 18, 0.5727036995171034d, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 18");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 3, (int) (byte) 1);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((int) 'a');
        double double11 = poissonDistributionImpl2.cumulativeProbability((int) (short) 0, 6);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(4.864649182067619E-63d);
        int[] intArray15 = poissonDistributionImpl2.sample((int) (short) 100);
        int int16 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 6, 5, 9, 8, 11, 8, 11, 8, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.719682636442159E-60d + "'", double8 == 4.719682636442159E-60d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.130141420882483d + "'", double11 == 0.130141420882483d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[6, 10, 13, 10, 4, 5, 10, 12, 17, 11, 9, 8, 6, 12, 10, 9, 15, 7, 10, 9, 8, 12, 7, 13, 7, 10, 8, 11, 11, 8, 11, 15, 5, 11, 9, 13, 12, 16, 10, 24, 15, 11, 17, 9, 5, 13, 10, 13, 9, 15, 6, 9, 9, 14, 19, 7, 8, 16, 11, 9, 14, 12, 9, 10, 16, 14, 9, 11, 11, 12, 14, 10, 8, 6, 7, 12, 13, 10, 13, 10, 12, 17, 10, 9, 10, 9, 13, 11, 4, 14, 10, 5, 11, 6, 12, 11, 8, 13, 8, 7]");
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999998885745217d, 9998694);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.9165415270653469d);
        double double6 = poissonDistributionImpl2.probability(2);
        double double7 = poissonDistributionImpl2.getMean();
        double double8 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.18393970009014876d + "'", double6 == 0.18393970009014876d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999998885745217d + "'", double7 == 0.9999998885745217d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999998885745217d + "'", double8 == 0.9999998885745217d);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.483363584418453E-97d, 0.11373639611012118d, 0);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 8, (double) (short) 100, 13);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(2.5330104258464705E-51d);
        double double7 = poissonDistributionImpl3.cumulativeProbability((double) 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.13768510870919E-30d, 0.027164443219597104d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(2147483647, 35);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, 0.771175349528829d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(8);
        double double6 = poissonDistributionImpl2.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9999546011008144d + "'", double6 == 0.9999546011008144d);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999997884584183d, 0.0013315596295692678d);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L, 1.0E-12d, (int) (byte) -1);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.972958390215201d, 0.9769178379571382d);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5830397501930291d, 0.11858007600857041d);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.130141420882483d);
        java.lang.Class<?> wildcardClass2 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 0.9999546011008144d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, 4.993992273873336E-4d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(11);
        double double7 = poissonDistributionImpl3.normalApproximateProbability((int) (short) 0);
        double double10 = poissonDistributionImpl3.cumulativeProbability((int) (byte) -1, 14);
        double double11 = poissonDistributionImpl3.getMean();
        int int12 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.797671619036357d + "'", double5 == 0.797671619036357d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0023032661316959024d + "'", double7 == 0.0023032661316959024d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9585423276538875d + "'", double10 == 0.9585423276538875d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 9.0d + "'", double11 == 9.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        int int4 = poissonDistributionImpl2.sample();
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0, 35);
        double double8 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999998333297d + "'", double7 == 0.9999999998333297d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 1);
        int int14 = poissonDistributionImpl2.sample();
        int int16 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double18 = poissonDistributionImpl2.cumulativeProbability(13.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.8644644226193212d + "'", double18 == 0.8644644226193212d);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (int) (short) 10);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 5, 11, 12, 8, 13, 11, 11, 10, 8]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        int[] intArray9 = poissonDistributionImpl2.sample((int) 'a');
        double double10 = poissonDistributionImpl2.getMean();
        int[] intArray12 = poissonDistributionImpl2.sample(4);
        int int13 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 8, 14, 13, 13, 18, 7, 7, 11, 15, 10, 18, 9, 7, 7, 9, 10, 15, 7, 13, 11, 7, 14, 9, 9, 17, 6, 9, 13, 13, 9, 4, 8, 11, 7, 10, 5, 12, 8, 10, 9, 6, 11, 13, 8, 10, 4, 11, 6, 15, 9, 9, 10, 12, 10, 11, 9, 9, 16, 5, 8, 5, 10, 13, 11, 17, 8, 12, 13, 7, 14, 13, 9, 10, 9, 12, 9, 4, 9, 11, 6, 17, 7, 13, 11, 9, 10, 9, 10, 6, 10, 14, 12, 15, 10, 5, 12]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[14, 13, 11, 10]");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.probability((int) (byte) -1);
        double double11 = poissonDistributionImpl2.probability((int) (short) 0);
        double double13 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.5399929762484854E-5d + "'", double11 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0013315596295692678d + "'", double13 == 0.0013315596295692678d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2, 0.6321205588285574d);
        int[] intArray4 = poissonDistributionImpl2.sample(1);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[2]");
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        int int5 = poissonDistributionImpl2.inverseCumulativeProbability(0.13553557721400844d);
        double double7 = poissonDistributionImpl2.cumulativeProbability(3.8243984514608465E-153d);
        double double8 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, (double) 10, 14);
        double double5 = poissonDistributionImpl3.probability(0.13553557721400844d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability(5.907792072437627E-11d, 0.1251100357211333d);
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
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        int[] intArray5 = poissonDistributionImpl3.sample((int) '#');
        double double7 = poissonDistributionImpl3.cumulativeProbability((double) (short) 100);
        double double10 = poissonDistributionImpl3.cumulativeProbability(0.0d, 9.0d);
        int int12 = poissonDistributionImpl3.inverseCumulativeProbability(0.9585423276538875d);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[11, 13, 4, 12, 11, 8, 8, 12, 8, 8, 12, 10, 7, 8, 6, 8, 9, 9, 14, 12, 5, 9, 18, 10, 13, 14, 16, 7, 10, 10, 10, 9, 17, 4, 10]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.8748899642788661d + "'", double10 == 0.8748899642788661d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.9261578838188795d);
        double double6 = poissonDistributionImpl2.probability((double) 91);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.539992976248491E-5d + "'", double4 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.3579791762842475E-54d + "'", double6 == 3.3579791762842475E-54d);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999546021313444d, 33);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability((int) (byte) 1);
        double double7 = poissonDistributionImpl2.cumulativeProbability((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999546021313444d + "'", double3 == 0.9999546021313444d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.3678794407923373d + "'", double5 == 0.3678794407923373d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.999999989956835d + "'", double7 == 0.999999989956835d);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        int int5 = poissonDistributionImpl2.sample();
        double double7 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 100);
        double double8 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 13, 7, 10, 10, 8, 13, 11, 4, 10]");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 98);
        double double3 = poissonDistributionImpl1.cumulativeProbability(0.13553557721400844d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl1.cumulativeProbability((int) ' ', 29);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.7487850079102307E-43d + "'", double3 == 2.7487850079102307E-43d);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 9, (double) 10, 14);
        int int4 = poissonDistributionImpl3.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double8 = poissonDistributionImpl2.cumulativeProbability(11);
        int[] intArray10 = poissonDistributionImpl2.sample(93);
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6967761463031481d + "'", double8 == 0.6967761463031481d);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[7, 11, 8, 8, 6, 14, 18, 7, 10, 14, 12, 11, 7, 9, 9, 10, 12, 7, 6, 10, 10, 22, 9, 9, 11, 14, 4, 4, 9, 9, 8, 13, 12, 14, 9, 4, 10, 11, 9, 9, 6, 9, 3, 19, 5, 11, 8, 7, 8, 3, 17, 7, 10, 14, 13, 8, 8, 16, 10, 9, 11, 12, 7, 10, 7, 7, 11, 10, 10, 5, 6, 5, 4, 11, 13, 14, 8, 14, 11, 14, 11, 13, 8, 12, 9, 14, 16, 7, 14, 12, 7, 12, 13]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 8, (-1));
        double double4 = poissonDistributionImpl2.probability(0.797671619036357d);
        double double6 = poissonDistributionImpl2.probability(4.3936199123351116E-10d);
        int int7 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) (-1.0f), 11);
        double double4 = poissonDistributionImpl3.getMean();
        double double6 = poissonDistributionImpl3.probability(7);
        double double8 = poissonDistributionImpl3.normalApproximateProbability(98);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.381103127025518E-34d + "'", double6 == 7.381103127025518E-34d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4403823076297575d + "'", double8 == 0.4403823076297575d);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.5727036995171034d);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = poissonDistributionImpl2.inverseCumulativeProbability((double) 96);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample((int) 'a');
        double double10 = poissonDistributionImpl2.cumulativeProbability(100);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[4, 11, 10, 12, 8, 4, 6, 8, 6, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[18, 16, 6, 4, 6, 11, 7, 9, 16, 11, 9, 11, 7, 4, 6, 12, 8, 4, 13, 10, 15, 5, 12, 8, 7, 6, 9, 13, 11, 9, 5, 11, 8, 14, 16, 13, 10, 5, 10, 7, 9, 12, 14, 5, 14, 10, 10, 9, 10, 4, 14, 12, 8, 8, 6, 15, 9, 12, 12, 12, 10, 9, 11, 7, 5, 6, 7, 12, 7, 8, 13, 6, 9, 9, 6, 5, 7, 17, 8, 10, 12, 7, 12, 8, 10, 7, 9, 10, 7, 9, 15, 10, 9, 4, 7, 11, 13]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6613041990368613d, 0.6321205588285574d);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.130141420882483d);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = poissonDistributionImpl1.cumulativeProbability(1.0170832425715481E-6d, 3.815366131842834E-14d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability(0.7854023497798255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.probability((int) (byte) -1);
        double double11 = poissonDistributionImpl2.probability((int) (short) 0);
        double double13 = poissonDistributionImpl2.cumulativeProbability(0.0d);
        double double15 = poissonDistributionImpl2.cumulativeProbability(9998694);
        double double18 = poissonDistributionImpl2.cumulativeProbability((int) 'a', 9998694);
        double double20 = poissonDistributionImpl2.probability((int) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.5399929762484854E-5d + "'", double11 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.539992976248491E-5d + "'", double13 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.719682636442159E-60d + "'", double20 == 4.719682636442159E-60d);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100L, 9);
        double double3 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 1);
        double double3 = poissonDistributionImpl1.probability(100.0d);
        double double5 = poissonDistributionImpl1.cumulativeProbability(1.8600379880104138E-40d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.941866060050443E-159d + "'", double3 == 3.941866060050443E-159d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.36787944117146065d + "'", double5 == 0.36787944117146065d);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3328196787507197d, (int) (short) -1);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.22022064660169965d, 20);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        int[] intArray8 = poissonDistributionImpl2.sample((int) 'a');
        double double11 = poissonDistributionImpl2.cumulativeProbability(17, 10000000);
        double double13 = poissonDistributionImpl2.probability((double) 2147483647);
        double double15 = poissonDistributionImpl2.probability((double) 100);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 8, 14, 14, 8, 10, 15, 13, 7, 5]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[13, 11, 9, 5, 11, 12, 9, 11, 5, 4, 10, 7, 17, 14, 7, 12, 15, 11, 6, 8, 7, 6, 10, 10, 7, 10, 13, 18, 13, 10, 11, 7, 7, 7, 8, 12, 10, 11, 14, 11, 14, 7, 8, 8, 10, 11, 9, 13, 11, 12, 13, 10, 13, 12, 14, 12, 13, 10, 9, 11, 8, 10, 12, 9, 9, 11, 12, 16, 9, 8, 19, 10, 15, 10, 12, 12, 15, 12, 7, 8, 8, 7, 8, 9, 6, 8, 9, 8, 8, 8, 12, 13, 11, 12, 14, 11, 14]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.02704160978479897d + "'", double11 == 0.02704160978479897d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.864649182067619E-63d + "'", double15 == 4.864649182067619E-63d);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.2284082830424716E-9d, 0);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        int int9 = poissonDistributionImpl2.sample();
        double double12 = poissonDistributionImpl2.cumulativeProbability(96, 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = poissonDistributionImpl2.cumulativeProbability(29, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 13, 15, 18, 8, 8, 12, 6, 14, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.06680720126885803d, (double) 100, 5);
        double double4 = poissonDistributionImpl3.getMean();
        int int6 = poissonDistributionImpl3.inverseCumulativeProbability(0.972958390215201d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.06680720126885803d + "'", double4 == 0.06680720126885803d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999998885745217d, 9998694);
        double double4 = poissonDistributionImpl2.probability(7);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.299190381441515E-5d + "'", double4 == 7.299190381441515E-5d);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        double double11 = poissonDistributionImpl2.normalApproximateProbability(13);
        double double13 = poissonDistributionImpl2.cumulativeProbability(11);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8658091863536196d + "'", double11 == 0.8658091863536196d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6967761463031481d + "'", double13 == 0.6967761463031481d);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (-1));
        poissonDistributionImpl2.reseedRandomGenerator((long) 5);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(4.578092157348709E-59d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 10");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 98, (int) '#');
        int[] intArray4 = poissonDistributionImpl2.sample(23);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[113, 105, 117, 110, 91, 69, 95, 105, 89, 107, 100, 109, 96, 95, 108, 121, 90, 88, 81, 94, 101, 94, 73]");
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0);
        double double8 = poissonDistributionImpl2.probability((int) (byte) 0);
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484854E-5d + "'", double8 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double10 = poissonDistributionImpl2.probability(9998694);
        double double12 = poissonDistributionImpl2.cumulativeProbability(100);
        double double14 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        int[] intArray16 = poissonDistributionImpl2.sample(10);
        double double17 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator(10L);
        int int21 = poissonDistributionImpl2.inverseCumulativeProbability(0.012763996187751522d);
        double double23 = poissonDistributionImpl2.probability(0.0d);
        double double25 = poissonDistributionImpl2.cumulativeProbability(0.771175349528829d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[14, 9, 8, 9, 10, 11, 14, 7, 9, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[7, 4, 5, 5, 8, 9, 12, 11, 15, 7]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.5399929762484854E-5d + "'", double23 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.539992976248491E-5d + "'", double25 == 4.539992976248491E-5d);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        double double5 = poissonDistributionImpl3.probability(9998694);
        int[] intArray7 = poissonDistributionImpl3.sample(35);
        double double9 = poissonDistributionImpl3.probability((int) (byte) 0);
        double double11 = poissonDistributionImpl3.probability(16);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 13, 6, 11, 12, 12, 9, 9, 10, 10, 5, 7, 7, 7, 7, 12, 14, 6, 9, 11, 10, 8, 18, 4, 13, 20, 6, 9, 5, 15, 11, 6, 10, 7, 11]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.021698793519177532d + "'", double11 == 0.021698793519177532d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(7);
        double double13 = poissonDistributionImpl2.normalApproximateProbability(8);
        int int15 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double17 = poissonDistributionImpl2.cumulativeProbability(16);
        double double19 = poissonDistributionImpl2.probability((double) 9);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.22022064660169965d + "'", double11 == 0.22022064660169965d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.31762814799862416d + "'", double13 == 0.31762814799862416d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.972958390215201d + "'", double17 == 0.972958390215201d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.1251100357211333d + "'", double19 == 0.1251100357211333d);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (double) 1.0f, (int) '4');
        double double5 = poissonDistributionImpl3.probability(9998694);
        int[] intArray7 = poissonDistributionImpl3.sample(35);
        double double9 = poissonDistributionImpl3.probability((int) (byte) 0);
        double double11 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = poissonDistributionImpl3.cumulativeProbability(35, 5);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[12, 10, 11, 6, 11, 7, 9, 11, 13, 3, 8, 11, 9, 13, 12, 13, 14, 9, 13, 8, 6, 8, 11, 11, 9, 12, 13, 11, 7, 14, 6, 14, 9, 11, 15]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.003594758625082517d + "'", double11 == 0.003594758625082517d);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.578092157348709E-59d, 0.5830397501930291d);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 26, 0.03471806963068409d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999998987770551d + "'", double4 == 0.9999998987770551d);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.13768510870919E-30d, 0.027164443219597104d);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double8 = poissonDistributionImpl2.cumulativeProbability(6, 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double15 = poissonDistributionImpl2.cumulativeProbability(4, (int) (short) 10);
        int int16 = poissonDistributionImpl2.sample();
        double double18 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) -1);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.932914037120968d + "'", double8 == 0.932914037120968d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5727036995171034d + "'", double15 == 0.5727036995171034d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.49456394057024E-4d + "'", double18 == 4.49456394057024E-4d);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability((double) 1L);
        double double7 = poissonDistributionImpl3.probability((double) 0);
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) 10);
        int[] intArray11 = poissonDistributionImpl3.sample(29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.720075976020836E-44d + "'", double7 == 3.720075976020836E-44d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[93, 107, 98, 129, 94, 94, 104, 104, 83, 98, 96, 97, 98, 92, 101, 93, 95, 102, 113, 99, 108, 98, 110, 85, 85, 88, 90, 82, 108]");
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999546000702375d, 0.0d);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        int[] intArray7 = poissonDistributionImpl2.sample(100);
        double double9 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double14 = poissonDistributionImpl2.cumulativeProbability((double) 6, (double) '#');
        double double17 = poissonDistributionImpl2.cumulativeProbability(10, 10);
        double double19 = poissonDistributionImpl2.probability(0.0d);
        double double20 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 6);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 9, 12, 6, 10, 14, 10, 10, 9, 12, 9, 8, 12, 11, 12, 10, 8, 6, 9, 12, 9, 9, 9, 13, 11, 8, 6, 11, 7, 10, 8, 15, 7, 6, 7, 9, 6, 13, 8, 10, 12, 18, 6, 13, 16, 10, 10, 17, 9, 11, 8, 11, 10, 13, 10, 9, 10, 9, 12, 13, 15, 17, 9, 17, 2, 10, 11, 8, 8, 7, 6, 5, 14, 6, 9, 9, 14, 11, 5, 6, 10, 11, 9, 13, 12, 12, 18, 10, 4, 10, 14, 16, 11, 12, 8, 10, 8, 7, 14, 12]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9329140369542976d + "'", double14 == 0.9329140369542976d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.12511003572113744d + "'", double17 == 0.12511003572113744d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.5399929762484854E-5d + "'", double19 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        double double9 = poissonDistributionImpl2.getMean();
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.10993981424841087d);
        double double13 = poissonDistributionImpl2.probability((double) (short) -1);
        double double14 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(9.404873445868597E-8d, (double) (short) -1);
        double double4 = poissonDistributionImpl2.probability(94);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', 0.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        double double5 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, (double) 'a', 1);
        double double5 = poissonDistributionImpl3.probability(4.993992273873336E-4d);
        double double7 = poissonDistributionImpl3.cumulativeProbability(0.029252688076961124d);
        int[] intArray9 = poissonDistributionImpl3.sample(36);
        double double11 = poissonDistributionImpl3.cumulativeProbability(0.9329140369542976d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999546021313444d + "'", double7 == 0.9999546021313444d);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9999546021313444d + "'", double11 == 0.9999546021313444d);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.03751294493110752d, 1);
        double double4 = poissonDistributionImpl2.probability((double) 29);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.880037291681325E-73d + "'", double4 == 4.880037291681325E-73d);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, (double) 98);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999997490048799d, 0.02704160978479897d);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test906");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        double double6 = poissonDistributionImpl2.cumulativeProbability(0.5830397501930291d);
        double double8 = poissonDistributionImpl2.probability(1.8306160934240197E-33d);
        double double10 = poissonDistributionImpl2.cumulativeProbability(16);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.539992976248491E-5d + "'", double6 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.972958390215201d + "'", double10 == 0.972958390215201d);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test907");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 100);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.probability((double) 0.0f);
        int int8 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.0d, 0.8160602794142788d);
        double double13 = poissonDistributionImpl2.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.5399929762484854E-5d + "'", double7 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.539992976248491E-5d + "'", double13 == 4.539992976248491E-5d);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test908");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((int) (short) 0, 23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (10) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test909");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double10 = poissonDistributionImpl2.probability(9998694);
        double double12 = poissonDistributionImpl2.cumulativeProbability(100);
        double double14 = poissonDistributionImpl2.normalApproximateProbability((int) '4');
        int[] intArray16 = poissonDistributionImpl2.sample(10);
        double double17 = poissonDistributionImpl2.getMean();
        double double19 = poissonDistributionImpl2.normalApproximateProbability(18);
        double double21 = poissonDistributionImpl2.probability(10000000);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[14, 5, 12, 6, 7, 10, 8, 7, 8, 6]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0013315596295692678d + "'", double8 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[16, 6, 10, 14, 8, 7, 6, 13, 7, 11]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9964052413749175d + "'", double19 == 0.9964052413749175d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test910");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, 0.771175349528829d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(8);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test911");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 15, (double) 100L);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.07290794622443657d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test912");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        poissonDistributionImpl2.reseedRandomGenerator(100L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(7);
        double double13 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 10);
        double double14 = poissonDistributionImpl2.getMean();
        int int15 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.539992976248491E-5d + "'", double7 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.22022064660169965d + "'", double11 == 0.22022064660169965d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.562816469418554d + "'", double13 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test913");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d, (double) 12);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test914");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.993992273873336E-4d, 6);
        double double3 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.993992273873336E-4d + "'", double3 == 4.993992273873336E-4d);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test915");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        int int4 = poissonDistributionImpl2.sample();
        int int5 = poissonDistributionImpl2.sample();
        int int6 = poissonDistributionImpl2.sample();
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.9769178379571382d);
        double double10 = poissonDistributionImpl2.probability(3.75727673578106E-42d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test916");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000, (double) 1, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability((double) 10L);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(68);
        int int8 = poissonDistributionImpl3.sample();
        int[] intArray10 = poissonDistributionImpl3.sample((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10006959 + "'", int8 == 10006959);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[9999309, 10002981, 10001907, 10000538, 10002006, 10003464, 10002205, 10002992, 10001290, 10000786, 9995667, 10003103, 10004266, 9996592, 10004242, 10002008, 9999270, 9996080, 9996675, 10000369, 9994427, 9999265, 10000774, 9997996, 9998891, 10004671, 10004547, 9995960, 9999862, 10005915, 9995303, 9998096, 10002632, 9995810, 9997318, 9998749, 9995202, 10000931, 10000749, 10000540, 9995389, 9998427, 9998921, 9999780, 9997335, 10006452, 9998333, 9999079, 10002046, 10001283, 9996479, 10004111, 10002391, 9999859, 9994469, 9995070, 9998906, 9999563, 10002196, 9994218, 10001553, 9996009, 9994313, 10000014, 9994533, 10002744, 10003634, 9993965, 9998315, 9998360, 10003319, 9999569, 9999625, 10002345, 10002032, 10001372, 10005757, 9999583, 9997425, 10003074, 9994929, 9992715, 10002303, 10001262, 9994146, 9996893, 9994946, 9999609, 9998522, 9998986, 10005323, 10004070, 10003841, 10002241, 10002280, 9999912, 10001613, 9994832, 10002517, 10003412]");
    }
}
