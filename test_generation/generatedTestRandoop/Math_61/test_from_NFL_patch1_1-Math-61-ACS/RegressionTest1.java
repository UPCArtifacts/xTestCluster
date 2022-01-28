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
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) (short) 0, 0);
        int int10 = poissonDistributionImpl2.inverseCumulativeProbability(0.06431656716352042d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.539992976248491E-5d + "'", double8 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.007091108993195285d, 0.0d, (int) (byte) 1);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, 1.0251066712595435E-50d);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.7200759760208177E-44d, 15);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, 0.9999999827462528d, (int) (short) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability(2);
        double double7 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.001210542580544489d + "'", double5 == 0.001210542580544489d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.6701700790245663E-5d + "'", double7 == 1.6701700790245663E-5d);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) (byte) -1);
        double double9 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-12d + "'", double9 == 1.0E-12d);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(16);
        int int6 = poissonDistributionImpl3.sample();
        int[] intArray8 = poissonDistributionImpl3.sample(9);
        poissonDistributionImpl3.reseedRandomGenerator((long) 8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.551115123125783E-17d + "'", double5 == 5.551115123125783E-17d);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[105, 103, 105, 114, 94, 121, 99, 119, 95]");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 0.9857223864029524d, 0);
        double double4 = poissonDistributionImpl3.getMean();
        double double6 = poissonDistributionImpl3.probability((double) 2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0022699964881242427d + "'", double6 == 0.0022699964881242427d);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(115, (int) (byte) -1);
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
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.7200759760208177E-44d, 14);
        double double4 = poissonDistributionImpl2.cumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.2041427794837412E-182d, 0.9999966023268753d);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10L);
        java.lang.Class<?> wildcardClass2 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.cumulativeProbability(10.0d);
        int[] intArray6 = poissonDistributionImpl2.sample(10);
        poissonDistributionImpl2.reseedRandomGenerator((long) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5830397501930291d + "'", double4 == 0.5830397501930291d);
        org.junit.Assert.assertNotNull(intArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[7, 12, 9, 12, 5, 11, 11, 12, 7, 7]");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.068466217984994E-249d, (double) (-1));
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = poissonDistributionImpl2.inverseCumulativeProbability((double) '#');
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
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.068466217984994E-249d, (double) (-1));
        double double4 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl2.cumulativeProbability(9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (10,000,000) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 8, 0.21459765022017452d, (int) ' ');
        double double6 = poissonDistributionImpl3.cumulativeProbability(2, 4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.09512761662664079d + "'", double6 == 0.09512761662664079d);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.3936204059180545E-10d, 4.5399929762484866E-4d, (int) 'a');
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 12);
        double double6 = poissonDistributionImpl2.probability((int) (byte) -1);
        int int7 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.probability(7);
        double double11 = poissonDistributionImpl2.probability((int) (short) -1);
        int[] intArray13 = poissonDistributionImpl2.sample(5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.9841269841250204E-88d + "'", double9 == 1.9841269841250204E-88d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(16);
        int int6 = poissonDistributionImpl3.sample();
        double double8 = poissonDistributionImpl3.cumulativeProbability(12);
        int[] intArray10 = poissonDistributionImpl3.sample(115);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.551115123125783E-17d + "'", double5 == 5.551115123125783E-17d);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.812003267147539E-29d + "'", double8 == 8.812003267147539E-29d);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[104, 89, 102, 105, 91, 94, 109, 85, 99, 94, 93, 109, 81, 99, 96, 93, 102, 97, 102, 109, 118, 104, 93, 94, 88, 119, 97, 103, 109, 105, 96, 109, 105, 118, 108, 100, 107, 123, 112, 92, 89, 117, 95, 104, 119, 89, 101, 118, 110, 72, 111, 98, 102, 97, 110, 104, 92, 98, 104, 100, 92, 107, 108, 109, 114, 95, 98, 102, 94, 96, 94, 93, 99, 94, 106, 115, 108, 93, 95, 82, 95, 100, 113, 86, 127, 114, 115, 83, 116, 98, 90, 113, 86, 98, 107, 98, 105, 89, 94, 92, 102, 102, 116, 99, 94, 102, 102, 89, 92, 85, 94, 87, 96, 95, 98]");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, 100.0d, 100);
        int[] intArray5 = poissonDistributionImpl3.sample(11);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = poissonDistributionImpl3.cumulativeProbability(0.09478033009176766d, 4.799682873368738E-10d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, (double) 101, 9997830);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 3.7200759760208177E-44d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 0);
        double double8 = poissonDistributionImpl2.probability((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.894027824574005E-32d + "'", double8 == 9.894027824574005E-32d);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double13 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 10);
        double double14 = poissonDistributionImpl2.getMean();
        int int15 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.562816469418554d + "'", double13 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999998333319d);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 10, (int) '4');
        double double4 = poissonDistributionImpl2.probability((double) 10L);
        double double5 = poissonDistributionImpl2.getMean();
        int[] intArray7 = poissonDistributionImpl2.sample(5);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[16, 11, 13, 7, 9]");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 7, 100.0d, 0);
        poissonDistributionImpl3.reseedRandomGenerator((long) (byte) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl3.cumulativeProbability(0.9605336665255937d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 7");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = poissonDistributionImpl2.cumulativeProbability(0.04820460841292379d, 0.0013315596295692678d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 6, 12, 10, 12, 6, 7, 15, 8, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(8.812003267147539E-29d, 0.01991630962237073d, 9);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 6, 4.5399929762484845E-4d, (int) (short) 1);
        double double5 = poissonDistributionImpl3.probability(0.11259903214901994d);
        int[] intArray7 = poissonDistributionImpl3.sample(93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[7, 6, 3, 6, 7, 5, 7, 6, 2, 7, 9, 6, 10, 4, 5, 9, 4, 4, 4, 1, 6, 5, 8, 7, 5, 12, 6, 8, 4, 5, 8, 6, 5, 8, 10, 7, 7, 6, 9, 8, 9, 7, 7, 4, 5, 2, 5, 1, 5, 8, 5, 8, 8, 4, 4, 4, 2, 7, 9, 5, 6, 8, 6, 6, 5, 5, 4, 5, 5, 9, 8, 3, 7, 2, 7, 8, 8, 12, 4, 7, 5, 5, 9, 6, 7, 3, 8, 7, 7, 11, 3, 8, 4]");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) '4', 1.0137771196302933E-7d, 0);
        int[] intArray5 = poissonDistributionImpl3.sample(94);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[48, 51, 59, 58, 51, 54, 51, 39, 44, 57, 49, 59, 61, 58, 55, 55, 55, 55, 49, 64, 32, 52, 59, 50, 59, 57, 51, 51, 56, 42, 60, 57, 43, 52, 55, 45, 61, 64, 54, 57, 50, 62, 50, 58, 51, 64, 57, 45, 49, 56, 45, 46, 58, 42, 54, 48, 60, 58, 59, 61, 57, 64, 57, 53, 43, 57, 53, 54, 51, 54, 42, 60, 48, 55, 64, 58, 55, 48, 45, 52, 45, 63, 56, 52, 61, 51, 47, 59, 46, 58, 64, 37, 47, 49]");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6524402995507083E-19d, 3.720075976020796E-42d, 4);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 5, 0.0d);
        double double4 = poissonDistributionImpl2.probability(0.9999999998333297d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 12);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability((int) '4', 16);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5829943502632666d, 3.7200759760208177E-44d, 0);
        int[] intArray5 = poissonDistributionImpl3.sample(88);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 2, 1, 1, 0, 0, 1, 0, 0, 0, 3, 1, 0, 0, 1, 0, 0, 3, 1, 0, 2, 1, 1, 1, 1, 2, 0, 1, 1, 1, 0, 0, 1, 0, 1, 3, 0, 2, 0, 1, 1, 0, 1, 2, 0, 1, 0, 0, 1, 0, 2, 1, 0, 0, 3]");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.07290794622443657d);
        poissonDistributionImpl1.reseedRandomGenerator((long) 9);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability(1);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 0, (int) (byte) 100);
        double double8 = poissonDistributionImpl2.getMean();
        double double10 = poissonDistributionImpl2.probability((double) ' ');
        double double11 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7357588823428858d + "'", double4 == 0.7357588823428858d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.3980856271290693E-36d + "'", double10 == 1.3980856271290693E-36d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) -1);
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5582243423023643d, 1.6701700790245663E-5d);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.003594758625082517d);
        int int6 = poissonDistributionImpl2.inverseCumulativeProbability(0.003594758625082517d);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.04820460841292379d, 4.49456394057024E-4d);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 12);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability(79, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int10 = poissonDistributionImpl2.inverseCumulativeProbability(0.1103970707165003d);
        double double12 = poissonDistributionImpl2.probability(115);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 4, 13, 5, 12, 16, 20, 13, 11, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.5520846345359742E-78d + "'", double12 == 1.5520846345359742E-78d);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((double) 1);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.normalApproximateProbability(11);
        int int12 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 10000000);
        double double16 = poissonDistributionImpl2.cumulativeProbability(0.43718353058144593d);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = poissonDistributionImpl2.inverseCumulativeProbability((double) 110);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 9, 12, 11, 9, 6, 5, 12, 11, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484845E-4d + "'", double8 == 4.5399929762484845E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6823718520013758d + "'", double11 == 0.6823718520013758d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.539992976248491E-5d + "'", double16 == 4.539992976248491E-5d);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((double) 1);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.normalApproximateProbability((-1));
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 7, 6, 9, 6, 13, 7, 12, 14, 6]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484845E-4d + "'", double8 == 4.5399929762484845E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.49456394057024E-4d + "'", double11 == 4.49456394057024E-4d);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double8 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.932914037120968d);
        int[] intArray10 = poissonDistributionImpl3.sample(1);
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.7200759760208177E-44d + "'", double5 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.7200759760208177E-44d + "'", double8 == 3.7200759760208177E-44d);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability(0.5830397501930291d);
        int int6 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.cumulativeProbability(3.720075976020836E-44d, (double) 10007188);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.539992976248491E-5d + "'", double5 == 4.539992976248491E-5d);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9999546000702375d + "'", double9 == 0.9999546000702375d);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d, 3.7200759760208177E-44d);
        double double4 = poissonDistributionImpl2.probability((int) (byte) 100);
        double double6 = poissonDistributionImpl2.probability(6);
        double double8 = poissonDistributionImpl2.probability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.986240122026397E-18d + "'", double6 == 2.986240122026397E-18d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.894027824574005E-32d + "'", double8 == 9.894027824574005E-32d);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 108, 6);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', (int) (short) 0);
        poissonDistributionImpl2.reseedRandomGenerator((long) '#');
        double double6 = poissonDistributionImpl2.normalApproximateProbability(104);
        java.lang.Class<?> wildcardClass7 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7768236335766507d + "'", double6 == 0.7768236335766507d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 100, 0.007091108993195285d);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9605336665255937d, 0.4579297144718917d, (int) 'a');
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9226355382573108d, 0.9999999827462528d);
        double double4 = poissonDistributionImpl2.cumulativeProbability((-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(17);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 5, 5, 15, 15, 7, 7, 14, 6, 4]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9857223864029524d + "'", double11 == 0.9857223864029524d);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.normalApproximateProbability(14);
        double double9 = poissonDistributionImpl2.probability(1.0342773236060213E-15d);
        int int10 = poissonDistributionImpl2.sample();
        double double13 = poissonDistributionImpl2.cumulativeProbability(9, 110);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9226355382573108d + "'", double7 == 0.9226355382573108d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.6671803212492803d + "'", double13 == 0.6671803212492803d);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.308537538725987d, 11);
        int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.probability((double) ' ');
        double double10 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double12 = poissonDistributionImpl2.cumulativeProbability((double) '#');
        double double14 = poissonDistributionImpl2.cumulativeProbability(3);
        double double16 = poissonDistributionImpl2.normalApproximateProbability(17);
        int[] intArray18 = poissonDistributionImpl2.sample(7);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 7, 9, 9, 7, 9, 13, 14, 8, 5]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7253747334040217E-8d + "'", double8 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999998333297d + "'", double12 == 0.9999999998333297d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.010336050675925733d + "'", double14 == 0.010336050675925733d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9911469670963167d + "'", double16 == 0.9911469670963167d);
        org.junit.Assert.assertNotNull(intArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[16, 9, 6, 13, 14, 12, 10]");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 88, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        int[] intArray12 = poissonDistributionImpl2.sample(13);
        int int13 = poissonDistributionImpl2.sample();
        double double15 = poissonDistributionImpl2.probability(7);
        int int16 = poissonDistributionImpl2.sample();
        double double18 = poissonDistributionImpl2.probability(88);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 18, 7, 10, 9, 17, 7, 10, 8, 4]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[13, 14, 9, 7, 7, 9, 6, 8, 11, 10, 16, 14, 11]");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.09007922571921603d + "'", double15 == 0.09007922571921603d);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.4476646013852358E-51d + "'", double18 == 2.4476646013852358E-51d);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, 4.539992976248491E-5d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.probability(0.43718353058144593d);
        int int7 = poissonDistributionImpl3.inverseCumulativeProbability(0.9999546021313444d);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = poissonDistributionImpl3.inverseCumulativeProbability((double) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 24 + "'", int7 == 24);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (byte) -1);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(0);
        double double8 = poissonDistributionImpl2.normalApproximateProbability(10000000);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, 0.7915564763949167d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator(0L);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0.999999982746253d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[12, 11, 12, 12, 10, 10, 13, 16, 10, 6]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double8 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.932914037120968d);
        int[] intArray10 = poissonDistributionImpl3.sample(1);
        double double12 = poissonDistributionImpl3.normalApproximateProbability((-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.7200759760208177E-44d + "'", double5 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.7200759760208177E-44d + "'", double8 == 3.7200759760208177E-44d);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[87]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability((double) 8);
        double double10 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3328196787507197d + "'", double7 == 0.3328196787507197d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.993992273873336E-4d + "'", double10 == 4.993992273873336E-4d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, 100.0d, 100);
        int[] intArray5 = poissonDistributionImpl3.sample(11);
        double double7 = poissonDistributionImpl3.probability((int) (short) 0);
        double double9 = poissonDistributionImpl3.cumulativeProbability(4.5399929762484845E-4d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999827462528d + "'", double7 == 0.9999999827462528d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.999999982746253d + "'", double9 == 0.999999982746253d);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1L, (double) (byte) -1, (int) (short) 10);
        double double5 = poissonDistributionImpl3.normalApproximateProbability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, 5.628682978044818E-21d, 0);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10, 0.4579297144718917d);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        poissonDistributionImpl2.reseedRandomGenerator(10L);
        double double7 = poissonDistributionImpl2.cumulativeProbability(0.7357588823428858d, (double) 10);
        double double9 = poissonDistributionImpl2.normalApproximateProbability(79);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7253747208734183E-8d + "'", double7 == 1.7253747208734183E-8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double12 = poissonDistributionImpl2.getMean();
        int[] intArray14 = poissonDistributionImpl2.sample((int) (byte) 0);
        int int16 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0L);
        double double18 = poissonDistributionImpl2.probability(3);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.007566654960414148d + "'", double18 == 0.007566654960414148d);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        double double7 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = poissonDistributionImpl2.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        int int8 = poissonDistributionImpl2.sample();
        double double10 = poissonDistributionImpl2.probability(6);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = poissonDistributionImpl2.cumulativeProbability(10000000, (int) '4');
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
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.06305545800345122d + "'", double10 == 0.06305545800345122d);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999827462528d, 6);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double10 = poissonDistributionImpl2.cumulativeProbability(1.7253747334040217E-8d);
        double double12 = poissonDistributionImpl2.cumulativeProbability(0.7915110764651542d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.539992976248491E-5d + "'", double12 == 4.539992976248491E-5d);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double7 = poissonDistributionImpl3.cumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.7200759760208177E-44d + "'", double5 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.404873445868597E-8d + "'", double7 == 9.404873445868597E-8d);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1L, 7.0d, (int) (byte) 0);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, 100.0d, 100);
        int[] intArray5 = poissonDistributionImpl3.sample(11);
        double double7 = poissonDistributionImpl3.probability((int) (short) -1);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(1.0E-12d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 4);
        java.lang.Class<?> wildcardClass12 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2, 1.9841269841250204E-88d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(18);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9999999999993523d + "'", double4 == 0.9999999999993523d);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        int int10 = poissonDistributionImpl2.sample();
        int[] intArray12 = poissonDistributionImpl2.sample(101);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[4, 17, 16, 16, 8, 16, 11, 10, 12, 4]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[9, 13, 10, 12, 7, 16, 16, 14, 8, 10, 7, 12, 3, 7, 12, 17, 6, 15, 8, 7, 11, 7, 9, 13, 9, 9, 12, 7, 9, 12, 6, 6, 8, 15, 11, 10, 8, 15, 10, 4, 10, 17, 9, 11, 11, 10, 10, 7, 7, 8, 10, 8, 13, 6, 8, 12, 10, 11, 9, 12, 9, 7, 4, 14, 9, 7, 13, 12, 9, 5, 8, 6, 13, 9, 8, 10, 9, 10, 6, 11, 8, 9, 12, 13, 9, 11, 4, 13, 10, 6, 14, 11, 6, 8, 7, 8, 9, 5, 8, 13, 4]");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (short) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 3);
        int[] intArray8 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double10 = poissonDistributionImpl2.cumulativeProbability(4);
        java.lang.Class<?> wildcardClass11 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0, 1, 2, 2, 4, 1, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9963401531726563d + "'", double10 == 0.9963401531726563d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double5 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        double double5 = poissonDistributionImpl2.cumulativeProbability(0.07290794622443657d, (double) 9);
        double double7 = poissonDistributionImpl2.normalApproximateProbability(7);
        double double9 = poissonDistributionImpl2.probability(11);
        int[] intArray11 = poissonDistributionImpl2.sample((int) 'a');
        double double13 = poissonDistributionImpl2.normalApproximateProbability(93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7253747208734183E-8d + "'", double5 == 1.7253747208734183E-8d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0105598679321445E-93d + "'", double9 == 1.0105598679321445E-93d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 7, 100.0d, 0);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(6);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.42505336956926293d + "'", double5 == 0.42505336956926293d);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d, (double) (byte) 10);
        int[] intArray4 = poissonDistributionImpl2.sample(7);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 16);
        double double7 = poissonDistributionImpl2.probability(14);
        double double8 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.052077104446026264d + "'", double7 == 0.052077104446026264d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) (short) -1);
        double double6 = poissonDistributionImpl2.probability(17);
        double double8 = poissonDistributionImpl2.cumulativeProbability((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0342773236060213E-15d + "'", double6 == 1.0342773236060213E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 16, (double) 100.0f);
        double double4 = poissonDistributionImpl2.cumulativeProbability(4);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0019950754115944E-4d + "'", double4 == 4.0019950754115944E-4d);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(6);
        double double6 = poissonDistributionImpl3.getMean();
        double double7 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.probability(0);
        double double11 = poissonDistributionImpl3.probability(93);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.720075976020836E-44d + "'", double9 == 3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.03215909743053985d + "'", double11 == 0.03215909743053985d);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.7200759760208177E-44d);
        double double3 = poissonDistributionImpl1.normalApproximateProbability(15);
        java.lang.Class<?> wildcardClass4 = poissonDistributionImpl1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((double) (-1.0f));
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double12 = poissonDistributionImpl2.probability(8);
        double double15 = poissonDistributionImpl2.cumulativeProbability(0.010336050675925733d, (double) 100L);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[2, 12, 5, 7, 9, 12, 7, 9, 10, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11259903214901994d + "'", double12 == 0.11259903214901994d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9999546000702375d + "'", double15 == 0.9999546000702375d);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability(0.5830397501930291d);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 10);
        double double9 = poissonDistributionImpl2.probability((int) 'a');
        double double11 = poissonDistributionImpl2.probability(0.04820460841292379d);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(4.799682873368738E-10d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.539992976248491E-5d + "'", double5 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.719682636442159E-60d + "'", double9 == 4.719682636442159E-60d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.993992273873336E-4d, 93);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        double double5 = poissonDistributionImpl2.getMean();
        int[] intArray7 = poissonDistributionImpl2.sample(11);
        int[] intArray9 = poissonDistributionImpl2.sample(11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[14, 8, 13, 13, 9, 13, 13, 10, 10, 11, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[11, 14, 8, 7, 9, 7, 11, 14, 13, 10, 12]");
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        double double7 = poissonDistributionImpl2.probability(13);
        int int8 = poissonDistributionImpl2.sample();
        int int9 = poissonDistributionImpl2.sample();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.07290794622443657d + "'", double7 == 0.07290794622443657d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (int) '#');
        double double4 = poissonDistributionImpl2.cumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.864649182067619E-63d, 5);
        double double4 = poissonDistributionImpl2.probability(4.539786865564999E-5d);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(100);
        int[] intArray8 = poissonDistributionImpl2.sample(5);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (int) '#');
        double double4 = poissonDistributionImpl2.probability((int) (byte) 100);
        double double5 = poissonDistributionImpl2.getMean();
        int int6 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.039860996809147134d + "'", double4 == 0.039860996809147134d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 115 + "'", int6 == 115);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 17, (double) (byte) 1);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.308537538725987d);
        double double7 = poissonDistributionImpl2.cumulativeProbability((double) 10, (double) 101);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.139937718785163E-8d + "'", double4 == 4.139937718785163E-8d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9741577703301502d + "'", double7 == 0.9741577703301502d);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (int) '#');
        int[] intArray4 = poissonDistributionImpl2.sample(15);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[119, 107, 104, 96, 113, 120, 82, 103, 116, 92, 91, 89, 99, 99, 100]");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double10 = poissonDistributionImpl2.cumulativeProbability(1.7253747334040217E-8d);
        int int11 = poissonDistributionImpl2.sample();
        double double13 = poissonDistributionImpl2.cumulativeProbability(0.5829943502632666d);
        double double15 = poissonDistributionImpl2.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.539992976248491E-5d + "'", double13 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.539992976248491E-5d + "'", double15 == 4.539992976248491E-5d);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((double) 1);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.normalApproximateProbability(11);
        int int12 = poissonDistributionImpl2.sample();
        double double14 = poissonDistributionImpl2.normalApproximateProbability(16);
        java.lang.Class<?> wildcardClass15 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 9, 12, 11, 9, 13, 7, 5, 12, 7]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484845E-4d + "'", double8 == 4.5399929762484845E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6823718520013758d + "'", double11 == 0.6823718520013758d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9800836903776293d + "'", double14 == 0.9800836903776293d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 7, 100.0d, 0);
        double double4 = poissonDistributionImpl3.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(1.0137771196302933E-7d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 7");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (double) 10000000, 7);
        int[] intArray5 = poissonDistributionImpl3.sample(52);
        double double7 = poissonDistributionImpl3.probability(35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.609017151492348E-193d + "'", double7 == 9.609017151492348E-193d);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(16);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(100);
        double double8 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.551115123125783E-17d + "'", double5 == 5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5199388058383725d + "'", double7 == 0.5199388058383725d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.562816469418554d, 100.0d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.9226355382573108d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 18);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6794183126051052d + "'", double4 == 0.6794183126051052d);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.probability((double) ' ');
        double double10 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double12 = poissonDistributionImpl2.cumulativeProbability((double) '#');
        double double14 = poissonDistributionImpl2.cumulativeProbability(3);
        double double16 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 10);
        double double18 = poissonDistributionImpl2.probability(0.7915564763949167d);
        double double20 = poissonDistributionImpl2.normalApproximateProbability(115);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 7, 10, 11, 7, 9, 10, 13, 5, 15]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7253747334040217E-8d + "'", double8 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999998333297d + "'", double12 == 0.9999999998333297d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.010336050675925733d + "'", double14 == 0.010336050675925733d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.562816469418554d + "'", double16 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5829943502632666d, 3.7200759760208177E-44d, 0);
        double double5 = poissonDistributionImpl3.probability((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = poissonDistributionImpl3.inverseCumulativeProbability(0.17315155134233906d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5582243423023643d + "'", double5 == 0.5582243423023643d);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484866E-4d);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, 100.0d, 100);
        int[] intArray5 = poissonDistributionImpl3.sample(11);
        double double7 = poissonDistributionImpl3.cumulativeProbability(0.9999999998333297d);
        double double9 = poissonDistributionImpl3.probability((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.999999982746253d + "'", double7 == 0.999999982746253d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 6.44275028029557E-85d + "'", double9 == 6.44275028029557E-85d);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (short) -1);
        double double4 = poissonDistributionImpl2.probability(0.9999990795857124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        poissonDistributionImpl2.reseedRandomGenerator((long) 16);
        double double7 = poissonDistributionImpl2.probability(16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.021698793519177532d + "'", double7 == 0.021698793519177532d);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.43718353058144593d);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (double) 10000000, 7);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        poissonDistributionImpl3.reseedRandomGenerator((long) 16);
        double double9 = poissonDistributionImpl3.probability(0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999546021313444d + "'", double5 == 0.9999546021313444d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, (-1));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (short) -1);
        double double4 = poissonDistributionImpl2.probability(0.9999999372293128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, 0.7915564763949167d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = poissonDistributionImpl2.cumulativeProbability(10000000, 94);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.12511003572113744d, (int) (short) 1);
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
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        poissonDistributionImpl2.reseedRandomGenerator(10L);
        double double7 = poissonDistributionImpl2.cumulativeProbability(0.7357588823428858d, (double) 10);
        double double9 = poissonDistributionImpl2.probability((double) (-1.0f));
        double double11 = poissonDistributionImpl2.cumulativeProbability((double) (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7253747208734183E-8d + "'", double7 == 1.7253747208734183E-8d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double10 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 1, (int) (byte) 10);
        double double12 = poissonDistributionImpl2.cumulativeProbability((int) (byte) 10);
        double double14 = poissonDistributionImpl2.normalApproximateProbability(98);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 12, 10, 12, 7, 8, 3, 7, 9, 7]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5829943502632666d + "'", double10 == 0.5829943502632666d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5830397501930291d + "'", double12 == 0.5830397501930291d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999546021313444d, 0.0d, (int) (short) 0);
        double double5 = poissonDistributionImpl3.probability(0.9999966023268753d);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.30854952631637833d + "'", double7 == 0.30854952631637833d);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.normalApproximateProbability(4);
        int[] intArray9 = poissonDistributionImpl2.sample(9);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability((double) (short) 0);
        double double13 = poissonDistributionImpl2.cumulativeProbability(14);
        int int15 = poissonDistributionImpl2.inverseCumulativeProbability(0.36787944117146065d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 6, 11, 13, 7, 14, 10, 10, 5, 6]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.04099516050019131d + "'", double7 == 0.04099516050019131d);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[8, 12, 7, 6, 12, 8, 8, 13, 9]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9165415270653469d + "'", double13 == 0.9165415270653469d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        poissonDistributionImpl2.reseedRandomGenerator((long) 8);
        double double5 = poissonDistributionImpl2.getMean();
        double double6 = poissonDistributionImpl2.getMean();
        double double8 = poissonDistributionImpl2.cumulativeProbability(2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0027693957155115767d + "'", double8 == 0.0027693957155115767d);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (double) 10000000, 7);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double7 = poissonDistributionImpl3.probability((int) (byte) 100);
        int int8 = poissonDistributionImpl3.sample();
        double double11 = poissonDistributionImpl3.cumulativeProbability(0.1251100357211333d, (double) 2);
        double double12 = poissonDistributionImpl3.getMean();
        int[] intArray14 = poissonDistributionImpl3.sample(8);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = poissonDistributionImpl3.cumulativeProbability(0.06305545800345122d, 2.6524402995507083E-19d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999546021313444d + "'", double5 == 0.9999546021313444d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.5397868640106864E-5d + "'", double11 == 4.5397868640106864E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.5399929762484854E-5d + "'", double12 == 4.5399929762484854E-5d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 1L, 3.720075976020796E-42d, 12);
        double double5 = poissonDistributionImpl3.probability((double) 18);
        int int6 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 5.745985131144603E-17d + "'", double5 == 5.745985131144603E-17d);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int[] intArray10 = poissonDistributionImpl2.sample((int) (short) 0);
        double double12 = poissonDistributionImpl2.normalApproximateProbability(10);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[11, 24, 10, 12, 11, 8, 12, 11, 7, 9]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.562816469418554d + "'", double12 == 0.562816469418554d);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (double) 10000000, 7);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double7 = poissonDistributionImpl3.probability((int) (byte) 100);
        int[] intArray9 = poissonDistributionImpl3.sample(0);
        int[] intArray11 = poissonDistributionImpl3.sample(5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999546021313444d + "'", double5 == 0.9999546021313444d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.691462461274013d, 9997830);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((double) 1);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.normalApproximateProbability(11);
        int int12 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 10000000);
        double double16 = poissonDistributionImpl2.cumulativeProbability(0.43718353058144593d);
        double double18 = poissonDistributionImpl2.probability((double) '#');
        double double19 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 9, 9, 10, 10, 10, 7, 12, 9, 12]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484845E-4d + "'", double8 == 4.5399929762484845E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6823718520013758d + "'", double11 == 0.6823718520013758d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.539992976248491E-5d + "'", double16 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.3936204059180545E-10d + "'", double18 == 4.3936204059180545E-10d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((double) (-1.0f));
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double12 = poissonDistributionImpl2.probability(8);
        double double14 = poissonDistributionImpl2.cumulativeProbability(93);
        java.lang.Class<?> wildcardClass15 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[13, 9, 13, 10, 10, 8, 10, 4, 3, 6]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.11259903214901994d + "'", double12 == 0.11259903214901994d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 11, 0.9999999827462528d, (int) (short) 100);
        double double6 = poissonDistributionImpl3.cumulativeProbability(9, (int) (short) 10);
        double double8 = poissonDistributionImpl3.cumulativeProbability((double) 10000000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5588595330374786d + "'", double6 == 0.5588595330374786d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', 0.43718353058144593d);
        double double4 = poissonDistributionImpl2.normalApproximateProbability(4);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (double) 10000000, 7);
        double double5 = poissonDistributionImpl3.probability(10.0d);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability(10, 10);
        double double11 = poissonDistributionImpl3.probability(2.0876756987846234E-153d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0251066712595435E-50d + "'", double5 == 1.0251066712595435E-50d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484854E-5d + "'", double6 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.3766198212623335E-120d);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int10 = poissonDistributionImpl2.inverseCumulativeProbability(0.7768236335766507d);
        double double12 = poissonDistributionImpl2.probability((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[4, 8, 6, 6, 11, 12, 4, 10, 12, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1251100357211333d + "'", double12 == 0.1251100357211333d);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        double double8 = poissonDistributionImpl3.probability((double) (-1L));
        poissonDistributionImpl3.reseedRandomGenerator((long) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.21459765022017452d);
        poissonDistributionImpl1.reseedRandomGenerator((long) '4');
        double double4 = poissonDistributionImpl1.getMean();
        double double6 = poissonDistributionImpl1.normalApproximateProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.21459765022017452d + "'", double4 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.021698793519177532d, 7);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double5 = poissonDistributionImpl2.getMean();
        double double7 = poissonDistributionImpl2.normalApproximateProbability(4);
        int int8 = poissonDistributionImpl2.sample();
        double double10 = poissonDistributionImpl2.cumulativeProbability(88);
        double double12 = poissonDistributionImpl2.normalApproximateProbability(52);
        int int14 = poissonDistributionImpl2.inverseCumulativeProbability(0.9999546000702375d);
        int int15 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 6, 17, 7, 5, 10, 5, 13, 11, 17]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.04099516050019131d + "'", double7 == 0.04099516050019131d);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 24 + "'", int14 == 24);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, 100.0d, 100);
        int int5 = poissonDistributionImpl3.inverseCumulativeProbability(0.42505336956926293d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double4 = poissonDistributionImpl2.probability(0);
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 1);
        int int8 = poissonDistributionImpl2.inverseCumulativeProbability(0.0d);
        double double10 = poissonDistributionImpl2.cumulativeProbability(1.7253747334040217E-8d);
        int int11 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 14);
        int int14 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (byte) 100);
        double double19 = poissonDistributionImpl2.cumulativeProbability((double) (short) 1, (double) 110);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5399929762484854E-5d + "'", double4 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9999546000702375d + "'", double19 == 0.9999546000702375d);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability((int) (byte) 10);
        double double6 = poissonDistributionImpl2.getMean();
        double double8 = poissonDistributionImpl2.cumulativeProbability((double) (short) 100);
        double double10 = poissonDistributionImpl2.cumulativeProbability((double) 100);
        double double12 = poissonDistributionImpl2.normalApproximateProbability(98);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1251100357211333d + "'", double5 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.7357588823428858d);
        double double3 = poissonDistributionImpl1.probability(1.9841269841250204E-88d);
        double double5 = poissonDistributionImpl1.normalApproximateProbability(98);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.42505336956926293d, 7);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.799682873368738E-10d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.719682636442159E-60d, (double) (byte) 10);
        int[] intArray4 = poissonDistributionImpl2.sample(14);
        double double6 = poissonDistributionImpl2.probability(8.0d);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.cumulativeProbability(0.5830397501930291d);
        double double7 = poissonDistributionImpl2.cumulativeProbability((double) (byte) 10);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(3.720075976020836E-44d);
        double double11 = poissonDistributionImpl2.probability(11);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.539992976248491E-5d + "'", double5 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5830397501930291d + "'", double7 == 0.5830397501930291d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.11373639611012118d + "'", double11 == 0.11373639611012118d);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 0, 0.5588595330374786d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 12);
        double double6 = poissonDistributionImpl2.probability(100);
        int int7 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.normalApproximateProbability(93);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (-1.0f), (double) (short) 1, 108);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: null is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (int) (byte) 10);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.probability(10007188);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = poissonDistributionImpl2.cumulativeProbability((double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (10) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double5 = poissonDistributionImpl2.getMean();
        double double6 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = poissonDistributionImpl2.cumulativeProbability(0.06431656716352042d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 13, 8, 13, 8, 10, 11, 16, 8, 9]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.052077104446026264d, 24);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.924706844651847E-56d);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.19214426577955643d, 0.04109455799120611d);
        double double5 = poissonDistributionImpl2.cumulativeProbability(0.0d, 0.010336050675925733d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.8252365391032837d + "'", double5 == 0.8252365391032837d);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double10 = poissonDistributionImpl2.cumulativeProbability(0.7711920512296193d);
        double double12 = poissonDistributionImpl2.normalApproximateProbability((int) '#');
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[8, 15, 16, 11, 15, 18, 13, 13, 17, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999999999996d + "'", double12 == 0.9999999999999996d);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.562816469418554d, 100.0d);
        double double4 = poissonDistributionImpl2.cumulativeProbability(0.9226355382573108d);
        double double6 = poissonDistributionImpl2.probability((int) ' ');
        double double8 = poissonDistributionImpl2.probability(52);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl2.cumulativeProbability(0.9999989865910095d, 0.43718353058144593d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6794183126051052d + "'", double4 == 0.6794183126051052d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.224014864972378E-44d + "'", double6 == 2.224014864972378E-44d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.378991165665747E-82d + "'", double8 == 7.378991165665747E-82d);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5397868640106864E-5d, 4.539786865564999E-5d);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 'a', 0.43718353058144593d);
        double double4 = poissonDistributionImpl2.cumulativeProbability((-1.0d));
        double double5 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 1);
        double double8 = poissonDistributionImpl2.probability((double) ' ');
        double double10 = poissonDistributionImpl2.cumulativeProbability(4.5399929762484845E-4d);
        double double12 = poissonDistributionImpl2.cumulativeProbability((double) '#');
        double double14 = poissonDistributionImpl2.cumulativeProbability(3);
        double double16 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 10);
        double double19 = poissonDistributionImpl2.cumulativeProbability((-1), (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[6, 8, 15, 12, 7, 9, 16, 10, 14, 7]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.003594758625082517d + "'", double6 == 0.003594758625082517d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7253747334040217E-8d + "'", double8 == 1.7253747334040217E-8d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.539992976248491E-5d + "'", double10 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9999999998333297d + "'", double12 == 0.9999999998333297d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.010336050675925733d + "'", double14 == 0.010336050675925733d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.562816469418554d + "'", double16 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (double) 10000000, 7);
        double double5 = poissonDistributionImpl3.probability(10.0d);
        double double6 = poissonDistributionImpl3.getMean();
        double double9 = poissonDistributionImpl3.cumulativeProbability(10, 10);
        double double12 = poissonDistributionImpl3.cumulativeProbability(0.12381112453801489d, (double) 'a');
        double double13 = poissonDistributionImpl3.getMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0251066712595435E-50d + "'", double5 == 1.0251066712595435E-50d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484854E-5d + "'", double6 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.539786865564999E-5d + "'", double12 == 4.539786865564999E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.5399929762484854E-5d + "'", double13 == 4.5399929762484854E-5d);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double12 = poissonDistributionImpl2.getMean();
        int[] intArray14 = poissonDistributionImpl2.sample((int) (byte) 0);
        int int16 = poissonDistributionImpl2.inverseCumulativeProbability((double) 0L);
        poissonDistributionImpl2.reseedRandomGenerator((long) 10000000);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        poissonDistributionImpl2.reseedRandomGenerator(10L);
        poissonDistributionImpl2.reseedRandomGenerator((long) 9);
        double double8 = poissonDistributionImpl2.cumulativeProbability(0.0d);
        poissonDistributionImpl2.reseedRandomGenerator((long) 4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9999999827462528d + "'", double8 == 0.9999999827462528d);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = poissonDistributionImpl3.inverseCumulativeProbability(0.1103970707165003d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, 100.0d, 100);
        int[] intArray5 = poissonDistributionImpl3.sample(11);
        double double7 = poissonDistributionImpl3.normalApproximateProbability((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, 100.0d, 100);
        int[] intArray5 = poissonDistributionImpl3.sample(11);
        double double7 = poissonDistributionImpl3.probability((int) (short) -1);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(1.0E-12d);
        int[] intArray11 = poissonDistributionImpl3.sample(11);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(12);
        double double13 = poissonDistributionImpl2.normalApproximateProbability((int) (short) -1);
        int int14 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 11, 6, 15, 11, 9, 11, 13, 8, 13]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.7915564763949167d + "'", double11 == 0.7915564763949167d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.49456394057024E-4d + "'", double13 == 4.49456394057024E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, 0.308537538725987d, (int) (byte) 10);
        double double5 = poissonDistributionImpl3.cumulativeProbability(98);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.48327056701197957d + "'", double5 == 0.48327056701197957d);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.139937718785163E-8d, 14);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.720075976020796E-42d, (int) (short) -1);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 5, 88);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double13 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 10);
        double double14 = poissonDistributionImpl2.getMean();
        double double17 = poissonDistributionImpl2.cumulativeProbability(0.0d, 0.04099516050019131d);
        double double18 = poissonDistributionImpl2.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.21459765022017452d + "'", double5 == 0.21459765022017452d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.539992976248491E-5d + "'", double11 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.562816469418554d + "'", double13 == 0.562816469418554d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.539992976248491E-5d + "'", double17 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, 100.0d, 100);
        int[] intArray5 = poissonDistributionImpl3.sample(11);
        double double7 = poissonDistributionImpl3.probability((int) (short) 0);
        int int9 = poissonDistributionImpl3.inverseCumulativeProbability(1.0105598679321445E-93d);
        java.lang.Class<?> wildcardClass10 = poissonDistributionImpl3.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9999999827462528d + "'", double7 == 0.9999999827462528d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int10 = poissonDistributionImpl2.inverseCumulativeProbability(0.7768236335766507d);
        int[] intArray12 = poissonDistributionImpl2.sample(100);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[7, 9, 9, 17, 13, 11, 12, 9, 5, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[9, 15, 11, 6, 9, 13, 9, 10, 9, 7, 10, 6, 16, 18, 7, 4, 9, 9, 7, 11, 10, 7, 6, 21, 5, 15, 11, 12, 13, 9, 11, 10, 11, 10, 11, 9, 14, 13, 6, 7, 8, 11, 12, 11, 15, 14, 11, 7, 16, 11, 11, 10, 14, 9, 7, 14, 11, 10, 8, 13, 12, 10, 5, 5, 17, 7, 8, 9, 12, 7, 7, 14, 8, 10, 12, 12, 12, 9, 10, 9, 5, 7, 7, 15, 11, 5, 8, 13, 12, 20, 6, 11, 11, 10, 14, 8, 8, 11, 14, 12]");
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, (int) (byte) 10);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.probability(10007188);
        int[] intArray7 = poissonDistributionImpl2.sample(8);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[8, 13, 14, 12, 11, 4, 7, 12]");
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        double double8 = poissonDistributionImpl3.probability((double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double11 = poissonDistributionImpl3.cumulativeProbability(2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability((double) 1);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.normalApproximateProbability(11);
        int int12 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 10000000);
        double double16 = poissonDistributionImpl2.cumulativeProbability(0.43718353058144593d);
        double double18 = poissonDistributionImpl2.normalApproximateProbability((int) (byte) 0);
        int int20 = poissonDistributionImpl2.inverseCumulativeProbability(0.9999999998333319d);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = poissonDistributionImpl2.cumulativeProbability(94, 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 13, 7, 11, 14, 3, 12, 5, 5, 11]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.5399929762484845E-4d + "'", double8 == 4.5399929762484845E-4d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 18 + "'", int9 == 18);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6823718520013758d + "'", double11 == 0.6823718520013758d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.539992976248491E-5d + "'", double16 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0013315596295692678d + "'", double18 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        double double5 = poissonDistributionImpl2.normalApproximateProbability(7);
        int int7 = poissonDistributionImpl2.inverseCumulativeProbability(4.993992273873336E-4d);
        double double9 = poissonDistributionImpl2.probability((double) 0);
        double double11 = poissonDistributionImpl2.cumulativeProbability(0);
        double double12 = poissonDistributionImpl2.getMean();
        int[] intArray14 = poissonDistributionImpl2.sample((int) (byte) 0);
        double double16 = poissonDistributionImpl2.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = poissonDistributionImpl2.cumulativeProbability(0.691462461274013d, 0.1251100357211333d);
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.5399929762484854E-5d + "'", double16 == 4.5399929762484854E-5d);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d);
        int int2 = poissonDistributionImpl1.sample();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999546021313444d, 0.0d, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = poissonDistributionImpl3.cumulativeProbability(0.6671803212492803d, 0.021698793519177532d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999372293128d, 0.9999999926277922d, 7);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.3328196787507197d, (int) (short) 0);
        double double4 = poissonDistributionImpl2.probability(0.01991630962237073d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100, (int) '#');
        poissonDistributionImpl2.reseedRandomGenerator((long) '#');
        double double7 = poissonDistributionImpl2.cumulativeProbability(4.5379322904364025E-4d, (double) 6);
        int int8 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.492917821869815E-35d + "'", double7 == 5.492917821869815E-35d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 93, (double) 9997830, 1);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(5.551115123125783E-17d);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.3056700905634025E-8d, 2.224014864972378E-44d, 9);
        int[] intArray5 = poissonDistributionImpl3.sample(88);
        int int6 = poissonDistributionImpl3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.11373639611012118d, 0.4579297144718917d, (int) (byte) -1);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double8 = poissonDistributionImpl2.probability(4.5399929762484845E-4d);
        int int9 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.probability(7);
        double double12 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 8, 10, 10, 16, 14, 15, 9, 19, 12]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.09007922571921603d + "'", double11 == 0.09007922571921603d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0E-12d, (int) (byte) -1);
        poissonDistributionImpl2.reseedRandomGenerator((long) 12);
        double double6 = poissonDistributionImpl2.probability((int) (byte) -1);
        int int7 = poissonDistributionImpl2.sample();
        double double9 = poissonDistributionImpl2.probability(7);
        int int10 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.9841269841250204E-88d + "'", double9 == 1.9841269841250204E-88d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 110, 35);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(7.378991165665747E-82d, (int) (short) 1);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000);
        int int2 = poissonDistributionImpl1.sample();
        double double3 = poissonDistributionImpl1.getMean();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9995647 + "'", int2 == 9995647);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E7d + "'", double3 == 1.0E7d);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(3.734116511364753E-76d, 12);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.cumulativeProbability((double) 8);
        double double9 = poissonDistributionImpl2.probability((double) (byte) 0);
        double double11 = poissonDistributionImpl2.probability((int) (short) 10);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3328196787507197d + "'", double7 == 0.3328196787507197d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5399929762484854E-5d + "'", double9 == 4.5399929762484854E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1251100357211333d + "'", double11 == 0.1251100357211333d);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9394292419979411d, 2.0876756987846234E-153d, (int) '#');
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (short) 100, 104);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0137771196302933E-7d, 0.999999982746253d, (int) (byte) 100);
        double double6 = poissonDistributionImpl3.cumulativeProbability(4, 104);
        double double8 = poissonDistributionImpl3.probability((double) 93);
        double double10 = poissonDistributionImpl3.normalApproximateProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.probability(100);
        int[] intArray9 = poissonDistributionImpl2.sample(7);
        int int11 = poissonDistributionImpl2.inverseCumulativeProbability(1.0137771196302933E-7d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.864649182067619E-63d + "'", double7 == 4.864649182067619E-63d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[16, 9, 12, 6, 10, 14, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5199388058383725d, 88);
        double double4 = poissonDistributionImpl2.probability(5.628682978044818E-21d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double9 = poissonDistributionImpl2.cumulativeProbability((-1), 0);
        double double11 = poissonDistributionImpl2.normalApproximateProbability((int) (short) -1);
        int[] intArray13 = poissonDistributionImpl2.sample(4);
        double double15 = poissonDistributionImpl2.cumulativeProbability(2);
        double double16 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 11, 6, 9, 9, 6, 7, 14, 9, 10]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.539992976248491E-5d + "'", double9 == 4.539992976248491E-5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.49456394057024E-4d + "'", double11 == 4.49456394057024E-4d);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 6, 13, 6]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0027693957155115767d + "'", double15 == 0.0027693957155115767d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2);
        double double3 = poissonDistributionImpl1.cumulativeProbability(98);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.864649182067619E-63d, 0.0022699964881242427d);
        double double4 = poissonDistributionImpl2.cumulativeProbability((double) 100.0f);
        double double6 = poissonDistributionImpl2.normalApproximateProbability(93);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.21459765022017452d);
        int[] intArray3 = poissonDistributionImpl1.sample((int) (short) 1);
        double double4 = poissonDistributionImpl1.getMean();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.21459765022017452d + "'", double4 == 0.21459765022017452d);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, 4.539992976248491E-5d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.probability(0.43718353058144593d);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.01991630962237073d + "'", double7 == 0.01991630962237073d);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.1251100357211333d, (double) (short) 100, (int) (short) 0);
        double double4 = poissonDistributionImpl3.getMean();
        poissonDistributionImpl3.reseedRandomGenerator((long) (short) -1);
        poissonDistributionImpl3.reseedRandomGenerator((long) 'a');
        int[] intArray10 = poissonDistributionImpl3.sample(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1251100357211333d + "'", double4 == 0.1251100357211333d);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 100.0f, 0.308537538725987d, (int) (byte) 10);
        int[] intArray5 = poissonDistributionImpl3.sample(0);
        int int7 = poissonDistributionImpl3.inverseCumulativeProbability(0.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.04109455799120611d, 10007188);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        double double6 = poissonDistributionImpl2.probability((double) 1.0f);
        double double7 = poissonDistributionImpl2.getMean();
        double double9 = poissonDistributionImpl2.cumulativeProbability((int) ' ');
        double double11 = poissonDistributionImpl2.probability(9997830);
        int int13 = poissonDistributionImpl2.inverseCumulativeProbability(0.9999966023268753d);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[9, 6, 11, 16, 5, 10, 11, 12, 5, 8]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5399929762484845E-4d + "'", double6 == 4.5399929762484845E-4d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9999999926277922d + "'", double9 == 0.9999999926277922d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 2);
        double double3 = poissonDistributionImpl1.cumulativeProbability(18);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9999999999993523d + "'", double3 == 0.9999999999993523d);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d, (double) 10000000, 7);
        int[] intArray5 = poissonDistributionImpl3.sample(52);
        double double7 = poissonDistributionImpl3.cumulativeProbability(104);
        int[] intArray9 = poissonDistributionImpl3.sample((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) (short) 100);
        double double7 = poissonDistributionImpl2.probability(100);
        int int9 = poissonDistributionImpl2.inverseCumulativeProbability(0.1251100357211333d);
        double double11 = poissonDistributionImpl2.probability(0.06431656716352042d);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.864649182067619E-63d + "'", double7 == 4.864649182067619E-63d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) (byte) 100, (double) 1L, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.0d);
        double double8 = poissonDistributionImpl3.cumulativeProbability(0.0d, 0.932914037120968d);
        double double10 = poissonDistributionImpl3.probability(100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.7200759760208177E-44d + "'", double5 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.7200759760208177E-44d + "'", double8 == 3.7200759760208177E-44d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.039860996809147134d + "'", double10 == 0.039860996809147134d);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999546021313444d, (double) 15, 8);
        double double5 = poissonDistributionImpl3.cumulativeProbability(8);
        double double7 = poissonDistributionImpl3.normalApproximateProbability(15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9999989865910095d + "'", double5 == 0.9999989865910095d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.5582243423023643d, (double) 17, 100);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4689421867381592d + "'", double5 == 0.4689421867381592d);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        double double7 = poissonDistributionImpl2.probability(13);
        double double8 = poissonDistributionImpl2.getMean();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = poissonDistributionImpl2.inverseCumulativeProbability((double) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.07290794622443657d + "'", double7 == 0.07290794622443657d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 17, (double) (short) 0, 11);
        double double5 = poissonDistributionImpl3.cumulativeProbability(0.9999999810104375d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.139937718785163E-8d + "'", double5 == 4.139937718785163E-8d);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6524402995507083E-19d, (double) 0L);
        int int3 = poissonDistributionImpl2.sample();
        double double4 = poissonDistributionImpl2.getMean();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.6524402995507083E-19d + "'", double4 == 2.6524402995507083E-19d);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 3, 0.1103970707165003d, (int) (byte) 1);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9999999827462528d, 0.9999989865910095d, 13);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.19214426577955643d, 0.04109455799120611d);
        java.lang.Class<?> wildcardClass3 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484845E-4d, 1.0E-12d, 10000000);
        double double5 = poissonDistributionImpl3.normalApproximateProbability(12);
        double double7 = poissonDistributionImpl3.cumulativeProbability((int) (short) 100);
        double double9 = poissonDistributionImpl3.cumulativeProbability((int) '4');
        int int11 = poissonDistributionImpl3.inverseCumulativeProbability(0.9999546021313444d);
        int[] intArray13 = poissonDistributionImpl3.sample(1);
        double double15 = poissonDistributionImpl3.normalApproximateProbability(93);
        double double17 = poissonDistributionImpl3.probability((int) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 9.605091715178582E-158d + "'", double17 == 9.605091715178582E-158d);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.7711920512296193d, 0.9999999998333319d);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10.0f, 4.539992976248491E-5d, (int) (byte) 100);
        double double5 = poissonDistributionImpl3.probability(0.43718353058144593d);
        int int7 = poissonDistributionImpl3.inverseCumulativeProbability(0.9999546021313444d);
        int[] intArray9 = poissonDistributionImpl3.sample((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 24 + "'", int7 == 24);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 14, 7, 9, 12, 8, 7, 8, 11, 18, 11, 12, 13, 10, 8, 13, 14, 10, 13, 12, 10, 11, 5, 6, 13, 13, 10, 10, 10, 6, 5, 8, 9, 9, 12, 9, 14, 6, 9, 5, 12, 13, 8, 7, 9, 6, 10, 12, 7, 4, 8, 17, 14, 9, 13, 9, 7, 12, 3, 7, 10, 13, 9, 19, 7, 11, 7, 6, 12, 9, 9, 9, 10, 13, 11, 15, 14, 9, 9, 14, 4, 11, 10, 6, 10, 9, 17, 7, 8, 13, 10, 12, 16, 8, 14, 11, 5, 12, 5, 8]");
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(2.6524402995507083E-19d, (double) 0L);
        double double5 = poissonDistributionImpl2.cumulativeProbability(4, 15);
        java.lang.Class<?> wildcardClass6 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.139937718785163E-8d);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.49456394057024E-4d, 0.9605336665255937d, (int) (short) -1);
        double double4 = poissonDistributionImpl3.getMean();
        double double6 = poissonDistributionImpl3.probability(0.4579297144718917d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.49456394057024E-4d + "'", double4 == 4.49456394057024E-4d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 108, (double) 10007188);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int int3 = poissonDistributionImpl2.sample();
        poissonDistributionImpl2.reseedRandomGenerator((long) 7);
        double double7 = poissonDistributionImpl2.probability(13);
        int int8 = poissonDistributionImpl2.sample();
        double double11 = poissonDistributionImpl2.cumulativeProbability((int) (short) 1, 1);
        double double13 = poissonDistributionImpl2.cumulativeProbability((double) 0.0f);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.07290794622443657d + "'", double7 == 0.07290794622443657d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.5399929762484866E-4d + "'", double11 == 4.5399929762484866E-4d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.539992976248491E-5d + "'", double13 == 4.539992976248491E-5d);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.003594758625082517d);
        int[] intArray3 = poissonDistributionImpl1.sample(10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7253747334040217E-8d, (int) 'a');
        double double5 = poissonDistributionImpl2.cumulativeProbability(0.07290794622443657d, (double) 9);
        double double7 = poissonDistributionImpl2.normalApproximateProbability(7);
        double double9 = poissonDistributionImpl2.probability(11);
        int[] intArray11 = poissonDistributionImpl2.sample((int) 'a');
        double double14 = poissonDistributionImpl2.cumulativeProbability((-1), 7);
        double double16 = poissonDistributionImpl2.cumulativeProbability((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7253747208734183E-8d + "'", double5 == 1.7253747208734183E-8d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0105598679321445E-93d + "'", double9 == 1.0105598679321445E-93d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        double double3 = poissonDistributionImpl2.getMean();
        double double5 = poissonDistributionImpl2.probability((int) (byte) 10);
        double double6 = poissonDistributionImpl2.getMean();
        double double8 = poissonDistributionImpl2.probability((int) '#');
        double double10 = poissonDistributionImpl2.normalApproximateProbability((int) (short) 0);
        double double12 = poissonDistributionImpl2.cumulativeProbability(0.9911469670963167d);
        int int13 = poissonDistributionImpl2.sample();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1251100357211333d + "'", double5 == 0.1251100357211333d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.3936204059180545E-10d + "'", double8 == 4.3936204059180545E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0013315596295692678d + "'", double10 == 0.0013315596295692678d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.539992976248491E-5d + "'", double12 == 4.539992976248491E-5d);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100);
        int[] intArray4 = poissonDistributionImpl2.sample((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = poissonDistributionImpl2.getClass();
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[6, 9, 9, 10, 6, 7, 7, 13, 17, 11]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.apache.commons.math.distribution.PoissonDistributionImpl poissonDistributionImpl1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((double) 10000000);
        int int2 = poissonDistributionImpl1.sample();
        double double4 = poissonDistributionImpl1.probability((int) '#');
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9999305 + "'", int2 == 9999305);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }
}
